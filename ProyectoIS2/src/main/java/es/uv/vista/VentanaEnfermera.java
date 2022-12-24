package es.uv.vista;

import es.uv.modelo.AccesoBD;
import es.uv.modelo.Medicamento;
import es.uv.modelo.Paciente;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.event.ActionListener;

public class VentanaEnfermera extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    

    public VentanaEnfermera() {
        initComponents();
        this.setLocationRelativeTo(null);
        panelBase.setLayout(new BorderLayout());
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        labelFechaActual.setText("Fecha: " + dateFormat.format(date));
        panelBase.add(panelPacientesDelDia);

        updateListPacientesDelDia();
    }

    public void updateListPacientesDelDia() {

        DefaultListModel listModelPacientes = new DefaultListModel();
        for (Object item : AccesoBD.obtenerPacientesDelDiaBD()) {
            listModelPacientes.addElement(item);
        }

        listPacientesDelDia.setModel(listModelPacientes);

        listPacientesDelDia.setCellRenderer(new NombrePacienteCellRenderer());
    }

    private String forma(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public class NombrePacienteCellRenderer extends DefaultListCellRenderer {

        public Component getListCellRendererComponent(
                JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            label.setText(value.toString());
            return label;
        }
    }

    /**
     * MostrarMedicamentos(int)
     *
     * Muestra los medicamentos que cumplen con el stock introducido
     *
     * @param cantidad (int) Cantidad en stock
     *
     */
    public void MostrarMedicamentos(int cantidad) {
        DefaultListModel modelo = new DefaultListModel();
        ArrayList<Medicamento> m = (ArrayList<Medicamento>) AccesoBD.obtenerMedicamentosBD();
        //Busco en la lista de medicamentos
        for (int i = 0; i < m.size(); i++) {
            //Si encuentro uno con la cantidad adecuada lo reviso
            if (m.get(i).getUnidades() < cantidad) {
                //Si la cantidad es 0 o menos el programa devuelve una excepción
                if (m.get(i).getUnidades() <= 0) {
                    throw new UnsupportedOperationException();
                } //En caso contrario lo añade al modelo para actualizar la lista
                else {
                    modelo.add(m.get(i).getIdMedicamento(), m.get(i));
                }
            }
        }
        listBuscarEnfermedades1.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPacientesDelDia = new javax.swing.JPanel();
        labelFechaActual = new javax.swing.JLabel();
        scrollListaPacientesDelDia = new javax.swing.JScrollPane();
        listPacientesDelDia = new javax.swing.JList<>();
        labelEnfermosAVisitar = new javax.swing.JLabel();
        labelApellidosDelPaciente = new javax.swing.JLabel();
        labelMedicamentosASuministrar = new javax.swing.JLabel();
        labelHabitacionDelPaciente = new javax.swing.JLabel();
        scrollMedicamentos = new javax.swing.JScrollPane();
        textMedicamentosPacienteDia = new javax.swing.JTextArea();
        panelBotiquin = new javax.swing.JPanel();
        textBuscarEnfermedad1 = new javax.swing.JTextField();
        buttonBuscarExistencias = new javax.swing.JButton();
        labelENombreEnfermedad1 = new javax.swing.JLabel();
        buttonBorrarExistencias = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        scrollListaMedicamentos4 = new javax.swing.JScrollPane();
        listBuscarEnfermedades1 = new javax.swing.JList<>();
        labelENombreEnfermedad2 = new javax.swing.JLabel();
        panelCrearPaciente = new javax.swing.JPanel();
        labelENombreEnfermedad10 = new javax.swing.JLabel();
        textBuscarEnfermedad2 = new javax.swing.JTextField();
        labelENombreEnfermedad11 = new javax.swing.JLabel();
        labelENombreEnfermedad12 = new javax.swing.JLabel();
        labelENombreEnfermedad13 = new javax.swing.JLabel();
        labelENombreEnfermedad14 = new javax.swing.JLabel();
        textBuscarEnfermedad6 = new javax.swing.JTextField();
        textBuscarEnfermedad7 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        buttonEnfermeraCrearPaciente = new javax.swing.JButton();
        buttonBuscarEnfermedad = new javax.swing.JButton();
        labelENombreEnfermedad15 = new javax.swing.JLabel();
        textBuscarEnfermedad8 = new javax.swing.JTextField();
        panelFondo = new javax.swing.JPanel();
        panelBarraSuperior1 = new javax.swing.JPanel();
        panelEMinimizar = new javax.swing.JPanel();
        labelMinimizar1 = new javax.swing.JLabel();
        panelESalir = new javax.swing.JPanel();
        labelSalir = new javax.swing.JLabel();
        panelCerrarSesion = new javax.swing.JPanel();
        labelCerrarSesion = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        buttonPacientes = new javax.swing.JButton();
        buttonBotiquin = new javax.swing.JButton();
        buttonCrearPaciente = new javax.swing.JButton();
        panelBase = new javax.swing.JPanel();

        panelPacientesDelDia.setBackground(new java.awt.Color(81, 81, 81));
        panelPacientesDelDia.setPreferredSize(new java.awt.Dimension(896, 512));
        panelPacientesDelDia.setRequestFocusEnabled(false);
        panelPacientesDelDia.setVerifyInputWhenFocusTarget(false);

        labelFechaActual.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelFechaActual.setForeground(new java.awt.Color(204, 204, 204));
        labelFechaActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFechaActual.setText("Fecha : viernes 4 de noviembre de 2022");
        labelFechaActual.setPreferredSize(new java.awt.Dimension(420, 20));

        listPacientesDelDia.setBackground(new java.awt.Color(71, 71, 71));
        listPacientesDelDia.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        listPacientesDelDia.setForeground(new java.awt.Color(204, 204, 204));
        listPacientesDelDia.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "12345678901234567890123456789012", "Item 2", "Item 3", "Item 4", "Item 5", "no hay " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listPacientesDelDia.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listPacientesDelDiaValueChanged(evt);
            }
        });
        scrollListaPacientesDelDia.setViewportView(listPacientesDelDia);

        labelEnfermosAVisitar.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelEnfermosAVisitar.setForeground(new java.awt.Color(204, 204, 204));
        labelEnfermosAVisitar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEnfermosAVisitar.setText("Enfermos a visitar");
        labelEnfermosAVisitar.setPreferredSize(new java.awt.Dimension(420, 20));

        labelApellidosDelPaciente.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelApellidosDelPaciente.setForeground(new java.awt.Color(204, 204, 204));
        labelApellidosDelPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelApellidosDelPaciente.setText("paco antonio");
        labelApellidosDelPaciente.setPreferredSize(new java.awt.Dimension(420, 20));

        labelMedicamentosASuministrar.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelMedicamentosASuministrar.setForeground(new java.awt.Color(204, 204, 204));
        labelMedicamentosASuministrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMedicamentosASuministrar.setText("Medicamentos a suministrar");
        labelMedicamentosASuministrar.setPreferredSize(new java.awt.Dimension(420, 20));

        labelHabitacionDelPaciente.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelHabitacionDelPaciente.setForeground(new java.awt.Color(204, 204, 204));
        labelHabitacionDelPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHabitacionDelPaciente.setText("Habitación 161");
        labelHabitacionDelPaciente.setPreferredSize(new java.awt.Dimension(420, 20));

        textMedicamentosPacienteDia.setEditable(false);
        textMedicamentosPacienteDia.setBackground(new java.awt.Color(71, 71, 71));
        textMedicamentosPacienteDia.setColumns(20);
        textMedicamentosPacienteDia.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        textMedicamentosPacienteDia.setForeground(new java.awt.Color(204, 204, 204));
        textMedicamentosPacienteDia.setRows(6);
        textMedicamentosPacienteDia.setTabSize(4);
        textMedicamentosPacienteDia.setBorder(null);
        textMedicamentosPacienteDia.setPreferredSize(new java.awt.Dimension(252, 132));
        scrollMedicamentos.setViewportView(textMedicamentosPacienteDia);

        javax.swing.GroupLayout panelPacientesDelDiaLayout = new javax.swing.GroupLayout(panelPacientesDelDia);
        panelPacientesDelDia.setLayout(panelPacientesDelDiaLayout);
        panelPacientesDelDiaLayout.setHorizontalGroup(
            panelPacientesDelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPacientesDelDiaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelPacientesDelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPacientesDelDiaLayout.createSequentialGroup()
                        .addGroup(panelPacientesDelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(scrollListaPacientesDelDia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                            .addComponent(labelEnfermosAVisitar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(panelPacientesDelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPacientesDelDiaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(labelApellidosDelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPacientesDelDiaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelHabitacionDelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPacientesDelDiaLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(panelPacientesDelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMedicamentosASuministrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(scrollMedicamentos))))))
                .addGap(24, 24, 24))
        );
        panelPacientesDelDiaLayout.setVerticalGroup(
            panelPacientesDelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPacientesDelDiaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(labelEnfermosAVisitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPacientesDelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollListaPacientesDelDia, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPacientesDelDiaLayout.createSequentialGroup()
                        .addComponent(labelApellidosDelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(labelHabitacionDelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(labelMedicamentosASuministrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollMedicamentos)))
                .addGap(24, 24, 24))
        );

        panelBotiquin.setBackground(new java.awt.Color(61, 61, 61));
        panelBotiquin.setPreferredSize(new java.awt.Dimension(896, 512));
        panelBotiquin.setRequestFocusEnabled(false);
        panelBotiquin.setVerifyInputWhenFocusTarget(false);

        textBuscarEnfermedad1.setBackground(new java.awt.Color(71, 71, 71));
        textBuscarEnfermedad1.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        textBuscarEnfermedad1.setForeground(new java.awt.Color(204, 204, 204));
        textBuscarEnfermedad1.setText("12345678A");
        textBuscarEnfermedad1.setToolTipText("");
        textBuscarEnfermedad1.setBorder(null);
        textBuscarEnfermedad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textBuscarEnfermedad1KeyPressed(evt);
            }
        });

        buttonBuscarExistencias.setBackground(new java.awt.Color(71, 71, 71));
        buttonBuscarExistencias.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonBuscarExistencias.setForeground(new java.awt.Color(204, 204, 204));
        buttonBuscarExistencias.setText("Buscar");
        buttonBuscarExistencias.setBorderPainted(false);
        buttonBuscarExistencias.setFocusPainted(false);
        buttonBuscarExistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarExistenciasActionPerformed(evt);
            }
        });

        labelENombreEnfermedad1.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelENombreEnfermedad1.setForeground(new java.awt.Color(204, 204, 204));
        labelENombreEnfermedad1.setText("Escribe el número máximo de existencias de los medicamentos");
        labelENombreEnfermedad1.setPreferredSize(new java.awt.Dimension(420, 20));

        buttonBorrarExistencias.setBackground(new java.awt.Color(71, 71, 71));
        buttonBorrarExistencias.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonBorrarExistencias.setForeground(new java.awt.Color(204, 204, 204));
        buttonBorrarExistencias.setText("Borrar");
        buttonBorrarExistencias.setBorderPainted(false);
        buttonBorrarExistencias.setFocusPainted(false);

        jPanel3.setBackground(new java.awt.Color(81, 81, 81));

        listBuscarEnfermedades1.setBackground(new java.awt.Color(71, 71, 71));
        listBuscarEnfermedades1.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        listBuscarEnfermedades1.setForeground(new java.awt.Color(204, 204, 204));
        listBuscarEnfermedades1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "12345678901234567890123456789012", "Item 2", "Item 3", "Item 4", "Item 5", "no hay " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollListaMedicamentos4.setViewportView(listBuscarEnfermedades1);

        labelENombreEnfermedad2.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelENombreEnfermedad2.setForeground(new java.awt.Color(204, 204, 204));
        labelENombreEnfermedad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelENombreEnfermedad2.setText("paracetamol");
        labelENombreEnfermedad2.setPreferredSize(new java.awt.Dimension(420, 20));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollListaMedicamentos4)
                    .addComponent(labelENombreEnfermedad2, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelENombreEnfermedad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollListaMedicamentos4, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout panelBotiquinLayout = new javax.swing.GroupLayout(panelBotiquin);
        panelBotiquin.setLayout(panelBotiquinLayout);
        panelBotiquinLayout.setHorizontalGroup(
            panelBotiquinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotiquinLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelENombreEnfermedad1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textBuscarEnfermedad1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(buttonBuscarExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(buttonBorrarExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBotiquinLayout.setVerticalGroup(
            panelBotiquinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotiquinLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelBotiquinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelENombreEnfermedad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBuscarEnfermedad1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscarExistencias)
                    .addComponent(buttonBorrarExistencias))
                .addGap(16, 16, 16)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCrearPaciente.setBackground(new java.awt.Color(81, 81, 81));
        panelCrearPaciente.setPreferredSize(new java.awt.Dimension(896, 512));
        panelCrearPaciente.setRequestFocusEnabled(false);
        panelCrearPaciente.setVerifyInputWhenFocusTarget(false);

        labelENombreEnfermedad10.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelENombreEnfermedad10.setForeground(new java.awt.Color(204, 204, 204));
        labelENombreEnfermedad10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelENombreEnfermedad10.setText("Nuevo paciente");
        labelENombreEnfermedad10.setPreferredSize(new java.awt.Dimension(420, 20));

        textBuscarEnfermedad2.setBackground(new java.awt.Color(71, 71, 71));
        textBuscarEnfermedad2.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        textBuscarEnfermedad2.setForeground(new java.awt.Color(204, 204, 204));
        textBuscarEnfermedad2.setText("12345678A");
        textBuscarEnfermedad2.setToolTipText("");
        textBuscarEnfermedad2.setBorder(null);

        labelENombreEnfermedad11.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelENombreEnfermedad11.setForeground(new java.awt.Color(204, 204, 204));
        labelENombreEnfermedad11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelENombreEnfermedad11.setText("DNI");
        labelENombreEnfermedad11.setPreferredSize(new java.awt.Dimension(420, 20));

        labelENombreEnfermedad12.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelENombreEnfermedad12.setForeground(new java.awt.Color(204, 204, 204));
        labelENombreEnfermedad12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelENombreEnfermedad12.setText("Apellidos");
        labelENombreEnfermedad12.setPreferredSize(new java.awt.Dimension(420, 20));

        labelENombreEnfermedad13.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelENombreEnfermedad13.setForeground(new java.awt.Color(204, 204, 204));
        labelENombreEnfermedad13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelENombreEnfermedad13.setText("Habitación");
        labelENombreEnfermedad13.setPreferredSize(new java.awt.Dimension(420, 20));

        labelENombreEnfermedad14.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelENombreEnfermedad14.setForeground(new java.awt.Color(204, 204, 204));
        labelENombreEnfermedad14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelENombreEnfermedad14.setText("Síntomas");
        labelENombreEnfermedad14.setPreferredSize(new java.awt.Dimension(420, 20));

        textBuscarEnfermedad6.setBackground(new java.awt.Color(71, 71, 71));
        textBuscarEnfermedad6.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        textBuscarEnfermedad6.setForeground(new java.awt.Color(204, 204, 204));
        textBuscarEnfermedad6.setText("12345678A");
        textBuscarEnfermedad6.setToolTipText("");
        textBuscarEnfermedad6.setBorder(null);

        textBuscarEnfermedad7.setBackground(new java.awt.Color(71, 71, 71));
        textBuscarEnfermedad7.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        textBuscarEnfermedad7.setForeground(new java.awt.Color(204, 204, 204));
        textBuscarEnfermedad7.setText("12345678A");
        textBuscarEnfermedad7.setToolTipText("");
        textBuscarEnfermedad7.setBorder(null);

        jScrollPane5.setPreferredSize(new java.awt.Dimension(242, 20));

        jTextArea4.setEditable(true);
        jTextArea4.setBackground(new java.awt.Color(71, 71, 71));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea4.setRows(6);
        jTextArea4.setTabSize(4);
        jTextArea4.setBorder(null);
        jTextArea4.setPreferredSize(new java.awt.Dimension(252, 20));
        jScrollPane5.setViewportView(jTextArea4);

        buttonEnfermeraCrearPaciente.setBackground(new java.awt.Color(71, 71, 71));
        buttonEnfermeraCrearPaciente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonEnfermeraCrearPaciente.setForeground(new java.awt.Color(204, 204, 204));
        buttonEnfermeraCrearPaciente.setText("Añadir paciente");
        buttonEnfermeraCrearPaciente.setBorderPainted(false);
        buttonEnfermeraCrearPaciente.setFocusPainted(false);
        buttonEnfermeraCrearPaciente.setActionCommand("crearPacienteEnfermera");
        //add(buttonEnfermeraCrearPaciente);

        buttonBuscarEnfermedad.setBackground(new java.awt.Color(71, 71, 71));
        buttonBuscarEnfermedad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonBuscarEnfermedad.setForeground(new java.awt.Color(204, 204, 204));
        buttonBuscarEnfermedad.setText("Cancelar");
        buttonBuscarEnfermedad.setBorderPainted(false);
        buttonBuscarEnfermedad.setFocusPainted(false);

        labelENombreEnfermedad15.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelENombreEnfermedad15.setForeground(new java.awt.Color(204, 204, 204));
        labelENombreEnfermedad15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelENombreEnfermedad15.setText("Nombre");
        labelENombreEnfermedad15.setPreferredSize(new java.awt.Dimension(420, 20));

        textBuscarEnfermedad8.setBackground(new java.awt.Color(71, 71, 71));
        textBuscarEnfermedad8.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        textBuscarEnfermedad8.setForeground(new java.awt.Color(204, 204, 204));
        textBuscarEnfermedad8.setText("12345678A");
        textBuscarEnfermedad8.setToolTipText("");
        textBuscarEnfermedad8.setBorder(null);

        javax.swing.GroupLayout panelCrearPacienteLayout = new javax.swing.GroupLayout(panelCrearPaciente);
        panelCrearPaciente.setLayout(panelCrearPacienteLayout);
        panelCrearPacienteLayout.setHorizontalGroup(
            panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearPacienteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCrearPacienteLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(labelENombreEnfermedad10, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonBuscarEnfermedad, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                    .addGroup(panelCrearPacienteLayout.createSequentialGroup()
                        .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelENombreEnfermedad13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(labelENombreEnfermedad12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(labelENombreEnfermedad11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(labelENombreEnfermedad15, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textBuscarEnfermedad2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(textBuscarEnfermedad6)
                            .addComponent(textBuscarEnfermedad7)
                            .addComponent(textBuscarEnfermedad8))
                        .addGap(52, 52, 52)
                        .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearPacienteLayout.createSequentialGroup()
                                .addComponent(labelENombreEnfermedad14, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
            .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearPacienteLayout.createSequentialGroup()
                    .addContainerGap(346, Short.MAX_VALUE)
                    .addComponent(buttonEnfermeraCrearPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(325, 325, 325)))
        );
        panelCrearPacienteLayout.setVerticalGroup(
            panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearPacienteLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelENombreEnfermedad10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscarEnfermedad))
                .addGap(61, 61, 61)
                .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelENombreEnfermedad11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBuscarEnfermedad2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelENombreEnfermedad14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearPacienteLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelENombreEnfermedad15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textBuscarEnfermedad6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelENombreEnfermedad12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textBuscarEnfermedad8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textBuscarEnfermedad7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelENombreEnfermedad13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(228, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearPacienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(208, Short.MAX_VALUE))))
            .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearPacienteLayout.createSequentialGroup()
                    .addContainerGap(366, Short.MAX_VALUE)
                    .addComponent(buttonEnfermeraCrearPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(39, 39, 39)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelFondo.setBackground(new java.awt.Color(90, 90, 90));

        panelBarraSuperior1.setBackground(new java.awt.Color(51, 51, 51));
        panelBarraSuperior1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelBarraSuperior1MouseDragged(evt);
            }
        });
        panelBarraSuperior1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBarraSuperior1MousePressed(evt);
            }
        });

        panelEMinimizar.setBackground(new java.awt.Color(51, 51, 51));
        panelEMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelEMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelEMinimizarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelEMinimizarMouseReleased(evt);
            }
        });

        labelMinimizar1.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        labelMinimizar1.setForeground(new java.awt.Color(204, 204, 204));
        labelMinimizar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMinimizar1.setText("-");
        labelMinimizar1.setMaximumSize(new java.awt.Dimension(14, 30));
        labelMinimizar1.setMinimumSize(new java.awt.Dimension(14, 30));
        labelMinimizar1.setPreferredSize(new java.awt.Dimension(14, 30));

        javax.swing.GroupLayout panelEMinimizarLayout = new javax.swing.GroupLayout(panelEMinimizar);
        panelEMinimizar.setLayout(panelEMinimizarLayout);
        panelEMinimizarLayout.setHorizontalGroup(
            panelEMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMinimizar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        panelEMinimizarLayout.setVerticalGroup(
            panelEMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMinimizar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelESalir.setBackground(new java.awt.Color(51, 51, 51));
        panelESalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelESalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelESalirMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelESalirMouseReleased(evt);
            }
        });

        labelSalir.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        labelSalir.setForeground(new java.awt.Color(204, 204, 204));
        labelSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSalir.setText("x");

        javax.swing.GroupLayout panelESalirLayout = new javax.swing.GroupLayout(panelESalir);
        panelESalir.setLayout(panelESalirLayout);
        panelESalirLayout.setHorizontalGroup(
            panelESalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        panelESalirLayout.setVerticalGroup(
            panelESalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelCerrarSesion.setBackground(new java.awt.Color(51, 51, 51));
        panelCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelCerrarSesionMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelCerrarSesionMouseReleased(evt);
            }
        });

        labelCerrarSesion.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        labelCerrarSesion.setForeground(new java.awt.Color(204, 204, 204));
        labelCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCerrarSesion.setText("·");
        labelCerrarSesion.setMaximumSize(new java.awt.Dimension(14, 30));
        labelCerrarSesion.setMinimumSize(new java.awt.Dimension(14, 30));
        labelCerrarSesion.setPreferredSize(new java.awt.Dimension(14, 30));

        javax.swing.GroupLayout panelCerrarSesionLayout = new javax.swing.GroupLayout(panelCerrarSesion);
        panelCerrarSesion.setLayout(panelCerrarSesionLayout);
        panelCerrarSesionLayout.setHorizontalGroup(
            panelCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        panelCerrarSesionLayout.setVerticalGroup(
            panelCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBarraSuperior1Layout = new javax.swing.GroupLayout(panelBarraSuperior1);
        panelBarraSuperior1.setLayout(panelBarraSuperior1Layout);
        panelBarraSuperior1Layout.setHorizontalGroup(
            panelBarraSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraSuperior1Layout.createSequentialGroup()
                .addComponent(panelCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(752, 752, 752)
                .addComponent(panelEMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelESalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBarraSuperior1Layout.setVerticalGroup(
            panelBarraSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraSuperior1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelBarraSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEMinimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelESalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panelMenu.setBackground(new java.awt.Color(51, 51, 51));

        buttonPacientes.setBackground(new java.awt.Color(68, 68, 68));
        buttonPacientes.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        buttonPacientes.setForeground(new java.awt.Color(204, 204, 204));
        buttonPacientes.setText("Pacientes del día");
        buttonPacientes.setBorderPainted(false);
        buttonPacientes.setFocusPainted(false);
        buttonPacientes.setPreferredSize(new java.awt.Dimension(140, 26));
        buttonPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonPacientesMousePressed(evt);
            }
        });

        buttonBotiquin.setBackground(new java.awt.Color(68, 68, 68));
        buttonBotiquin.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        buttonBotiquin.setForeground(new java.awt.Color(204, 204, 204));
        buttonBotiquin.setText("Botiquín");
        buttonBotiquin.setBorderPainted(false);
        buttonBotiquin.setFocusPainted(false);
        buttonBotiquin.setPreferredSize(new java.awt.Dimension(140, 26));
        buttonBotiquin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonBotiquinMousePressed(evt);
            }
        });

        buttonCrearPaciente.setBackground(new java.awt.Color(68, 68, 68));
        buttonCrearPaciente.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        buttonCrearPaciente.setForeground(new java.awt.Color(204, 204, 204));
        buttonCrearPaciente.setText("Crear Paciente");
        buttonCrearPaciente.setBorderPainted(false);
        buttonCrearPaciente.setFocusPainted(false);
        buttonCrearPaciente.setPreferredSize(new java.awt.Dimension(140, 26));
        buttonCrearPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonCrearPacienteMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(buttonPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(buttonBotiquin, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(buttonCrearPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBotiquin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCrearPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        panelBase.setBackground(new java.awt.Color(61, 61, 61));

        javax.swing.GroupLayout panelBaseLayout = new javax.swing.GroupLayout(panelBase);
        panelBase.setLayout(panelBaseLayout);
        panelBaseLayout.setHorizontalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 896, Short.MAX_VALUE)
        );
        panelBaseLayout.setVerticalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBarraSuperior1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelBase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panelBarraSuperior1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelEMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEMinimizarMouseEntered
        panelEMinimizar.setBackground(new Color(71, 71, 71));
    }//GEN-LAST:event_panelEMinimizarMouseEntered

    private void panelEMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEMinimizarMouseExited
        panelEMinimizar.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_panelEMinimizarMouseExited

    private void panelEMinimizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEMinimizarMouseReleased
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_panelEMinimizarMouseReleased

    private void panelESalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelESalirMouseEntered
        panelESalir.setBackground(new Color(192, 0, 0));
    }//GEN-LAST:event_panelESalirMouseEntered

    private void panelESalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelESalirMouseExited
        panelESalir.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_panelESalirMouseExited

    private void panelESalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelESalirMouseReleased
        System.exit(0);
    }//GEN-LAST:event_panelESalirMouseReleased

    private void ouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ouseClicked

    private void panelCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCerrarSesionMouseEntered
        panelCerrarSesion.setBackground(new Color(71, 71, 71));
    }//GEN-LAST:event_panelCerrarSesionMouseEntered

    private void panelCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCerrarSesionMouseExited
        panelCerrarSesion.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_panelCerrarSesionMouseExited

    private void panelCerrarSesionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCerrarSesionMouseReleased
        Login login = new Login();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_panelCerrarSesionMouseReleased

    private void panelBarraSuperior1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperior1MouseDragged
        int xMouseCurrent = evt.getXOnScreen();
        int yMouseCurrent = evt.getYOnScreen();
        this.setLocation(xMouseCurrent - xMouse, yMouseCurrent - yMouse);
    }//GEN-LAST:event_panelBarraSuperior1MouseDragged

    private void panelBarraSuperior1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperior1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelBarraSuperior1MousePressed

    private void buttonPacientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPacientesMousePressed
        panelBase.removeAll();
        panelBase.add(panelPacientesDelDia);
        panelBase.revalidate();
        panelBase.repaint();
    }//GEN-LAST:event_buttonPacientesMousePressed

    private void buttonBotiquinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBotiquinMousePressed
        panelBase.removeAll();
        panelBase.add(panelBotiquin);
        panelBase.revalidate();
        panelBase.repaint();
    }//GEN-LAST:event_buttonBotiquinMousePressed

    private void buttonCrearPacienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCrearPacienteMousePressed
        panelBase.removeAll();
        panelBase.add(panelCrearPaciente);
        panelBase.revalidate();
        panelBase.repaint();
    }//GEN-LAST:event_buttonCrearPacienteMousePressed

    private void listPacientesDelDiaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listPacientesDelDiaValueChanged
        if (!listPacientesDelDia.getValueIsAdjusting() && listPacientesDelDia.getSelectedValue() != null) {
            Object paciente = listPacientesDelDia.getSelectedValue();
            List<String> medicamentos = AccesoBD.obtenerMedicamentosPacienteBD(String.valueOf(((Paciente) paciente).getIdPaciente()));
            String medicamentosText = "";
            labelApellidosDelPaciente.setText("Apellidos: " + ((Paciente) paciente).getApellidos());
            labelHabitacionDelPaciente.setText("Habitacion: " + ((Paciente) paciente).getHabitacion());
            for (String x : medicamentos) {
                medicamentosText += x + "\n";
            }
            textMedicamentosPacienteDia.setText(medicamentosText);
        }
    }//GEN-LAST:event_listPacientesDelDiaValueChanged

    private void textBuscarEnfermedad1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBuscarEnfermedad1KeyPressed
        // FALTA AÑADIR SHOTCUT
    }//GEN-LAST:event_textBuscarEnfermedad1KeyPressed
    /**
     * buttonBuscarExistenciasActionPerformed(ActionEvent)
     * 
     * Botón que lanza la secuencia de acciones por la cual se buscan los medicamentos a partir de la cantidad insertada
     * 
     * @param evt 
     */
    private void buttonBuscarExistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarExistenciasActionPerformed
        // TODO add your handling code here:
        MostrarMedicamentos(Integer.valueOf(textBuscarEnfermedad1.getText()));

    }//GEN-LAST:event_buttonBuscarExistenciasActionPerformed

    public String getDNI() {
        return textBuscarEnfermedad2.getText();
    }

    public String getNombre() {
        return textBuscarEnfermedad6.getText();
    }

    public String getApellidos() {
        return textBuscarEnfermedad8.getText();
    }

    public int getHabitacion() {
        return Integer.parseInt(textBuscarEnfermedad7.getText());
    }

    public String getSintomas() {
        return jTextArea4.getText();
    }

    public void setActionListener(ActionListener al) {
        buttonEnfermeraCrearPaciente.addActionListener(al);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBorrarExistencias;
    private javax.swing.JButton buttonBotiquin;
    private javax.swing.JButton buttonBuscarEnfermedad;
    private javax.swing.JButton buttonBuscarExistencias;
    private javax.swing.JButton buttonCrearPaciente;
    private javax.swing.JButton buttonEnfermeraCrearPaciente;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JLabel labelApellidosDelPaciente;
    private javax.swing.JLabel labelCerrarSesion;
    private javax.swing.JLabel labelENombreEnfermedad1;
    private javax.swing.JLabel labelENombreEnfermedad10;
    private javax.swing.JLabel labelENombreEnfermedad11;
    private javax.swing.JLabel labelENombreEnfermedad12;
    private javax.swing.JLabel labelENombreEnfermedad13;
    private javax.swing.JLabel labelENombreEnfermedad14;
    private javax.swing.JLabel labelENombreEnfermedad15;
    private javax.swing.JLabel labelENombreEnfermedad2;
    private javax.swing.JLabel labelEnfermosAVisitar;
    private javax.swing.JLabel labelFechaActual;
    private javax.swing.JLabel labelHabitacionDelPaciente;
    private javax.swing.JLabel labelMedicamentosASuministrar;
    private javax.swing.JLabel labelMinimizar1;
    private javax.swing.JLabel labelSalir;
    private javax.swing.JList<String> listBuscarEnfermedades1;
    private javax.swing.JList<String> listPacientesDelDia;
    private javax.swing.JPanel panelBarraSuperior1;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelBotiquin;
    private javax.swing.JPanel panelCerrarSesion;
    private javax.swing.JPanel panelCrearPaciente;
    private javax.swing.JPanel panelEMinimizar;
    private javax.swing.JPanel panelESalir;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPacientesDelDia;
    private javax.swing.JScrollPane scrollListaMedicamentos4;
    private javax.swing.JScrollPane scrollListaPacientesDelDia;
    private javax.swing.JScrollPane scrollMedicamentos;
    private javax.swing.JTextField textBuscarEnfermedad1;
    private javax.swing.JTextField textBuscarEnfermedad2;
    private javax.swing.JTextField textBuscarEnfermedad6;
    private javax.swing.JTextField textBuscarEnfermedad7;
    private javax.swing.JTextField textBuscarEnfermedad8;
    private javax.swing.JTextArea textMedicamentosPacienteDia;
    // End of variables declaration//GEN-END:variables
}
