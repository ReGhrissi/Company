
package Entity;

import company.Tools;
import javax.swing.JTable;

/**
 *
 * @author MOSTAPHA
 */
public class Work_On implements Main_Data
{
    private int Emp_NO;
    private int Project_NO;

//-----------------------------------------------------------------------------------------------
    @Override
    public void Add() 
    {
           String Str_Insert = "insert into work_on values (" + Emp_NO + "," + Project_NO + ");" ;

            boolean isAdd = data_base.Go.Run_nonQuery(Str_Insert); 

            if(isAdd)
            {
                Tools.MsgBox(" Work_On : Les données ont été ajouté avec succes ! ");
            }
        
    }
//-----------------------------------------------------------------------------------------------
    @Override
    public void Update() 
    {
        Tools.MsgBox(" Methode -> Update() : ' Service Non Disponibles ! ' ");
        
    }
//-----------------------------------------------------------------------------------------------
    @Override
    public void Delete() 
    {
        String Str_Delete = "delete from work_on where " + "EmpNO = " + Emp_NO 
                            + " and " + "ProjectNO = " + Project_NO + ";";
        
        boolean isDetete = data_base.Go.Run_nonQuery(Str_Delete);
        if(isDetete)
        {
            Tools.MsgBox(" Work_On : Le lien WORK_ON a été supprimé avec succes ! ");
        }

    }
//-----------------------------------------------------------------------------------------------
    @Override
    public String Get_Auto_Number()
    {
         Tools.MsgBox(" Methode -> Get_Auto_Number() : ' Service Non Disponibles ! ' ");
         return "";
    }
//-----------------------------------------------------------------------------------------------
    @Override
    public void Get_All_Rows(JTable table)
    {
        data_base.Go.fill_JTable("work_on_data", table);
        
    }
//-----------------------------------------------------------------------------------------------
    @Override
    public void Get_One_Row(JTable table) 
    {
        String Str_Select = "select * from work_on_data where " 
                + "Number = " + Emp_NO + " and " + "Project_NO = " + Project_NO + ";" ;
 
        
        data_base.Go.fill_JTable(Str_Select, table);
        
    }
//-----------------------------------------------------------------------------------------------
    @Override
    public void Get_Custom_Rows(String statement, JTable table)
    {
         data_base.Go.fill_JTable(statement, table);
        
    }
//-----------------------------------------------------------------------------------------------
    @Override
    public String GetValue_By_Name(String name) 
    {
         Tools.MsgBox(" Methode -> GetValue_By_Name() : ' Service Non Disponibles ! ' ");
         return "";
    }
//-----------------------------------------------------------------------------------------------
    @Override
    public String GetName_By_Value(String value) 
    {
         Tools.MsgBox(" Methode -> GetName_By_Value() : ' Service Non Disponibles ! ' ");
         return "";
        
    }

    
// ------------------------Getters & Setters ----------------------------    
    public int getEmp_NO() {
        return Emp_NO;
    }

    public void setEmp_NO(int Emp_NO) {
        this.Emp_NO = Emp_NO;
    }

    public int getProject_NO() {
        return Project_NO;
    }

    public void setProject_NO(int Project_NO) {
        this.Project_NO = Project_NO;
    }

    
    
}
