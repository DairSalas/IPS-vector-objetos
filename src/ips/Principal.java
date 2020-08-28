package ips;

import javax.swing.JTextArea;

/**
 *
 * @author Diana Córdoba
 */
public class Principal extends javax.swing.JFrame {

    MetodosOrdenamiento ordenamiento;

    public Principal() {
        initComponents();

        ordenamiento = new MetodosOrdenamiento();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnBurbuja = new javax.swing.JButton();
        btnIntercambio = new javax.swing.JButton();
        btnSeleccion = new javax.swing.JButton();
        btnShell = new javax.swing.JButton();
        btnQuicksort = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtVectorDesordenado = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtVectorOrdenado = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTurnos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        btnBurbuja.setBackground(new java.awt.Color(37, 142, 166));
        btnBurbuja.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBurbuja.setForeground(new java.awt.Color(255, 255, 255));
        btnBurbuja.setText("Burbuja");
        btnBurbuja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBurbuja.setEnabled(false);
        btnBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBurbujaActionPerformed(evt);
            }
        });

        btnIntercambio.setBackground(new java.awt.Color(37, 142, 166));
        btnIntercambio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnIntercambio.setForeground(new java.awt.Color(255, 255, 255));
        btnIntercambio.setText("Intercambio");
        btnIntercambio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIntercambio.setEnabled(false);
        btnIntercambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntercambioActionPerformed(evt);
            }
        });

        btnSeleccion.setBackground(new java.awt.Color(37, 142, 166));
        btnSeleccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccion.setText("Selección");
        btnSeleccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeleccion.setEnabled(false);
        btnSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionActionPerformed(evt);
            }
        });

        btnShell.setBackground(new java.awt.Color(37, 142, 166));
        btnShell.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnShell.setForeground(new java.awt.Color(255, 255, 255));
        btnShell.setText("Shell");
        btnShell.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShell.setEnabled(false);
        btnShell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShellActionPerformed(evt);
            }
        });

        btnQuicksort.setBackground(new java.awt.Color(37, 142, 166));
        btnQuicksort.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnQuicksort.setForeground(new java.awt.Color(255, 255, 255));
        btnQuicksort.setText("Quicksort");
        btnQuicksort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuicksort.setEnabled(false);
        btnQuicksort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuicksortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(btnBurbuja)
                .addGap(31, 31, 31)
                .addComponent(btnIntercambio)
                .addGap(30, 30, 30)
                .addComponent(btnSeleccion)
                .addGap(31, 31, 31)
                .addComponent(btnShell)
                .addGap(27, 27, 27)
                .addComponent(btnQuicksort)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnShell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSeleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnIntercambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBurbuja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnQuicksort, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(37, 142, 166));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("TURNOS CITAS IPS");

        btnGenerar.setBackground(new java.awt.Color(37, 142, 166));
        btnGenerar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerar.setText("Generar Datos");
        btnGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerar.setFocusable(false);
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnGenerar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 142, 166));
        jLabel1.setText("Vector Desordenado");

        txtVectorDesordenado.setEditable(false);
        txtVectorDesordenado.setColumns(20);
        txtVectorDesordenado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtVectorDesordenado.setRows(5);
        jScrollPane1.setViewportView(txtVectorDesordenado);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(37, 142, 166));
        jLabel2.setText("Pacientes por turno");

        txtVectorOrdenado.setEditable(false);
        txtVectorOrdenado.setColumns(20);
        txtVectorOrdenado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtVectorOrdenado.setRows(5);
        jScrollPane2.setViewportView(txtVectorOrdenado);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2)))
                .addGap(47, 47, 47))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        btnLimpiar.setBackground(new java.awt.Color(37, 142, 166));
        btnLimpiar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setEnabled(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel4.setText("Total turnos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(224, 224, 224)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTurnos))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void inicializar() {

        ordenamiento.crearVector();
        ordenamiento.ponerTurnos();

        txtTurnos.setText(ordenamiento.getTurnos() + "");

        mostrarVector(txtVectorDesordenado, ordenamiento);
    }

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        Alerts.print("Se ha generado el vector, y definido turnos");
        habilitar();
        btnGenerar.setEnabled(false);

        inicializar();
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtVectorOrdenado.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public MetodosOrdenamiento crearCopiaOrdenamiento() {
        MetodosOrdenamiento copia = new MetodosOrdenamiento();
        copia.copiar(ordenamiento.getVector());
        copia.ponerTurnos();
        return copia;
    }
    
    private void btnBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBurbujaActionPerformed
        MetodosOrdenamiento copia = crearCopiaOrdenamiento();
        copia.ordenarBurbuja();
        mostrarVector(txtVectorOrdenado, copia);
    }//GEN-LAST:event_btnBurbujaActionPerformed

    
    private void btnIntercambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntercambioActionPerformed
        MetodosOrdenamiento copia = crearCopiaOrdenamiento();
        copia.ordenarIntercambio();
        mostrarVector(txtVectorOrdenado, copia);
    }//GEN-LAST:event_btnIntercambioActionPerformed

    private void btnSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionActionPerformed
        MetodosOrdenamiento copia = crearCopiaOrdenamiento();
        copia.ordenarSeleccion();
        mostrarVector(txtVectorOrdenado, copia);
    }//GEN-LAST:event_btnSeleccionActionPerformed

    private void btnShellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShellActionPerformed
        MetodosOrdenamiento copia = crearCopiaOrdenamiento();
        copia.shell();
        mostrarVector(txtVectorOrdenado, copia);
    }//GEN-LAST:event_btnShellActionPerformed

    private void btnQuicksortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuicksortActionPerformed
        MetodosOrdenamiento copia = crearCopiaOrdenamiento();
        copia.quickSort(0, copia.getNumElementos() - 1);
        mostrarVector(txtVectorOrdenado, copia);
    }//GEN-LAST:event_btnQuicksortActionPerformed

    public void mostrarVector(JTextArea area, MetodosOrdenamiento metord) {
        String msg = "ID\tAL DÍA\tTURNO\n";
        for (int i = 0; i < metord.getNumElementos(); i++) {
            msg += metord.getVectorDatos(i).getId() + "\t"
                    + metord.getVectorDatos(i).isDia() + "\t"
                    + metord.getVectorDatos(i).getTurno() + "\n";
        }
        area.setText(msg);
    }

    public void habilitar() {
        btnBurbuja.setEnabled(true);
        btnIntercambio.setEnabled(true);
        btnSeleccion.setEnabled(true);
        btnShell.setEnabled(true);
        btnQuicksort.setEnabled(true);
        btnLimpiar.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBurbuja;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnIntercambio;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnQuicksort;
    private javax.swing.JButton btnSeleccion;
    private javax.swing.JButton btnShell;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtTurnos;
    private javax.swing.JTextArea txtVectorDesordenado;
    private javax.swing.JTextArea txtVectorOrdenado;
    // End of variables declaration//GEN-END:variables
}
