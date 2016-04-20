/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.text.DecimalFormat;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JorgeCristhian
 */
public class Results extends javax.swing.JDialog {

    private int paResult[][][];
    private String paClasses[];
    /**
     * Creates new form Results
     */
    public Results(java.awt.Frame parent, boolean modal, int taResult[][][], String taClasses[]) {
        super(parent, modal);
        initComponents();
        this.paResult = taResult;
        this.paClasses = taClasses;
        this.mxInitTables();
        this.mxLoadComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFols = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblConfusionSingle = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblConfusion = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txcPrecis = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txcTVP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txcTFP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txcMedidaF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbbClasses = new javax.swing.JComboBox<>();
        cmbReturn = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Results");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblFols.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fold"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblFols.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tblFols);
        tblFols.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        tblConfusionSingle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblConfusionSingle.setEnabled(false);
        jScrollPane4.setViewportView(tblConfusionSingle);

        jLabel7.setText("Confusion Matrix");

        jLabel9.setText("Standard Deviation:");

        jTextField5.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41))
        );

        jLabel1.setText("Individual Results:");

        jLabel2.setText("General Result:");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblConfusion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblConfusion.setEnabled(false);
        jScrollPane3.setViewportView(tblConfusion);

        jLabel3.setText("Precision:");

        txcPrecis.setEditable(false);
        txcPrecis.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel4.setText("TVP:");

        txcTVP.setEditable(false);
        txcTVP.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel5.setText("TFP:");

        txcTFP.setEditable(false);
        txcTFP.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel6.setText("Medida-F:");

        txcMedidaF.setEditable(false);
        txcMedidaF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel8.setText("Class of Interest:");

        cbbClasses.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbClassesItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbbClasses, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txcPrecis, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txcTVP, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txcTFP, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txcMedidaF, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbbClasses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txcPrecis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txcTVP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txcTFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txcMedidaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cmbReturn.setText("Return");
        cmbReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbReturnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmbReturn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(cmbReturn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbReturnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbReturnMousePressed
        this.dispose();        
    }//GEN-LAST:event_cmbReturnMousePressed

    private void cbbClassesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbClassesItemStateChanged
        // TODO add your handling code here:
        int lnClass = ((BasicComboBoxModelObject)this.cbbClasses.getSelectedItem()).getCodigo();
        
        this.mxCalcularConfusionTotal(lnClass);
    }//GEN-LAST:event_cbbClassesItemStateChanged
    
    public void mxInitTables()
    {
        FormatTable formato = new FormatTable();
        String laColumnas[] = new String[this.paClasses.length + 1];
        Class[] laTypes = new Class[this.paClasses.length + 1];
        
        laColumnas[0] = "Class";
        laTypes[0] = java.lang.String.class;
        int lnCont = 1;
        for(String lsClasse : this.paClasses)
        {
            laColumnas[lnCont] = lsClasse;
            laTypes[lnCont++] = java.lang.Integer.class;
        }   
        final Class [] laTypesFinal = laTypes;
        
        this.tblConfusionSingle.setModel(new javax.swing.table.DefaultTableModel( new Object [][] {},laColumnas)
        {
            Class[] types = laTypesFinal;
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        
        this.tblConfusionSingle.setDefaultRenderer(String.class, formato); 
        this.tblConfusionSingle.setDefaultRenderer(Integer.class, formato);
        
        this.tblConfusion.setModel(new javax.swing.table.DefaultTableModel( new Object [][] {}, laColumnas)
        {
            Class[] types = laTypesFinal;
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        this.tblConfusion.setDefaultRenderer(String.class, formato); 
        this.tblConfusion.setDefaultRenderer(Integer.class, formato);
        
        for(int i = 0; i < this.paResult.length; i++)
        {
            ((DefaultTableModel)this.tblFols.getModel()).addRow(new Object[]{i + 1});
        }
        
        this.tblFols.setDefaultRenderer(Integer.class, formato);
        this.tblFols.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        ListSelectionModel loCellSelectionModel = this.tblFols.getSelectionModel();
        
        loCellSelectionModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                int lnRow = tblFols.getSelectedRow();
                mxLoadConfusionSingle(lnRow);  
            }
        });
    }
    
    private void mxLoadComboBox()
    {
        int lnNumClases = this.paClasses.length;
        Integer laClases[] = new Integer[lnNumClases];
        BasicComboBoxModel loModel;
        
        for(int i = 0; i < lnNumClases; i++)
            laClases[i] = i;
        
        loModel = new BasicComboBoxModel(laClases, this.paClasses);
        this.cbbClasses.setModel(loModel);
        
        this.cbbClasses.setSelectedIndex(0);
    }
    
    private void mxLoadConfusionSingle(int tnFold)
    {
        Object laDatos[];
        int lnNumRows  = this.tblConfusionSingle.getRowCount();
        for(int i = 0; i < lnNumRows; i++)
            ((DefaultTableModel)this.tblConfusionSingle.getModel()).removeRow(0);
        
        for(int i = 0; i < this.paResult[tnFold].length; i++)
        {
            laDatos = new Object[this.paResult[tnFold][i].length + 1];
            laDatos[0] = this.paClasses[i];
            for(int j = 0; j < this.paResult[tnFold][i].length; j++)
            {
                laDatos[j+1] = (Integer)this.paResult[tnFold][i][j];                
            }
            ((DefaultTableModel)this.tblConfusionSingle.getModel()).addRow(laDatos);
        }
    }    
   
    private void mxCalcularConfusionTotal(int tnClasse)
    {
        DecimalFormat loDecimalFormat = new DecimalFormat("0.000");
        FormatTable formato = new FormatTable();
        Object laDatos[];
        int lnNumFolds = this.paResult.length;
        int lnNumClasses = this.paResult[0].length;
        int laResultMedio [][] = new int [lnNumClasses][lnNumClasses];
        String laColumnas[] = new String[3];
        laColumnas[0] = "Class";
        laColumnas[1] = this.paClasses[tnClasse];
        laColumnas[2] = "Other";
        double lnVP = 0, lnFP = 0, lnVN = 0, lnFN = 0;
        
        
        for(int i = 0; i < lnNumFolds; i++)
        {
            for(int j = 0; j < lnNumClasses; j++)
            {
                for(int k = 0; k < lnNumClasses; k++)
                {
                    if(j == tnClasse && k == tnClasse)
                        laResultMedio[0][0] += this.paResult[i][j][k];
                    else if(j == tnClasse)
                        laResultMedio[0][1] += this.paResult[i][j][k];
                    else if(k == tnClasse)
                        laResultMedio[1][0] += this.paResult[i][j][k];
                    else
                        laResultMedio[1][1] += this.paResult[i][j][k];
                }
            }
        }
        
        this.tblConfusion.setModel(new javax.swing.table.DefaultTableModel( new Object [][] {}, laColumnas)
        {
            Class[] types = new Class[] {java.lang.String.class, java.lang.Double.class, java.lang.Double.class};
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        this.tblConfusion.setDefaultRenderer(String.class, formato); 
        this.tblConfusion.setDefaultRenderer(Integer.class, formato);
        
        lnVP = (double)laResultMedio[0][0] / (double)lnNumFolds;
        lnFP = (double)laResultMedio[0][1] / (double)lnNumFolds;
        lnFN = (double)laResultMedio[1][0] / (double)lnNumFolds;
        lnVN = (double)laResultMedio[1][1] / (double)lnNumFolds;
        
        //Set values confusion matrix mean
        ((DefaultTableModel)this.tblConfusion.getModel()).addRow(new Object[] {this.paClasses[tnClasse], (Double)(lnVP), (Double)lnFP});
        ((DefaultTableModel)this.tblConfusion.getModel()).addRow(new Object[] {"Other", (Double)(lnFN), (Double)lnVN});   
        
        double lnPrecis = (lnVP / (lnVP + lnFP));
        double lnTVP = (lnVP / (lnVP + lnFN));
        double lnTFP = (lnFP / (lnFP + lnVN));
        double lnMedidaF = (2 * lnTVP * lnPrecis) / (lnTVP + lnPrecis);
        
        this.txcPrecis.setText( "" + loDecimalFormat.format(lnPrecis));
        this.txcTVP.setText( "" + loDecimalFormat.format(lnTVP));
        this.txcTFP.setText( "" + loDecimalFormat.format(lnTFP));
        this.txcMedidaF.setText( "" + loDecimalFormat.format(lnMedidaF));        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbClasses;
    private javax.swing.JButton cmbReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tblConfusion;
    private javax.swing.JTable tblConfusionSingle;
    private javax.swing.JTable tblFols;
    private javax.swing.JTextField txcMedidaF;
    private javax.swing.JTextField txcPrecis;
    private javax.swing.JTextField txcTFP;
    private javax.swing.JTextField txcTVP;
    // End of variables declaration//GEN-END:variables
}
