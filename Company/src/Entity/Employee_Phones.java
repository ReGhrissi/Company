
package Entity;

import company.Tools;
import javax.swing.JTable;

/**
 *
 * @author MOSTAPHA
 */
public class Employee_Phones implements Main_Data
{
    private int Emp_NO;
    private String Phone;
    
//----------------------------------------------------------------------------------------------- 
    public String Get_EmpNO_By_Phone( String s_phone)
    {
        String Str_Select = "select EmpNO from employee_phones where phone = '" + s_phone + "';" ;
        
        Object row[][] = data_base.Go.Get_Table_Data(Str_Select).Items;
        String STR_EmpNO = "";
        
        if(row .length > 0) // cad si row[}[} n'est pas vide (contient au moins une ligne)
        {
            STR_EmpNO = (String)row[0][0];
        }
        else
        {
            STR_EmpNO = "0";
        }
        
        return STR_EmpNO;
    }
    
//----------------------------------------------------------------------------------------------- 
    @Override
    public void Add() 
    {
        String Str_Insert = "insert into employee_phones values (" + Emp_NO + ", '" + Phone + "') ";
                           
        
       // appelation de la methode Run_nonQuery pour verifier si notre requet SQL est executé ou non
       boolean isAdd = data_base.Go.Run_nonQuery(Str_Insert); // true or false
       
       if(isAdd)
       {
           //Tools.MsgBox(" Employé : ' Les données ont été ajoutés avec succes ! ' ");
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
        String Str_Delete = "delete from employee_phones where " + "EmpNO = " + Emp_NO + " and Phone = '"
                            + Phone + "' ;" ;
        
        boolean isDetete = data_base.Go.Run_nonQuery(Str_Delete);
        if(isDetete)
        {
           // Tools.MsgBox(" Employé : ' Le numéro de téléphone a été supprimé avec succes ! ' ");
        }
    }
                    //-----------------------------------------------
    
    public void Delete_By_emp()
    {
         String Str_Delete = "delete from employee_phones where " + "EmpNO = " + Emp_NO + " ;" ;
     
        boolean isDetete = data_base.Go.Run_nonQuery(Str_Delete);
        if(isDetete)
        {
            //Tools.MsgBox(" Employé : ' Tous Les numéros de téléphone de cet employé a été supprimé avec succes ! ' ");
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
         String Str_Select = "select phone from employee_phones where EmpNO = " + Emp_NO + ";" ;
        
         data_base.Go.fill_JTable(Str_Select, table);
    }
//----------------------------------------------------------------------------------------------- 
    @Override
    public void Get_One_Row(JTable table)
    {
        Tools.MsgBox(" Methode -> Get_One_Row() : ' Service Non Disponibles ! ' ");
       
    }
//----------------------------------------------------------------------------------------------- 
    @Override
    public void Get_Custom_Rows(String statement, JTable table) 
    {
        Tools.MsgBox(" Methode -> Get_Custom_Rows() : ' Service Non Disponibles ! ' ");
        
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
    
    
//--------------------------- Getters & Setters -----------------------
    public int getEmp_NO() {
        return Emp_NO;
    }

    public void setEmp_NO(int Emp_NO) {
        this.Emp_NO = Emp_NO;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }


    
}
