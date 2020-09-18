package com.example.lambda;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity11 extends AppCompatActivity {

    protected static String[] vector = new String[16];
    ImageButton buttonyp, buttonyl, buttonp1, buttonp2, buttonarriba, buttonabajo, buttonizquierdo, buttonderecho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        buttonyp=(ImageButton)findViewById(R.id.buttonyp);
        buttonyp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task9().execute();
                m1();
            }
        });
        buttonyl=(ImageButton)findViewById(R.id.buttonyl);
        buttonyl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task10().execute();
                m2();
            }
        });
        buttonp1=(ImageButton)findViewById(R.id.buttonp1);
        buttonp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task11().execute();
                m3();
            }
        });
        buttonp2=(ImageButton) findViewById(R.id.buttonp2);
        buttonp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task12().execute();
                m4();
            }
        });
        buttonarriba=(ImageButton)findViewById(R.id.butttonarriba);
        buttonarriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task13().execute();
                m5();
            }
        });
        buttonabajo=(ImageButton)findViewById(R.id.buttonabajo);
        buttonabajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task14().execute();
                m6();
            }
        });
        buttonizquierdo=(ImageButton)findViewById(R.id.buttonizquierdo);
        buttonizquierdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task15().execute();
                m7();
            }
        });
        buttonderecho=(ImageButton)findViewById(R.id.buttonderecho);
        buttonderecho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task16().execute();
                m8();
            }
        });
    }

    class Task9 extends AsyncTask<Void, Void, Void> {
        String record = "", error = "";
        @Override
        protected Void doInBackground(Void... voids) {
            Sync_events obj23= new Sync_events();
            vector[1]="0";vector[2]="0";vector[3]="0"; vector[4]="0";;vector[5]="1";vector[6]="0";vector[7]="0";vector[8]="0";vector[9]="0";vector[10]="0";vector[11]="0";vector[12]="0";vector[13]="0";vector[14]="0";vector[15]="0";
            obj23.act(vector);
            return null;
        }
        protected void onPostExecute(Void aVoid) {
            System.out.println("hola");
            super.onPostExecute(aVoid);
        }
    }

    class Task10 extends AsyncTask<Void, Void, Void> {
        String record = "", error = "";
        @Override
        protected Void doInBackground(Void... voids) {
            Sync_events obj23= new Sync_events();
            vector[1]="0";vector[2]="0";vector[3]="0"; vector[4]="0";;vector[5]="0";vector[6]="1";vector[7]="0";vector[8]="0";vector[9]="0";vector[10]="0";vector[11]="0";vector[12]="0";vector[13]="0";vector[14]="0";vector[15]="0";
            obj23.act(vector);
            return null;
        }
        protected void onPostExecute(Void aVoid) {
            System.out.println("hola");
            super.onPostExecute(aVoid);
        }
    }

    class Task11 extends AsyncTask<Void, Void, Void> {
        String record = "", error = "";
        @Override
        protected Void doInBackground(Void... voids) {
            Sync_events obj23= new Sync_events();
            vector[1]="0";vector[2]="0";vector[3]="0"; vector[4]="0";;vector[5]="0";vector[6]="0";vector[7]="0";vector[8]="0";vector[9]="0";vector[10]="1";vector[11]="0";vector[12]="0";vector[13]="0";vector[14]="0";vector[15]="0";
            obj23.act(vector);
            return null;
        }
        protected void onPostExecute(Void aVoid) {
            System.out.println("hola");
            super.onPostExecute(aVoid);
        }
    }

    class Task12 extends AsyncTask<Void, Void, Void> {
        String record = "", error = "";
        @Override
        protected Void doInBackground(Void... voids) {
            Sync_events obj23= new Sync_events();
            vector[1]="0";vector[2]="0";vector[3]="0"; vector[4]="0";;vector[5]="0";vector[6]="0";vector[7]="0";vector[8]="0";vector[9]="1";vector[10]="0";vector[11]="0";vector[12]="0";vector[13]="0";vector[14]="0";vector[15]="0";
            obj23.act(vector);
            return null;
        }
        protected void onPostExecute(Void aVoid) {
            System.out.println("hola");
            super.onPostExecute(aVoid);
        }
    }

    class Task13 extends AsyncTask<Void, Void, Void> {
        String record = "", error = "";
        @Override
        protected Void doInBackground(Void... voids) {
            Sync_events obj23= new Sync_events();
            vector[3]="1"; vector[1]="0";vector[2]="0";vector[4]="0";vector[5]="0";vector[6]="0";vector[7]="0";vector[8]="0";vector[9]="0";vector[10]="0";vector[11]="0";vector[12]="0";vector[13]="0";vector[14]="0";vector[15]="0";
            obj23.act(vector);
            return null;
        }
        protected void onPostExecute(Void aVoid) {
            System.out.println("hola");
            super.onPostExecute(aVoid);
        }
    }

    class Task14 extends AsyncTask<Void, Void, Void> {
        String record = "", error = "";
        @Override
        protected Void doInBackground(Void... voids) {
            Sync_events obj23= new Sync_events();
            vector[4]="1"; vector[1]="0";vector[2]="0";vector[3]="0";;vector[5]="0";vector[6]="0";vector[7]="0";vector[8]="0";vector[9]="0";vector[10]="0";vector[11]="0";vector[12]="0";vector[13]="0";vector[14]="0";vector[15]="0";
            obj23.act(vector);
            return null;
        }
        protected void onPostExecute(Void aVoid) {
            System.out.println("hola");
            super.onPostExecute(aVoid);
        }
    }

    class Task15 extends AsyncTask<Void, Void, Void> {
        String record = "", error = "";
        @Override
        protected Void doInBackground(Void... voids) {
            Sync_events obj23= new Sync_events();
            vector[1]="0";vector[2]="0";vector[3]="0"; vector[4]="0";;vector[5]="0";vector[6]="0";vector[7]="0";vector[8]="1";vector[9]="0";vector[10]="0";vector[11]="0";vector[12]="0";vector[13]="0";vector[14]="0";vector[15]="0";
            obj23.act(vector);
            return null;
        }
        protected void onPostExecute(Void aVoid) {
            System.out.println("hola");
            super.onPostExecute(aVoid);
        }
    }

    class Task16 extends AsyncTask<Void, Void, Void> {
        String record = "", error = "";
        @Override
        protected Void doInBackground(Void... voids) {
            Sync_events obj23= new Sync_events();
            vector[1]="0";vector[2]="0";vector[3]="0"; vector[4]="0";;vector[5]="0";vector[6]="0";vector[7]="1";vector[8]="0";vector[9]="0";vector[10]="0";vector[11]="0";vector[12]="0";vector[13]="0";vector[14]="0";vector[15]="0";
            obj23.act(vector);
            return null;
        }
        protected void onPostExecute(Void aVoid) {
            System.out.println("hola");
            super.onPostExecute(aVoid);
        }
    }

    private void m1(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity11.this);
        Toast.makeText(getApplicationContext(),"Brazo sale", Toast.LENGTH_SHORT).show();
    }
    private void m2(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity11.this);
        Toast.makeText(getApplicationContext(),"Brazo entra", Toast.LENGTH_SHORT).show();
    }
    private void m3(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity11.this);
        Toast.makeText(getApplicationContext(),"Pinza abierta", Toast.LENGTH_SHORT).show();
    }
    private void m4(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity11.this);
        Toast.makeText(getApplicationContext(),"Pinza cerrada", Toast.LENGTH_SHORT).show();
    }
    private void m5(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity11.this);
        Toast.makeText(getApplicationContext(),"Brazo arriba", Toast.LENGTH_SHORT).show();
    }
    private void m6(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity11.this);
        Toast.makeText(getApplicationContext(),"Brazo abajo", Toast.LENGTH_SHORT).show();
    }
    private void m7(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity11.this);
        Toast.makeText(getApplicationContext(),"Brazo a la izquierda", Toast.LENGTH_SHORT).show();
    }
    private void m8(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity11.this);
        Toast.makeText(getApplicationContext(),"Brazo a la derecha", Toast.LENGTH_SHORT).show();
    }
}