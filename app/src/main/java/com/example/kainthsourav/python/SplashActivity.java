package com.example.kainthsourav.python;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by kainthsourav on 12-Nov-17.
 */

public class SplashActivity extends AppCompatActivity {
private static int sp=1000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
new Handler().postDelayed(new Runnable()
{
    @Override
    public void run()
    {
        Intent intent = new Intent(SplashActivity.this,MainActivity.class);
        //Intent intent = new Intent(this,Login.class);
        startActivity(intent);
        finish();
    }
},sp);
    }
}
