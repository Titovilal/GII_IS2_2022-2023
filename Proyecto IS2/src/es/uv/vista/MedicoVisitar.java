package es.uv.vista;



import es.uv.modelo.Paciente;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class MedicoVisitar extends javax.swing.JFrame {
    
    ArrayList pacientes = new ArrayList();
    DefaultListModel modelo = new DefaultListModel();
    
//    private Paciente P1 = new Paciente("paco", "paco1", "paco2", "paco333333333");
//    private Paciente P2 = new Paciente("yeeeeea", "yeeeeea1", "yeeeeea2", "yeeeeea33333333333333");
//    private Paciente P3 = new Paciente("buaaaaa", "buaaaaa1", "buaaaaa2", "buaaaaa33333333333333");
    
    public MedicoVisitar() {
        initComponents();
        iniciar();
    }
    
    public void iniciar(){
        listPacientes.setModel(modelo);
        modelo.removeAllElements();
//        modelo.addElement(P1);
//        modelo.addElement(P2);
//        modelo.addElement(P3);
        
    };
    
    public class ResponsableCellRenderer extends DefaultListCellRenderer {

        public Component getListCellRendererComponent(
                JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            if (value.toString() != null) {
                label.setText(value.toString());
            }
            return label;
        }
    }
    
    public class NombreTareaCellRenderer extends DefaultListCellRenderer {

        public Component getListCellRendererComponent(
                JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

            label.setText(value.toString());
            return label;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        scrollPacientes = new javax.swing.JScrollPane();
        listPacientes = new javax.swing.JList<>();
        labelPacientes = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        labelNombreMedico = new javax.swing.JLabel();
        labelListaPacientes = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        scrollDescripcion = new javax.swing.JScrollPane();
        textADescripción = new javax.swing.JTextArea();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelPrincipal.setPreferredSize(new java.awt.Dimension(750, 520));

        scrollPacientes.setViewportView(listPacientes);

        labelPacientes.setText("Pacientes (xx)");

        labelDescripcion.setText("Descripcion del paciente");

        labelNombreMedico.setText("Nombre del medico");

        labelListaPacientes.setText("Lista de pacientes");

        labelFecha.setText("dd-mm-aaaa");

        textADescripción.setColumns(20);
        textADescripción.setRows(5);
        scrollDescripcion.setViewportView(textADescripción);

        btnVolver.setText("volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelNombreMedico)
                        .addGap(173, 173, 173)
                        .addComponent(labelListaPacientes)
                        .addGap(236, 236, 236)
                        .addComponent(labelFecha))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelPacientes))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(scrollPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelDescripcion))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(scrollDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(btnVolver)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNombreMedico)
                    .addComponent(labelListaPacientes)
                    .addComponent(labelFecha))
                .addGap(34, 34, 34)
                .addComponent(labelPacientes)
                .addGap(4, 4, 4)
                .addComponent(scrollPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(labelDescripcion)
                .addGap(4, 4, 4)
                .addComponent(scrollDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnVolver))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MedicoMenu m = new MedicoMenu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelListaPacientes;
    private javax.swing.JLabel labelNombreMedico;
    private javax.swing.JLabel labelPacientes;
    private javax.swing.JList<String> listPacientes;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollDescripcion;
    private javax.swing.JScrollPane scrollPacientes;
    private javax.swing.JTextArea textADescripción;
    // End of variables declaration//GEN-END:variables
}
