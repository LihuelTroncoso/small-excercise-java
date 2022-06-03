
package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class GestorBD {
    Connection conn = null;
    Statement stm = null;
    ResultSet rs;
    Alumno alEncontrado;
    
    public boolean insert(String n, String a, double p){
        int resultUpdate = 0;
        try{
            conn = ConectarBD.abrir();
            stm = conn.createStatement();
            String sql = "INSERT INTO Alumno(nombre, apellido, promedio) VALUES('"+
                    n+"', '"+a+"' , '"+p+"')";
            resultUpdate = stm.executeUpdate(sql);
            if(resultUpdate != 0){
                ConectarBD.cerrar();
                return true;
            }else{
                ConectarBD.cerrar();
                return false;
            }
        }catch(Exception e){
            System.out.println("Error en la base de datos");
            e.printStackTrace();
            return false;
        }
    }
    
//    public Alumno select(int legajo){
//        try{
//            conn = conectarBD.abrir();
//            stm = conn.createStatement();
//            String sql
//        }
//    }
}
