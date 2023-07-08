/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion_carros;

import java.sql.*;


/**
 *
 * @author CRISTHIAN
 */
import java.sql.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

public class Facturacion_carros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        FACTURA_CARRO fC=new FACTURA_CARRO();
        fC.setVisible(true);
        ResultSet rs;
    accesobased bd=new accesobased("localhost","root","mysql","facturacion:carros");
    bd.conectarBD();
    bd.actualizaBD("insert into CLIENTE values(`Cristhian`,`Cuenca`,`12345`)");
    rs=bd.consultaBD("select * from Cliente");
   while (rs.next()){
    System.out.println(rs.getInt(1));
     System.out.println(rs.getString(2) +"");
     System.out.println(rs.getString(3) +"");
     System.out.println(rs.getString(4) +"");
     System.out.println(rs.getString(5) +"");
     System.out.println(rs.getString(6) +"");
   System.out.println("");
    
   Scanner  sc=new Scanner(System.in);
      int ID;
      String _cedula,_nombre = null,_apellido = null,_direccion = null;
      CLIENTE cli=new CLIENTE();
        cli.setnombre(_nombre);
      System.out.println("ingrese los nombres");
      _nombre=sc.next();
      cli.setapellido(_apellido);
      System.out.println("ingrese los apellidos");
      _apellido=sc.next();
   cli.setdireccion(_direccion);
      System.out.println("ingrese la direccion");
     _direccion = sc.next();
   }
        
    
}


     
    