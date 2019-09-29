
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hnamn
 */
public class moveRowInTable extends javax.swing.JFrame {
    DefaultTableModel dftb = new DefaultTableModel();
    int tableRows;
    public moveRowInTable() throws Exception {
        initComponents();
        DataToTable();
        jTable1.setEnabled(false);
        jTable1.setRowSelectionInterval(0, 0);
    }
    public void DataToTable() throws Exception {
        Object[] title = {"StockID", "StockName", "Address", "DateAvailable", "Note"};
        Object[][] data = {
            {"1", "Stock 1", "Ha Noi", "2018-02-04", "Nah"},
            {"2", "Stock 2", "Ha Long", "2018-02-04", "Nah"},
            {"3", "Stock 3", "HCM city", "13/05/2010", "no"},
            {"4", "Stock 4", "Hai Phong", "2018-02-04", "Nah"},
            {"5", "Stock 5", "Da Nang", "2018-02-04", "Nah"}
        };
        tableRows = data.length;
        dftb.setDataVector(data, title);
        jTable1.setModel(dftb);
    }
    public void moveRowBy(int by){
//    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int[] rows = jTable1.getSelectedRows();
    int destination = rows[0] + by;
//    int rowCount = model.getRowCount();

    if (destination < 0 || destination >= tableRows)
    {
        return;
    }

//    model.moveRow(rows[0], rows[rows.length - 1], destination);
    jTable1.setRowSelectionInterval(rows[0] + by, rows[0] + by);
        System.out.println(rows.length);
}
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        firstRow = new javax.swing.JButton();
        prevRow = new javax.swing.JButton();
        nextRow = new javax.swing.JButton();
        lastRow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        firstRow.setText("first");
        firstRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstRowActionPerformed(evt);
            }
        });

        prevRow.setText("Previous");
        prevRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevRowActionPerformed(evt);
            }
        });

        nextRow.setText("Next");
        nextRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextRowActionPerformed(evt);
            }
        });

        lastRow.setText("Last");
        lastRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastRowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(firstRow)
                        .addGap(18, 18, 18)
                        .addComponent(prevRow)
                        .addGap(18, 18, 18)
                        .addComponent(nextRow)
                        .addGap(18, 18, 18)
                        .addComponent(lastRow)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstRow)
                    .addComponent(prevRow)
                    .addComponent(nextRow)
                    .addComponent(lastRow))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstRowActionPerformed
        // TODO add your handling code here:
        jTable1.setRowSelectionInterval(0, 0);
    }//GEN-LAST:event_firstRowActionPerformed

    private void prevRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevRowActionPerformed
        // TODO add your handling code here:
        moveRowBy(-1);
    }//GEN-LAST:event_prevRowActionPerformed

    private void nextRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextRowActionPerformed
        // TODO add your handling code here:
        moveRowBy(1);
    }//GEN-LAST:event_nextRowActionPerformed

    private void lastRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastRowActionPerformed
        // TODO add your handling code here:
        jTable1.setRowSelectionInterval(tableRows-1, tableRows-1);
    }//GEN-LAST:event_lastRowActionPerformed

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
            java.util.logging.Logger.getLogger(moveRowInTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(moveRowInTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(moveRowInTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(moveRowInTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new moveRowInTable().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(moveRowInTable.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton firstRow;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton lastRow;
    private javax.swing.JButton nextRow;
    private javax.swing.JButton prevRow;
    // End of variables declaration//GEN-END:variables
}