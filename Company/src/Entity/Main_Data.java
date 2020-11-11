
package Entity;

import javax.swing.JTable;

/**
 *
 * @author MOSTAPHA
 */
public interface Main_Data {
    
    public void Add();
    
    public void Update();
    
    public void Delete();
    
    public String Get_Auto_Number();
    
    public void Get_All_Rows(JTable table);
    
    public void Get_One_Row(JTable table);
    
    public void Get_Custom_Rows(String statement, JTable table); // sera utilisé dans la recherche pour des données specifique 
    
    public String GetValue_By_Name(String name);
    
    public String GetName_By_Value(String value);
    
    
}
