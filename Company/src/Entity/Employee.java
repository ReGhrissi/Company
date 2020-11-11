
package Entity;

import company.Tools;
import javax.swing.JTable;

/**
 *
 * @author MOSTAPHA
 */
public class Employee implements Main_Data
{
    private int Emp_NO;
    private String Emp_Name;
    private String Address;
    private double Salary;
    private String Hiring_Date;
    private String Birth_Date;
    private int Dept_NO;
    
    
//----------------------------------------------------------------------------------------------------    
    @Override
    public void Add() 
    {    
        if( Emp_Name.equals("") || Address.equals("") || Salary == 0 || Hiring_Date.equals("") || Birth_Date.equals(""))
        {
             Tools.MsgBox(" Employé : Veillez saisir tous les champs !");
        }
        else
        {
            String Str_Insert = "insert into employee values (" + Emp_NO + ", '" + Emp_Name + "', "
                                + "' " + Address + "', " + Salary + ", '"  + Hiring_Date + "', '" + Birth_Date + "', "     
                                + Dept_NO + ");" ;

           // appelation de la methode Run_nonQuery pour verifier si notre requet SQL est executé ou non
           boolean isAdd = data_base.Go.Run_nonQuery(Str_Insert); // true or false

           if(isAdd)
           {
               Tools.MsgBox(" Employé : ' Les données ont été ajoutés avec succes ! ' ");
           }
        
        }
    }
//---------------------------------------------------------------------------------------------------- 
    @Override
    public void Update() 
    {
        String Str_Update = "update employee set " + "EmpName = '" + Emp_Name + "' , " 
                        + "Address = '" + Address + "' , " + " Salary = " + Salary + " , HiringDate = '" 
                        + Hiring_Date + "' , BirthDate = '" + Birth_Date +"' , DeptNO = " + Dept_NO
                        + " where EmpNO = " + Emp_NO + ";" ;
        
        boolean isUpdate = data_base.Go.Run_nonQuery(Str_Update);
        if(isUpdate)
        {
            Tools.MsgBox(" Employé : ' Les Mises-à-Jour ont été fait avec succes ! ' ");
        }
    }
//---------------------------------------------------------------------------------------------------- 
    @Override
    public void Delete() 
    {
        String Str_Delete = "delete from employee where " + "EmpNO = " + Emp_NO + ";";
        
        boolean isDetete = data_base.Go.Run_nonQuery(Str_Delete);
        if(isDetete)
        {
            Tools.MsgBox(" Employé : ' L'employé a été supprimé avec succes ! ' ");
        }
    }
//---------------------------------------------------------------------------------------------------- 
    @Override
    public String Get_Auto_Number() 
    {
        //  elle renvoi le ID de l avant derniere ligne pour des raisons de saisi dans le tableau
        
        String Str_Auto = data_base.Go.Get_Auto_Number("employee", "EmpNo");
        
        return Str_Auto;
        
    }
//---------------------------------------------------------------------------------------------------- 
    @Override
    public void Get_All_Rows(JTable table) 
    {
        data_base.Go.fill_JTable("employee_data", table);
      

     // --> dans ce cas on aura une case supplimentaire qui indique 'Nom du departement' qui va etre affiché
    // car le view de l employee contient 8 cases au lieu de 7
    }
//---------------------------------------------------------------------------------------------------- 
    @Override
    public void Get_One_Row(JTable table) 
    {
        String Str_Select = "select * from employee_data where " + "Number = " + Emp_NO + ";" ;
        

       //  n'oublie pas de changer "EmpNO" par "Number"
        
        data_base.Go.fill_JTable(Str_Select, table);
    }
//---------------------------------------------------------------------------------------------------- 
    @Override
    public void Get_Custom_Rows(String statement, JTable table) 
    {
         // cherchons des elements (lignes) dans le tableau en utilisant des requets SQL 
        // par exemple : statement -> "select * from employee where EmpNO = 1" 
        
        data_base.Go.fill_JTable(statement, table);
    }
//---------------------------------------------------------------------------------------------------- 
    @Override
    public String GetValue_By_Name(String name) 
    {
        // Tools.MsgBox(dept.GetValue_By_Name("Informatique"));
        
        String Str_Select = "select EmpNO from employee where " + "EmpName = '" + name + "';" ;
        
       
        String Str_Value = (String)data_base.Go.Get_Table_Data(Str_Select).Items[0][0];
                                     // Get_Table_Data est un array de type Object --> Items
                                   // Items[0}[0} specification de la premiere case car il y on a 
                                  //une seul valeur qui est declaré unique dans le tableau employee 
        
        return Str_Value; // (String)data_Base......... --> car la methode GetValue_By_Name 
                      //   renvoi un String
       
    }
//---------------------------------------------------------------------------------------------------- 
    @Override
    public String GetName_By_Value(String value) 
    {
        String Str_Select = "select EmpName from employee where " + "EmpNO = " + value + ";" ;
        
        // ici c'est pas lappel d utiliser le view employee_data car on va afficher un nom
       
        String Str_Name = (String)data_base.Go.Get_Table_Data(Str_Select).Items[0][0];
        
        return Str_Name;
        
    }
   
    
// ------------------------ Getters & Setters -------------------------------------------
    public int getEmp_NO() {
        return Emp_NO;
    }

    public void setEmp_NO(int Emp_NO) {
        this.Emp_NO = Emp_NO;
    }

    public String getEmp_Name() {
        return Emp_Name;
    }

    public void setEmp_Name(String Emp_Name) {
        this.Emp_Name = Emp_Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getHiring_Date() {
        return Hiring_Date;
    }

    public void setHiring_Date(String Hiring_Date) {
        this.Hiring_Date = Hiring_Date;
    }

    public String getBirth_Date() {
        return Birth_Date;
    }

    public void setBirth_Date(String Birth_Date) {
        this.Birth_Date = Birth_Date;
    }

    public int getDept_NO() {
        return Dept_NO;
    }

    public void setDept_NO(int Dept_NO) {
        this.Dept_NO = Dept_NO;
    }
    
    
}
