import java.util.ArrayList;
import java.sql.*;


public class Vuelo implements IReservable {
    private int numeroVuelo;
    private String aerolinea;
    private String horaSalida;
    private String destino;
    private int capacidadMaxima;
    private Aeropuerto aeropuertoPartida;
    private Aeropuerto aeropuertoLlegada;
    private ArrayList<Pasajero> pasajeros;

    public Vuelo(int numeroVuelo, String aerolinea, String horaSalida, String destino, int capacidadMaxima, Aeropuerto aeropuertoPartida, Aeropuerto aeropuertoLlegada) {
        this.numeroVuelo = numeroVuelo;
        this.aerolinea = aerolinea;
        this.horaSalida = horaSalida;
        this.destino = destino;
        this.capacidadMaxima = capacidadMaxima;
        this.aeropuertoPartida = aeropuertoPartida;
        this.aeropuertoLlegada = aeropuertoLlegada;
        this.pasajeros = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/vuelos?serverTimezone=UTC";
        String user = "root";
        String password = "S3n42023*";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.print("");
            }

            String sql = "SELECT * FROM pasajeros";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                String nombre=rs.getString("nombre");
                String numeroPasaporte = rs.getString("numeroPasaporte");
                Double cantidadEquipaje = rs.getDouble("cantidadEquipaje");
                int vueloReservado = rs.getInt("vueloReservado");

                if (vueloReservado == this.numeroVuelo) {
                    pasajeros.add(new Pasajero(nombre, numeroPasaporte, cantidadEquipaje));
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    
    public void reservarAsiento(Pasajero pasajero) {
        agregarPasajero(pasajero);
        agregarPasajeroBD(pasajero);
        pasajero.reservarVuelo(this);
    }

    public void agregarPasajeroBD(Pasajero pasajero){
        String url = "jdbc:mysql://localhost:3306/vuelos?serverTimezone=UTC";
        String user = "root";
        String password = "S3n42023*";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.print("");
            }

            String sql = "INSERT INTO pasajeros (nombre, numeroPasaporte, cantidadEquipaje, vueloReservado) VALUES(?,?,?,?)";
            PreparedStatement pstm= conn.prepareStatement(sql);
            pstm.setString(1, pasajero.getNombre());
            pstm.setString(2, pasajero.getNumeroPasaporte());
            pstm.setDouble(3, pasajero.getCantidadEquipaje());
            pstm.setInt(4, this.numeroVuelo);
            int filas=pstm.executeUpdate();

            if (filas>0) {
                System.out.println("");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void agregarPasajero(Pasajero pasajero) {
        pasajeros.add(pasajero);
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public String getDestino() {
        return destino;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public Aeropuerto getAeropuertoPartida() {
        return aeropuertoPartida;
    }

    public Aeropuerto getAeropuertoLlegada() {
        return aeropuertoLlegada;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    @Override
    public String toString() {
        return "" + numeroVuelo;
    }

    
}

