

package Forms;

import Entity.Departement;
import Entity.Project;
import company.Tools;

/**
 *
 * @author MOSTAPHA
 */
public class Form_Project extends javax.swing.JFrame {

    /** Creates new form Form_Project */
    public Form_Project() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_Group = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Txt_ProjectName = new controls.JTextBox(15);
        Txt_ProjectLocation = new controls.JTextBox(15);
        Txt_ProjectNO = new controls.JTextBox(15);
        Combo_Dept = new controls.JMyCombo();
        Btn_Clear = new controls.JMyButton();
        Btn_back = new controls.JMyButton();
        Btn_Add = new controls.JMyButton();
        Btn_Update = new controls.JMyButton();
        Btn_Delete = new controls.JMyButton();
        Btn_Find = new controls.JMyButton();
        Btn_All = new controls.JMyButton();
        Rdo_Name = new javax.swing.JRadioButton();
        Txt_Search = new controls.JTextBox(15);
        Btn_Search = new controls.JMyButton();
        jLabel2 = new javax.swing.JLabel();
        Rdo_Number = new javax.swing.JRadioButton();
        Rdo_Location = new javax.swing.JRadioButton();
        Rdo_Dept = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_Project = new javax.swing.JTable();
        Btn_Add_Dept1 = new controls.JMyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 48)); // NOI18N
        jLabel1.setText("Projet");

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel5.setText("Numéro du Projet");

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel6.setText("Nom du Projet");

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel7.setText("Local du Projet");

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel8.setText("Département ");

        Txt_ProjectName.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N

        Txt_ProjectLocation.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N

        Txt_ProjectNO.setEditable(false);
        Txt_ProjectNO.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N

        Combo_Dept.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N

        Btn_Clear.setText("Effacer");
        Btn_Clear.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ClearActionPerformed(evt);
            }
        });

        Btn_back.setText("Retour");
        Btn_back.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_backActionPerformed(evt);
            }
        });

        Btn_Add.setText("Ajouter");
        Btn_Add.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AddActionPerformed(evt);
            }
        });

        Btn_Update.setText("Modifier");
        Btn_Update.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UpdateActionPerformed(evt);
            }
        });

        Btn_Delete.setText("Supprimer");
        Btn_Delete.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DeleteActionPerformed(evt);
            }
        });

        Btn_Find.setText("Afficher Projet");
        Btn_Find.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Btn_Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_FindActionPerformed(evt);
            }
        });

        Btn_All.setText("Afficher Tous");
        Btn_All.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Btn_All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AllActionPerformed(evt);
            }
        });

        Rdo_Name.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        Rdo_Name.setText("Nom");
        Rdo_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rdo_NameActionPerformed(evt);
            }
        });

        Txt_Search.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N

        Btn_Search.setText("Recherche");
        Btn_Search.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel2.setText("Recherche par :");

        Rdo_Number.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        Rdo_Number.setSelected(true);
        Rdo_Number.setText("Numéro");
        Rdo_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rdo_NumberActionPerformed(evt);
            }
        });

        Rdo_Location.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        Rdo_Location.setText("Local");
        Rdo_Location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rdo_LocationActionPerformed(evt);
            }
        });

        Rdo_Dept.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        Rdo_Dept.setText("Département");

        Table_Project.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        Table_Project.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numéro Projet", "Nom Projet", "Local Projet", "Numéro Dépt", "Nom Dépt"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table_Project.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_ProjectMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table_Project);

        Btn_Add_Dept1.setText("+");
        Btn_Add_Dept1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        Btn_Add_Dept1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Add_Dept1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_All, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(Btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Txt_ProjectLocation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Combo_Dept, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Btn_Add_Dept1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(Btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txt_ProjectName, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                    .addComponent(Txt_ProjectNO))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(42, 42, 42)
                                        .addComponent(Rdo_Number)
                                        .addGap(36, 36, 36)
                                        .addComponent(Rdo_Name))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Txt_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Rdo_Location)
                        .addGap(38, 38, 38)
                        .addComponent(Rdo_Dept)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(521, 521, 521))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rdo_Number)
                    .addComponent(Rdo_Location)
                    .addComponent(Rdo_Name)
                    .addComponent(jLabel2)
                    .addComponent(Rdo_Dept))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Txt_ProjectNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Txt_ProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Txt_ProjectLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Combo_Dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Add_Dept1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Find, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_All, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Departement dept3 = new Departement();
    Project proj = new Project();
    
//-----------------------------------------------------------------------------------------------------------
    private void Clear_Data()
    {
        Tools.ClearText(this);
        Txt_ProjectNO.setText(proj.Get_Auto_Number());
        
        Btn_Add.setEnabled(true);
        Btn_Update.setEnabled(false);
        Btn_Delete.setEnabled(false);
      
        Txt_ProjectName.requestFocus();
    }
