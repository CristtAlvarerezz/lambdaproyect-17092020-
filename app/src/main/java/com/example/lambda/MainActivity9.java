package com.example.lambda;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainActivity9 extends AppCompatActivity {

    protected static String[] vector = new String[16];
    ImageButton buttonp, buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        buttonp=(ImageButton) findViewById(R.id.buttonp);
        buttonp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task2().execute();
                men1();
            }
        });
        buttons=(ImageButton) findViewById(R.id.buttons);
        buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task3().execute();
                men2();
            }
        });
    }

    class Task2 extends AsyncTask<Void, Void, Void> {
        String record = "", error = "";
        @Override
        protected Void doInBackground(Void... voids) {
            Sync_events obj23= new Sync_events();
            vector[1]="1";vector[2]="0";vector[3]="0"; vector[4]="0";;vector[5]="0";vector[6]="0";vector[7]="0";vector[8]="0";vector[9]="0";vector[10]="0";vector[11]="0";vector[12]="0";vector[13]="0";vector[14]="0";vector[15]="0";
            obj23.act(vector);
            return null;
        }
        protected void onPostExecute(Void aVoid) {
           System.out.println("hola");
            super.onPostExecute(aVoid);
        }
    }

    class Task3 extends AsyncTask<Void, Void, Void> {
        String record = "", error = "";
        @Override
        protected Void doInBackground(Void... voids) {
            Sync_events obj23= new Sync_events();
            vector[1]="0";vector[2]="1";vector[3]="0"; vector[4]="0";;vector[5]="0";vector[6]="0";vector[7]="0";vector[8]="0";vector[9]="0";vector[10]="0";vector[11]="0";vector[12]="0";vector[13]="0";vector[14]="0";vector[15]="0";
            obj23.act(vector);
            return null;
        }
        protected void onPostExecute(Void aVoid) {
            System.out.println("hola");
            super.onPostExecute(aVoid);
        }
    }

    private void men1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity9.this);
        Toast.makeText(getApplicationContext(), "Banda encendida", Toast.LENGTH_SHORT).show();
    }
    private void men2(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity9.this);
        Toast.makeText(getApplicationContext(),"Banda apagada", Toast.LENGTH_SHORT).show();
    }

}


