package bank.management;

import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;
    public Connn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Mitul@123");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}