package com.example.simon.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {


    CharSequence toastspotify = "This button will launch my Spotify app!";
    CharSequence toastscores = "This button will launch my Scores app!";
    CharSequence toastlibrary = "This button will launch my Library app!";
    CharSequence toastbigger = "This button will launch my Bigger app!";
    CharSequence toastreader = "This button will launch my Reader app!";
    CharSequence toastownapp = "This button will launch my Own app!";
    int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button= (Button) findViewById(R.id.spotify);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), toastspotify, duration).show();
            }
        });

        Button scoresbutton= (Button) findViewById(R.id.scores);
        scoresbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext() , toastscores, duration).show();
            }
        });

        Button librarybutton= (Button) findViewById(R.id.library);
        librarybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext() , toastlibrary, duration).show();
            }
        });

        Button biggerbutton= (Button) findViewById(R.id.bigger);
        biggerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext() , toastbigger, duration).show();
            }
        });

        Button readerbutton= (Button) findViewById(R.id.reader);
        readerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext() , toastreader, duration).show();
            }
        });

        Button ownappbutton= (Button) findViewById(R.id.ownapp);
        ownappbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext() , toastownapp, duration).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
