
package company;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Tools
{
    
    public static void MsgBox(String message)
    {
        JOptionPane.showMessageDialog(null, message);
    }
//------------------------------------------------------------------------------------------
    public static boolean Confirm_Msg(String Msg)
    {
        int Msg_C = JOptionPane.showConfirmDialog(null, Msg);
        if(Msg_C == JOptionPane.YES_OPTION)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
//------------------------------------------------------------------------------------------
    public static Object InputBox(String Title)
    {
        Object myObj = JOptionPane.showInputDialog(Title);
        return myObj;
    
    }
//--------------------------------------------------------------------------------------------     
    public static void CreateFolder( String Folder_Name, String Path)
    {
        File f = new File(Path + "/" + Folder_Name);
        f.mkdir();
    }
                        /*-------------------------------------*/
     public static void CreateFolder( String Folder_Name)
    {
        File f = new File(Folder_Name);
        f.mkdir();
    }
//----------------------------------------------------------------------------------------------
     public static void CreateEmptyFile(String File_Name)
     {
        try 
        {
            File f = new File(File_Name + ".txt");
            f.createNewFile();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
     }
//----------------------------------------------------------------------------------------------
     public static void CreateEmptyFile_s(String Files_Names[])
     {
         for (String str : Files_Names)
         {
             CreateEmptyFile(str);
         }
     }
 //-------------------------------------------------------------------------------------------
     public static void CreateFile(String File_Name, Object data[])
     {
        try 
        {
            PrintWriter p = new PrintWriter(File_Name + ".txt"); 
            for(Object obj : data)
            {
                p.println(obj);
            }
            p.close();
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
//-------------------------------------------------------------------------------------------
     public static void CreateFile_s(String Files_Names[], Object All_Data[][] )
     {
         
         for(int x=0; x< Files_Names.length ; x++)
         {
             CreateFile(Files_Names[x], All_Data[x]);
         }
        
         
     }
     
//---------------------------------------------------------------------------------------------
     public static void OpenForm(JFrame My_Form)
     {
        try 
        {
            My_Form.setLocationRelativeTo(null);
            Image img = ImageIO.read(Tools.class.getResource("admin.png"));
            My_Form.setIconImage(img);
            My_Form.setDefaultCloseOperation(2);
            My_Form.setVisible(true);
        }
        catch (IOException ex) 
        {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
 //---------------------------------------------------------------------------------------------
     public static void ClearText(Container CTNR)
     {
         for(Component c : CTNR.getComponents())
         {
             if(c instanceof JTextField)
             {
                 JTextField txt = (JTextField)c;
                 txt.setText("");
             }
             else if (c instanceof Container) // si la page contient autre contenaire
             {
                 ClearText((Container)c);
             }
         }
     
     }
 //-----------------------------------------------------------------------------------------------
     public static String getNumber(String Text)
     {
         String val="";
         for(char c : Text.toCharArray())
         {
             if(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9')
             {
                 val += c;
             }
         }
         return val;
     }
 //------------------------------------------------------------------------------------------------
     public static int getNumberToInteger(String Text)
     {
         String val="";
         for(char c : Text.toCharArray())
         {
             if(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9')
             {
                 val += c;
             }
         }
         return Integer.parseInt(val);
     }
//--------------------------------------------------------------------------------------
     public static String RemoveNumber(String Text)
     {
         String val="";
         for(char c : Text.toCharArray())
         {
             if(   ! (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9')  )
             {
                 val += c;
             }
         }
         return val;
     }     
 //--------------------------------------------------------------------------------------
     public static void PrintScreen(String Image_Name)
     {
        try
        {
            Robot r = new Robot();
            Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage img = r.createScreenCapture(rec);
            
            ImageIO.write( img, "jpg" , new File(Image_Name + ".jpg"));
            
       
        }
        catch (Exception ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
                    /*-----------------------------------------*/
        public static void PrintScreen(String Image_Name, JFrame Form)
     {
        try
        {
            Form.setState(1);
            Robot r = new Robot();
            Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage img = r.createScreenCapture(rec);
            
            ImageIO.write( img, "jpg" , new File(Image_Name + ".jpg"));
            
            Form.setState(0);
        }
        catch (Exception ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
     }

//________________________________________________________________________________________
    
    public static class StringTools {
    
        private static String Inverse_Text;
        
        public static  void Print_Char_By_Char(String text)
        {
            for(char c : text.toCharArray())
            {
                System.out.println(c);
            }
        }
 //-------------------------------------------------------------------------------------- 
      /*
        public static void Print_CharByChar_Inverse(String text)
        {
            StringBuidler sb = new StringBuidler(text);
            
        }
       */
    }
  //________________________________________________________________________________________
    public class Table
    {
            public int columns;
            public Object[][] Items;
            
//--------------------------------------------------------------------------------------             
            public Table(int columns)
            {
                this.columns = columns;
                Items = new Object[0][columns]; 
                
            }
//-------------------------------------------------------------------------------------- 
            public void Add_New_Row(Object row[])
            {
                // conservation des enciens elements dans une variable temporaire
                Object TempItems[][] = Items;
                
                // incrementation de la variable principal pa 1
                Items = new Object[Items.length + 1][columns];
     
                // charger la nouvelle variable par la var temporaire
     
                for( int x=0; x < TempItems.length; x++)
                {
                    Items[x] = TempItems[x];
                }
                
                //ajouter la nouvelle ligne a notre variable principale
                Items[Items.length - 1 ] = row;
            }
//-------------------------------------------------------------------------------------- 
            public void Print_Items()
            {
                for(Object objs[] : Items)
                {
                    for(Object obj : objs)
                    {
                        System.out.print(obj + " ; ");
                    }
                    System.out.println();
                }
  
            }
//-------------------------------------------------------------------------------------- 
            public void Edit_Row(int Row_Index, int Columns_Index, Object New_Data[][])
            {
                Items[Row_Index][Columns_Index] = New_Data;
            }
  
        }
//________________________________________________________________________________________ 
    public class MergeArray 
    {
        
        public Object[] array1;
        public Object[] array2;

        //constructor
        public MergeArray(Object[] array1 , Object[] array2)
        {
            this.array1 = array1;
            this.array2 = array2;
        }
 //--------------------------------------------------------------------------------------       
        public Object[] Merge_Two_Arrays()
        {
            int a1 = array1.length;
            int a2 = array2.length;
            
            Object[] arrayR = new Object[a1 + a2];
            
            System.arraycopy(array1, 0, arrayR, 0, a1);
            System.arraycopy(array2, 0, arrayR, a1, a2);
            
            return arrayR;

        }
  
    }
//__________________________________________________________________________________________________
    
    public static void Set_Report(JTable table)
    {
        table.getTableHeader().setBackground(new Color(0,0,100));
        table.getTableHeader().setForeground(Color.white);
        
    }
 //-------------------------------------------------------------------------------------------------
    public static void Print_Report(JTable table, String title)
    {
               
        try
        {
            //Table_Dept.print(); --> impression simple
            
            MessageFormat header = new MessageFormat("Rapport " + title);
            MessageFormat footer = new MessageFormat("Page - {0}");
            
            table.print(JTable.PrintMode.FIT_WIDTH,header,footer);
            
        }
        catch(Exception ex)
        {
            Tools.MsgBox(ex.getMessage());
        }
        
    }
    
    
}