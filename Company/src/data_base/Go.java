
package data_base;

import company.Tools;
import company.Tools.Table;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MOSTAPHA
 */
public class Go {
    
    private static String url = "";
   // private static String db_Name = "company";
    
    private static Connection Cnx;
    
//---------------------------------------------------------------------------------------        
    private static void SetURL()
    {
        //url = "jdbc:mysql://localhost:3306/" + db_Name +"?useUnicode=true&characterEncoding=UTF-8";
        url = "jdbc:mysql://localhost:3306/company" + "?useUnicode=true&characterEncoding=UTF-8";
        
    }
//-----------------------------------------------------------------------------------------    
    private static void SetConnection()
    {   
        try 
        {
            SetURL();
            Cnx = DriverManager.getConnection(url, "root","");
        } 
        catch (SQLException ex) 
        {
            Tools.MsgBox(ex.getMessage());
        }
        
    }
 //----------------------------------------------------------------------------------------      
    public static boolean Check_UserAndPass(String User_Name, String Password)
    {
        try
        {
            SetConnection();
            Statement stm = Cnx.createStatement();
            
            String Str_Check = "select * from users where " + "UserName ='" + User_Name + "' and "
                                + "PassWord ='" + Password + "'";
            stm.executeQuery(Str_Check);
            
            while(stm.getResultSet().next())
            {
                Cnx.close();
                return true;
            }
            Cnx.close();
        }
        catch(SQLException ex)
        {
                Tools.MsgBox(ex.getMessage());
        }
        return false;
    }
 //-----------------------------------------------------------------------------------------    
    public static boolean Run_nonQuery(String SQL_Statement) // responsable de : Insert , Update , Delate
    {
        try
        {
            SetConnection();
            Statement stm = Cnx.createStatement();
            stm.execute(SQL_Statement);
            Cnx.close();
            return true;
        }
        catch(SQLException ex)
        {
            Tools.MsgBox(ex.getMessage());
            return false;
        }
    }
//-------------------------------------------------------------------------------------------- 
    public static String Get_Auto_Number(String Table_Name, String Column_Name)
    {          //  elle renvoi le ID de l avant derniere ligne pour des raisons de saisi dans le tableau
        try
        {
            SetConnection();
            Statement stm = Cnx.createStatement();
            String Str_Auto = "select max(" + Column_Name +")+1 as autonum" + " from " + Table_Name;
            stm.executeQuery(Str_Auto); // retourne la dernier+1 case du tableau
            
            String Num = "";
            while(stm.getResultSet().next()) // nexte() attendre la premiere repense de 
            {                               //  la base de donneés pour la recupere
                Num = stm.getResultSet().getString("autonum");
            }
            Cnx.close();
            
            if( Num == null || "".equals(Num))
            {
                return "1";
            }
            else 
            {
                return Num;
            }
        }
        catch(SQLException ex)
        {
             Tools.MsgBox(ex.getMessage());
             return "0";
                    
        }
    }
//-------------------------------------------------------------------------------------------- 
    public static Table Get_Table_Data(String statement)
    {
        Tools t_class = new Tools(); // parceque la classe Table qu'on va l'utiliser exite dans la classe Tools
        try
        {
            SetConnection();
            Statement stm = Cnx.createStatement();
            ResultSet rs ;
            rs = stm.executeQuery(statement);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            int c = rsmd.getColumnCount();
            
            Table table = t_class.new Table(c); // appelation du constructeur de la classe Table située dans Tools
            
            while(rs.next())
            {
                Object row[] = new Object[c];
                for(int i =0; i<c ; i++)
                {
                    row[i] = rs.getString(i+1); // 'i+1' car les nombres de colonne commence par 
                                                // getString ne commence pas par 0
                }
                table.Add_New_Row(row);
            }
            Cnx.close();
            
            return table;
        }
        catch(SQLException ex)
        {
            Tools.MsgBox(ex.getMessage());
            return t_class.new Table(0);
        }
    }
//--------------------------------------------------------------------------------------
    public static void Fill_Combo(String Table_Name, String Column_Name, JComboBox combo)
    { // remplire un combo automatiquement en donnant le nom d'un tableau et la colonne
        
        try
        {
            SetConnection();
            Statement stm = Cnx.createStatement();
            ResultSet rs;
            
            String Str_Select = "select " + Column_Name + " from " + Table_Name;
            rs = stm.executeQuery(Str_Select);
            rs.last();
            int count = rs.getRow(); // retourne le nombre de ligne
            rs.beforeFirst(); // retour au debut avant la premiere ligne
            
            String values[] = new String[count];
            int i = 0;
            while(rs.next())
            {
                values[i] = rs.getString(1);  //getString ne commence pas par 0 --> dans ce cas
                i++;                         // nous cherchons la colonne N 1
            }
            Cnx.close();
            
            combo.setModel(new DefaultComboBoxModel(values));
        }
        catch(SQLException ex)
        {
            Tools.MsgBox(ex.getMessage());
        }
    }
//--------------------------------------------------------------------------------------
    public static void fill_JTable(String TableName_OR_SelectStatement, JTable table)
    {                                 // select statement comme par Exmpe (select from)
        try
        {
            SetConnection();
            Statement stm =Cnx.createStatement();
            ResultSet rs;
            
            String Str_check_Select;
            if("select ".equals(TableName_OR_SelectStatement.substring(0, 7).toLowerCase()))
            {               // comparaison des 7 element du String TableName_OR_SelectStatement
                           //avec le mot "select " avec un changement de TableName_OR... au miniscule
                Str_check_Select = TableName_OR_SelectStatement;
                
            }
            else
            {   // renvoie un JTable
                Str_check_Select = "select * from " + TableName_OR_SelectStatement; 
            }
            rs = stm.executeQuery(Str_check_Select);
            // nombre de colonnes
            ResultSetMetaData rsmd = rs.getMetaData();
            int count = rsmd.getColumnCount();
            
            // get ->  modele de JTable
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            // Vector sera utilisé pour remplir le JTable
            Vector  row = new Vector();
            model.setRowCount(0); // supprimé les lignes de la JTable s'ils existent
            
            while(rs.next()) // pour parcourir notre JTable avec remplissage
            {
                row = new Vector(count); // ajouter une nouvelle ligne en initialisons
                                        //  le Vector par le nombre de colonnes 'count'

                for(int i =1 ; i <= count ; i++) // i commence par 1 car getString demare par 1
                {
                    row.add(rs.getString(i)); // chaque row contienne 'count' colonne donc nous devant
                }                            // remplir tous les colonne d'une row
                model.addRow(row); // ajouter la ligne remplie dans la boucle for dans notre JTable
                                  // --> ce cycle sera repeté jusqu'au le while termine
            }
            if(table.getColumnCount() != count)
            {
                Tools.MsgBox(" Le nombre de colonnes des tableaux n'ont pas egaux  ! \n"
                             + "  * Nombre de colonnes du JTable : " + table.getColumnCount() + "\n"
                             + "  * Nombre de colonnes du Tableau : " + count );
            }
            Cnx.close();
        }   
        catch(SQLException ex)
        {
            Tools.MsgBox(ex.getMessage());
        }
    }

    
    
    
    
    

}
    

