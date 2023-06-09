/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calendariofutbol.gui;

import java.sql.*;
import calendariofutbol.ConexionMysql;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class frmPanelAñadirJugadores extends javax.swing.JFrame {

    Fondo fondo = new Fondo();
    ConexionMysql con = new ConexionMysql();
    Connection cn = con.conectar();

    public frmPanelAñadirJugadores() {
        this.setContentPane(fondo);
        initComponents();
        mostrarDatos();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new Fondo();
        jPanel2 = new javax.swing.JPanel();
        txtDorsal = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtNombreApellido = new javax.swing.JTextField();
        txtNumeroTelefono = new javax.swing.JTextField();
        txtCiclo = new javax.swing.JTextField();
        cmbGenero = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableJugadores = new javax.swing.JTable();

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deleteIcon.jpg"))); // NOI18N
        jMenuItem1.setText("Eliminar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel de control");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Eventos deportivos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 36), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Ingrese datos del jugador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setToolTipText("");

        txtDorsal.setBorder(javax.swing.BorderFactory.createTitledBorder("Dorsal #"));
        txtDorsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDorsalActionPerformed(evt);
            }
        });

        txtId.setBorder(javax.swing.BorderFactory.createTitledBorder("Id"));
        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtNombreApellido.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombres y apellidos"));
        txtNombreApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreApellidoActionPerformed(evt);
            }
        });

        txtNumeroTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Número de telefono"));
        txtNumeroTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroTelefonoActionPerformed(evt);
            }
        });

        txtCiclo.setBorder(javax.swing.BorderFactory.createTitledBorder("Ciclo"));
        txtCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCicloActionPerformed(evt);
            }
        });

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        cmbGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Genero"));
        cmbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGeneroActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreApellido)
                    .addComponent(txtDorsal)
                    .addComponent(txtNumeroTelefono)
                    .addComponent(txtCiclo)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(cmbGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnActualizar))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Lista de Jugadores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jTableJugadores.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableJugadores.setComponentPopupMenu(jPopupMenu1);
        jTableJugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableJugadoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableJugadores);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDorsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDorsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDorsalActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNombreApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreApellidoActionPerformed

    private void txtNumeroTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroTelefonoActionPerformed

    private void txtCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCicloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCicloActionPerformed

    private void cmbGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGeneroActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombreApellido = txtNombreApellido.getText();
        String dorsal = txtDorsal.getText();
        String ciclo = txtCiclo.getText();
        String numeroTelefono = txtNumeroTelefono.getText();
        String genero = cmbGenero.getSelectedItem().toString();

        if (!validarCampos(nombreApellido, dorsal, ciclo, numeroTelefono)) {
            btnRegistrar.setEnabled(true);
            return;
        }
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO jugadores (nombre_apellido,dorsal,genero,ciclo,numero_de_telefono)VALUES (?,?,?,?,?)");
            ps.setString(1, txtNombreApellido.getText());
            ps.setString(2, txtDorsal.getText());
            ps.setString(3, txtCiclo.getText());
            ps.setString(4, txtNumeroTelefono.getText());
            ps.setString(5, cmbGenero.getSelectedItem().toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            mostrarDatos();
            limpiarEntradas();
        } catch (SQLException e) {
            System.out.println("ERROR AL REGISTRAR AL JUGADOR" + e);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jTableJugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableJugadoresMouseClicked
        btnRegistrar.setEnabled(false);
        btnActualizar.setEnabled(true);
        int fila = this.jTableJugadores.getSelectedRow();
        this.txtId.setText(this.jTableJugadores.getValueAt(fila, 0).toString());
        this.txtNombreApellido.setText(this.jTableJugadores.getValueAt(fila, 1).toString());
        this.txtDorsal.setText(this.jTableJugadores.getValueAt(fila, 2).toString());
        this.txtCiclo.setText(this.jTableJugadores.getValueAt(fila, 3).toString());
        this.txtNumeroTelefono.setText(this.jTableJugadores.getValueAt(fila, 4).toString());
        this.cmbGenero.setSelectedItem(this.jTableJugadores.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_jTableJugadoresMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            PreparedStatement ps = cn.prepareStatement("UPDATE jugadores SET nombre_apellido=?, dorsal=?, genero=?, ciclo=?, numero_de_telefono=? WHERE id=?");
            ps.setString(1, txtNombreApellido.getText());
            ps.setString(2, txtDorsal.getText());
            ps.setString(3, cmbGenero.getSelectedItem().toString());
            ps.setString(4, txtCiclo.getText());
            ps.setString(5, txtNumeroTelefono.getText());
            ps.setString(6, txtId.getText());
            int indice = ps.executeUpdate();

            if (indice > 0) {
                JOptionPane.showMessageDialog(rootPane, "DATOS ACTUALIZADOS CORRECTAMENTE");
                mostrarDatos();
                limpiarEntradas();
            } else {
                JOptionPane.showMessageDialog(null, "SELECCIONE UNA FILA");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        btnActualizar.setEnabled(false);
        btnRegistrar.setEnabled(true);
        limpiarEntradas();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "ESTAS SEGURO DE ELIMINAR AL JUGADOR ", "SALIR", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
            try {
                PreparedStatement ps = cn.prepareStatement("DELETE FROM jugadores where id='" + txtId.getText() + "'");
                int indice = ps.executeUpdate();
                if (indice > 0) {
                    mostrarDatos();
                } else {
                    JOptionPane.showMessageDialog(null, "NO SE HA SELECCIONADO FILA");
                }
            } catch (SQLException e) {
                System.out.println("ERROR AL ELIMINAR LOS DATOS" + e);
            }
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmPanelAñadirJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPanelAñadirJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPanelAñadirJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPanelAñadirJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPanelAñadirJugadores().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableJugadores;
    private javax.swing.JTextField txtCiclo;
    private javax.swing.JTextField txtDorsal;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombreApellido;
    private javax.swing.JTextField txtNumeroTelefono;
    // End of variables declaration//GEN-END:variables

    class Fondo extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Images/fondo_añadir_jugadores.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);
            super.paint(g);
        }

    }

    private void mostrarDatos() {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                return false;
            }
        };
        model.addColumn("id");
        model.addColumn("Nombres y apellidos");
        model.addColumn("Dorsal #");
        model.addColumn("Ciclo");
        model.addColumn("Numero de telefono");
        model.addColumn("Genero");
        jTableJugadores.setModel(model);
        String consultaSql = "select*from jugadores";
        String data[] = new String[6];

        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultaSql);
            while (rs.next()) {
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                data[4] = rs.getString(5);
                data[5] = rs.getString(6);
                model.addRow(data);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR DATO :" + e);
        }
        jTableJugadores.setModel(model);
    }

    private void limpiarEntradas() {
        txtCiclo.setText("");
        txtDorsal.setText("");
        txtId.setText("");
        txtNombreApellido.setText("");
        txtNumeroTelefono.setText("");
        cmbGenero.setSelectedIndex(0);

    }

    private boolean validarCampos(String nombreApellido, String dorsal, String ciclo, String numeroTelefono) {
        if (nombreApellido.trim().isEmpty() || dorsal.trim().isEmpty() || ciclo.trim().isEmpty() || numeroTelefono.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return false;
        }
        return true;
    }

}
