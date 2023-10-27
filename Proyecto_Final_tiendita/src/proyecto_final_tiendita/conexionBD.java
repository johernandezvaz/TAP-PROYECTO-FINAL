/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto_final_tiendita;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*--> Sergio Eduardo Lastiri Torres - 22550031 <--*/

public class conexionBD
{
    private static final String bdUrl = "C:/Users/sergi/Documents/NetBeansProjects/Proyecto_Final_tiendita/src/BD/Proyecto_Final_BaseDeDatos_Tiendita.accdb"; 
    private static final String nomProd = "";
    private static final String precio = "";
    //private static final String f_preparacion = "";
    //private static final String f_caducidad = "";

    public static Connection getConnection() {
        Connection connection = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(bdUrl, nomProd, precio);
            System.out.println("Conexión exitosa a la base de datos.");
        } 
        catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
        return connection;
    }
}

