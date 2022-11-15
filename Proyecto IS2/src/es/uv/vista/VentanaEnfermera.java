package es.uv.vista;

import es.uv.modelo.Paciente;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class VentanaEnfermera extends javax.swing.JFrame {

    int x, y, xMouse, yMouse;
    private ArrayList<Object> pacientesPrueba;

    public VentanaEnfermera() {
        initComponents();
        this.setLocationRelativeTo(null);
        panelBase.setLayout(new BorderLayout());
        panelBase.add(panelPacientesDelDia);
        
        pacientesPrueba = new ArrayList<>();

        Paciente pac1 = new Paciente(0, 100, "25252525P", "Molinos Marchantes", "Dolor de cuello");
        Paciente pac2 = new Paciente(1, 101, "35353535Q", "Caida Peliantes", "Dolor de espalda");
        Paciente pac3 = new Paciente(2, 102, "24242424R", "Lopez Bogabante", "Dolor de huevos");

        pacientesPrueba.add(pac1);
        pacientesPrueba.add(pac2);
        pacientesPrueba.add(pac3);

        updateListPacientesDelDia();
    }
    
    public void updateListPacientesDelDia() {

        DefaultListModel listModelPacientes = new DefaultListModel();
        for (Object item : pacientesPrueba) {
            listModelPacientes.addElement(item);
        }

        listPacientesDelDia.setModel(listModelPacientes);
        listPacientesDelDia.setCellRenderer(new NombrePacienteCellRenderer());
    }
    
    public class NombrePacienteCellRenderer extends DefaultListCellRenderer {

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

        panelPacientesDelDia = new javax.swing.JPanel();
        labelFechaActual = new javax.swing.JLabel();
        scrollListaPacientesDelDia = new javax.swing.JScrollPane();
        listPacientesDelDia = new javax.swing.JList<>();
        labelEnfermosAVisitar = new javax.swing.JLabel();
        labelApellidosDelPaciente = new javax.swing.JLabel();
        labelMedicamentosASuministrar = new javax.swing.JLabel();
        labelHabitacionDelPaciente = new javax.swing.JLabel();
        scrollListaMedicamentosASuministrar = new javax.swing.JScrollPane();
        listMedicamentosASuministrar = new javax.swing.JList<>();
        panelBotiquin1 = new javax.swing.JPanel();
        textBuscarEnfermedad1 = new javax.swing.JTextField();
        buttonBuscarEnfermedad1 = new javax.swing.JButton();
        labelENombreEnfermedad1 = new javax.swing.JLabel();
        buttonBuscarEnfermedad2 = new javax.swing.JButton();
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
        buttonBuscarEnfermedad4 = new javax.swing.JButton();
        buttonBuscarEnfermedad = new javax.swing.JButton();
        panelFondo1 = new javax.swing.JPanel();
        panelBarraSuperior1 = new javax.swing.JPanel();
        panelEMinimizar = new javax.swing.JPanel();
        labelMinimizar1 = new javax.swing.JLabel();
        panelESalir = new javax.swing.JPanel();
        labelSalir = new javax.swing.JLabel();
        panelCerrarSesion = new javax.swing.JPanel();
        labelCerrarSesion = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        buttonPaciente1 = new javax.swing.JButton();
        buttonEnfermedad = new javax.swing.JButton();
        buttonEnfermedad1 = new javax.swing.JButton();
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

        listMedicamentosASuministrar.setBackground(new java.awt.Color(71, 71, 71));
        listMedicamentosASuministrar.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        listMedicamentosASuministrar.setForeground(new java.awt.Color(204, 204, 204));
        listMedicamentosASuministrar.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "12345678901234567890123456789012", "Item 2", "Item 3", "Item 4", "Item 5", "no hay " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listMedicamentosASuministrar.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listMedicamentosASuministrarValueChanged(evt);
            }
        });
        scrollListaMedicamentosASuministrar.setViewportView(listMedicamentosASuministrar);

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
                                    .addComponent(scrollListaMedicamentosASuministrar)
                                    .addComponent(labelMedicamentosASuministrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
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
                        .addComponent(scrollListaMedicamentosASuministrar)))
                .addGap(24, 24, 24))
        );

        panelBotiquin1.setBackground(new java.awt.Color(61, 61, 61));
        panelBotiquin1.setPreferredSize(new java.awt.Dimension(896, 512));
        panelBotiquin1.setRequestFocusEnabled(false);
        panelBotiquin1.setVerifyInputWhenFocusTarget(false);

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

        buttonBuscarEnfermedad1.setBackground(new java.awt.Color(71, 71, 71));
        buttonBuscarEnfermedad1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonBuscarEnfermedad1.setForeground(new java.awt.Color(204, 204, 204));
        buttonBuscarEnfermedad1.setText("Buscar");
        buttonBuscarEnfermedad1.setBorderPainted(false);
        buttonBuscarEnfermedad1.setFocusPainted(false);
        buttonBuscarEnfermedad1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBuscarEnfermedad1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonBuscarEnfermedad1MousePressed(evt);
            }
        });

        labelENombreEnfermedad1.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelENombreEnfermedad1.setForeground(new java.awt.Color(204, 204, 204));
        labelENombreEnfermedad1.setText("Escribe el número máximo de existencias de los medicamentos");
        labelENombreEnfermedad1.setPreferredSize(new java.awt.Dimension(420, 20));

        buttonBuscarEnfermedad2.setBackground(new java.awt.Color(71, 71, 71));
        buttonBuscarEnfermedad2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonBuscarEnfermedad2.setForeground(new java.awt.Color(204, 204, 204));
        buttonBuscarEnfermedad2.setText("Borrar");
        buttonBuscarEnfermedad2.setBorderPainted(false);
        buttonBuscarEnfermedad2.setFocusPainted(false);
        buttonBuscarEnfermedad2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBuscarEnfermedad2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonBuscarEnfermedad2MousePressed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(81, 81, 81));

        listBuscarEnfermedades1.setBackground(new java.awt.Color(71, 71, 71));
        listBuscarEnfermedades1.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        listBuscarEnfermedades1.setForeground(new java.awt.Color(204, 204, 204));
        listBuscarEnfermedades1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "12345678901234567890123456789012", "Item 2", "Item 3", "Item 4", "Item 5", "no hay " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listBuscarEnfermedades1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listBuscarEnfermedades1ValueChanged(evt);
            }
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

        javax.swing.GroupLayout panelBotiquin1Layout = new javax.swing.GroupLayout(panelBotiquin1);
        panelBotiquin1.setLayout(panelBotiquin1Layout);
        panelBotiquin1Layout.setHorizontalGroup(
            panelBotiquin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotiquin1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelENombreEnfermedad1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textBuscarEnfermedad1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(buttonBuscarEnfermedad1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(buttonBuscarEnfermedad2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBotiquin1Layout.setVerticalGroup(
            panelBotiquin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotiquin1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelBotiquin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelENombreEnfermedad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBuscarEnfermedad1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscarEnfermedad1)
                    .addComponent(buttonBuscarEnfermedad2))
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
        textBuscarEnfermedad2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textBuscarEnfermedad2KeyPressed(evt);
            }
        });

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
        textBuscarEnfermedad6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textBuscarEnfermedad6KeyPressed(evt);
            }
        });

        textBuscarEnfermedad7.setBackground(new java.awt.Color(71, 71, 71));
        textBuscarEnfermedad7.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        textBuscarEnfermedad7.setForeground(new java.awt.Color(204, 204, 204));
        textBuscarEnfermedad7.setText("12345678A");
        textBuscarEnfermedad7.setToolTipText("");
        textBuscarEnfermedad7.setBorder(null);
        textBuscarEnfermedad7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textBuscarEnfermedad7KeyPressed(evt);
            }
        });

        jScrollPane5.setPreferredSize(new java.awt.Dimension(242, 20));

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(71, 71, 71));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea4.setRows(6);
        jTextArea4.setTabSize(4);
        jTextArea4.setBorder(null);
        jTextArea4.setPreferredSize(new java.awt.Dimension(252, 20));
        jScrollPane5.setViewportView(jTextArea4);

        buttonBuscarEnfermedad4.setBackground(new java.awt.Color(71, 71, 71));
        buttonBuscarEnfermedad4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonBuscarEnfermedad4.setForeground(new java.awt.Color(204, 204, 204));
        buttonBuscarEnfermedad4.setText("Añadir paciente");
        buttonBuscarEnfermedad4.setBorderPainted(false);
        buttonBuscarEnfermedad4.setFocusPainted(false);
        buttonBuscarEnfermedad4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBuscarEnfermedad4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonBuscarEnfermedad4MousePressed(evt);
            }
        });

        buttonBuscarEnfermedad.setBackground(new java.awt.Color(71, 71, 71));
        buttonBuscarEnfermedad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonBuscarEnfermedad.setForeground(new java.awt.Color(204, 204, 204));
        buttonBuscarEnfermedad.setText("Cancelar");
        buttonBuscarEnfermedad.setBorderPainted(false);
        buttonBuscarEnfermedad.setFocusPainted(false);
        buttonBuscarEnfermedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBuscarEnfermedadMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonBuscarEnfermedadMousePressed(evt);
            }
        });

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
                            .addComponent(labelENombreEnfermedad11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textBuscarEnfermedad2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(textBuscarEnfermedad6)
                            .addComponent(textBuscarEnfermedad7))
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
                    .addComponent(buttonBuscarEnfermedad4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(61, 61, 61)
                        .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelENombreEnfermedad12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textBuscarEnfermedad6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelENombreEnfermedad13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textBuscarEnfermedad7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearPacienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(panelCrearPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearPacienteLayout.createSequentialGroup()
                    .addContainerGap(366, Short.MAX_VALUE)
                    .addComponent(buttonBuscarEnfermedad4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(39, 39, 39)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelFondo1.setBackground(new java.awt.Color(90, 90, 90));

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
        panelEMinimizar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                panelEMinimizarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                panelEMinimizarFocusLost(evt);
            }
        });
        panelEMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelEMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelEMinimizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelEMinimizarMousePressed(evt);
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
        labelMinimizar1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                labelMinimizar1FocusGained(evt);
            }
        });

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
        panelESalir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                panelESalirFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                panelESalirFocusLost(evt);
            }
        });
        panelESalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelESalirMouseClicked(evt);
            }
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
        panelCerrarSesion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                panelCerrarSesionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                panelCerrarSesionFocusLost(evt);
            }
        });
        panelCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelCerrarSesionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelCerrarSesionMousePressed(evt);
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
        labelCerrarSesion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                labelCerrarSesionFocusGained(evt);
            }
        });
        labelCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                labelCerrarSesionMouseReleased(evt);
            }
        });

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

        buttonPaciente1.setBackground(new java.awt.Color(68, 68, 68));
        buttonPaciente1.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        buttonPaciente1.setForeground(new java.awt.Color(204, 204, 204));
        buttonPaciente1.setText("Pacientes del día");
        buttonPaciente1.setBorderPainted(false);
        buttonPaciente1.setFocusPainted(false);
        buttonPaciente1.setPreferredSize(new java.awt.Dimension(140, 26));
        buttonPaciente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPaciente1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonPaciente1MousePressed(evt);
            }
        });

        buttonEnfermedad.setBackground(new java.awt.Color(68, 68, 68));
        buttonEnfermedad.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        buttonEnfermedad.setForeground(new java.awt.Color(204, 204, 204));
        buttonEnfermedad.setText("Botiquín");
        buttonEnfermedad.setBorderPainted(false);
        buttonEnfermedad.setFocusPainted(false);
        buttonEnfermedad.setPreferredSize(new java.awt.Dimension(140, 26));
        buttonEnfermedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEnfermedadMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonEnfermedadMousePressed(evt);
            }
        });
        buttonEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnfermedadActionPerformed(evt);
            }
        });

        buttonEnfermedad1.setBackground(new java.awt.Color(68, 68, 68));
        buttonEnfermedad1.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        buttonEnfermedad1.setForeground(new java.awt.Color(204, 204, 204));
        buttonEnfermedad1.setText("Crear Paciente");
        buttonEnfermedad1.setBorderPainted(false);
        buttonEnfermedad1.setFocusPainted(false);
        buttonEnfermedad1.setPreferredSize(new java.awt.Dimension(140, 26));
        buttonEnfermedad1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEnfermedad1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonEnfermedad1MousePressed(evt);
            }
        });
        buttonEnfermedad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnfermedad1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(buttonPaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(buttonEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(buttonEnfermedad1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEnfermedad1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout panelFondo1Layout = new javax.swing.GroupLayout(panelFondo1);
        panelFondo1.setLayout(panelFondo1Layout);
        panelFondo1Layout.setHorizontalGroup(
            panelFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBarraSuperior1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelBase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelFondo1Layout.setVerticalGroup(
            panelFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondo1Layout.createSequentialGroup()
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
                .addComponent(panelFondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelMinimizar1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_labelMinimizar1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_labelMinimizar1FocusGained

    private void panelEMinimizarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelEMinimizarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_panelEMinimizarFocusGained

    private void panelEMinimizarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelEMinimizarFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_panelEMinimizarFocusLost

    private void panelEMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEMinimizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelEMinimizarMouseClicked

    private void panelEMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEMinimizarMouseEntered
        panelEMinimizar.setBackground(new Color(71, 71, 71));
    }//GEN-LAST:event_panelEMinimizarMouseEntered

    private void panelEMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEMinimizarMouseExited
        panelEMinimizar.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_panelEMinimizarMouseExited

    private void panelEMinimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEMinimizarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelEMinimizarMousePressed

    private void panelEMinimizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEMinimizarMouseReleased
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_panelEMinimizarMouseReleased

    private void panelESalirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelESalirFocusGained

    }//GEN-LAST:event_panelESalirFocusGained

    private void panelESalirFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelESalirFocusLost

    }//GEN-LAST:event_panelESalirFocusLost

    private void panelESalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelESalirMouseClicked

    }//GEN-LAST:event_panelESalirMouseClicked

    private void panelESalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelESalirMouseEntered
        panelESalir.setBackground(new Color(192, 0, 0));
    }//GEN-LAST:event_panelESalirMouseEntered

    private void panelESalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelESalirMouseExited
        panelESalir.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_panelESalirMouseExited

    private void panelESalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelESalirMouseReleased
        System.exit(0);
    }//GEN-LAST:event_panelESalirMouseReleased

    private void labelCerrarSesionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_labelCerrarSesionFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_labelCerrarSesionFocusGained

    private void panelCerrarSesionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelCerrarSesionFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_panelCerrarSesionFocusGained

    private void panelCerrarSesionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panelCerrarSesionFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_panelCerrarSesionFocusLost

    private void panelCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCerrarSesionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelCerrarSesionMouseClicked

    private void panelCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCerrarSesionMouseEntered
        panelCerrarSesion.setBackground(new Color(71, 71, 71));
    }//GEN-LAST:event_panelCerrarSesionMouseEntered

    private void panelCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCerrarSesionMouseExited
        panelCerrarSesion.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_panelCerrarSesionMouseExited

    private void panelCerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCerrarSesionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelCerrarSesionMousePressed

    private void panelCerrarSesionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCerrarSesionMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_panelCerrarSesionMouseReleased

    private void panelBarraSuperior1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperior1MouseDragged
        x = evt.getXOnScreen();
        y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelBarraSuperior1MouseDragged

    private void panelBarraSuperior1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperior1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelBarraSuperior1MousePressed

    private void buttonPaciente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPaciente1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPaciente1MouseClicked

    private void buttonPaciente1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPaciente1MousePressed
        panelBase.removeAll();
        panelBase.add(panelPacientesDelDia);
        panelBase.revalidate();
        panelBase.repaint();
    }//GEN-LAST:event_buttonPaciente1MousePressed

    private void buttonEnfermedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEnfermedadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEnfermedadMouseClicked

    private void buttonEnfermedadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEnfermedadMousePressed
        panelBase.removeAll();
        panelBase.add(panelBotiquin1);
        panelBase.revalidate();
        panelBase.repaint();
    }//GEN-LAST:event_buttonEnfermedadMousePressed

    private void buttonEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEnfermedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEnfermedadActionPerformed

    private void buttonEnfermedad1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEnfermedad1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEnfermedad1MouseClicked

    private void buttonEnfermedad1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEnfermedad1MousePressed
        panelBase.removeAll();
        panelBase.add(panelCrearPaciente);
        panelBase.revalidate();
        panelBase.repaint();
    }//GEN-LAST:event_buttonEnfermedad1MousePressed

    private void buttonEnfermedad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEnfermedad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEnfermedad1ActionPerformed

    private void listPacientesDelDiaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listPacientesDelDiaValueChanged
        if (!listPacientesDelDia.getValueIsAdjusting() && listPacientesDelDia.getSelectedValue() != null) {
            Object paciente = listPacientesDelDia.getSelectedValue();            
            labelApellidosDelPaciente.setText("Apellidos: " + ((Paciente)paciente).getApellidos());
            //labelMedicamentosASuministrar.setText(((Paciente)paciente).getSintomas());
            labelHabitacionDelPaciente.setText("Habitacion: " + ((Paciente)paciente).getHabitacion());
        }
    }//GEN-LAST:event_listPacientesDelDiaValueChanged

    private void listMedicamentosASuministrarValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listMedicamentosASuministrarValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_listMedicamentosASuministrarValueChanged

    private void textBuscarEnfermedad1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBuscarEnfermedad1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBuscarEnfermedad1KeyPressed

    private void buttonBuscarEnfermedad1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarEnfermedad1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBuscarEnfermedad1MouseClicked

    private void buttonBuscarEnfermedad1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarEnfermedad1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBuscarEnfermedad1MousePressed

    private void buttonBuscarEnfermedad2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarEnfermedad2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBuscarEnfermedad2MouseClicked

    private void buttonBuscarEnfermedad2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarEnfermedad2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBuscarEnfermedad2MousePressed

    private void listBuscarEnfermedades1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listBuscarEnfermedades1ValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_listBuscarEnfermedades1ValueChanged

    private void textBuscarEnfermedad2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBuscarEnfermedad2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBuscarEnfermedad2KeyPressed

    private void textBuscarEnfermedad6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBuscarEnfermedad6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBuscarEnfermedad6KeyPressed

    private void textBuscarEnfermedad7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBuscarEnfermedad7KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBuscarEnfermedad7KeyPressed

    private void buttonBuscarEnfermedad4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarEnfermedad4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBuscarEnfermedad4MouseClicked

    private void buttonBuscarEnfermedad4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarEnfermedad4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBuscarEnfermedad4MousePressed

    private void buttonBuscarEnfermedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarEnfermedadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBuscarEnfermedadMouseClicked

    private void buttonBuscarEnfermedadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarEnfermedadMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBuscarEnfermedadMousePressed

    private void labelCerrarSesionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarSesionMouseReleased
        Login login = new Login();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_labelCerrarSesionMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscarEnfermedad;
    private javax.swing.JButton buttonBuscarEnfermedad1;
    private javax.swing.JButton buttonBuscarEnfermedad2;
    private javax.swing.JButton buttonBuscarEnfermedad4;
    private javax.swing.JButton buttonEnfermedad;
    private javax.swing.JButton buttonEnfermedad1;
    private javax.swing.JButton buttonPaciente1;
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
    private javax.swing.JLabel labelENombreEnfermedad2;
    private javax.swing.JLabel labelEnfermosAVisitar;
    private javax.swing.JLabel labelFechaActual;
    private javax.swing.JLabel labelHabitacionDelPaciente;
    private javax.swing.JLabel labelMedicamentosASuministrar;
    private javax.swing.JLabel labelMinimizar1;
    private javax.swing.JLabel labelSalir;
    private javax.swing.JList<String> listBuscarEnfermedades1;
    private javax.swing.JList<String> listMedicamentosASuministrar;
    private javax.swing.JList<String> listPacientesDelDia;
    private javax.swing.JPanel panelBarraSuperior1;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelBotiquin1;
    private javax.swing.JPanel panelCerrarSesion;
    private javax.swing.JPanel panelCrearPaciente;
    private javax.swing.JPanel panelEMinimizar;
    private javax.swing.JPanel panelESalir;
    private javax.swing.JPanel panelFondo1;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPacientesDelDia;
    private javax.swing.JScrollPane scrollListaMedicamentos4;
    private javax.swing.JScrollPane scrollListaMedicamentosASuministrar;
    private javax.swing.JScrollPane scrollListaPacientesDelDia;
    private javax.swing.JTextField textBuscarEnfermedad1;
    private javax.swing.JTextField textBuscarEnfermedad2;
    private javax.swing.JTextField textBuscarEnfermedad6;
    private javax.swing.JTextField textBuscarEnfermedad7;
    // End of variables declaration//GEN-END:variables
}
