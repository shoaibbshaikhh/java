/*
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Patient Details</title>
</head>
<body>
    <h1>Patient Details</h1>
    <table border="1">
        <tr>
            <th>Patient Number</th>
            <th>Patient Name</th>
            <th>Patient Address</th>
            <th>Patient Age</th>
            <th>Patient Disease</th>
        </tr>
        <%@ page import="java.sql.*" %>
        <% 
            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            try 
            {
              String url = "jdbc:postgresql://192.168.1.254:5432/ty35";
              String username = "ty35";
              String password = "ty35";

              conn = DriverManager.getConnection(url, username, password);
              String sql = "SELECT * FROM patient";
              stmt = conn.prepareStatement(sql);
              rs = stmt.executeQuery();

              while (rs.next()) {
        %>
              <tr>
              <td><%= rs.getString("pno") %></td>
              <td><%= rs.getString("pname") %></td>
              <td><%= rs.getString("paddr") %></td>
              <td><%= rs.getString("age") %></td>
              <td><%= rs.getString("disease") %></td>
              </tr>
        <% 
                }
            } 
            catch (Exception e)
            {
                e.printStackTrace();
            } 
            finally 
            {
              try 
              {
                  if (rs != null) rs.close();
                  if (stmt != null) stmt.close();
                  if (conn != null) conn.close();
                } 
                catch (SQLException e) 
                {
                    e.printStackTrace();
                }
            }
        %>
    </table>
</body>
</html>
*/

/*
import java.sql.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Slip11
{
    public static void main(String[] args)throws SQLException 
    {
        Connection con;
        Statement stmt;
        ResultSet rs;

        try 
        {
            // Registering the MySQL JDBC Driver
            Class.forName("com.postgresql.Driver");

            con = DriverManager.getConnection("jdbc:postgresql://192.168.1.254/ty32","ty32","t32");
            if (con==null)
            {
                System.out.println("Connection failed..");
            }
            else
            {
                stmt=con.createStatement();
                rs=stmt.executeQuery("Select * from Donor");

                ResultSetMetaData rsmd=rs.getMetaData();
                int no=rsmd.getColumnCount();

                for (int i=0;i<no;++i){
                    System.out.println("Column no : "+i);
                    System.out.println("Column name : "+rsmd.getColumnName(i));
                    System.out.println("Column type : "+rsmd.getColumnType(i));
                    System.out.println("Column Display size : "+rsmd.getColumnDisplaySize(i));
               }
                con.close();
            }
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
            e.printStackTrace();
        }
    }   
}
*/