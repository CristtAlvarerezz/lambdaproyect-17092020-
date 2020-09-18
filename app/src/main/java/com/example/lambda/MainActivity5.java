package com.example.lambda;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.CollationElementIterator;

public class MainActivity5 extends AppCompatActivity {


    public static int we=0;
    public static ActionBar.Tab cub;
    public static ActionBar.Tab cil;
    public static ActionBar.Tab hex;
    public static ActionBar.Tab nf;
    public static CollationElementIterator peso;
    ImageButton playbutton, stopbutton;
    //String hex, cub, nf, cil, peso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        playbutton=(ImageButton)findViewById(R.id.playbutton);
        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task21().execute();
                men1();
            }
        });
        stopbutton=(ImageButton)findViewById(R.id.stopbutton);
        stopbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task20().execute();
                men2();
            }
        });
    }

    class Task20 extends AsyncTask<Void, Void, Void> {
        String record = "", error = "";
        @Override
        protected Void doInBackground(Void... voids) {
            Sync_events obj23 = new  Sync_events();
            obj23.go("0");


            return null;
        }
        protected void onPostExecute(Void aVoid) {
            System.out.println("hola");
            super.onPostExecute(aVoid);
        }
    }

    class Task21 extends AsyncTask<Void, Void, Void> {
        String record = "", error = "";
        @Override
        protected Void doInBackground(Void... voids) {
            Sync_events obj23 = new  Sync_events();
            obj23.go("1");

            return null;
        }
        protected void onPostExecute(Void aVoid) {
            System.out.println("hola");
            super.onPostExecute(aVoid);
        }
    }

    private void men1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity5.this);
        Toast.makeText(getApplicationContext(), "Prototipo encendido", Toast.LENGTH_SHORT).show();
    }
    private void men2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity5.this);
        Toast.makeText(getApplicationContext(), "Prototipo apagado", Toast.LENGTH_SHORT).show();
    }
}