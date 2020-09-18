package com.example.lambda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sync_events {
    String sql;
    //   protected static String[] vector = new String[16];

     public void act (String vector[]){
        for(int i=0;i<=3;i++){
            try {
                sql = "UPDATE Actuadores SET AB1='"+vector[1]+"',AB2='"+vector[2]+"',AZP='"+vector[3]+"',AZL='"+vector[4]+"',AYP='"+vector[5]+"',AYL='"+vector[6]+"',AXP='"+vector[7]+"',AXL='"+vector[8]+"',AW='"+vector[9]+"',AWO='"+vector[10]+"',S60='"+vector[11]+"',S120='"+vector[12]+"',S180='"+vector[13]+"',EX='"+vector[14]+ "',M='"+vector[15]+"' WHERE Actuator = 'ACT' "  ;
                PreparedStatement pst = cn.prepareStatement(sql);
                int res = pst.executeUpdate();

            } catch (SQLException e) {
                System.out.print(e.getMessage());
            }
        }
    }
    public void go (String es){
        for(int i=0;i<=3;i++){
            try {
                sql = "UPDATE Actuadores SET GO='"+es+"' WHERE Actuator = 'ACT' "  ;
                PreparedStatement pst = cn.prepareStatement(sql);
                int res = pst.executeUpdate();

            } catch (SQLException e) {
                System.out.print(e.getMessage());
            }

        }
    }
    connection cc= new connection();
    Connection cn =cc.database_connection("192.168.0.22/Sync_events");
}
