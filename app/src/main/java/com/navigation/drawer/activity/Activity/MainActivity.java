package com.navigation.drawer.activity.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.StringDef;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.navigation.drawer.activity.R;

import java.util.Vector;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        GetCoin.arr = new Vector<String>() ;
        GetCoin.arr.add("TEXT1");
        GetCoin.arr.add("TEXT2");
        GetCoin.arr.add("TEXT3");
        GetCoin.arr.add("TEXT4");
        GetCoin.id = 0;
        findGirls.arr = new Vector<String>() ;
        findGirls.arr.add("TEXT1");
        findGirls.arr.add("TEXT2");
        findGirls.arr.add("TEXT3");
        findGirls.arr.add("TEXT4");
        findGirls.id = 0;
        startActivity(new Intent(MainActivity.this,Acceuil.class));

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
