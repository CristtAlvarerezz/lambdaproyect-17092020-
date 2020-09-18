package com.example.lambda;

//import static Soft_Bn.Login.dat;
import static com.example.lambda.MainActivity5.we;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.Thread.sleep;

public class Sync_sensors extends Thread {

    String route = "192.168.0.22/Sync_events";
    boolean flag;
    String sql;
    protected static String[] Sensor_state = new String[17];
    protected static int[] conteo = new int[4];
    double peso=0;
    int bl=0;

    public Sync_sensors(){


    }

    @Override
    public void run() {

        while(true){

            sql="SELECT*FROM Sensores WHERE Sensor = 'SENSOR'";

            try{
                Statement st=cn.createStatement();
                ResultSet rs=st.executeQuery(sql);
                while(rs.next()){

                    for(int i=0; i<16;i++){

                        Sensor_state[i]=String.valueOf(rs.getInt(2+i));
                        if(we==1){
                            MainActivity5.cub.setText(""+Sensor_state[12]);
                            MainActivity5.cil.setText(""+Sensor_state[13]);
                            MainActivity5.hex.setText(""+Sensor_state[14]);
                            MainActivity5.nf.setText(""+Sensor_state[15]);
                            we=2;
                        }
                    }

                    if(we==2){
                        peso=(Integer.parseInt(Sensor_state[11])/10);
                        peso=71.953*peso*peso*peso*peso*peso*peso-641.44*peso*peso*peso*peso*peso+2178.5*peso*peso*peso*peso-3470.6*peso*peso*peso+2525.3*peso*peso-280.36*peso+8.1252;
                        peso=peso-11;
                        MainActivity5.peso.setText(""+peso);
                        if (!MainActivity5.cub.getText().equals(Sensor_state[12])){
                            MainActivity5.cub.setText(""+Sensor_state[12]);
                        }else if (!MainActivity5.cil.getText().equals(Sensor_state[13])){
                            MainActivity5.cil.setText(""+Sensor_state[13]);
                        }
                        else if (!MainActivity5.hex.getText().equals(Sensor_state[14])){
                            MainActivity5.hex.setText(""+Sensor_state[14]);
                        }
                        else if (!MainActivity5.nf.getText().equals(Sensor_state[15])){
                            MainActivity5.nf.setText(""+Sensor_state[15]);
                        }
                    }

                }
            }catch(SQLException e){
                System.err.println(e);
            }
            try{
                sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sync_sensors.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    connection cc= new connection();
    Connection cn =cc.database_connection("192.168.0.22/Sync_events");
}