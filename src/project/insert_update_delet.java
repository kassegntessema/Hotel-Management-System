/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author INSA
 */
public class insert_update_delet {
    public static void setData(String query,String msg){
         Connection con=null;
        Statement st=null;
     try
        {
          con=Create_Connection.getCon();
        st=con.createStatement();
        st.executeUpdate(query);
        if(!msg.equals(""))
         JOptionPane.showMessageDialog(null, msg);
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
