/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package task05.app.views;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import task05.app.dao.MotorCycleDao;
import task05.app.entity.MotorCycle;
import task05.app.entity.MotorCycleCategory;

/**
 *
 * @author Vizsga
 */
public class MainForm extends javax.swing.JFrame {

    private List<MotorCycle> motors;
    private List<MotorCycle> motors1;
    private String[] header;
    private AbstractTableModel tableModelMotor;
    private MotorCycleDao motorDao;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        otherMotors();
        getHeader();
        getMotorTableData();
    }

    private void getMotorTableData() {
        // nem működik a  beírt kód ezért kellett másképp megoldanom
//        motorDao = new MotorCycleDao();
//        motors = motorDao.getAll();
//        header = motorDao.getHeader();
        tableModelMotor = new TableModelMotors(motors1, header);
        tbMotors.setModel(tableModelMotor);
    }
    
    private void otherMotors() {
        motors1 = new ArrayList<>();
        MotorCycleCategory cat1 = new MotorCycleCategory(1, "Bagger");
        MotorCycleCategory cat2 = new MotorCycleCategory(1, "Bobber");
        MotorCycleCategory cat3 = new MotorCycleCategory(1, "Cruiser");
        MotorCycle motor1 = new MotorCycle(1, "Ducati", "R-4442", cat1, true);
        MotorCycle motor2 = new MotorCycle(2, "KTM", "TMF-234", cat2, false);
        MotorCycle motor3 = new MotorCycle(3, "Honda", "RIT-345", cat3, true);
        motors1.add(motor1);
        motors1.add(motor2);
        motors1.add(motor3);
    }

    private void getHeader() {
        header = new String[5];
        header[0] = "ID";
        header[1] = "MANUFACTURER";
        header[2] = "MODEL";
        header[3] = "CATEGORY";
        header[4] = "STATUS";
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
        tbMotors = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Motorkerékpárok");

        tbMotors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbMotors.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbMotors.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbMotors);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMotors;
    // End of variables declaration//GEN-END:variables
}
