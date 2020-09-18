package com.example.lambda;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity10 extends AppCompatActivity {

    protected static String[] vector = new String[16];
    ImageButton buttonleft, buttonup, buttonright, buttonex, buttonget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        buttonleft=(ImageButton) findViewById(R.id.buttonleft);
        buttonleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task4().execute();
                m1();
            }
        });
        buttonup=(ImageButton) findViewById(R.id.buttonup);
        buttonup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task5().execute();
                m2();
            }
        });
        buttonright=(ImageButton) findViewById(R.id.buttonright);
        buttonright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task6().execute();
                m3();
            }
        });
        buttonex=(ImageButton) findViewById(R.id.buttonex);
        buttonex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task7().execute();
                m4();
            }
        });
        buttonget=(ImageButton) findViewById(R.id.buttonget);
        buttonget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task8().execute();
                m5();
            }
        });
    }

    class Task4 extends AsyncTask<Void, Void, Void> {
        String record = "", error = "";
        @Override
        protected Void doInBackground(Void... voids) {
            Sync_events obj23= new Sync_events();
            vector[1]="0";vector[2]="0";vector[3]="0"; vector[4]="0";;vector[5]="0";vector[6]="0";vector[7]="0";vector[8]="0";vector[9]="0";vector[10]="0";vector[11]="1";vector[12]="0";vector[13]="0";vector[14]="0";vector[15]="0";
            obj23.act(vector);
            return null;
        }
        protected void onPostExecute(Void aVoid) {
            System.out.println("hola");
            super.onPostExecute(aVoid);
        }
    }

    class Task5 extends AsyncTask<Void, Void, Void> {
        String record = "", error = "";
        @Override
        protected Void doInBackground(Void... voids) {
            Sync_events obj23= new Sync_events();
            vector[1]="0";vector[2]="0";vector[3]="0"; vector[4]="0";;vector[5]="0";vector[6]="0";vector[7]="0";vector[8]="0";vector[9]="0";vector[10]="0";vector[11]="0";vector[12]="1";vector[13]="0";vector[14]="0";vector[15]="0";
            obj23.act(vector);
            return null;
        }
        protected void onPostExecute(Void aVoid) {
            System.out.println("hola");
            super.onPostExecute(aVoid);
        }
    }

    class Task6 extends AsyncTask<Void, Void, Void> {
        String record = "", error = "";
        @Override
        protected Void doInBackground(Void... voids) {
            Sync_events obj23= new Sync_events();
            vector[1]="0";vector[2]="0";vector[3]="0"; vector[4]="0";;vector[5]="0";vector[6]="0";vector[7]="0";vector[8]="0";vector[9]="0";vector[10]="0";vector[11]="0";vector[12]="0";vector[13]="1";vector[14]="0";vector[15]="0";
            obj23.act(vector);
            return null;
        }
        protected void onPostExecute(Void aVoid) {
            System.out.println("hola");
            super.onPostExecute(aVoid);
        }
    }

    class Task7 extends AsyncTask<Void, Void, Void> {
        String record = "", error = "";
        @Override
        protected Void doInBackground(Void... voids) {
            Sync_events obj23= new Sync_events();
            vector[1]="0";vector[2]="0";vector[3]="0"; vector[4]="0";;vector[5]="0";vector[6]="0";vector[7]="0";vector[8]="0";vector[9]="0";vector[10]="0";vector[11]="0";vector[12]="0";vector[13]="0";vector[14]="1";vector[15]="0";
            obj23.act(vector);
            return null;
        }
        protected void onPostExecute(Void aVoid) {
            System.out.println("hola");
            super.onPostExecute(aVoid);
        }
    }

    class Task8 extends AsyncTask<Void, Void, Void> {
        String record = "", error = "";
        @Override
        protected Void doInBackground(Void... voids) {
            Sync_events obj23= new Sync_events();
            vector[1]="0";vector[2]="0";vector[3]="0"; vector[4]="0";;vector[5]="0";vector[6]="0";vector[7]="0";vector[8]="0";vector[9]="0";vector[10]="0";vector[11]="0";vector[12]="0";vector[13]="0";vector[14]="0";vector[15]="1";
            obj23.act(vector);
            return null;
        }
        protected void onPostExecute(Void aVoid) {
            System.out.println("hola");
            super.onPostExecute(aVoid);
        }
    }

    private void m1(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity10.this);
        Toast.makeText(getApplicationContext(),"Cilindro", Toast.LENGTH_SHORT).show();
    }
    private void m2(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity10.this);
        Toast.makeText(getApplicationContext(),"Cubo", Toast.LENGTH_SHORT).show();
    }
    private void m3(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity10.this);
        Toast.makeText(getApplicationContext(),"Hexagono", Toast.LENGTH_SHORT).show();
    }
    private void m4(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity10.this);
        Toast.makeText(getApplicationContext(),"Expulsar", Toast.LENGTH_SHORT).show();
    }
    private void m5(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity10.this);
        Toast.makeText(getApplicationContext(),"Ejectar", Toast.LENGTH_SHORT).show();
    }
}