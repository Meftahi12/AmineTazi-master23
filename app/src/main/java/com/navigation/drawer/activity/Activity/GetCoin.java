package com.navigation.drawer.activity.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.navigation.drawer.activity.R;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Vector;

public class GetCoin extends BaseActivity {
    public static Vector<String> arr = null;
    public static int id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        getLayoutInflater().inflate(R.layout.activity_get_coin, frameLayout);
        mDrawerList.setItemChecked(position, true);
        setTitle(listArray[position]);
        ImageView iv = (ImageView) findViewById(R.id.coinImg);
        int resId = getResources().getIdentifier("coin" + id, "drawable", getPackageName());
        iv.setImageResource(resId);
        TextView tv = (TextView) findViewById(R.id.coinTxt);
        tv.setText(arr.get(id));
        if(id == 0){
            Button b = (Button) findViewById(R.id.prevCoin);
            b.setVisibility(View.INVISIBLE);
        }
        if(id == arr.size() - 1){
            Button b = (Button) findViewById(R.id.nextCoin);
            b.setVisibility(View.INVISIBLE);
        }
    }

    public void prevCoin(View view) {
        id --;
        startActivity(new Intent(this,GetCoin.class));
    }

    public void nextCoin(View view) {
        id ++;
        startActivity(new Intent(this,GetCoin.class));
    }

}
