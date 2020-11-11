
package Entity;

import company.Tools;
import javax.swing.JTable;

/**
 *
 * @author MOSTAPHA
 */
public class Departement implements Main_Data
{
    
    private int Dept_NO;
    private String  Dept_Name;
    private String Location;
 
//-------------------------------------- @Override of methods ---------------------------
    @Override
    public void Add() 
    {
        if( Dept_Name.equals("") || Location.equals(""))
        {
             Tools.MsgBox(" Département : Veillez saisir tous les champs !");
        }
        else
        {
            String Str_Insert = "insert into departement values (" + Dept_NO + "," + " '" + Dept_Name + "',"
                                  + "'" + Location + "');" ;

            // appelation de la methode Run_nonQuery pour verifier si notre requet SQL est executé ou non
            boolean isAdd = data_base.Go.Run_nonQuery(Str_Insert); // true or false
       
            if(isAdd)
            {
                 Tools.MsgBox(" Departement : Les données ont été ajouté avec succes ! ");
            }
       
        }
    }
//--------------------------------------------------------------------------------------
    @Override
    public void Update() 
    {
        String Str_Update = "update departement set " + "DeptName = '" + Dept_Name + "' , " 
                        + "Location = '" + Location + "' " + "where DeptNO = " + Dept_NO + ";" ;
        
        boolean isUpdate = data_base.Go.Run_nonQuery(Str_Update);
        if(isUpdate)
        {
            Tools.MsgBox(" Departement : Les Mises-à-Jour ont été fait avec succes ! ");
        }
    }
//--------------------------------------------------------------------------------------
    @Override
    public void Delete() 
    {
        String Str_Delete = "delete from departement where " + "DeptNO = " + Dept_NO + ";";
        
        boolean isDetete = data_base.Go.Run_nonQuery(Str_Delete);
        if(isDetete)
        {
            Tools.MsgBox(" Departement : Le departement a été supprimé avec succes ! ");
        }
        
    }
//--------------------------------------------------------------------------------------
    @Override
    public String Get_Auto_Number() 
    {     //  elle renvoi le ID de l avant derniere ligne pour des raisons de saisi dans le tableau
        
        String Str_Auto = data_base.Go.Get_Auto_Number("departement", "DeptNo");
        
        return Str_Auto;
    }
//--------------------------------------------------------------------------------------
    @Override
    public void Get_All_Rows(JTable table) 
    {
        data_base.Go.fill_JTable("departement_data", table);
      
        // On a utilisé le View departement_data pour afficher le max d info
        
    }
//--------------------------------------------------------------------------------------
    @Override
    public void Get_One_Row(JTable table) 
    {
        String Str_Select = "select * from departement_data where " + "Departement_NO = " + Dept_NO + ";" ;
        
        // On a utilisé le View departement_data pour afficher le max d'info ( on n'oublie pas
      //  changer "DeptNO" par "Departement_NO" )
        
        data_base.Go.fill_JTable(Str_Select, table);
        
    }
//--------------------------------------------------------------------------------------
    @Override
    public void Get_Custom_Rows(String statement, JTable table)
    {  // cherchons des elements (lignes) dans le tableau en utilisant des requets SQL 
      // par exemple : statement -> "select * from departement where DeptNO = 1"
        
        data_base.Go.fill_JTable(statement, table);
        
    }
//--------------------------------------------------------------------------------------
    @Override
    public String GetValue_By_Name(String name)
    {   // Tools.MsgBox(dept.GetValue_By_Name("Informatique"));
        
        String Str_Select = "select DeptNO from departement where " + "DeptName = '" + name + "';" ;
        
        // ici c'est pas lappel d utiliser le view departement_data car on va afficher une valeure
       
        String Str_Value = (String)data_base.Go.Get_Table_Data(Str_Select).Items[0][0];
                                     // Get_Table_Data est un array de type Object --> Items
                                   // Items[0}[0} specification de la premiere case car il y on a 
                                  //une seul valeur qui est declaré unique dans le tableau departement 
        
        return Str_Value; // (String)data_Base......... --> car la methode GetValue_By_Name 
    }                    //   renvoi un String
//--------------------------------------------------------------------------------------
    @Override
    public String GetName_By_Value(String value)
    {
        String Str_Select = "select DeptName from departement where " + "DeptNO = " + value + ";" ;
        
        // ici c'est pas lappel d utiliser le view departement_data car on va afficher un nom
       
        String Str_Name = (String)data_base.Go.Get_Table_Data(Str_Select).Items[0][0];
        
        return Str_Name;
    }
   
//-------------------------- Getters & Setters ----------------------------
    public int getDept_NO() {
        return Dept_NO;
    }

    public void setDept_NO(int Dept_NO) {
        this.Dept_NO = Dept_NO;
    }

    public String getDept_Name() {
        return Dept_Name;
    }

    public void setDept_Name(String Dept_Name) {
        this.Dept_Name = Dept_Name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }


    
    
    
}
