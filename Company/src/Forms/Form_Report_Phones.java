
package Forms;

import Entity.Employee_Phones;
import company.Tools;

/**
 *
 * @author MOSTAPHA
 */
public class Form_Report_Phones extends javax.swing.JFrame {

    /**
     * Creates new form Form_Report_Phones
     */
    public Form_Report_Phones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_Group = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_Contact = new javax.swing.JTable();
        Btn_All = new controls.JMyButton();
        Btn_Print = new controls.JMyButton();
        jLabel1 = new javax.swing.JLabel();
        Btn_back = new controls.JMyButton();
        Rdo_Number = new javax.swing.JRadioButton();
        Rdo_Contact = new javax.swing.JRadioButton();
        Rdo_Name = new javax.swing.JRadioButton();
        Txt_Search = new controls.JTextBox(15);
        Btn_Search = new controls.JMyButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Table_Contact.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        Table_Contact.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Employé", "Nom Employé", "Contacts Employé"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table_Contact.setToolTipText("");
        Table_Contact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_ContactMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table_Contact);

        Btn_All.setText("Afficher Tous");
        Btn_All.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Btn_All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AllActionPerformed(evt);
            }
        });

        Btn_Print.setText("Imprimer");
        Btn_Print.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Btn_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PrintActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel1.setText("Rapport Contact");

        Btn_back.setText("Retour");
        Btn_back.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_backActionPerformed(evt);
            }
        });

        Rdo_Number.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        Rdo_Number.setSelected(true);
        Rdo_Number.setText("ID Employé");
        Rdo_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rdo_NumberActionPerformed(evt);
            }
        });

        Rdo_Contact.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        Rdo_Contact.setText("Contacts Employé");
        Rdo_Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rdo_ContactActionPerformed(evt);
            }
        });

        Rdo_Name.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        Rdo_Name.setText("Nom Employé");
        Rdo_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rdo_NameActionPerformed(evt);
            }
        });

        Txt_Search.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        Txt_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_SearchActionPerformed(evt);
            }
        });

        Btn_Search.setText("Recherche");
        Btn_Search.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel2.setText("Recherche par :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Txt_Search)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(141, 141, 141)
                        .addComponent(Rdo_Number)
                        .addGap(249, 249, 249)
                        .addComponent(Rdo_Name)
                        .addGap(184, 184, 184)
                        .addComponent(Rdo_Contact)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(428, 428, 428))
            .addGroup(layout.createSequentialGroup()
                .addGap(536, 536, 536)
                .addComponent(Btn_All, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Rdo_Number)
                    .addComponent(Rdo_Contact)
                    .addComponent(Rdo_Name))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_All, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Print, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     Employee_Phones emp_ph = new Employee_Phones();
    
    
    private void Table_ContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_ContactMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Table_ContactMouseClicked

    private void Btn_AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AllActionPerformed

        data_base.Go.fill_JTable("employee_phones_data", Table_Contact);

    }//GEN-LAST:event_Btn_AllActionPerformed

    private void Btn_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PrintActionPerformed

        Tools.Print_Report(Table_Contact, "Contacts");

    }//GEN-LAST:event_Btn_PrintActionPerformed

    private void Btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_backActionPerformed

        this.dispose();
        Tools.OpenForm(new Form_Repports());
        
    }//GEN-LAST:event_Btn_backActionPerformed

    private void Rdo_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rdo_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rdo_NumberActionPerformed

    private void Rdo_ContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rdo_ContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rdo_ContactActionPerformed

    private void Rdo_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rdo_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rdo_NameActionPerformed

    private void Txt_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_SearchActionPerformed
        
   
    
    private void Btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SearchActionPerformed

        String Str_Search = "select * from employee_phones_data where " ;

        if(Rdo_Number.isSelected())
        {
            Str_Search += "Number";
        }
        else if(Rdo_Name.isSelected())
        {
            Str_Search += "Name";
        }
        else
        {
            Str_Search += "Phone";
        }

        Str_Search += " like '%" + Txt_Search.getText() +  "%' ;";

        data_base.Go.fill_JTable(Str_Search, Table_Contact);
        
        
    }//GEN-LAST:event_Btn_SearchActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
         Btn_Group.add(Rdo_Number);
         Btn_Group.add(Rdo_Name);
         Btn_Group.add(Rdo_Contact);
        
        data_base.Go.fill_JTable("employee_phones_data", Table_Contact);
        
        Tools.Set_Report(Table_Contact);
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Form_Report_Phones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Report_Phones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Report_Phones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Report_Phones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Report_Phones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private controls.JMyButton Btn_All;
    private javax.swing.ButtonGroup Btn_Group;
    private controls.JMyButton Btn_Print;
    private controls.JMyButton Btn_Search;
    private controls.JMyButton Btn_back;
    private javax.swing.JRadioButton Rdo_Contact;
    private javax.swing.JRadioButton Rdo_Name;
    private javax.swing.JRadioButton Rdo_Number;
    private javax.swing.JTable Table_Contact;
    private javax.swing.JTextField Txt_Search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}