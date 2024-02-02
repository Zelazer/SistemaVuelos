import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class App {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/vuelos?serverTimezone=UTC";
        String user = "root";
        String password = "S3n42023*";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("Conectado");
            }
            Ventana ventana = new Ventana();

            ventana.setTitle("Sistema de Vuelo");

            JTabbedPane tabbedPane = new JTabbedPane();

            JPanel panel1 = new JPanel(null);
            JLabel label1_nombre = new JLabel("Nombre del aeropuerto");
            panel1.add(label1_nombre);
            JTextField texto1_nombre = new JTextField(10);
            panel1.add(texto1_nombre);
            JLabel label1_ubicacion = new JLabel("Ubicacion del aeropuerto");
            panel1.add(label1_ubicacion);
            JTextField texto1_ubicacion = new JTextField(10);
            panel1.add(texto1_ubicacion);
            JButton boton1_añadir = new JButton("Añadir");
            panel1.add(boton1_añadir);
            label1_nombre.setBounds(10, 10, 150, 20);
            texto1_nombre.setBounds(160, 10, 150, 20);
            label1_ubicacion.setBounds(10, 40, 150, 20);
            texto1_ubicacion.setBounds(160, 40, 150, 20);
            boton1_añadir.setBounds(10, 70, 100, 30);



            JPanel panel2 = new JPanel(null);

            JLabel label2_numeroVuelo = new JLabel("Numero de Vuelo");
            panel2.add(label2_numeroVuelo);
            JTextField texto2_numeroVuelo = new JTextField(10);
            panel2.add(texto2_numeroVuelo);

            JLabel label2_nombreAerolinea = new JLabel("Nombre de Aerolínea");
            panel2.add(label2_nombreAerolinea);
            JTextField texto2_nombreAerolinea = new JTextField(10);
            panel2.add(texto2_nombreAerolinea);

            JLabel label2_horaSalida = new JLabel("Hora de Salida");
            panel2.add(label2_horaSalida);
            JTextField texto2_horaSalida = new JTextField(10);
            panel2.add(texto2_horaSalida);

            JLabel label2_destino = new JLabel("Destino");
            panel2.add(label2_destino);
            JTextField texto2_destino = new JTextField(10);
            panel2.add(texto2_destino);

            JLabel label2_capacidad = new JLabel("Capacidad");
            panel2.add(label2_capacidad);
            JTextField texto2_capacidad = new JTextField(10);
            panel2.add(texto2_capacidad);

            JLabel label2_aeroPartida = new JLabel("Aeropuerto Partida");
            panel2.add(label2_aeroPartida);
            JTextField texto2_aeroPartida = new JTextField(10);
            panel2.add(texto2_aeroPartida);

            JLabel label2_aeroLlegada = new JLabel("Aeropuerto Llegada");
            panel2.add(label2_aeroLlegada);
            JTextField texto2_aeroLlegada = new JTextField(10);
            panel2.add(texto2_aeroLlegada);

            JButton boton2_añadir = new JButton("Añadir");
            panel2.add(boton2_añadir);

            int yPosition = 10;
            label2_numeroVuelo.setBounds(10, yPosition, 150, 20);
            texto2_numeroVuelo.setBounds(160, yPosition, 150, 20);
            yPosition += 30;
            label2_nombreAerolinea.setBounds(10, yPosition, 150, 20);
            texto2_nombreAerolinea.setBounds(160, yPosition, 150, 20);
            yPosition += 30;
            label2_horaSalida.setBounds(10, yPosition, 150, 20);
            texto2_horaSalida.setBounds(160, yPosition, 150, 20);
            yPosition += 30;
            label2_destino.setBounds(10, yPosition, 150, 20);
            texto2_destino.setBounds(160, yPosition, 150, 20);
            yPosition += 30;
            label2_capacidad.setBounds(10, yPosition, 150, 20);
            texto2_capacidad.setBounds(160, yPosition, 150, 20);
            yPosition += 30;
            label2_aeroPartida.setBounds(10, yPosition, 150, 20);
            texto2_aeroPartida.setBounds(160, yPosition, 150, 20);
            yPosition += 30;
            label2_aeroLlegada.setBounds(10, yPosition, 150, 20);
            texto2_aeroLlegada.setBounds(160, yPosition, 150, 20);
            yPosition += 30;

            boton2_añadir.setBounds(10, yPosition, 100, 30);



            JPanel panel3 = new JPanel(null);
            JLabel label3_numeroVuelo = new JLabel("Número de Vuelo");
            panel3.add(label3_numeroVuelo);
            JTextField texto3_numeroVuelo = new JTextField(10);
            panel3.add(texto3_numeroVuelo);

            JLabel label3_nombrePasajero = new JLabel("Nombre");
            panel3.add(label3_nombrePasajero);
            JTextField texto3_nombrePasajero = new JTextField(10);
            panel3.add(texto3_nombrePasajero);

            JLabel label3_pasaporte = new JLabel("Pasaporte");
            panel3.add(label3_pasaporte);
            JTextField texto3_pasaporte = new JTextField(10);
            panel3.add(texto3_pasaporte);

            JLabel label3_equipaje = new JLabel("Equipaje");
            panel3.add(label3_equipaje);
            JTextField texto3_equipaje = new JTextField(10);
            panel3.add(texto3_equipaje);

            JButton boton3_añadir = new JButton("Añadir");
            panel3.add(boton3_añadir);

            int yPositionPanel3 = 10;
            label3_numeroVuelo.setBounds(10, yPositionPanel3, 150, 20);
            texto3_numeroVuelo.setBounds(160, yPositionPanel3, 150, 20);
            yPositionPanel3 += 30;
            label3_nombrePasajero.setBounds(10, yPositionPanel3, 150, 20);
            texto3_nombrePasajero.setBounds(160, yPositionPanel3, 150, 20);
            yPositionPanel3 += 30;
            label3_pasaporte.setBounds(10, yPositionPanel3, 150, 20);
            texto3_pasaporte.setBounds(160, yPositionPanel3, 150, 20);
            yPositionPanel3 += 30;
            label3_equipaje.setBounds(10, yPositionPanel3, 150, 20);
            texto3_equipaje.setBounds(160, yPositionPanel3, 150, 20);
            yPositionPanel3 += 30;
            boton3_añadir.setBounds(10, yPositionPanel3, 100, 30);

            
            JPanel panel4 = new JPanel(null); 
            JLabel label4_numeroVuelo = new JLabel("Número de Vuelo");
            panel4.add(label4_numeroVuelo);
            JTextField texto4_numeroVuelo = new JTextField(10);
            panel4.add(texto4_numeroVuelo);
            JButton boton4_verVuelo = new JButton("Ver Vuelo");
            panel4.add(boton4_verVuelo);
            int yPositionPanel4 = 10;
            label4_numeroVuelo.setBounds(10, yPositionPanel4, 150, 20);
            texto4_numeroVuelo.setBounds(160, yPositionPanel4, 150, 20);
            yPositionPanel4 += 30;
            boton4_verVuelo.setBounds(10, yPositionPanel4, 100, 30);

        
            JPanel panel5 = new JPanel(null); 
            JButton boton5_verVuelos = new JButton("Ver Vuelos");
            panel5.add(boton5_verVuelos);
            boton5_verVuelos.setBounds(10, 10, 150, 30);


            JPanel panel6 = new JPanel(null);
            JButton boton6_verPasajeros = new JButton("Ver Pasajeros");
            panel6.add(boton6_verPasajeros);
            boton6_verPasajeros.setBounds(10, 10, 150, 30);

            JPanel panel7= new JPanel(null);
            JLabel label7_nombre = new JLabel("Nombre del aeropuerto");
            panel7.add(label7_nombre);
            JTextField texto7_nombre = new JTextField(10);
            panel7.add(texto7_nombre);
            JButton boton7_eliminar = new JButton("Eliminar");
            panel7.add(boton7_eliminar);
            label7_nombre.setBounds(10, 10, 150, 20);
            texto7_nombre.setBounds(160, 10, 150, 20);
            boton7_eliminar.setBounds(10, 40, 100, 30);


            JPanel panel8= new JPanel(null);
            JLabel label8_numeroVuelo = new JLabel("Numero de Vuelo");
            panel8.add(label8_numeroVuelo);
            JTextField texto8_numeroVuelo = new JTextField(10);
            panel8.add(texto8_numeroVuelo);
            JButton boton8_eliminar = new JButton("Eliminar");
            panel8.add(boton8_eliminar);
            label8_numeroVuelo.setBounds(10, 10, 150, 20);
            texto8_numeroVuelo.setBounds(160, 10, 150, 20);
            boton8_eliminar.setBounds(10, 40, 100, 30);

            JPanel panel9 = new JPanel(null);
            JLabel label9_pasaporte = new JLabel("Pasaporte");
            panel9.add(label9_pasaporte);
            JTextField texto9_pasaporte = new JTextField(10);
            panel9.add(texto9_pasaporte);
            JLabel label9_numeroVuelo = new JLabel("Numero de Vuelo");
            panel9.add(label9_numeroVuelo);
            JTextField texto9_numeroVuelo = new JTextField(10);
            panel9.add(texto9_numeroVuelo);
            JButton boton9_eliminar = new JButton("Eliminar");
            panel9.add(boton9_eliminar);
            label9_pasaporte.setBounds(10, 10, 150, 20);
            texto9_pasaporte.setBounds(160, 10, 150, 20);
            label9_numeroVuelo.setBounds(10, 40, 150, 20);
            texto9_numeroVuelo.setBounds(160, 40, 150, 20);
            boton9_eliminar.setBounds(10, 70, 100, 30);

            JPanel panel10 = new JPanel(null);
            JButton boton10_aeropuertos = new JButton("Aeropuertos");
            panel10.add(boton10_aeropuertos);
            boton10_aeropuertos.setBounds(10, 10, 150, 30);


            tabbedPane.addTab("Añadir Aeropuerto", null, panel1, "Crear Aeropuertos");
            tabbedPane.addTab("Añadir Vuelo", null, panel2, "Crear Vuelos");
            tabbedPane.addTab("Añadir Pasajero", null, panel3, "Reservar Asientos");
            tabbedPane.addTab("Ver Vuelo", null, panel4, "Ver vuelo por codigo");
            tabbedPane.addTab("Ver Vuelos", null, panel5, "Ver todos los vuelos");
            tabbedPane.addTab("Ver Pasajeros", null, panel6, "Ver todos los pasajeros");
            tabbedPane.addTab("Eliminar Aeropuerto", null, panel7, "Eliminar aeropuerto");
            tabbedPane.addTab("Eliminar Vuelo", null, panel8, "Eliminar vuelo");
            tabbedPane.addTab("Eliminar Pasajero", null, panel9, "Eliminar pasajero");
            tabbedPane.addTab("Aeropuertos", null, panel10, "Eliminar pasajero");

            ventana.getContentPane().add(tabbedPane, BorderLayout.CENTER);

            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            ventana.setSize(575, 500);

            ventana.setResizable(true);

            ventana.setVisible(true);
            
            

            String sql = "";
            ArrayList<Aeropuerto> aeropuertos = new ArrayList<>();
            ArrayList<Vuelo> vuelos = new ArrayList<>();
            sql = "SELECT * FROM aeropuertos";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                String nombre=rs.getString("nombre");
                String ubicacion = rs.getString("ubicacion");

                aeropuertos.add(new Aeropuerto(nombre, ubicacion));
            }

            sql = "SELECT * FROM vuelos";
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                int numeroVuelo2=rs.getInt("numeroVuelo");
                String aerolinea=rs.getString("aerolinea");
                String horaSalida = rs.getString("horaSalida");
                String destino = rs.getString("destino");
                int capacidadMaxima = rs.getInt("capacidadMaxima");
                String aeropuertoPartida = rs.getString("aeropuertoPartida");
                String aeropuertoLlegada = rs.getString("aeropuertoLlegada");

                for (Aeropuerto aeropuerto : aeropuertos) {
                    if (aeropuerto.getNombre().equals(aeropuertoPartida)) {
                        for (Aeropuerto aeropuerto2 : aeropuertos) {
                            if (aeropuerto2.getNombre().equals(aeropuertoLlegada)) {
                                aeropuerto.registrarVuelo(new Vuelo(numeroVuelo2, aerolinea, horaSalida, destino, capacidadMaxima, aeropuerto, aeropuerto2));
                                vuelos.add(new Vuelo(numeroVuelo2, aerolinea, horaSalida, destino, capacidadMaxima, aeropuerto, aeropuerto2));
                            }
                        }
                        
                    }
                }
            }

                ActionListener oyente1 = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae){
                        String nombre = texto1_nombre.getText();
                        String ubicacion = texto1_ubicacion.getText();
                        Aeropuerto nuevoAeropuerto = new Aeropuerto(nombre, ubicacion);

                        boolean existente = false;

                        for (Aeropuerto aeropuerto : aeropuertos) {
                            if (aeropuerto.getNombre().equals(nuevoAeropuerto.getNombre())) {
                                JOptionPane.showMessageDialog(null, "Ya existe un aeropuerto con este nombre", "Error", JOptionPane.ERROR_MESSAGE);
                                existente = true;
                                break;
                            }
                        }

                        if (!existente && nombre.length() != 0 && ubicacion.length() != 0) {
                            aeropuertos.add(nuevoAeropuerto);
                            String sql = "INSERT INTO aeropuertos (nombre, ubicacion) VALUES(?,?)";
                            PreparedStatement pstm;
                            try {
                                pstm = conn.prepareStatement(sql);
                                pstm.setString(1, nombre);
                                pstm.setString(2, ubicacion);
                                int filas=pstm.executeUpdate();
                                if (filas>0) {
                                    JOptionPane.showMessageDialog(null, "Aeropuerto Creado Correctamente", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                                }
                            } catch (SQLException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                            

                            
                        } else {
                            if (nombre.length() == 0 || ubicacion.length() == 0) {
                                JOptionPane.showMessageDialog(null, "No puede dejar datos vacios", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        
                    }

                };

                boton1_añadir.addActionListener(oyente1);


                ActionListener oyente2 = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae){
                        String numeroVuelo = texto2_numeroVuelo.getText();

                        if (numeroVuelo.length() != 0) {
                            if (!existeNumeroVuelo(aeropuertos, Integer.parseInt(numeroVuelo))) {
                                String aerolinea = texto2_nombreAerolinea.getText();
                                String horaSalida = texto2_horaSalida.getText();
                                String destino = texto2_destino.getText();
                                String capacidadMaxima = texto2_capacidad.getText();
                                String nombreAeropuertoPartida = texto2_aeroPartida.getText();
                                Aeropuerto aeropuertoPartida = buscarAeropuertoPorNombre(aeropuertos, nombreAeropuertoPartida);
                                boolean existente1 = true;
                                boolean existente2 = true;
                                if (aeropuertoPartida == null) {
                                    JOptionPane.showMessageDialog(null, "El aeropuerto de partida no existe", "Error", JOptionPane.ERROR_MESSAGE);
                                    existente1 = false;
                                }
                                String nombreAeropuertoLlegada = texto2_aeroLlegada.getText();

                                Aeropuerto aeropuertoLlegada = buscarAeropuertoPorNombre(aeropuertos, nombreAeropuertoLlegada);
                                if (aeropuertoLlegada == null) {
                                    JOptionPane.showMessageDialog(null, "El aeropuerto de llegada no existe", "Error", JOptionPane.ERROR_MESSAGE);
                                    existente2 = false;
                                }
                                
                                if (existente1 && existente2) {
                                    Vuelo vuelo = new Vuelo(Integer.parseInt(numeroVuelo), aerolinea, horaSalida, destino, Integer.parseInt(capacidadMaxima), aeropuertoPartida, aeropuertoLlegada);
                                    aeropuertos.get(aeropuertos.indexOf(aeropuertoPartida)).registrarVuelo(vuelo);
                                    vuelos.add(vuelo);

                                    String sql = "INSERT INTO vuelos (numeroVuelo, aerolinea, horaSalida, destino, capacidadMaxima, aeropuertoPartida, aeropuertoLlegada) VALUES(?,?,?,?,?,?,?)";
                                    PreparedStatement pstm;
                                    try {
                                        pstm = conn.prepareStatement(sql);
                                        pstm.setInt(1, Integer.parseInt(numeroVuelo));
                                        pstm.setString(2, aerolinea);
                                        pstm.setString(3, horaSalida);
                                        pstm.setString(4, destino);
                                        pstm.setInt(5, Integer.parseInt(capacidadMaxima));
                                        pstm.setString(6, aeropuertoPartida.getNombre());
                                        pstm.setString(7, aeropuertoLlegada.getNombre());
                                        int filas=pstm.executeUpdate();

                                    if (filas>0) {
                                        JOptionPane.showMessageDialog(null, "Vuelo Creado Correctamente", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    } catch (SQLException e) {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                    }
                                    
                                }
                                
                            } else {
                                JOptionPane.showMessageDialog(null, "Ya existe numero de vuelo", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No puede dejar datos vacios", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        
                        
                    }
    
                };

                boton2_añadir.addActionListener(oyente2);

                
                ActionListener oyente3 = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae){
                        String numeroVuelo = texto3_numeroVuelo.getText();
                        if (numeroVuelo.length() != 0) {
                            Vuelo vuelo = buscarVueloPorNumero(aeropuertos, Integer.parseInt(numeroVuelo));
                            if (vuelo == null) {
                                JOptionPane.showMessageDialog(null, "Vuelo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                            } else {
                                if (vuelo.getNumeroVuelo() == Integer.parseInt(numeroVuelo)) {
                                    String nombre = texto3_nombrePasajero.getText();
                                    String numeroPasaporte = texto3_pasaporte.getText();
                                    String cantidadEquipaje = texto3_equipaje.getText();
                                    int numeroAsiento = 1;
                                        if (vuelo.getNumeroVuelo() == Integer.parseInt(numeroVuelo)) {
                                            if (numeroAsiento <= (vuelo.getCapacidadMaxima() - vuelo.getPasajeros().size())) {
                                                double precio = 0;
                                                for (int i = 1; i <= numeroAsiento; i++) {
                                                    if (i == 1) {
                                                        boolean existe = false;
                                                        Pasajero pasajero = new Pasajero(null, null, 0);
                                                        if (!existe) {
                                                            pasajero = new Pasajero(nombre, numeroPasaporte, Integer.parseInt(cantidadEquipaje));
                                                        }
                                                        ArrayList<Pasajero> pasaj = new ArrayList<>();
                                                        precio = pasajero.calcularPrecioReserva();
                                                        pasaj.add(pasajero);
                                                        Ventana confirmar = new Ventana();
                                                        confirmar.setSize(340,200);
                                                        confirmar.setTitle("Confirmar Compra");
                                                        confirmar.setLocationRelativeTo(null);
                                                        JPanel confPanel = new JPanel(null);
                                                        confirmar.getContentPane().add(confPanel);
                                                        JLabel confLabel = new JLabel("El precio a pagar es: $" + precio);
                                                        confPanel.add(confLabel);
                                                        confLabel.setBounds(85, 15, 200, 60);
                                                        JLabel confLabel2 = new JLabel("¿Desea confirmar la compra?");
                                                        confPanel.add(confLabel2);
                                                        confLabel2.setBounds(75, 50, 300, 60);
                                                        JButton confButton = new JButton("Confirmar");
                                                        confPanel.add(confButton);
                                                        confButton.setBounds(110, 100, 100, 30);
                                                        confButton.addActionListener(new ActionListener() {
                                                            @Override
                                                            public void actionPerformed(ActionEvent ae){
                                                                vuelo.reservarAsiento(pasaj.get(0));
                                                                confirmar.dispose();
                                                                JOptionPane.showMessageDialog(null, "Reserva Exitosa!", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                                                                pasaj.clear();
                                                            }
                                            
                                                        });
                                                        
                                                        
                                                    }
                                                }
                                                
                                            } else {
                                                JOptionPane.showMessageDialog(null, "El vuelo esta lleno", "Error", JOptionPane.ERROR_MESSAGE);
                                            }
        
        
                                        }
                                    
                                } else {
                                    JOptionPane.showMessageDialog(null, "El vuelo ingresado no existe", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No puede dejar datos vacios", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        
                        
                        
                    }
    
                };

                boton3_añadir.addActionListener(oyente3);

                ActionListener oyente4 = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae){
                        String numeroVuelo = texto4_numeroVuelo.getText();
                        if (numeroVuelo.length() == 0) {
                            JOptionPane.showMessageDialog(null, "Vuelo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            Vuelo vuelo = buscarVueloPorNumero(aeropuertos, Integer.parseInt(numeroVuelo));
                        if (vuelo != null) {
                            String mensaje = "Hay " + vuelo.getPasajeros().size() + " pasajeros en este vuelo\n\n";
                            DefaultTableModel modelo = new DefaultTableModel() {
                                @Override
                                public boolean isCellEditable(int row, int column) {
                                    return false;
                                }
                            };
                            modelo.addColumn("Nombre");
                            modelo.addColumn("Pasaporte");
                            modelo.addColumn("Equipaje");
                            for (Pasajero pasajero : vuelo.getPasajeros()) {
                                mensaje = mensaje + "Nombre: " + pasajero.getNombre() + "\nPasaporte: " + pasajero.getNumeroPasaporte() + "\nEquipaje: " + pasajero.getCantidadEquipaje() + "\n\n";
                                modelo.addRow(new Object[]{pasajero.getNombre(), pasajero.getNumeroPasaporte(), pasajero.getCantidadEquipaje()});
                            }

                            JTable tabla = new JTable(modelo);

                            JScrollPane scrollPane = new JScrollPane(tabla);

                            JFrame ventana = new JFrame("Tabla de Pasajeros en Vuelo");

                            ventana.setSize(400, 300);
                            ventana.setLocationRelativeTo(null);

                            ventana.getContentPane().add(scrollPane);

                            ventana.setVisible(true);

                        } else {
                            JOptionPane.showMessageDialog(null, "Vuelo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        }
                        
                        
                    }
    
                };
                boton4_verVuelo.addActionListener(oyente4);
                
                ActionListener oyente5 = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae){
                        String sql = "SELECT * FROM vuelos";
                        Statement stm;
                        String mensaje = "";
                        DefaultTableModel modelo = new DefaultTableModel() {
                            @Override
                            public boolean isCellEditable(int row, int column) {
                                return false;
                            }
                        };
                        modelo.addColumn("Numero Vuelo");
                        modelo.addColumn("Aerolinea");
                        modelo.addColumn("Salida");
                        modelo.addColumn("Destino");
                        modelo.addColumn("Capacidad");
                        modelo.addColumn("AeroPartida");
                        modelo.addColumn("AeroLlegada");
                        try {
                            stm = conn.createStatement();
                            ResultSet rs = stm.executeQuery(sql);
                            
                            while (rs.next()) {
                                int numeroVueloo=rs.getInt("numeroVuelo");
                                String aerolinea = rs.getString("aerolinea");
                                String horaSalida = rs.getString("horaSalida");
                                String destino = rs.getString("destino");
                                int capacidadMaxima = rs.getInt("capacidadMaxima");
                                String aeropuertoPartida = rs.getString("aeropuertoPartida");
                                String aeropuertoLlegada = rs.getString("aeropuertoLlegada");
                                
                                mensaje = mensaje + "Numero Vuelo: " + numeroVueloo + "\nAerolinea: " + aerolinea + "\nSalida: " + horaSalida + "\nDestino: " + destino + "\nCapacidad: " + capacidadMaxima + "\nAeropuerto Partida y Llegada: " + aeropuertoPartida + " - " + aeropuertoLlegada + "\n\n";
                                modelo.addRow(new Object[]{numeroVueloo, aerolinea, horaSalida, destino, capacidadMaxima, aeropuertoPartida, aeropuertoLlegada});
                            }
                            JTable tabla = new JTable(modelo);

                            JScrollPane scrollPane = new JScrollPane(tabla);

                            JFrame ventana = new JFrame("Tabla de Vuelos");

                            ventana.setSize(600, 400);
                            ventana.setLocationRelativeTo(null);

                            ventana.getContentPane().add(scrollPane);

                            ventana.setVisible(true);

                        } catch (SQLException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        
                    }
    
                };
                boton5_verVuelos.addActionListener(oyente5);


                      ActionListener oyente6 = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae){
                            String sql = "SELECT * FROM pasajeros";
                            Statement stm;
                            try {
                                stm = conn.createStatement();
                                ResultSet rs = stm.executeQuery(sql);
                                String mensaje = "";
                                DefaultTableModel modelo = new DefaultTableModel() {
                                    @Override
                                    public boolean isCellEditable(int row, int column) {
                                        return false;
                                    }
                                };
                                modelo.addColumn("Nombre");
                                modelo.addColumn("Pasaporte");
                                modelo.addColumn("Vuelo");
                                modelo.addColumn("Equipaje");
                                while (rs.next()) {
                                    String nombre=rs.getString("nombre");
                                    String numeroPasaporte = rs.getString("numeroPasaporte");
                                    int cantidadEquipaje = rs.getInt("cantidadEquipaje");
                                    int vueloReservado = rs.getInt("vueloReservado");
                    
                                    mensaje = mensaje + "Nombre: " + nombre + "\nPasaporte: " + numeroPasaporte + "\nVuelo: " + vueloReservado + "\nEquipaje: " + cantidadEquipaje + "\n\n";
                                    
                                    modelo.addRow(new Object[]{nombre, numeroPasaporte, vueloReservado, cantidadEquipaje});

                                }

                                JTable tabla = new JTable(modelo);

                                JScrollPane scrollPane = new JScrollPane(tabla);

                                JFrame ventana = new JFrame("Tabla de Pasajeros");

                                ventana.setSize(400, 300);
                                ventana.setLocationRelativeTo(null);

                                ventana.getContentPane().add(scrollPane);

                                ventana.setVisible(true);

                            } catch (SQLException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                            
                            
                        }
        
                    };
                    boton6_verPasajeros.addActionListener(oyente6);


                    ActionListener oyente7 = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae){
                            String nombreEliminar = texto7_nombre.getText();
                            boolean existente = false;
                            boolean encontrado = false;
                            int index = 0;
                            for (Aeropuerto aeropuerto : aeropuertos) {
                                if (nombreEliminar.equals(aeropuerto.getNombre())) {
                                    encontrado = true;
                                    for (Vuelo vuelo : vuelos) {
                                        if (nombreEliminar.equals(vuelo.getAeropuertoPartida().getNombre()) || nombreEliminar.equals(vuelo.getAeropuertoLlegada().getNombre())) {
                                            JOptionPane.showMessageDialog(null, "Aeropuerto tiene vuelos registrados", "Error", JOptionPane.ERROR_MESSAGE);
                                            existente = true;
                                            break;
                                        } else {
                                            if (vuelo.equals(vuelos.get(vuelos.size()-1))) {
                                                if (!existente) {
                                                    String sql = "DELETE FROM aeropuertos WHERE nombre = ?;";
                                                    PreparedStatement pstm;
                                                    try {
                                                        pstm = conn.prepareStatement(sql);
                                                        pstm.setString(1, nombreEliminar);
                                                        int filas=pstm.executeUpdate(); 
                                                        index = aeropuertos.indexOf(aeropuerto);
                                                        if (filas>0) {
                                                            JOptionPane.showMessageDialog(null, "Aeropuerto eliminado correctamente", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                                                        }
                                                    } catch (SQLException e) {
                                                        // TODO Auto-generated catch block
                                                        e.printStackTrace();
                                                    }
                                                }
                                                
                                            }
                                        }
                                    }
                                } else {
                                    if (aeropuerto.equals(aeropuertos.get(aeropuertos.size()-1))) {
                                        if (!encontrado) {
                                            JOptionPane.showMessageDialog(null, "Aeropuerto no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                                        }
                                    }
                                    
                                }
                            }
                            aeropuertos.remove(index);
                            
                        }
        
                    };
                    boton7_eliminar.addActionListener(oyente7);


                    ActionListener oyente8 = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae){
                            String vueloEliminar = texto8_numeroVuelo.getText();
                            if (vueloEliminar.length() != 0) {
                                if (existeNumeroVuelo(aeropuertos, Integer.parseInt(vueloEliminar))) {
                                    Vuelo vuelo = buscarVueloPorNumero(aeropuertos, Integer.parseInt(vueloEliminar));
                                    if (vuelo.getPasajeros().size() == 0) {
                                        String sql = "DELETE FROM vuelos WHERE numeroVuelo = ?;";
                                        PreparedStatement pstm;
                                        try {
                                            pstm = conn.prepareStatement(sql);
                                            pstm.setInt(1, Integer.parseInt(vueloEliminar));
                                            for (Aeropuerto aeropuerto : aeropuertos) {
                                                aeropuerto.getVuelos().removeIf(vuelo2 -> vuelo2.getNumeroVuelo() == Integer.parseInt(vueloEliminar));
                                            }
                                            int filas=pstm.executeUpdate(); 
                                            if (filas>0) {
                                                JOptionPane.showMessageDialog(null, "Vuelo eliminado correctamente", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                                            }
                                        } catch (SQLException e) {
                                            // TODO Auto-generated catch block
                                            e.printStackTrace();
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Vuelo tiene pasajeros registrados", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Vuelo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "No puede dejar datos vacios", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            
                        }
        
                    };
                    boton8_eliminar.addActionListener(oyente8);


                    ActionListener oyente9 = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae){
                            String pasaporteEliminar = texto9_pasaporte.getText();
                            String numeroVueloEliminar = texto9_numeroVuelo.getText();
                            if (pasaporteEliminar.length() != 0 && numeroVueloEliminar.length() != 0) {
                                if (existeNumeroVuelo(aeropuertos, Integer.parseInt(numeroVueloEliminar))) {
                                    Vuelo vuelo = buscarVueloPorNumero(aeropuertos, Integer.parseInt(numeroVueloEliminar));
                                    for (Pasajero pasajero : vuelo.getPasajeros()) {
                                        if (pasajero.getNumeroPasaporte().equals(pasaporteEliminar)) {
                                            String sql = "DELETE FROM pasajeros WHERE numeroPasaporte = ? AND vueloReservado = ?;";
                                            PreparedStatement pstm;
                                            try {
                                                pstm = conn.prepareStatement(sql);
                                                pstm.setString(1, pasaporteEliminar);
                                                pstm.setInt(2, Integer.parseInt(numeroVueloEliminar));
                                                int filas=pstm.executeUpdate(); 
                                                vuelo.getPasajeros().remove(pasajero);
                                                if (filas>0) {
                                                    JOptionPane.showMessageDialog(null, "Pasajero eliminado correctamente", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                                                }
                                            } catch (SQLException e) {
                                                // TODO Auto-generated catch block
                                                e.printStackTrace();
                                            }
                                            break;
                                        } else {
                                            if (pasajero.equals(vuelo.getPasajeros().get(vuelo.getPasajeros().size()-1))) {
                                                JOptionPane.showMessageDialog(null, "Pasajero no encontrado en vuelo", "Error", JOptionPane.ERROR_MESSAGE);
                                            }
                                            
                                        }
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Vuelo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "No puede dejar datos vacios", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            
                        }
        
                    };
                    boton9_eliminar.addActionListener(oyente9);


                    ActionListener oyente10 = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae){
                            String sql = "SELECT * FROM aeropuertos";
                            Statement stm;
                            try {
                                stm = conn.createStatement();
                                ResultSet rs = stm.executeQuery(sql);
                                DefaultTableModel modelo = new DefaultTableModel() {
                                    @Override
                                    public boolean isCellEditable(int row, int column) {
                                        return false;
                                    }
                                };
                                modelo.addColumn("Nombre");
                                modelo.addColumn("Ubicacion");
                                while (rs.next()) {
                                    String nombre=rs.getString("nombre");
                                    String ubicacion = rs.getString("ubicacion");
                                    
                                    modelo.addRow(new Object[]{nombre, ubicacion});

                                }

                                JTable tabla = new JTable(modelo);

                                JScrollPane scrollPane = new JScrollPane(tabla);

                                JFrame ventana = new JFrame("Tabla de Aeropuertos");

                                ventana.setSize(400, 300);
                                ventana.setLocationRelativeTo(null);

                                ventana.getContentPane().add(scrollPane);

                                ventana.setVisible(true);

                            } catch (SQLException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                            
                            
                        }
        
                    };
                    boton10_aeropuertos.addActionListener(oyente10);



        } catch (SQLException ex) {
            ex.printStackTrace();
    }
    }

    private static Vuelo buscarVueloPorNumero(ArrayList<Aeropuerto> aeropuertos, int numeroVuelo) {
        for (Aeropuerto aeropuerto : aeropuertos) {
            for (Vuelo vuelo : aeropuerto.getVuelos()) {
                if (vuelo.getNumeroVuelo() == numeroVuelo) {
                    return vuelo;
                }
            }
        }
        return null;
    }

    private static boolean existeNumeroVuelo(ArrayList<Aeropuerto> aeropuertos, int numeroVuelo) {
        for (Aeropuerto aeropuerto : aeropuertos) {
            for (Vuelo vuelo : aeropuerto.getVuelos()) {
                if (vuelo.getNumeroVuelo() == numeroVuelo) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Aeropuerto buscarAeropuertoPorNombre(ArrayList<Aeropuerto> aeropuertos, String nombre) {
        for (Aeropuerto aeropuerto : aeropuertos) {
            if (aeropuerto.getNombre().equalsIgnoreCase(nombre)) {
                return aeropuerto;
            }
        }
        return null;
    }
}
