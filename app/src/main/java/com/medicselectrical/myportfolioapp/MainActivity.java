package com.medicselectrical.myportfolioapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    // Button Event Functions

    public void onBtnClicked(View v){
        if(v.getId() == R.id.popularmoviesbutton){
            Context context = getApplicationContext();
            CharSequence text = "This button will launch my Popular Movies app!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else if(v.getId() == R.id.scoresappbutton){
            Context context = getApplicationContext();
            CharSequence text = "This button will launch my Scores app!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else if(v.getId() == R.id.libraryapp){
            Context context = getApplicationContext();
            CharSequence text = "This button will launch my Library app!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else if(v.getId() == R.id.builditbigger){
            Context context = getApplicationContext();
            CharSequence text = "This button will launch my Build It Bigger app!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else if(v.getId() == R.id.xyzreader){
            Context context = getApplicationContext();
            CharSequence text = "This button will launch my XYZ Reader app!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else if(v.getId() == R.id.capstonebutton){
            Context context = getApplicationContext();
            CharSequence text = "This button will launch my Capstone app!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
}
