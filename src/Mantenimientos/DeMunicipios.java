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
public class DeMunicipios extends javax.swing.JFrame {

    /**
     * Creates new form DeMunicipios
     */
    public DeMunicipios() {
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

        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Id = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        jButton3.setText("Eliminar");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Mantenimientos de usuario");

        jLabel2.setText("Nombres");

        jLabel3.setText("Apellidos");

        jButton1.setText("Guardar");

        jButton2.setText("Limpiar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Mantenimientos de municipios");

        jLabel5.setText("Id");

        jLabel6.setText("Nombre");

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

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel6)
                                .addGap(32, 32, 32)
                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(94, 94, 94)
                        .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Limpiar)))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Limpiar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(Salir))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        String id = Id.getText();
        String nombre = Nombre.getText();

        // Validar que el id y la descripcion no estén vacíos
        if (id.isEmpty() || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El id y el nombre son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Detener el proceso
        }

        try {
            // Intentar abrir el archivo
            File archivo = new File("Archivos\\Municipios.txt");

            // Verificar si el archivo existe
            if (archivo.exists()) {
                // Verificar si el municipio ya existe en el archivo
                if (modificarMunicipio(id, nombre)) {
                    JOptionPane.showMessageDialog(null, "Información del municipio modificada en el archivo.", "Información", JOptionPane.INFORMATION_MESSAGE);
                    return; // Detener el proceso si el municipio ya existe y fue modificado
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

            // Abrir flujos de escritura
            try (FileWriter FW = new FileWriter(archivo, true);
                BufferedWriter BW = new BufferedWriter(FW)) {

                // Crear la línea formateada
                String linea = String.format("%s,%s", id, nombre);
                System.out.println("Línea: " + linea);  // Agregar esta línea para imprimir la línea formateada

                // Aquí se guarda la información
                BW.write(linea);
                BW.newLine(); // Añadir una nueva línea

                JOptionPane.showMessageDialog(null, "Información guardada en el archivo.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (IOException e) {
            // Capturar y manejar la excepción en caso de error
            JOptionPane.showMessageDialog(null, "Error al manejar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Id.setText("");
        Nombre.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        buscarYRellenarMunicipio();
    }//GEN-LAST:event_BuscarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        MenuP Menu = new MenuP();
        Menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed
     private boolean modificarMunicipio(String id, String nombre) {
        // Crear una lista para almacenar las líneas modificadas
        List<String> lineasModificadas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Archivos\\Municipios.txt"))) {
            String linea;
            boolean municipioModificado = false;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2 && partes[0].equals(id)) {
                    // Encontramos el municipio, rellenamos los campos
                    partes[1] = nombre;

                    // Agregamos la línea modificada a la lista
                    lineasModificadas.add(String.join(",", partes));
                    municipioModificado = true;
                } 
                else {
                    // Si no es el municipio que estamos buscando, simplemente agregamos la línea al listado
                    lineasModificadas.add(linea);
                }
            }

            if (municipioModificado) {
                // Ahora escribimos las líneas modificadas de vuelta al archivo
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("Archivos\\Municipios.txt"))) {
                    for (String lineaModificada : lineasModificadas) {
                        bw.write(lineaModificada);
                     bw.newLine(); // Agregamos un salto de línea después de cada línea
                    }
                }
            }

        return municipioModificado;

        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private void buscarYRellenarMunicipio() {
        String idMunicipio = Id.getText().trim();
        String nombre = Nombre.getText().trim();
        
        try (BufferedReader br = new BufferedReader(new FileReader("Archivos\\Municipios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2 && partes[0].equals(idMunicipio)) {
                    // Encontramos el municipio, rellenamos los campos
                    Nombre.setText(partes[1]);
                    return; // Terminamos la búsqueda una vez encontrado el municipio
                }
            }

            // Si llegamos aquí, el municipio no fue encontrado
            JOptionPane.showMessageDialog(null, "Municipio no encontrado", "Error", JOptionPane.ERROR_MESSAGE);

        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(DeMunicipios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeMunicipios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeMunicipios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeMunicipios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeMunicipios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Id;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton Salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
