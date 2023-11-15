/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author INSA
 */
public class tables {
    
    public static void main(String[] args){
        Connection con=null;
        Statement st=null;
        try
        {
        con=Create_Connection.getCon();
        st=con.createStatement();
        st.executeUpdate("create table user(name varchar(100),email varchar(100),password varchar(20),sequrity_question varchar(600),answer varchar(200),address varchar(200),status varchar(200))");
       st.executeUpdate("create table room(roomno varchar(100),roomtype varchar(100),bed varchar(20),price int(10),status varchar(200))");
         // st.executeUpdate("create table customer(id int(10),name varchar(100),phone int(20),nationality varchar(600),gender varchar(200),email varchar(200),idproof varchar(200),address varchar(100),checkin varchar(100),roomno int(20),bed varchar(600),roomtype varchar(200),priceperday int(200),numberofdaysstay int(200),totalamount varchar(100),checkout varchar(100))");
         st.executeUpdate("create table customers(id int(10),name varchar(100),phone int(20),nationality varchar(600),gender varchar(200),email varchar(200),idproof varchar(200),address varchar(100),checkin varchar(100),roomno int(20),bed varchar(600),roomtype varchar(200),price int(200),numberofdaysstay int(200),totalamount varchar(100),checkout varchar(100))");
         JOptionPane.showMessageDialog(null, "table created successfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
        finally
        {
            try
            {
            con.close();
            st.close();
            }
        catch(Exception e)
        {}
        }
    }
    
}
