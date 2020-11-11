
package Entity;

import company.Tools;
import javax.swing.JTable;

/**
 *
 * @author MOSTAPHA
 */
public class Project implements Main_Data
{
    private int Project_NO;
    private String Project_Name;
    private String Location;
    private int Dept_NO;
    
//------------------------------------------------------------------------------------------------
    
    @Override
    public void Add() 
    {
        if( Project_Name.equals("") || Location.equals(""))
        {
             Tools.MsgBox(" Projer : Veillez saisir tous les champs !");
        }
        else
        {
        
            String Str_Insert = "insert into project values (" + Project_NO + "," + " '" + Project_Name + "', '"
                              + Location + "' , " + Dept_NO + ");" ;

            // appelation de la methode Run_nonQuery pour verifier si notre requet SQL est executé ou non
            boolean isAdd = data_base.Go.Run_nonQuery(Str_Insert); // true or false

            if(isAdd)
            {
                Tools.MsgBox(" Projet : Les données ont été ajouté avec succes ! ");
            }
        }
    }
//------------------------------------------------------------------------------------------------
    @Override
    public void Update()
    {
        String Str_Update = "update project set " + "ProjectName = '" + Project_Name + "' , " 
                             + "Location = '" + Location + "' ," + " DeptNO = " + Dept_NO  
                             + " where ProjectNO = " + Project_NO + " ;" ;
        
        boolean isUpdate = data_base.Go.Run_nonQuery(Str_Update);
        if(isUpdate)
        {
            Tools.MsgBox(" Projet : Les Mises-à-Jour ont été fait avec succes ! ");
        }   
        
    }
//------------------------------------------------------------------------------------------------
    @Override
    public void Delete() 
    {
        String Str_Delete = "delete from project where " + "ProjectNO = " + Project_NO + ";";
        
        boolean isDetete = data_base.Go.Run_nonQuery(Str_Delete);
        if(isDetete)
        {
            Tools.MsgBox(" Projet : Le projet a été supprimé avec succes ! ");
        }

       
    }
//------------------------------------------------------------------------------------------------
    @Override
    public String Get_Auto_Number() 
    {
        
        String Str_Auto = data_base.Go.Get_Auto_Number("project", "ProjectNo");
        
        return Str_Auto;
        
      
    }
//------------------------------------------------------------------------------------------------
    @Override
    public void Get_All_Rows(JTable table) 
    {
         data_base.Go.fill_JTable("project_data", table);
      
    }
//------------------------------------------------------------------------------------------------
    @Override
    public void Get_One_Row(JTable table) 
    {
         String Str_Select = "select * from project_data where " + "Project_NO = " + Project_NO + ";" ;
        
        // n'oublie pas changer "ProjectNO" par "Project_NO"

        data_base.Go.fill_JTable(Str_Select, table);
        
    }
//------------------------------------------------------------------------------------------------
    @Override
    public void Get_Custom_Rows(String statement, JTable table) 
    {
        // cherchons des elements (lignes) dans le tableau en utilisant des requets SQL 
      // par exemple : statement -> "select * from project where DeptNO = 1"
        
        data_base.Go.fill_JTable(statement, table);
        
    }
//------------------------------------------------------------------------------------------------
    @Override
    public String GetValue_By_Name(String name)
    {
        // Tools.MsgBox(pjt.GetValue_By_Name("Projet_1"));
        
        String Str_Select = "select ProjectNO from project where " + "ProjectName = '" + name + "';" ;
        
       
        String Str_Value = (String)data_base.Go.Get_Table_Data(Str_Select).Items[0][0];
                                     // Get_Table_Data est un array de type Object --> Items
                                   // Items[0}[0} specification de la premiere case car il y on a 
                                  //une seul valeur qui est declaré unique dans le tableau project
        
        return Str_Value; // (String)data_Base......... --> car la methode GetValue_By_Name 
    }                    //   renvoi un String
        
    
//------------------------------------------------------------------------------------------------
    @Override
    public String GetName_By_Value(String value) 
    {
         String Str_Select = "select ProjectName from project where " + "ProjectNO = " + value + ";" ;
        
       
        String Str_Name = (String)data_base.Go.Get_Table_Data(Str_Select).Items[0][0];
        
        return Str_Name;
 
    }
    

    
//----------------------Getters & Setters --------------------------------------------------------
    public int getProject_NO() {
        return Project_NO;
    }

    public void setProject_NO(int Project_NO) {
        this.Project_NO = Project_NO;
    }

    public String getProject_Name() {
        return Project_Name;
    }

    public void setProject_Name(String Project_Name) {
        this.Project_Name = Project_Name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getDept_NO() {
        return Dept_NO;
    }

    public void setDept_NO(int Dept_NO) {
        this.Dept_NO = Dept_NO;
    }

}
