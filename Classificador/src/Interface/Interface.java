/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.io.File;
import java.io.FilenameFilter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import classificador.*;
/**
 *
 * @author jorge
 */
public class Interface extends javax.swing.JFrame {

    private String paDocuments [][];
    private Classificador poClassificador;
    /**
     * Creates new form Interface
     */
    public Interface() {
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

        jPanel1 = new javax.swing.JPanel();
        cmbSelFil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFilesSelected = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListFiles = new javax.swing.JTable();
        cmbMoveItem = new javax.swing.JButton();
        cmbReturnItem = new javax.swing.JButton();
        cmbMoveAll = new javax.swing.JButton();
        cmbReturnAll = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblBegin = new javax.swing.JLabel();
        spnBegin = new javax.swing.JSpinner();
        spnEnd = new javax.swing.JSpinner();
        lblEnd = new javax.swing.JLabel();
        cmbMoveRange = new javax.swing.JButton();
        cmbExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cmbTraining = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spnFolds = new javax.swing.JSpinner();
        pgbProgress = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Classificador de textos");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cmbSelFil.setText("Select FIles");
        cmbSelFil.setToolTipText("");
        cmbSelFil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbSelFilMousePressed(evt);
            }
        });

        tblFilesSelected.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Testing's Files"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFilesSelected);
        if (tblFilesSelected.getColumnModel().getColumnCount() > 0) {
            tblFilesSelected.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblFilesSelected.getColumnModel().getColumn(0).setMaxWidth(300);
        }

        tblListFiles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "List Files"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblListFiles);
        if (tblListFiles.getColumnModel().getColumnCount() > 0) {
            tblListFiles.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblListFiles.getColumnModel().getColumn(0).setMaxWidth(300);
        }

        cmbMoveItem.setText(">");
        cmbMoveItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbMoveItemMousePressed(evt);
            }
        });

        cmbReturnItem.setText("<");
        cmbReturnItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbReturnItemMousePressed(evt);
            }
        });

        cmbMoveAll.setText(">>");
        cmbMoveAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbMoveAllMousePressed(evt);
            }
        });

        cmbReturnAll.setText("<<");
        cmbReturnAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbReturnAllMousePressed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setName(""); // NOI18N

        lblBegin.setText("Begin");

        spnBegin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                spnBeginFocusLost(evt);
            }
        });

        lblEnd.setText("End");

        cmbMoveRange.setText(">>");
        cmbMoveRange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbMoveRangeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblBegin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(spnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(cmbMoveRange, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnBegin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBegin)
                    .addComponent(cmbMoveRange)
                    .addComponent(spnEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbSelFil)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbMoveAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbReturnAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbMoveItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbReturnItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(123, 123, 123))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbSelFil)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(cmbMoveItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbReturnItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbMoveAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbReturnAll))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cmbExit.setText("Exit");
        cmbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbExitMousePressed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cmbTraining.setText("Training");
        cmbTraining.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbTrainingMousePressed(evt);
            }
        });

        jLabel1.setText("Cross Validation");

        jLabel2.setText("N° Folds:");

        pgbProgress.setStringPainted(true);
        pgbProgress.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pgbProgressStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(spnFolds, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbTraining, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(pgbProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spnFolds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTraining))
                .addGap(18, 18, 18)
                .addComponent(pgbProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmbExit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(cmbExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbSelFilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbSelFilMousePressed
        // TODO add your handling code here:
        this.mxSelectFiles();
    }//GEN-LAST:event_cmbSelFilMousePressed

    private void spnBeginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spnBeginFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_spnBeginFocusLost

    private void cmbMoveItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbMoveItemMousePressed
        // TODO add your handling code here:
        this.mxMoveItem();
    }//GEN-LAST:event_cmbMoveItemMousePressed

    private void cmbReturnItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbReturnItemMousePressed
        // TODO add your handling code here:
        this.mxReturnItem();
    }//GEN-LAST:event_cmbReturnItemMousePressed

    private void cmbMoveAllMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbMoveAllMousePressed
        // TODO add your handling code here:
        this.mxMoveAll();
    }//GEN-LAST:event_cmbMoveAllMousePressed

    private void cmbMoveRangeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbMoveRangeMousePressed
        // TODO add your handling code here:
        this.mxMoveRange();
    }//GEN-LAST:event_cmbMoveRangeMousePressed

    private void cmbReturnAllMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbReturnAllMousePressed
        // TODO add your handling code here:
        this.mxReturnAll();
    }//GEN-LAST:event_cmbReturnAllMousePressed

    private void cmbExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbExitMousePressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cmbExitMousePressed

    private void cmbTrainingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbTrainingMousePressed
        // TODO add your handling code here:
        this.mxStartTraining();
    }//GEN-LAST:event_cmbTrainingMousePressed

    private void pgbProgressStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pgbProgressStateChanged
        // TODO add your handling code here:
        if(this.pgbProgress.getValue() == 100)
            JOptionPane.showMessageDialog(null, "Training Complete!");
    }//GEN-LAST:event_pgbProgressStateChanged

    private void mxMoveAll()
    {
        DefaultTableModel loModelList = (DefaultTableModel)this.tblListFiles.getModel();
        DefaultTableModel loModelSelected = (DefaultTableModel)this.tblFilesSelected.getModel();
        int lnNumFiles = loModelList.getRowCount();
        
        for(int i = 0; i < lnNumFiles; i++)
        {
            loModelSelected.addRow(new Object[]{loModelList.getValueAt(0, NORMAL)});
            loModelList.removeRow(0);
        }
    }
    
    private void mxReturnAll()
    {
        DefaultTableModel loModelList = (DefaultTableModel)this.tblListFiles.getModel();
        DefaultTableModel loModelSelected = (DefaultTableModel)this.tblFilesSelected.getModel();
        int lnNumFiles = loModelSelected.getRowCount();
        
        for(int i = 0; i < lnNumFiles; i++)
        {
            loModelList.addRow(new Object[]{loModelSelected.getValueAt(0, NORMAL)});
            loModelSelected.removeRow(0);
        }
    }
    
    private void mxMoveItem()
    {
        int lnFilSel = this.tblListFiles.getSelectedRow();
        
        if(lnFilSel < 0)
        {
            return;
        }
        
        DefaultTableModel loModelList = (DefaultTableModel)this.tblListFiles.getModel();
        DefaultTableModel loModelSelected = (DefaultTableModel)this.tblFilesSelected.getModel();
        loModelSelected.addRow(new Object[]{loModelList.getValueAt(lnFilSel, NORMAL)});
        loModelList.removeRow(lnFilSel);
    }
    
    private void mxReturnItem()
    {
        int lnFilSel = this.tblFilesSelected.getSelectedRow();
        if(lnFilSel < 0)
        {
            return;
        }
        DefaultTableModel loModelList = (DefaultTableModel)this.tblListFiles.getModel();
        DefaultTableModel loModelSelected = (DefaultTableModel)this.tblFilesSelected.getModel();
        loModelList.addRow(new Object[]{loModelSelected.getValueAt(lnFilSel, NORMAL)});
        loModelSelected.removeRow(lnFilSel);
    }
    
    private void mxMoveRange()
    {
        DefaultTableModel loModelList = (DefaultTableModel)this.tblListFiles.getModel();
        DefaultTableModel loModelSelected = (DefaultTableModel)this.tblFilesSelected.getModel();
        int lnNumFiles = loModelList.getRowCount();
        
        for(int i = 0; i < lnNumFiles; i++)
        {
            loModelSelected.addRow(new Object[]{loModelList.getValueAt(0, NORMAL)});
            loModelList.removeRow(0);
        }
    }    
    
    private void mxSelectFiles()
    {
        JFileChooser loFileChooser = new JFileChooser();
        File loFolderSelected, laListFiles[];
        FilenameFilter loNameFilter;
        int result = 0;
        
        loFileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        loFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        loFileChooser.setAcceptAllFileFilterUsed(false);
        
        result = loFileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) 
        {
            loFolderSelected = loFileChooser.getSelectedFile();
            loNameFilter = new FilenameFilter() 
            {   
                @Override
                public boolean accept(File dir, String name) 
                {
                    if(name.lastIndexOf('.') > 0)
                    {
                        int lastIndex = name.lastIndexOf('.');
                        String str = name.substring(lastIndex);
                        return str.equals(".txt");
                    }
                   return false;
                }
            };
            laListFiles = loFolderSelected.listFiles(loNameFilter);
            for (File loFile: laListFiles)
            {
                if (loFile.isFile())
                    ((DefaultTableModel)this.tblListFiles.getModel()).addRow(new Object[]{loFile.getName()});                
            }
        }     
    }
    
    private void mxStartTraining()
    {
        new Thread(){
            @Override
            public void run()
            {
                for(int i = 0; i <= 10000; i++)
                {
                    if(i%100 == 0)
                        pgbProgress.setValue(i/100);
                    for(int j = 0; j < 100;j++)
                        System.out.println("s");
                }
            }
        }.start();
    }
    
    private void mxLearnNaiveBayesText(int tnBeginTeste, int tnEndTeste)
    {
        int lnNumDocs = 0, lnNumClasses = this.paDocuments.length;
        
        this.mxCollectWords();
        
        for(int i = 0; i < lnNumClasses; i++)
        {
            lnNumDocs = this.paDocuments[i].length;
            //Class Probability 
            this.poClassificador.setProbaClass(i, (float)lnNumDocs/(float)this.poClassificador.getNumDocs());
        }
    }
    
    private void mxCollectWords()
    {
        int lnNumDoc = 0, lnNumClasses = this.paDocuments.length;
        
        for(int i = 0; i < lnNumClasses; i++)
        {
            lnNumDoc = this.paDocuments[i].length;
            for(int j = 0; j < lnNumDoc; j++)
            {
                this.poClassificador.mxAddDocument(this.paDocuments[i][j], i);
            }
        }
    }
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbExit;
    private javax.swing.JButton cmbMoveAll;
    private javax.swing.JButton cmbMoveItem;
    private javax.swing.JButton cmbMoveRange;
    private javax.swing.JButton cmbReturnAll;
    private javax.swing.JButton cmbReturnItem;
    private javax.swing.JButton cmbSelFil;
    private javax.swing.JButton cmbTraining;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBegin;
    private javax.swing.JLabel lblEnd;
    private javax.swing.JProgressBar pgbProgress;
    private javax.swing.JSpinner spnBegin;
    private javax.swing.JSpinner spnEnd;
    private javax.swing.JSpinner spnFolds;
    private javax.swing.JTable tblFilesSelected;
    private javax.swing.JTable tblListFiles;
    // End of variables declaration//GEN-END:variables
}