//-------------------------------------------------------------------------------------------------
    private void Set_Values()
    {
        int P_NO = Integer.parseInt(Txt_ProjectNO.getText());
        String P_Name = Txt_ProjectName.getText();
        String P_Location = Txt_ProjectLocation.getText();
        
        String Dept_Name = Combo_Dept.getSelectedItem().toString(); // cherchons Dept_NO on donnant le nom du departement
        int Dept_NO = Integer.parseInt(dept3.GetValue_By_Name(Dept_Name));
        

        proj.setProject_NO(P_NO);
        proj.setProject_Name(P_Name);
        proj.setLocation(P_Location);
        proj.setDept_NO(Dept_NO);

    }       
    
    
    private void Btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ClearActionPerformed
        Clear_Data();
    }//GEN-LAST:event_Btn_ClearActionPerformed

    private void Btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_backActionPerformed
           
        this.dispose();
        Tools.OpenForm(new Form_Main());
        
    }//GEN-LAST:event_Btn_backActionPerformed

    private void Btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AddActionPerformed

        Set_Values();
        proj.Add();
        Clear_Data();
        
        proj.Get_All_Rows(Table_Project);

    }//GEN-LAST:event_Btn_AddActionPerformed

    private void Btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UpdateActionPerformed

        Set_Values();
        proj.Update();
        Clear_Data();
        
        proj.Get_All_Rows(Table_Project);

    }//GEN-LAST:event_Btn_UpdateActionPerformed

    private void Btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DeleteActionPerformed
        if(Tools.Confirm_Msg(" Voulez vous vraiment supprimer le Projet ?! "))
        {
            Set_Values();
            proj.Delete();
            Clear_Data();
            
            proj.Get_All_Rows(Table_Project);
        }
    }//GEN-LAST:event_Btn_DeleteActionPerformed

    private void Btn_FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_FindActionPerformed

        String Str_ProjNO = (String)Tools.InputBox(" Veillez saisir le numéro du Projet !");
        int ProjNO = Integer.parseInt(Str_ProjNO);

        proj.setProject_NO(ProjNO);
        proj.Get_One_Row(Table_Project);

    }//GEN-LAST:event_Btn_FindActionPerformed

    private void Btn_AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AllActionPerformed

        proj.Get_All_Rows(Table_Project);

    }//GEN-LAST:event_Btn_AllActionPerformed

    private void Rdo_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rdo_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rdo_NameActionPerformed

    private void Btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SearchActionPerformed

        String Str_Search = "select * from project_data where " ;

        if(Rdo_Number.isSelected())
        {
            Str_Search += "Project_NO";
        }
        else if(Rdo_Name.isSelected())
        {
            Str_Search += "Project_Name";
        }
        else if(Rdo_Location.isSelected())
        {
            Str_Search += "Location";
        }
        else 
        {
            Str_Search += "Departement";
        }

        Str_Search += " like '%" + Txt_Search.getText() +  "%' ;";

       proj.Get_Custom_Rows(Str_Search, Table_Project);

    }//GEN-LAST:event_Btn_SearchActionPerformed

    private void Rdo_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rdo_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rdo_NumberActionPerformed

    private void Rdo_LocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rdo_LocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rdo_LocationActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         
         Btn_Group.add(Rdo_Number);
         Btn_Group.add(Rdo_Name);
         Btn_Group.add(Rdo_Location);
         Btn_Group.add(Rdo_Dept);
         
         data_base.Go.Fill_Combo("departement", "DeptName", Combo_Dept);
         
         proj.Get_All_Rows(Table_Project);
         
         Clear_Data();
         
         Table_Project.getTableHeader().setReorderingAllowed(false);
         
         
    }//GEN-LAST:event_formWindowOpened

    
    
    private void Btn_Add_Dept1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Add_Dept1ActionPerformed

        int DeptNO =Integer.parseInt(dept3.Get_Auto_Number());
        String DeptName = (String)Tools.InputBox(" Saisir le nom du département !");
        String Location = (String)Tools.InputBox(" Saisir le local du département !");

        dept3.setDept_NO(DeptNO);
        dept3.setDept_Name(DeptName);
        dept3.setLocation(Location);

        dept3.Add();

        data_base.Go.Fill_Combo("departement", "DeptName", Combo_Dept);

    }//GEN-LAST:event_Btn_Add_Dept1ActionPerformed

    private void Table_ProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_ProjectMouseClicked
          
        
            try
            {
            int row = Table_Project.getSelectedRow();
            
            String Str_Number =Table_Project.getValueAt(row, 0).toString();
            String Str_Name =Table_Project.getValueAt(row, 1).toString();
            String Str_Local =Table_Project.getValueAt(row, 2).toString();
            String Str_DeptName =Table_Project.getValueAt(row, 4).toString();
            
            Txt_ProjectNO.setText(Str_Number);
            Txt_ProjectName.setText(Str_Name);
            Txt_ProjectLocation.setText(Str_Local);
            Combo_Dept.setSelectedItem(Str_DeptName);
            
            
            Btn_Add.setEnabled(false);
            Btn_Update.setEnabled(true);
            Btn_Delete.setEnabled(true);
            
            }
            catch(Exception ex)
            {
                Tools.MsgBox(ex.getMessage());
            }
                               
    }//GEN-LAST:event_Table_ProjectMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Project().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private controls.JMyButton Btn_Add;
    private controls.JMyButton Btn_Add_Dept1;
    private controls.JMyButton Btn_All;
    private controls.JMyButton Btn_Clear;
    private controls.JMyButton Btn_Delete;
    private controls.JMyButton Btn_Find;
    private javax.swing.ButtonGroup Btn_Group;
    private controls.JMyButton Btn_Search;
    private controls.JMyButton Btn_Update;
    private controls.JMyButton Btn_back;
    private controls.JMyCombo Combo_Dept;
    private javax.swing.JRadioButton Rdo_Dept;
    private javax.swing.JRadioButton Rdo_Location;
    private javax.swing.JRadioButton Rdo_Name;
    private javax.swing.JRadioButton Rdo_Number;
    private javax.swing.JTable Table_Project;
    private javax.swing.JTextField Txt_ProjectLocation;
    private javax.swing.JTextField Txt_ProjectNO;
    private javax.swing.JTextField Txt_ProjectName;
    private javax.swing.JTextField Txt_Search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}