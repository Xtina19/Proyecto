/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimientos;

import MenuPrincipal.MenuP;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DePartidos extends javax.swing.JFrame {

    /**
     * Creates new form DePartidos
     */
    public DePartidos() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Votos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        Descripcion = new javax.swing.JTextField();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Id ");

        jLabel3.setText("Descripción ");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Votos.setEditable(false);
        Votos.setText("0");

        jLabel4.setText("Votos");

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Mantenimientos de partido");

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Votos, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(Guardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Limpiar)
                                        .addGap(26, 26, 26))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(Buscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Votos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Limpiar))
                .addGap(18, 18, 18)
                .addComponent(Salir)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        String id = Id.getText();
        String descripcion = Descripcion.getText();
        String votos = "0";

        // Validar que el id y la descripcion no estén vacíos
        if (id.isEmpty() || descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El id y la descripcion son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Detener el proceso
        }

        try {
            // Intentar abrir el archivo
            File archivo = new File("Archivos\\Partidos.txt");

            // Verificar si el archivo existe
            if (archivo.exists()) {
                // Verificar si el usuario ya existe en el archivo
                if (modificarPartido(archivo, id, descripcion)) {
                    JOptionPane.showMessageDialog(null, "Información del partido modificada en el archivo.", "Información", JOptionPane.INFORMATION_MESSAGE);
                    LimpiarCampos();
                    return; // Detener el proceso si el usuario ya existe y fue modificado
                }
            }
            else {
                // Si el archivo no existe, intentar crear uno nuevo
                if (archivo.createNewFile()) {
                    System.out.println("Se ha creado un nuevo archivo.");
                }
                else {
                    JOptionPane.showMessageDialog(null, "No se pudo crear el archivo ", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Detener el proceso si no se pudo crear el archivo
                }
            }
            CrearPartido(archivo, id, descripcion, votos);

        } catch (IOException e) {
            // Capturar y manejar la excepción en caso de error
            JOptionPane.showMessageDialog(null, "Error al manejar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_GuardarActionPerformed

    private void CrearPartido(File archivo, String id, String descripcion, String votos) throws IOException{
        // Abrir flujos de escritura
        try (FileWriter FW = new FileWriter(archivo, true);
            BufferedWriter BW = new BufferedWriter(FW)) {

            // Crear la línea formateada
            String linea = String.format("%s,%s, %s", id, descripcion, votos);
            System.out.println("Linea: " + linea);  // Agregar esta línea para imprimir la línea formateada

            // Aquí se guarda la información
            BW.write(linea);
            BW.newLine(); // Añadir una nueva línea

            JOptionPane.showMessageDialog(null, "Información guardada en el archivo.", "Información", JOptionPane.INFORMATION_MESSAGE);
            LimpiarCampos();
        }
        catch (IOException e) {
            // Capturar y manejar la excepción en caso de error
            JOptionPane.showMessageDialog(null, "Error al guardar en el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } 
    
    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void LimpiarCampos(){
        Id.setText("");
        Descripcion.setText("");
        Votos.setText("0");        
    }
    
    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        buscarYRellenarPartido();
    }//GEN-LAST:event_BuscarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        MenuP Menu = new MenuP();
        Menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed
     
    private boolean modificarPartido(File archivo,String id, String descripcion) {
        // Crear una lista para almacenar las líneas modificadas
        List<String> lineasModificadas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            boolean partidoModificado = false;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3 && partes[0].equals(id)) {
                    // Encontramos el partido, rellenamos los campos
                    partes[1] = descripcion;

                     // Agregamos la línea modificada a la lista
                    lineasModificadas.add(String.join(",", partes));
                    partidoModificado = true;
                } 
                else {
                    // Si no es el partido que estamos buscando, simplemente agregamos la línea al listado
                    lineasModificadas.add(linea);
                }
            }

            if (partidoModificado) {
                // Ahora escribimos las líneas modificadas de vuelta al archivo
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
                    for (String lineaModificada : lineasModificadas) {
                        bw.write(lineaModificada);
                        bw.newLine(); // Agregamos un salto de línea después de cada línea
                    }
                }
            }

            return partidoModificado;

        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private void buscarYRellenarPartido() {
        String idPartido = Id.getText().trim();

        try (BufferedReader br = new BufferedReader(new FileReader("Archivos\\Partidos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3 && partes[0].equals(idPartido)) {
                    // Encontramos el partido, rellenamos los campos
                    Descripcion.setText(partes[1].trim());
                    Votos.setText(partes[2].trim());
                    return; // Terminamos la búsqueda una vez encontrado el partido
                }
            }

            // Si llegamos aquí, el partido no fue encontrado
            JOptionPane.showMessageDialog(this, "Partido no encontrado", "Error", JOptionPane.ERROR_MESSAGE);

        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(DePartidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DePartidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DePartidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DePartidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DePartidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField Descripcion;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Id;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField Votos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
