/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.uv.vista;

public class EnfermeraVisitar extends javax.swing.JFrame {

    public EnfermeraVisitar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEnfermeraVisitar = new javax.swing.JPanel();
        textFecha = new javax.swing.JTextField();
        labelFecha = new javax.swing.JLabel();
        buttonBuscar = new javax.swing.JButton();
        buttonVolver = new javax.swing.JButton();
        scrollPacientes = new javax.swing.JScrollPane();
        listPacientes = new javax.swing.JList<>();
        labelPacientes = new javax.swing.JLabel();
        labelMedicamentos = new javax.swing.JLabel();
        scrollMedicamentos = new javax.swing.JScrollPane();
        textAMedicamentos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFechaActionPerformed(evt);
            }
        });

        labelFecha.setText("Fecha: ");

        buttonBuscar.setText("Buscar");

        buttonVolver.setText("Volver");

        listPacientes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "506: Gonzalez Lopez Paco", "XXX: Apellido1 Apellido2 Nombre", "XXX: Apellido1 Apellido2 Nombre", "XXX: Apellido1 Apellido2 Nombre", "XXX: Apellido1 Apellido2 Nombre" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollPacientes.setViewportView(listPacientes);

        labelPacientes.setText("Pacientes");

        labelMedicamentos.setText("Medicamentos");

        textAMedicamentos.setColumns(20);
        textAMedicamentos.setRows(5);
        scrollMedicamentos.setViewportView(textAMedicamentos);

        javax.swing.GroupLayout panelEnfermeraVisitarLayout = new javax.swing.GroupLayout(panelEnfermeraVisitar);
        panelEnfermeraVisitar.setLayout(panelEnfermeraVisitarLayout);
        panelEnfermeraVisitarLayout.setHorizontalGroup(
            panelEnfermeraVisitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnfermeraVisitarLayout.createSequentialGroup()
                .addGroup(panelEnfermeraVisitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnfermeraVisitarLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelEnfermeraVisitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollPacientes)
                            .addGroup(panelEnfermeraVisitarLayout.createSequentialGroup()
                                .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 422, Short.MAX_VALUE)
                                .addComponent(buttonBuscar))
                            .addComponent(labelPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollMedicamentos)
                            .addComponent(labelMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelEnfermeraVisitarLayout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(buttonVolver)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelEnfermeraVisitarLayout.setVerticalGroup(
            panelEnfermeraVisitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnfermeraVisitarLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelEnfermeraVisitarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFecha)
                    .addComponent(textFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscar))
                .addGap(18, 18, 18)
                .addComponent(labelPacientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMedicamentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonVolver)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEnfermeraVisitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEnfermeraVisitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFechaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonVolver;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelMedicamentos;
    private javax.swing.JLabel labelPacientes;
    private javax.swing.JList<String> listPacientes;
    private javax.swing.JPanel panelEnfermeraVisitar;
    private javax.swing.JScrollPane scrollMedicamentos;
    private javax.swing.JScrollPane scrollPacientes;
    private javax.swing.JTextArea textAMedicamentos;
    private javax.swing.JTextField textFecha;
    // End of variables declaration//GEN-END:variables
}
