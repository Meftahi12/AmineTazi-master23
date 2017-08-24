package com.navigation.drawer.activity.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.navigation.drawer.activity.R;

public class Acceuil extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        getLayoutInflater().inflate(R.layout.activity_acceuil, frameLayout);

        mDrawerList.setItemChecked(position, true);
        setTitle(listArray[position]);
    }

    public void share(View view) {
    }

    public void getCoins(View view) {
        GetCoin.id = 0;
        openActivity(2);
    }

    public void findGirl(View view) {
        findGirls.id = 0;
        openActivity(1);
    }
}
