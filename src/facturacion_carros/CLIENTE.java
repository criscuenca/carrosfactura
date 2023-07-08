/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion_carros;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author CRISTHIAN
 */
public class CLIENTE {
     private int Id_cliente;
     private String nombre;
     private String apellido;
     private String  direccion;
   accesobased bd;
   
    public CLIENTE()throws Exception{
         accesobased bd = new accesobased("localhost","root","Cris1234","facturacionbase");
    bd.conectaBD();
              
  }
public void setId_cliente(int Id_cliente){
 this.Id_cliente=Id_cliente;
}
public void setnombre(String nombre){
 this.nombre = nombre;
}

public void setapellido(String apellido){
 this.apellido = apellido;
}

public void setdireccion(String direccion){
 this.direccion= direccion;
}

public int getId_cliente(){
 return Id_cliente;
}

 public String getnombre(){
 return  nombre;
}

public String getapellido(){
 return apellido;
}

public String getdireccion(){
 return direccion;
}

public int incremento_Cliente()throws SQLException{
 int inc=0;
 ResultSet rs;
 rs=bd.consultaBD("SELECT max(id_cliente) as num FROM cliente:");
 if (rs.next()){
  inc=rs.getInt(1)+1;
   }else{   
     
 inc=1;
  }
return inc;
 }


public void Insertar_Cliente()throws SQLException{

String cadena="insert into cliente values('"+incremento_Cliente()+"','"+getnombre()+"','"+getapellido()+"','"+getdireccion()+"')";
        
bd.actualizaBd(cadena);
}
public void Actualizar_Cliente(){
}
public void Eliminar_Cliente(){
}
public void Consultar_Cliente()throws SQLException{
ResultSet rs;
   rs=bd.consultaBD("select * from Cliente");
     while(rs.next()){
    System.out.print(rs.getInt(1)+"");
    System.out.print(rs.getString(2)+"");
    System.out.print(rs.getString(3)+"");
    System.out.print(rs.getString(4)+"");
    System.out.print(rs.getString(5)+"");
    System.out.print(rs.getString(6)+"");
    System.out.println("");



}

 
   



       
