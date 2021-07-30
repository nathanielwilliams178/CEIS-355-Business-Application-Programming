/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n8wil
 */

import java.sql.*;
import java.util.ArrayList;

public class LandscapingDB {
    private final String CONNECTION_STR = "jdbc:mysql://localhost:3306/cis355a";
    private final String USER = "root";
    private final String PASSWORD = "Katenw1998";
    
    //write to the database
    
    //save a student object to the database
    public void add(LandscapingClass cus) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //connect to the database
        Connection conn = DriverManager.getConnection(CONNECTION_STR, USER, PASSWORD);
        
        //write to the database
        
        String sqlStr = "INSERT INTO landscape(CustomerID, CustomerName, LandscapeType, YardWidth, YardLength, LandscapeCost) VALUES(?, ?, ?, ?, ?, ?)";
        
        PreparedStatement pstmt = conn.prepareStatement(sqlStr);
        pstmt.setInt(1, cus.getIdNum());
        pstmt.setString(2, cus.getClientName());
        pstmt.setString(3, cus.getLandscapeType());
        pstmt.setDouble(4, cus.getyardWidth());
        pstmt.setDouble(5, cus.getyardLength());
        pstmt.setDouble(6, cus.getYardCost());
        
        pstmt.execute();
        conn.close();
    }
    
    public ArrayList <LandscapingClass> getAll() throws ClassNotFoundException, SQLException{
    //create an empty arraylist
    
    ArrayList <LandscapingClass> list = new ArrayList <LandscapingClass>();
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection(CONNECTION_STR, USER, PASSWORD);
    
    String strSQL = "SELECT * FROM landscape";
    Statement stmt = conn.createStatement();
    
    ResultSet rs = stmt.executeQuery(strSQL);
    
    while ( rs.next() )
        {
            int idNum = rs.getInt(1);
            String clientName = rs.getString(2);
            String landscapeType = rs.getString(3);
            double yardWidth = rs.getDouble(4);
            double yardLength = rs.getDouble(5);
            double yardCost = rs.getDouble(6);

            LandscapingClass cus = new LandscapingClass( idNum,  clientName,  landscapeType,  yardWidth,  yardLength, yardCost);
              list.add(cus);
        }

// close the database
conn.close();

// return the filled ArrayList

return list;
}
}
