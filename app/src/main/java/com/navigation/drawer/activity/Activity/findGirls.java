package com.navigation.drawer.activity.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.navigation.drawer.activity.R;

import java.util.Vector;

public class findGirls extends BaseActivity {
    public static Vector<String> arr = null;
    public static int id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        getLayoutInflater().inflate(R.layout.activity_find_girls, frameLayout);
        mDrawerList.setItemChecked(position, true);
        setTitle(listArray[position]);
        ImageView iv = (ImageView) findViewById(R.id.girlImg);
        int resId = getResources().getIdentifier("girl" + id , "drawable", getPackageName());
        iv.setImageResource(resId);
        TextView tv = (TextView) findViewById(R.id.girltxt);
        tv.setText(arr.get(id));
        if(id == 0){
            Button b = (Button) findViewById(R.id.prevGirl);
            b.setVisibility(View.INVISIBLE);
        }
        if(id == arr.size() - 1){
            Button b = (Button) findViewById(R.id.nextGirl);
            b.setVisibility(View.INVISIBLE);
        }
    }

    public void prevGirl(View view) {
        id --;
        startActivity(new Intent(this,findGirls.class));
    }

    public void nextGirl(View view) {
        id ++;
        startActivity(new Intent(this,findGirls.class));
    }
}
