/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion_carros;

/**
 *
 * @author CRISTHIAN
 */
import java.sql.*;

public class accesobased {

    private final String host;
    private final String user;
    private final String passwd;
    private final String bd;

    private Connection conexion;

    
  
public accesobased(String host, String user, String passwd, String bd) {
        this.host = host;
        this.user = user;
        this.passwd = passwd;
        this.bd = bd;

    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPasswd() {
        return host;
    }

    public String getBd() {
        return bd;
    }

    public void conectarBD() throws Exception {
        try {
            Driver  driver = (Driver)
                    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                  String cadena = "jdbc:mysql://" + getHost() + "/" + getBd();
            conexion = DriverManager.getConnection(cadena, getUser(), getPasswd());
            System.out.println("conecion exito ala base de datos");
        } catch (SQLException e) {
            System.out.println("Error de conexion ala base de datos...ROLLBACK"+ e.toString());
        }
    }

    public void actualizaBD(String sql) throws SQLException{
      try{
         Statement stm=conexion.createStatement();
          stm.executeUpdate(sql);
            System.out.println("transaccion exitosa...COMMIT");
      } catch (SQLException e){
        System.out.println("Error en transaccion....Rollbalck");
      }
    }
    public ResultSet   consultaBD(String sql) throws SQLException {
        ResultSet cursor;
        Statement stm=conexion.createStatement();
        cursor=stm.executeQuery(sql);
        return cursor;
    }

    public void cerrarBd() throws SQLException{
         conexion.close();
}

    void conectaBD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void actualizaBd(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}