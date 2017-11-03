/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import BaseDatos.*;
import Clases.*;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MHC <miguel.hrc>
 */
public class FrmBusquedaLista extends javax.swing.JFrame {

    /**
     * Creates new form FrmBusquedaLista
     */
    int i = 0;

    public FrmBusquedaLista(int a) {
        initComponents();
        this.setLocationRelativeTo(null);
        i = a;
    }

    String Carrera;
    String Grupo;
    String Semestre;
    String Materia;
    String url;
    public String ID = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        JCmbSemestro = new javax.swing.JComboBox<>();
        JCmbCarrera = new javax.swing.JComboBox<>();
        jBtnAceptar = new javax.swing.JButton();
        JCmbMateria = new javax.swing.JComboBox<>();
        jLblMateria = new javax.swing.JLabel();
        jLblGrupo = new javax.swing.JLabel();
        jLblSemestre = new javax.swing.JLabel();
        jLblCarrera = new javax.swing.JLabel();
        JCmbGrupo = new javax.swing.JComboBox<>();
        BtnRegresar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuBar2 = new javax.swing.JMenuBar();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JCmbSemestro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCmbSemestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCmbSemestroActionPerformed(evt);
            }
        });

        JCmbCarrera.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCmbCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCmbCarreraActionPerformed(evt);
            }
        });

        jBtnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/32x32/marca-de-verificacion.png"))); // NOI18N
        jBtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAceptarActionPerformed(evt);
            }
        });

        JCmbMateria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCmbMateria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JCmbMateriaFocusGained(evt);
            }
        });
        JCmbMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCmbMateriaActionPerformed(evt);
            }
        });

        jLblMateria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLblMateria.setText("Materia");

        jLblGrupo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLblGrupo.setText("Grupo");

        jLblSemestre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLblSemestre.setText("Semestre");

        jLblCarrera.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLblCarrera.setText("Carrera");

        JCmbGrupo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCmbGrupo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JCmbGrupoFocusGained(evt);
            }
        });
        JCmbGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCmbGrupoActionPerformed(evt);
            }
        });

        BtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/32x32/icon.png"))); // NOI18N
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        jMenuBar2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "L.S'SOFT", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Baskerville Old Face", 1, 18))); // NOI18N
        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLblMateria)
                                        .addGap(87, 87, 87)
                                        .addComponent(jLblCarrera)
                                        .addGap(88, 88, 88)
                                        .addComponent(jLblSemestre))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(JCmbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JCmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JCmbSemestro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLblGrupo)
                                            .addComponent(JCmbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLblMateria)
                                    .addComponent(jLblCarrera)
                                    .addComponent(jLblSemestre)
                                    .addComponent(jLblGrupo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JCmbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JCmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JCmbSemestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JCmbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jBtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCmbSemestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCmbSemestroActionPerformed
        // TODO add your handling code here:
        Semestre = String.valueOf(this.JCmbSemestro.getSelectedItem());
        System.out.println("Semestre: " + Semestre + "\n");
    }//GEN-LAST:event_JCmbSemestroActionPerformed

    private void JCmbCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCmbCarreraActionPerformed
        // TODO add your handling code here:
        Carrera = String.valueOf(this.JCmbCarrera.getSelectedItem());
        System.out.println("Carrera: " + Carrera + "\n");
    }//GEN-LAST:event_JCmbCarreraActionPerformed

    private void jBtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAceptarActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:

        if (i == 0) {
            BD mBD = new BD();
            String ID = "0";
            try {
                List<Lista> mLista = mBD.consultarListarID(Materia, Carrera, Grupo, Semestre);
                for (Lista actual : mLista) {
                    ID = String.valueOf(actual.getIdLista());
                }

                System.out.println("id =" + ID);

                JFileChooser dato = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos csv", "csv");
                dato.setAcceptAllFileFilterUsed(false);
                dato.setFileFilter(filter);
                int op = dato.showOpenDialog(this);
                if (op == JFileChooser.APPROVE_OPTION) {
                    url = dato.getSelectedFile().getPath();
                }
                System.out.println(url);

                mBD.Cargar(ID, url);
                dispose();
                FrmPrincipal mFrmPrincipal = new FrmPrincipal(ID,0);
                List<Alumno> lista = mBD.consultarAlumno(Integer.parseInt(ID));

                Object[] encabezado = {"NC", "Nombre"};
                DefaultTableModel modelo = new DefaultTableModel(null, encabezado);
                for (Alumno actual : lista) {
                    Object[] fila = {actual.getNC(), actual.getNombre()};
                    modelo.addRow(fila);
                }
                mFrmPrincipal.jTblConsulta.setModel(modelo);
                mFrmPrincipal.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(FrmBusquedaLista.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {

                BD mBD = new BD();
                List<Lista> mLista = mBD.consultarListarID(Materia, Carrera, Grupo, Semestre);
                for (Lista actual : mLista) {
                    ID = String.valueOf(actual.getIdLista());
                }
                List<Alumno> lista = mBD.consultarAlumno(Integer.parseInt(ID));

                //Mostrar la consulta alumno
                Object[] encabezado = {"NC", "Nombre"};
                DefaultTableModel modelo = new DefaultTableModel(null, encabezado);
                for (Alumno actual : lista) {
                    Object[] fila = {actual.getNC(), actual.getNombre()};
                    modelo.addRow(fila);
                }
                FrmPrincipal mFrmPrincipal = new FrmPrincipal(ID,1);
                mFrmPrincipal.jTblConsulta.setModel(modelo);
                mFrmPrincipal.setVisible(true);
                this.dispose();

            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }

    }//GEN-LAST:event_jBtnAceptarActionPerformed

    private void JCmbMateriaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JCmbMateriaFocusGained
        // TODO add your handling code here:
        BD mBD = new BD();
        this.JCmbMateria.removeAllItems();
        try {
            List<Lista> mLista = mBD.consultarListaMateria();
            for (Lista actual : mLista) {
                this.JCmbMateria.addItem(actual.getMateria());
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrmBusquedaLista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JCmbMateriaFocusGained

    private void JCmbMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCmbMateriaActionPerformed
        // TODO add your handling code here:
        BD mBD = new BD();
        this.JCmbCarrera.removeAllItems();
        this.JCmbSemestro.removeAllItems();
        this.JCmbGrupo.removeAllItems();

        try {
            List<Lista> mLista = mBD.consultarListaCarrera(String.valueOf(this.JCmbMateria.getSelectedItem()));
            for (Lista actual : mLista) {
                this.JCmbCarrera.addItem(actual.getCarrera());
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrmBusquedaLista.class.getName()).log(Level.SEVERE, null, ex);
        }
        Materia = String.valueOf(this.JCmbMateria.getSelectedItem());
        System.out.println("Materia: " + Materia + "\n");

        try {
            List<Lista> mLista = mBD.consultarListaSemestres(String.valueOf(this.JCmbMateria.getSelectedItem()));
            for (Lista actual : mLista) {
                this.JCmbSemestro.addItem(String.valueOf(actual.getSemestre()));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrmBusquedaLista.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            List<Lista> mLista = mBD.consultarListaGrupo(String.valueOf(this.JCmbMateria.getSelectedItem()));
            for (Lista actual : mLista) {
                this.JCmbGrupo.addItem(String.valueOf(actual.getGrupo()));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrmBusquedaLista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JCmbMateriaActionPerformed

    private void JCmbGrupoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JCmbGrupoFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_JCmbGrupoFocusGained

    private void JCmbGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCmbGrupoActionPerformed
        // TODO add your handling code here:
        Grupo = String.valueOf(this.JCmbGrupo.getSelectedItem());
        System.out.println("Grupo: " + Grupo + "\n");
    }//GEN-LAST:event_JCmbGrupoActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmBusquedaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBusquedaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBusquedaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBusquedaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBusquedaLista(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JComboBox<String> JCmbCarrera;
    private javax.swing.JComboBox<String> JCmbGrupo;
    private javax.swing.JComboBox<String> JCmbMateria;
    private javax.swing.JComboBox<String> JCmbSemestro;
    private javax.swing.JButton jBtnAceptar;
    private javax.swing.JLabel jLblCarrera;
    private javax.swing.JLabel jLblGrupo;
    private javax.swing.JLabel jLblMateria;
    private javax.swing.JLabel jLblSemestre;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
