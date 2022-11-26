/**
 * VentanaMedico extends JFrame
 *
 * Venta que implementa las vistas que el médico utiliza
 *
 */
package es.uv.vista;

import es.uv.modelo.AccesoBD;
import es.uv.modelo.Paciente;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import es.uv.modelo.AccesoBD;
import es.uv.modelo.Enfermedad;
import es.uv.modelo.Medicamento;
import es.uv.modelo.Tratamiento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class VentanaMedico extends javax.swing.JFrame {

    //Variables para habilitar la movilidad de la ventana
    private int x, xMouse, yMouse, y;

    //Ventana interna
    private VM_AddHistorialPaciente vAddHistorialPaciente;

    //Variables necesarias para que la ventana funcione sin BBDD
    private ArrayList<String> addA;

    /**
     * VentanaMedico()
     *
     * Contructor de la clase VentanaMedico que inicializa todos los
     * componentes(ventanas de la vista, menús, información) de la clase
     *
     */
    public VentanaMedico() {
        //Iniciar ventanas
        initComponents();
        vAddHistorialPaciente = new VM_AddHistorialPaciente();

        //Establecer configuracion de ventana
        panelBase.setLayout(new BorderLayout());
        panelBase.add(panelPacientesDelDia);
        this.setLocationRelativeTo(null);

        //Establecer renderizados de celda
        listBuscarEnfermedades.setCellRenderer(new SelectedListCellRenderer());
        listMedicamentos.setCellRenderer(new SelectedListCellRenderer());
        listPacientesDelDia.setCellRenderer(new SelectedListCellRenderer());
        vAddHistorialPaciente.setActionListener(new VentanasInternasListener());

        //Pruebas
        addA = new ArrayList<>();

        //Actualiza la fecha del panel Pacientes del dia
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        labelFechaActual.setText("Fecha: " + dateFormat.format(date));
        
        //Rellena la lista del panel Pacientes del dia
        updateListPacientesDelDia();
    }

    class VentanasInternasListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            String command = ae.getActionCommand();
            if (command.equals("addHistorial")) {
                System.out.println("El actionListener funciona");
                addA.add(vAddHistorialPaciente.getFecha()
                        + " - " + vAddHistorialPaciente.getEnfermedad());
                buttonBuscarDNI.doClick();
            }
        }
    }

    /**
     * updateListPacientesDelDia ()
     *
     * Función que actualiza la lista de pacientes del día actual
     *
     */
    public void updateListPacientesDelDia() {

        DefaultListModel listModelPacientes = new DefaultListModel();
        for (Object item : AccesoBD.obtenerPacientesDelDiaBD()) {
            listModelPacientes.addElement(item);
        }

        listPacientesDelDia.setModel(listModelPacientes);
        listPacientesDelDia.setCellRenderer(new NombrePacienteCellRenderer());
    }

    /**
     * NombrePacienteCellRender extends DefaultListCellRender
     *
     * Clase empotrada utilizada para representar los objetos de una lista
     *
     */
    public class NombrePacienteCellRenderer extends DefaultListCellRenderer {

        public Component getListCellRendererComponent(
                JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            label.setText(value.toString());
            return label;
        }
    }

    /**
     * Mostrar enfermedades(int)
     *
     * Actualiza la lista de enfermedades mostrada por el panelBase en la
     * sección "Enfermedades"
     *
     * @param id (int) Identificador de la enfermedad
     */
    public void MostrarEnfermedades(int id) {
        DefaultListModel modelo = new DefaultListModel();
        DefaultListModel modelo2 = new DefaultListModel();
        ArrayList<Enfermedad> e = (ArrayList<Enfermedad>) AccesoBD.obtenerEnfermedadesBD();
        ArrayList<Tratamiento> t = (ArrayList<Tratamiento>) AccesoBD.obtenerTratamientoBD();
        ArrayList<Medicamento> m = (ArrayList<Medicamento>) AccesoBD.obtenerMedicamentosBD();
        
        //Bucle que busca la enfermedad introducida por el usuario
        for (int i = 0; i != e.size(); i++) 
        {
            //Si encuentra la enfermedad busca los tratamientos en los que aparece
            if (e.get(i).getIdEnfermedad() == id) 
            {
                //Busca tratamientos
                for( int c = 0; c != t.size(); c++)
                {
                    //Si encuentra un tratamiento, busca el medicamento que tenga relacionado
                    if(t.get(c).getIdEnfermedad()==id)
                    {
                        //Busca medicamentos
                        for(int z = 0; z != m.size(); z++)
                        {
                            //Si encuentra un medicamento relacionado, lo añade al modelo
                            if(m.get(z).getIdMedicamento() == t.get(c).getIdMedicamento())
                            {
                                modelo2.add(m.get(z).getIdMedicamento(), m.get(z));
                            }
                        }
                    }
                }
                //Finalmente añade la enfermedad al modelo
                modelo.add(id, e.get(i));
            }
        }
        listBuscarEnfermedades.setModel(modelo);
        listMedicamentos.setModel(modelo2);
    }

    /**
     * Controladores de la clase(todo el código generado hasta abajo, sin tener
     * en cuenta la pesataña 'Generated Code'
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPacientesDelDia = new javax.swing.JPanel();
        labelFechaActual = new javax.swing.JLabel();
        scrollListaPacientesdelDia = new javax.swing.JScrollPane();
        listPacientesDelDia = new javax.swing.JList<>();
        labelEnfermosAVisitar = new javax.swing.JLabel();
        scrollSintomas = new javax.swing.JScrollPane();
        textASintomas = new javax.swing.JTextArea();
        labelApellidosPaciente = new javax.swing.JLabel();
        labelSintomasPaciente = new javax.swing.JLabel();
        labelHabitacionPaciente = new javax.swing.JLabel();
        panelBuscarPaciente = new javax.swing.JPanel();
        textBuscarDNI = new javax.swing.JTextField();
        buttonBuscarDNI = new javax.swing.JButton();
        buttonAddHistorial = new javax.swing.JButton();
        labelDNI = new javax.swing.JLabel();
        buttonBorrarDNI = new javax.swing.JButton();
        panelBaseHistorialPacientes = new javax.swing.JPanel();
        scrollFechaEnfermedad = new javax.swing.JScrollPane();
        listFechaEnfermedad = new javax.swing.JList<>();
        labelNombrePaciente = new javax.swing.JLabel();
        panelBuscarEnfermedad = new javax.swing.JPanel();
        buttonBorrarEnfermedad = new javax.swing.JButton();
        buttonBuscarEnfermedad = new javax.swing.JButton();
        scrollListaMedicamentos1 = new javax.swing.JScrollPane();
        listBuscarEnfermedades = new javax.swing.JList<>();
        textBuscarEnfermedad = new javax.swing.JTextField();
        labelBuscarEnfermedad = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelENombreEnfermedad = new javax.swing.JLabel();
        scrollListaMedicamentos3 = new javax.swing.JScrollPane();
        listMedicamentos = new javax.swing.JList<>();
        labelNombreMedicamento = new javax.swing.JLabel();
        labelDosisRecomendada2 = new javax.swing.JLabel();
        labelDosisDiaria2 = new javax.swing.JLabel();
        labelListaEMedicamentos2 = new javax.swing.JLabel();
        labelEnfermedadContagiosa2 = new javax.swing.JLabel();
        labelEnfermedadesRelacionadas2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textEnfermedadesRel = new javax.swing.JTextArea();
        panelBuscarMedicamento = new javax.swing.JPanel();
        buttonBorrar1 = new javax.swing.JButton();
        buttonBuscar1 = new javax.swing.JButton();
        scrollListaMedicamentos2 = new javax.swing.JScrollPane();
        listBuscarMedicamentos = new javax.swing.JList<>();
        textBuscar1 = new javax.swing.JTextField();
        labelBuscarEnfermedad1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelListaMedicamentos3 = new javax.swing.JLabel();
        labelEnfermedadesRelacionadas3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        labelListaMedicamentos4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        labelListaMedicamentos5 = new javax.swing.JLabel();
        labelListaMedicamentos6 = new javax.swing.JLabel();
        panelFondo = new javax.swing.JPanel();
        panelBarraSuperior = new javax.swing.JPanel();
        panelMinimizar = new javax.swing.JPanel();
        labelMinimizar = new javax.swing.JLabel();
        panelSalir = new javax.swing.JPanel();
        labelSalir = new javax.swing.JLabel();
        panelCerrarSesion = new javax.swing.JPanel();
        labelCerrarSesion = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        buttonPaciente1 = new javax.swing.JButton();
        buttonEnfermedad = new javax.swing.JButton();
        buttonMedicamento = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
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
        scrollListaPacientesdelDia.setViewportView(listPacientesDelDia);

        labelEnfermosAVisitar.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelEnfermosAVisitar.setForeground(new java.awt.Color(204, 204, 204));
        labelEnfermosAVisitar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEnfermosAVisitar.setText("Enfermos a visitar");
        labelEnfermosAVisitar.setPreferredSize(new java.awt.Dimension(420, 20));

        scrollSintomas.setPreferredSize(new java.awt.Dimension(242, 20));

        textASintomas.setEditable(false);
        textASintomas.setBackground(new java.awt.Color(71, 71, 71));
        textASintomas.setColumns(20);
        textASintomas.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        textASintomas.setForeground(new java.awt.Color(204, 204, 204));
        textASintomas.setRows(6);
        textASintomas.setTabSize(4);
        textASintomas.setBorder(null);
        textASintomas.setPreferredSize(new java.awt.Dimension(252, 20));
        scrollSintomas.setViewportView(textASintomas);

        labelApellidosPaciente.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelApellidosPaciente.setForeground(new java.awt.Color(204, 204, 204));
        labelApellidosPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelApellidosPaciente.setText("paco antonio");
        labelApellidosPaciente.setPreferredSize(new java.awt.Dimension(420, 20));

        labelSintomasPaciente.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelSintomasPaciente.setForeground(new java.awt.Color(204, 204, 204));
        labelSintomasPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSintomasPaciente.setText("Síntomas");
        labelSintomasPaciente.setPreferredSize(new java.awt.Dimension(420, 20));

        labelHabitacionPaciente.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelHabitacionPaciente.setForeground(new java.awt.Color(204, 204, 204));
        labelHabitacionPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHabitacionPaciente.setText("Habitación 161");
        labelHabitacionPaciente.setPreferredSize(new java.awt.Dimension(420, 20));

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
                            .addComponent(scrollListaPacientesdelDia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                            .addComponent(labelEnfermosAVisitar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(panelPacientesDelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPacientesDelDiaLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(panelPacientesDelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scrollSintomas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelSintomasPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPacientesDelDiaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(labelApellidosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPacientesDelDiaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelHabitacionPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addGroup(panelPacientesDelDiaLayout.createSequentialGroup()
                        .addComponent(labelApellidosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(labelHabitacionPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(labelSintomasPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollSintomas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(scrollListaPacientesdelDia, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        panelBuscarPaciente.setBackground(new java.awt.Color(61, 61, 61));
        panelBuscarPaciente.setPreferredSize(new java.awt.Dimension(896, 512));
        panelBuscarPaciente.setRequestFocusEnabled(false);
        panelBuscarPaciente.setVerifyInputWhenFocusTarget(false);

        textBuscarDNI.setBackground(new java.awt.Color(71, 71, 71));
        textBuscarDNI.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        textBuscarDNI.setForeground(new java.awt.Color(204, 204, 204));
        textBuscarDNI.setText("12345678A");
        textBuscarDNI.setToolTipText("");
        textBuscarDNI.setBorder(null);

        buttonBuscarDNI.setBackground(new java.awt.Color(71, 71, 71));
        buttonBuscarDNI.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonBuscarDNI.setForeground(new java.awt.Color(204, 204, 204));
        buttonBuscarDNI.setText("Buscar");
        buttonBuscarDNI.setBorderPainted(false);
        buttonBuscarDNI.setFocusPainted(false);
        buttonBuscarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarDNIActionPerformed(evt);
            }
        });

        buttonAddHistorial.setBackground(new java.awt.Color(71, 71, 71));
        buttonAddHistorial.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonAddHistorial.setForeground(new java.awt.Color(204, 204, 204));
        buttonAddHistorial.setText("Añadir historial");
        buttonAddHistorial.setBorderPainted(false);
        buttonAddHistorial.setFocusPainted(false);
        buttonAddHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonAddHistorialMousePressed(evt);
            }
        });

        labelDNI.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelDNI.setForeground(new java.awt.Color(204, 204, 204));
        labelDNI.setText("Escribe el DNI del paciente (12345678A):");
        labelDNI.setPreferredSize(new java.awt.Dimension(420, 20));

        buttonBorrarDNI.setBackground(new java.awt.Color(71, 71, 71));
        buttonBorrarDNI.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonBorrarDNI.setForeground(new java.awt.Color(204, 204, 204));
        buttonBorrarDNI.setText("Borrar");
        buttonBorrarDNI.setBorderPainted(false);
        buttonBorrarDNI.setFocusPainted(false);
        buttonBorrarDNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonBorrarDNIMousePressed(evt);
            }
        });

        panelBaseHistorialPacientes.setBackground(new java.awt.Color(81, 81, 81));

        listFechaEnfermedad.setBackground(new java.awt.Color(71, 71, 71));
        listFechaEnfermedad.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        listFechaEnfermedad.setForeground(new java.awt.Color(204, 204, 204));
        listFechaEnfermedad.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "12345678901234567890123456789012", "Item 2", "Item 3", "Item 4", "Item 5", "no hay " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listFechaEnfermedad.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listFechaEnfermedadValueChanged(evt);
            }
        });
        scrollFechaEnfermedad.setViewportView(listFechaEnfermedad);

        labelNombrePaciente.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelNombrePaciente.setForeground(new java.awt.Color(204, 204, 204));
        labelNombrePaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombrePaciente.setText("paco antonio (1245678A)");
        labelNombrePaciente.setPreferredSize(new java.awt.Dimension(420, 20));

        javax.swing.GroupLayout panelBaseHistorialPacientesLayout = new javax.swing.GroupLayout(panelBaseHistorialPacientes);
        panelBaseHistorialPacientes.setLayout(panelBaseHistorialPacientesLayout);
        panelBaseHistorialPacientesLayout.setHorizontalGroup(
            panelBaseHistorialPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseHistorialPacientesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelBaseHistorialPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollFechaEnfermedad)
                    .addComponent(labelNombrePaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        panelBaseHistorialPacientesLayout.setVerticalGroup(
            panelBaseHistorialPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseHistorialPacientesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollFechaEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBuscarPacienteLayout = new javax.swing.GroupLayout(panelBuscarPaciente);
        panelBuscarPaciente.setLayout(panelBuscarPacienteLayout);
        panelBuscarPacienteLayout.setHorizontalGroup(
            panelBuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarPacienteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(buttonBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(buttonBorrarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(buttonAddHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(panelBaseHistorialPacientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBuscarPacienteLayout.setVerticalGroup(
            panelBuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarPacienteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelBuscarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscarDNI)
                    .addComponent(buttonBorrarDNI)
                    .addComponent(buttonAddHistorial))
                .addGap(16, 16, 16)
                .addComponent(panelBaseHistorialPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBuscarEnfermedad.setBackground(new java.awt.Color(61, 61, 61));
        panelBuscarEnfermedad.setPreferredSize(new java.awt.Dimension(896, 512));
        panelBuscarEnfermedad.setRequestFocusEnabled(false);
        panelBuscarEnfermedad.setVerifyInputWhenFocusTarget(false);

        buttonBorrarEnfermedad.setBackground(new java.awt.Color(71, 71, 71));
        buttonBorrarEnfermedad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonBorrarEnfermedad.setForeground(new java.awt.Color(204, 204, 204));
        buttonBorrarEnfermedad.setText("Borrar");
        buttonBorrarEnfermedad.setBorderPainted(false);
        buttonBorrarEnfermedad.setFocusPainted(false);

        buttonBuscarEnfermedad.setBackground(new java.awt.Color(71, 71, 71));
        buttonBuscarEnfermedad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonBuscarEnfermedad.setForeground(new java.awt.Color(204, 204, 204));
        buttonBuscarEnfermedad.setText("Buscar");
        buttonBuscarEnfermedad.setBorderPainted(false);
        buttonBuscarEnfermedad.setFocusPainted(false);
        buttonBuscarEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarEnfermedadActionPerformed(evt);
            }
        });

        listBuscarEnfermedades.setBackground(new java.awt.Color(71, 71, 71));
        listBuscarEnfermedades.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        listBuscarEnfermedades.setForeground(new java.awt.Color(204, 204, 204));
        listBuscarEnfermedades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "12345678901234567890123456789012", "Item 2", "Item 3", "Item 4", "Item 5", "no hay " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listBuscarEnfermedades.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listBuscarEnfermedadesValueChanged(evt);
            }
        });
        scrollListaMedicamentos1.setViewportView(listBuscarEnfermedades);

        textBuscarEnfermedad.setBackground(new java.awt.Color(71, 71, 71));
        textBuscarEnfermedad.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        textBuscarEnfermedad.setForeground(new java.awt.Color(204, 204, 204));
        textBuscarEnfermedad.setText("12345678901234567890");
        textBuscarEnfermedad.setToolTipText("");
        textBuscarEnfermedad.setBorder(null);
        textBuscarEnfermedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textBuscarEnfermedadKeyPressed(evt);
            }
        });

        labelBuscarEnfermedad.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelBuscarEnfermedad.setForeground(new java.awt.Color(204, 204, 204));
        labelBuscarEnfermedad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBuscarEnfermedad.setText("Resultados de la búsqueda");
        labelBuscarEnfermedad.setPreferredSize(new java.awt.Dimension(280, 20));

        jPanel1.setBackground(new java.awt.Color(81, 81, 81));

        labelENombreEnfermedad.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelENombreEnfermedad.setForeground(new java.awt.Color(204, 204, 204));
        labelENombreEnfermedad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelENombreEnfermedad.setText("Enfermedad: nombre de la enfermedad");
        labelENombreEnfermedad.setPreferredSize(new java.awt.Dimension(420, 20));

        listMedicamentos.setBackground(new java.awt.Color(71, 71, 71));
        listMedicamentos.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        listMedicamentos.setForeground(new java.awt.Color(204, 204, 204));
        listMedicamentos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "12345678901234567890123456789012", "Item 2", "Item 3", "Item 4", "Item 5", "no hay " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listMedicamentos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listMedicamentosValueChanged(evt);
            }
        });
        scrollListaMedicamentos3.setViewportView(listMedicamentos);

        labelNombreMedicamento.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelNombreMedicamento.setForeground(new java.awt.Color(204, 204, 204));
        labelNombreMedicamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombreMedicamento.setText("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        labelDosisRecomendada2.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelDosisRecomendada2.setForeground(new java.awt.Color(204, 204, 204));
        labelDosisRecomendada2.setText("Dosis recomendada: xxxxxx");

        labelDosisDiaria2.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelDosisDiaria2.setForeground(new java.awt.Color(204, 204, 204));
        labelDosisDiaria2.setText("Dosis diaria: xxxxxxxx");
        labelDosisDiaria2.setPreferredSize(new java.awt.Dimension(280, 20));

        labelListaEMedicamentos2.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelListaEMedicamentos2.setForeground(new java.awt.Color(204, 204, 204));
        labelListaEMedicamentos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelListaEMedicamentos2.setText("Lista de medicamentos");

        labelEnfermedadContagiosa2.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelEnfermedadContagiosa2.setForeground(new java.awt.Color(0, 192, 0));
        labelEnfermedadContagiosa2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEnfermedadContagiosa2.setText("Enfermedad no contagiosa");

        labelEnfermedadesRelacionadas2.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelEnfermedadesRelacionadas2.setForeground(new java.awt.Color(204, 204, 204));
        labelEnfermedadesRelacionadas2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEnfermedadesRelacionadas2.setText("Enfermedades relacionadas");

        textEnfermedadesRel.setEditable(false);
        textEnfermedadesRel.setBackground(new java.awt.Color(71, 71, 71));
        textEnfermedadesRel.setColumns(20);
        textEnfermedadesRel.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        textEnfermedadesRel.setForeground(new java.awt.Color(204, 204, 204));
        textEnfermedadesRel.setRows(6);
        textEnfermedadesRel.setTabSize(4);
        textEnfermedadesRel.setBorder(null);
        textEnfermedadesRel.setPreferredSize(new java.awt.Dimension(252, 132));
        jScrollPane2.setViewportView(textEnfermedadesRel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelENombreEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelEnfermedadContagiosa2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelListaEMedicamentos2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrollListaMedicamentos3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNombreMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(labelDosisRecomendada2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(labelDosisDiaria2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2)
                    .addComponent(labelEnfermedadesRelacionadas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelENombreEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEnfermedadContagiosa2))
                .addGap(24, 24, 24)
                .addComponent(labelListaEMedicamentos2)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollListaMedicamentos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelNombreMedicamento)
                        .addGap(32, 32, 32)
                        .addComponent(labelDosisRecomendada2)
                        .addGap(32, 32, 32)
                        .addComponent(labelDosisDiaria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(labelEnfermedadesRelacionadas2)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout panelBuscarEnfermedadLayout = new javax.swing.GroupLayout(panelBuscarEnfermedad);
        panelBuscarEnfermedad.setLayout(panelBuscarEnfermedadLayout);
        panelBuscarEnfermedadLayout.setHorizontalGroup(
            panelBuscarEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarEnfermedadLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelBuscarEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollListaMedicamentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBuscarEnfermedadLayout.createSequentialGroup()
                        .addGroup(panelBuscarEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelBuscarEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(textBuscarEnfermedad, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(panelBuscarEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonBuscarEnfermedad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonBorrarEnfermedad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBuscarEnfermedadLayout.setVerticalGroup(
            panelBuscarEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarEnfermedadLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelBuscarEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBuscarEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscarEnfermedad))
                .addGap(16, 16, 16)
                .addGroup(panelBuscarEnfermedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBorrarEnfermedad)
                    .addComponent(labelBuscarEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(scrollListaMedicamentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelBuscarMedicamento.setBackground(new java.awt.Color(61, 61, 61));
        panelBuscarMedicamento.setPreferredSize(new java.awt.Dimension(896, 512));
        panelBuscarMedicamento.setRequestFocusEnabled(false);
        panelBuscarMedicamento.setVerifyInputWhenFocusTarget(false);

        buttonBorrar1.setBackground(new java.awt.Color(71, 71, 71));
        buttonBorrar1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonBorrar1.setForeground(new java.awt.Color(204, 204, 204));
        buttonBorrar1.setText("Borrar");
        buttonBorrar1.setBorderPainted(false);
        buttonBorrar1.setFocusPainted(false);

        buttonBuscar1.setBackground(new java.awt.Color(71, 71, 71));
        buttonBuscar1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonBuscar1.setForeground(new java.awt.Color(204, 204, 204));
        buttonBuscar1.setText("Buscar");
        buttonBuscar1.setBorderPainted(false);
        buttonBuscar1.setFocusPainted(false);

        listBuscarMedicamentos.setBackground(new java.awt.Color(71, 71, 71));
        listBuscarMedicamentos.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        listBuscarMedicamentos.setForeground(new java.awt.Color(204, 204, 204));
        listBuscarMedicamentos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "sd", "s", "d", "fdgh", "jkl", " ", "c" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollListaMedicamentos2.setViewportView(listBuscarMedicamentos);

        textBuscar1.setBackground(new java.awt.Color(71, 71, 71));
        textBuscar1.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        textBuscar1.setForeground(new java.awt.Color(204, 204, 204));
        textBuscar1.setText("werref");
        textBuscar1.setToolTipText("");
        textBuscar1.setBorder(null);

        labelBuscarEnfermedad1.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelBuscarEnfermedad1.setForeground(new java.awt.Color(204, 204, 204));
        labelBuscarEnfermedad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBuscarEnfermedad1.setText("Resultados de la búsqueda");
        labelBuscarEnfermedad1.setPreferredSize(new java.awt.Dimension(280, 20));

        jPanel2.setBackground(new java.awt.Color(81, 81, 81));

        labelListaMedicamentos3.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelListaMedicamentos3.setForeground(new java.awt.Color(204, 204, 204));
        labelListaMedicamentos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelListaMedicamentos3.setText("Enfermedades");

        labelEnfermedadesRelacionadas3.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelEnfermedadesRelacionadas3.setForeground(new java.awt.Color(204, 204, 204));
        labelEnfermedadesRelacionadas3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEnfermedadesRelacionadas3.setText("Efectos secunadarios");

        jScrollPane3.setPreferredSize(new java.awt.Dimension(242, 20));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(71, 71, 71));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea2.setRows(6);
        jTextArea2.setTabSize(4);
        jTextArea2.setBorder(null);
        jTextArea2.setPreferredSize(new java.awt.Dimension(252, 20));
        jScrollPane3.setViewportView(jTextArea2);

        labelListaMedicamentos4.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelListaMedicamentos4.setForeground(new java.awt.Color(204, 204, 204));
        labelListaMedicamentos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelListaMedicamentos4.setText("Posibles alergias");

        jScrollPane4.setPreferredSize(new java.awt.Dimension(242, 20));

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(71, 71, 71));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea3.setRows(6);
        jTextArea3.setTabSize(4);
        jTextArea3.setBorder(null);
        jTextArea3.setPreferredSize(new java.awt.Dimension(252, 20));
        jScrollPane4.setViewportView(jTextArea3);

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

        labelListaMedicamentos5.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelListaMedicamentos5.setForeground(new java.awt.Color(204, 204, 204));
        labelListaMedicamentos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelListaMedicamentos5.setText("Nombre del medicamento");

        labelListaMedicamentos6.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        labelListaMedicamentos6.setForeground(new java.awt.Color(204, 204, 204));
        labelListaMedicamentos6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelListaMedicamentos6.setText("que cura");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelListaMedicamentos5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelEnfermedadesRelacionadas3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelListaMedicamentos4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelListaMedicamentos6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelListaMedicamentos3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelListaMedicamentos5)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(labelListaMedicamentos3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelListaMedicamentos6)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(labelListaMedicamentos4)))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(labelEnfermedadesRelacionadas3)))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout panelBuscarMedicamentoLayout = new javax.swing.GroupLayout(panelBuscarMedicamento);
        panelBuscarMedicamento.setLayout(panelBuscarMedicamentoLayout);
        panelBuscarMedicamentoLayout.setHorizontalGroup(
            panelBuscarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarMedicamentoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelBuscarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollListaMedicamentos2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBuscarMedicamentoLayout.createSequentialGroup()
                        .addGroup(panelBuscarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelBuscarEnfermedad1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(textBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(panelBuscarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonBuscar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonBorrar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBuscarMedicamentoLayout.setVerticalGroup(
            panelBuscarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarMedicamentoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelBuscarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscar1))
                .addGap(16, 16, 16)
                .addGroup(panelBuscarMedicamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBorrar1)
                    .addComponent(labelBuscarEnfermedad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(scrollListaMedicamentos2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(768, 618));

        panelFondo.setBackground(new java.awt.Color(90, 90, 90));
        panelFondo.setPreferredSize(new java.awt.Dimension(0, 0));

        panelBarraSuperior.setBackground(new java.awt.Color(51, 51, 51));
        panelBarraSuperior.setPreferredSize(new java.awt.Dimension(0, 0));
        panelBarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelBarraSuperiorMouseDragged(evt);
            }
        });
        panelBarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBarraSuperiorMousePressed(evt);
            }
        });

        panelMinimizar.setBackground(new java.awt.Color(51, 51, 51));
        panelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelMinimizarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelMinimizarMouseReleased(evt);
            }
        });

        labelMinimizar.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        labelMinimizar.setForeground(new java.awt.Color(204, 204, 204));
        labelMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMinimizar.setText("-");
        labelMinimizar.setMaximumSize(new java.awt.Dimension(14, 30));
        labelMinimizar.setMinimumSize(new java.awt.Dimension(14, 30));
        labelMinimizar.setPreferredSize(new java.awt.Dimension(14, 30));

        javax.swing.GroupLayout panelMinimizarLayout = new javax.swing.GroupLayout(panelMinimizar);
        panelMinimizar.setLayout(panelMinimizarLayout);
        panelMinimizarLayout.setHorizontalGroup(
            panelMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMinimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        panelMinimizarLayout.setVerticalGroup(
            panelMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMinimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelSalir.setBackground(new java.awt.Color(51, 51, 51));
        panelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelSalirMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelSalirMouseReleased(evt);
            }
        });

        labelSalir.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        labelSalir.setForeground(new java.awt.Color(204, 204, 204));
        labelSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSalir.setText("x");

        javax.swing.GroupLayout panelSalirLayout = new javax.swing.GroupLayout(panelSalir);
        panelSalir.setLayout(panelSalirLayout);
        panelSalirLayout.setHorizontalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        panelSalirLayout.setVerticalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelCerrarSesion.setBackground(new java.awt.Color(51, 51, 51));
        panelCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelCerrarSesionMouseExited(evt);
            }
        });

        labelCerrarSesion.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        labelCerrarSesion.setForeground(new java.awt.Color(204, 204, 204));
        labelCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCerrarSesion.setText("·");
        labelCerrarSesion.setMaximumSize(new java.awt.Dimension(14, 30));
        labelCerrarSesion.setMinimumSize(new java.awt.Dimension(14, 30));
        labelCerrarSesion.setPreferredSize(new java.awt.Dimension(14, 30));
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

        javax.swing.GroupLayout panelBarraSuperiorLayout = new javax.swing.GroupLayout(panelBarraSuperior);
        panelBarraSuperior.setLayout(panelBarraSuperiorLayout);
        panelBarraSuperiorLayout.setHorizontalGroup(
            panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraSuperiorLayout.createSequentialGroup()
                .addComponent(panelCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(752, 752, 752)
                .addComponent(panelMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBarraSuperiorLayout.setVerticalGroup(
            panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraSuperiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMinimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panelMenu.setBackground(new java.awt.Color(51, 51, 51));
        panelMenu.setPreferredSize(new java.awt.Dimension(0, 0));

        buttonPaciente1.setBackground(new java.awt.Color(68, 68, 68));
        buttonPaciente1.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        buttonPaciente1.setForeground(new java.awt.Color(204, 204, 204));
        buttonPaciente1.setText("Pacientes del día");
        buttonPaciente1.setBorderPainted(false);
        buttonPaciente1.setFocusPainted(false);
        buttonPaciente1.setPreferredSize(new java.awt.Dimension(140, 26));
        buttonPaciente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonPaciente1MousePressed(evt);
            }
        });

        buttonEnfermedad.setBackground(new java.awt.Color(68, 68, 68));
        buttonEnfermedad.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        buttonEnfermedad.setForeground(new java.awt.Color(204, 204, 204));
        buttonEnfermedad.setText("Enfermedades");
        buttonEnfermedad.setBorderPainted(false);
        buttonEnfermedad.setFocusPainted(false);
        buttonEnfermedad.setPreferredSize(new java.awt.Dimension(140, 26));
        buttonEnfermedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonEnfermedadMousePressed(evt);
            }
        });

        buttonMedicamento.setBackground(new java.awt.Color(68, 68, 68));
        buttonMedicamento.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        buttonMedicamento.setForeground(new java.awt.Color(204, 204, 204));
        buttonMedicamento.setText("Medicamentos");
        buttonMedicamento.setBorderPainted(false);
        buttonMedicamento.setFocusPainted(false);
        buttonMedicamento.setPreferredSize(new java.awt.Dimension(140, 26));
        buttonMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonMedicamentoMousePressed(evt);
            }
        });

        buttonPaciente.setBackground(new java.awt.Color(68, 68, 68));
        buttonPaciente.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        buttonPaciente.setForeground(new java.awt.Color(204, 204, 204));
        buttonPaciente.setText("Historial pacientes");
        buttonPaciente.setBorderPainted(false);
        buttonPaciente.setFocusPainted(false);
        buttonPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonPacienteMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(buttonPaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(buttonEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(buttonMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(buttonPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        panelBase.setBackground(new java.awt.Color(61, 61, 61));
        panelBase.setPreferredSize(new java.awt.Dimension(0, 0));

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
            .addComponent(panelBarraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelBase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(panelBarraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelBase, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelBase.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleParent(panelBuscarMedicamento);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSalirMouseEntered
        panelSalir.setBackground(new Color(192, 0, 0));
    }//GEN-LAST:event_panelSalirMouseEntered

    private void panelSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSalirMouseExited
        panelSalir.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_panelSalirMouseExited

    private void panelSalirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSalirMouseReleased
        System.exit(0);
    }//GEN-LAST:event_panelSalirMouseReleased

    private void panelBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperiorMouseDragged
        x = evt.getXOnScreen();
        y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelBarraSuperiorMouseDragged

    private void panelBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelBarraSuperiorMousePressed

    private void panelMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseEntered
        panelMinimizar.setBackground(new Color(71, 71, 71));
    }//GEN-LAST:event_panelMinimizarMouseEntered

    private void panelMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseExited
        panelMinimizar.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_panelMinimizarMouseExited

    private void panelMinimizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseReleased
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_panelMinimizarMouseReleased

    private void buttonEnfermedadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEnfermedadMousePressed
        panelBase.removeAll();
        panelBase.add(panelBuscarEnfermedad);

        panelBase.revalidate();
        panelBase.repaint();
    }//GEN-LAST:event_buttonEnfermedadMousePressed

    private void buttonPaciente1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPaciente1MousePressed
        panelBase.removeAll();
        panelBase.add(panelPacientesDelDia);
        panelBase.revalidate();
        panelBase.repaint();
    }//GEN-LAST:event_buttonPaciente1MousePressed

    private void buttonMedicamentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMedicamentoMousePressed
        panelBase.removeAll();
        panelBase.add(panelBuscarMedicamento);
        panelBase.revalidate();
        panelBase.repaint();
    }//GEN-LAST:event_buttonMedicamentoMousePressed

    private void buttonPacienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPacienteMousePressed
        panelBase.removeAll();
        panelBase.add(panelBuscarPaciente);
        panelBase.revalidate();
        panelBase.repaint();
    }//GEN-LAST:event_buttonPacienteMousePressed

    private void panelCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCerrarSesionMouseExited
        panelCerrarSesion.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_panelCerrarSesionMouseExited

    private void textBuscarEnfermedadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBuscarEnfermedadKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buttonBuscarEnfermedad.doClick();
        }
    }//GEN-LAST:event_textBuscarEnfermedadKeyPressed

    private void listBuscarEnfermedadesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listBuscarEnfermedadesValueChanged
        labelENombreEnfermedad.setText("Enfermedad: " + listBuscarEnfermedades.getSelectedValue());
    }//GEN-LAST:event_listBuscarEnfermedadesValueChanged

    private void listMedicamentosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listMedicamentosValueChanged
        labelNombreMedicamento.setText(listMedicamentos.getSelectedValue() + " ");
    }//GEN-LAST:event_listMedicamentosValueChanged

    private void buttonBorrarDNIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBorrarDNIMousePressed
        textBuscarDNI.setText("");
    }//GEN-LAST:event_buttonBorrarDNIMousePressed

    private void listFechaEnfermedadValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listFechaEnfermedadValueChanged
        // FALTA AÑADIR ALGUNA COSA
    }//GEN-LAST:event_listFechaEnfermedadValueChanged

    private void listPacientesDelDiaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listPacientesDelDiaValueChanged
        if (!listPacientesDelDia.getValueIsAdjusting() && listPacientesDelDia.getSelectedValue() != null) {
            Object paciente = listPacientesDelDia.getSelectedValue();
            labelApellidosPaciente.setText("Apellidos: " + ((Paciente) paciente).getApellidos());
            textASintomas.setText(((Paciente) paciente).getSintomas());
            labelHabitacionPaciente.setText("Habitacion: " + ((Paciente) paciente).getHabitacion());
        }
    }//GEN-LAST:event_listPacientesDelDiaValueChanged

    private void panelCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCerrarSesionMouseEntered
        panelCerrarSesion.setBackground(new Color(71, 71, 71));
    }//GEN-LAST:event_panelCerrarSesionMouseEntered

    private void labelCerrarSesionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarSesionMouseReleased
        Login login = new Login();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_labelCerrarSesionMouseReleased
    /*
    buttonBuscarEnfermedadActionPerdormed(ActionEvent)
    Botón que lanza la secuencia de acciones por la cual se busca una enfermedad en concreto a partir de su id

     */
    private void buttonBuscarEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarEnfermedadActionPerformed
        // TODO add your handling code here:

        MostrarEnfermedades(Integer.valueOf(textBuscarEnfermedad.getText()));

    }//GEN-LAST:event_buttonBuscarEnfermedadActionPerformed

    private void buttonAddHistorialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddHistorialMousePressed
        vAddHistorialPaciente.limpiar();
        vAddHistorialPaciente.setLocationRelativeTo(this);
        vAddHistorialPaciente.setVisible(true);

    }//GEN-LAST:event_buttonAddHistorialMousePressed

    private void buttonBuscarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarDNIActionPerformed
        //Prueba primera historia Práctica 2 
        if (textBuscarDNI.getText().equals("12345678A")) {
            DefaultListModel listModelActividades = new DefaultListModel();
            labelNombrePaciente.setText("Paco Antonio Vallecas (12345678A)");
            listModelActividades.addElement("21/12/21 - coronavirus");
            if (!addA.isEmpty()) {
                for (int i = 0; i < addA.size(); i++) {
                    listModelActividades.addElement(addA.get(i));
                    System.out.println(addA.get(i));
                }
            }
            listFechaEnfermedad.setModel(listModelActividades);
        }
        if (textBuscarDNI.getText().equals("12345678B")) {
            DefaultListModel listModelActividades = new DefaultListModel();
            listModelActividades.addElement("21/12/21 - VIRUELA DEL MONO");
            listFechaEnfermedad.setModel(listModelActividades);
            labelNombrePaciente.setText("VICENTE ANDRES ESTELLES (12345678B)");
        }
    }//GEN-LAST:event_buttonBuscarDNIActionPerformed

    public class SelectedListCellRenderer extends DefaultListCellRenderer {

        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            if (isSelected) {
                c.setBackground(new Color(91, 91, 91));
                c.setForeground(new Color(204, 204, 204));

            }
            return c;
        }
    }

    /**
     *
     * Elementos inicializados automáticamente de la clase
     *
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddHistorial;
    private javax.swing.JButton buttonBorrar1;
    private javax.swing.JButton buttonBorrarDNI;
    private javax.swing.JButton buttonBorrarEnfermedad;
    private javax.swing.JButton buttonBuscar1;
    private javax.swing.JButton buttonBuscarDNI;
    private javax.swing.JButton buttonBuscarEnfermedad;
    private javax.swing.JButton buttonEnfermedad;
    private javax.swing.JButton buttonMedicamento;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPaciente1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JLabel labelApellidosPaciente;
    private javax.swing.JLabel labelBuscarEnfermedad;
    private javax.swing.JLabel labelBuscarEnfermedad1;
    private javax.swing.JLabel labelCerrarSesion;
    private javax.swing.JLabel labelDNI;
    private javax.swing.JLabel labelDosisDiaria2;
    private javax.swing.JLabel labelDosisRecomendada2;
    private javax.swing.JLabel labelENombreEnfermedad;
    private javax.swing.JLabel labelEnfermedadContagiosa2;
    private javax.swing.JLabel labelEnfermedadesRelacionadas2;
    private javax.swing.JLabel labelEnfermedadesRelacionadas3;
    private javax.swing.JLabel labelEnfermosAVisitar;
    private javax.swing.JLabel labelFechaActual;
    private javax.swing.JLabel labelHabitacionPaciente;
    private javax.swing.JLabel labelListaEMedicamentos2;
    private javax.swing.JLabel labelListaMedicamentos3;
    private javax.swing.JLabel labelListaMedicamentos4;
    private javax.swing.JLabel labelListaMedicamentos5;
    private javax.swing.JLabel labelListaMedicamentos6;
    private javax.swing.JLabel labelMinimizar;
    private javax.swing.JLabel labelNombreMedicamento;
    private javax.swing.JLabel labelNombrePaciente;
    private javax.swing.JLabel labelSalir;
    private javax.swing.JLabel labelSintomasPaciente;
    private javax.swing.JList<String> listBuscarEnfermedades;
    private javax.swing.JList<String> listBuscarMedicamentos;
    private javax.swing.JList<String> listFechaEnfermedad;
    private javax.swing.JList<String> listMedicamentos;
    private javax.swing.JList<String> listPacientesDelDia;
    private javax.swing.JPanel panelBarraSuperior;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelBaseHistorialPacientes;
    private javax.swing.JPanel panelBuscarEnfermedad;
    private javax.swing.JPanel panelBuscarMedicamento;
    private javax.swing.JPanel panelBuscarPaciente;
    private javax.swing.JPanel panelCerrarSesion;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMinimizar;
    private javax.swing.JPanel panelPacientesDelDia;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JScrollPane scrollFechaEnfermedad;
    private javax.swing.JScrollPane scrollListaMedicamentos1;
    private javax.swing.JScrollPane scrollListaMedicamentos2;
    private javax.swing.JScrollPane scrollListaMedicamentos3;
    private javax.swing.JScrollPane scrollListaPacientesdelDia;
    private javax.swing.JScrollPane scrollSintomas;
    private javax.swing.JTextArea textASintomas;
    private javax.swing.JTextField textBuscar1;
    private javax.swing.JTextField textBuscarDNI;
    private javax.swing.JTextField textBuscarEnfermedad;
    private javax.swing.JTextArea textEnfermedadesRel;
    // End of variables declaration//GEN-END:variables
}
