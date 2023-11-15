/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author INSA
 */
public class Create_Connection {
    public static Connection getCon()
    {
    try
    {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hotel_management","root","2112");
    return con;
    }
    catch(Exception e)
    {
    return null;
    }
    }
}
