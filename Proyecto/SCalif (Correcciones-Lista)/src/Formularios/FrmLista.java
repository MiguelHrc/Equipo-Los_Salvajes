/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import BaseDatos.BD;
import Clases.Alumno;
import Clases.Lista;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alan_
 */
public class FrmLista extends javax.swing.JFrame {

    /**
     * Creates new form FrmLista
     */
    int i = 0;
    String id = "";

    public FrmLista(int a, String ID) {
        i = a;
        id = ID;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtMateria = new javax.swing.JTextField();
        TxtGrupo = new javax.swing.JTextField();
        TxtSemestre = new javax.swing.JTextField();
        TxtCarrera = new javax.swing.JTextField();
        BtnAgragar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Materia:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Grupo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Semestre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Carrera:");

        TxtMateria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TxtMateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtMateriaKeyTyped(evt);
            }
        });

        TxtGrupo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TxtGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtGrupoKeyTyped(evt);
            }
        });

        TxtSemestre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TxtSemestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtSemestreKeyTyped(evt);
            }
        });

        TxtCarrera.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TxtCarrera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCarreraKeyTyped(evt);
            }
        });

        BtnAgragar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/32x32/disquete.png"))); // NOI18N
        BtnAgragar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgragarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/32x32/icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "L.S'SOFT", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Baskerville Old Face", 1, 18))); // NOI18N
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel1)))
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(BtnAgragar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(TxtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TxtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAgragar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void LLenarTabla() throws SQLException {
        BD mBD = new BD();
        List<Lista> lista = mBD.consultarLista();

        //Mostrar la consulta lista
        Object[] encabezado = {"Lista", "Materia", "Grupo", "Semestre", "Carrera"};
        DefaultTableModel modelo = new DefaultTableModel(null, encabezado);
        for (Lista actual : lista) {
            Object[] fila = {actual.getIdLista(), actual.getMateria(), actual.getGrupo(), actual.getSemestre(), actual.getCarrera()};
            modelo.addRow(fila);
        }
        FrmPrincipal mFrmPrincipal = new FrmPrincipal(id, 0);
        mFrmPrincipal.jTblConsulta.setModel(modelo);
        mFrmPrincipal.setVisible(true);
    }
    
    public void LLenarTablaLista() throws SQLException {
        BD mBD = new BD();
        List<Lista> lista = mBD.consultarLista();
        
        Object[] encabezado = {"Lista", "Materia", "Grupo", "Semestre", "Carrera"};
        DefaultTableModel modelo = new DefaultTableModel(null, encabezado);
        for (Lista actual : lista) {
            Object[] fila = {actual.getIdLista(), actual.getMateria(), actual.getGrupo(), actual.getSemestre(), actual.getCarrera()};
            modelo.addRow(fila);
        }
        FrmPrincipal mFrmPrincipal = new FrmPrincipal(id, 0);
        mFrmPrincipal.jTblConsulta.setModel(modelo);
        mFrmPrincipal.setVisible(true);
    }

    private void BtnAgragarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgragarActionPerformed
        // TODO add your handling code here:
        switch (i) {
            case 0:
                if (((this.TxtMateria.getText().equals("")) | (this.TxtGrupo.getText().equals("")) | (this.TxtSemestre.getText().equals("")) | (this.TxtCarrera.getText().equals("")))) {
                    JOptionPane.showMessageDialog(rootPane, "Exiten campos vacios");
                } else {
                    
                    try {
                        //Agregar Lista
                        Lista mLista = new Lista();
                        
                        mLista.setCarrera(TxtCarrera.getText());
                        mLista.setGrupo(TxtGrupo.getText());
                        mLista.setMateria(TxtMateria.getText());
                        mLista.setSemestre(Integer.parseInt(TxtSemestre.getText()));
                        
                        //Guardar el productor usando su control
                        BD mBD = new BD();
                        
                        mBD.agregarLista(mLista);
                        JOptionPane.showMessageDialog(this, "Lista guardada");
                        this.LLenarTablaLista();
                        dispose();
                        i = 0;
                    } catch (Exception ex) {
                        System.out.println(ex.toString());
                    }
                }   break;
            case 1:
                try {
                    //Modificar Lista
                    BD mBD = new BD();
                    
                    Lista mLista = new Lista();
                    mLista.setIdLista(Integer.parseInt(id));
                    mLista.setMateria(this.TxtMateria.getText());
                    mLista.setGrupo(this.TxtGrupo.getText());
                    mLista.setSemestre(Integer.parseInt(this.TxtSemestre.getText()));
                    mLista.setCarrera(this.TxtCarrera.getText());
                    
                    mBD.modificarLista(mLista);
                    JOptionPane.showMessageDialog(null, "Lista modificada");
                    this.LLenarTablaLista();
                    dispose();
                    i = 0;
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }   break;
            default:
                i = 0;
                break;
        }
    }

    private void cmbMateriaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:


    }//GEN-LAST:event_BtnAgragarActionPerformed

    private void TxtMateriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtMateriaKeyTyped
        // TODO add your handling code here:
        if (!Character.isLetter(evt.getKeyChar())
                != (evt.getKeyChar() == KeyEvent.VK_SPACE)
                != (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtMateriaKeyTyped

    private void TxtGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtGrupoKeyTyped
        // TODO add your handling code here:
        if (!Character.isLetter(evt.getKeyChar())
                != (evt.getKeyChar() == KeyEvent.VK_SPACE)
                != (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtGrupoKeyTyped

    private void TxtSemestreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSemestreKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.')) {
            /* lo que deseo colocar aqui es si ya se pulso el caracter (.) el mismo no se pueda repetir*/
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Números");
        }
    }//GEN-LAST:event_TxtSemestreKeyTyped

    private void TxtCarreraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCarreraKeyTyped
        // TODO add your handling code here:
        if (!Character.isLetter(evt.getKeyChar())
                != (evt.getKeyChar() == KeyEvent.VK_SPACE)
                != (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtCarreraKeyTyped

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
            java.util.logging.Logger.getLogger(FrmLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLista(0, "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgragar;
    public javax.swing.JTextField TxtCarrera;
    public javax.swing.JTextField TxtGrupo;
    public javax.swing.JTextField TxtMateria;
    public javax.swing.JTextField TxtSemestre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
