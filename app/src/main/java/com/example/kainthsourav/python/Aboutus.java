package com.example.kainthsourav.python;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Aboutus extends AppCompatActivity {
    Button b;
    TextInputEditText x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        b=(Button)findViewById(R.id.cont);
        x=(TextInputEditText)findViewById(R.id.textInputEditText2);
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                android.app.FragmentManager fragmentManager=getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fmx,new fragm()).commit();
                x.setVisibility(View.INVISIBLE);
            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.options,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.Home:
                startActivity(new Intent(this,MainActivity.class));
                return true;
            case R.id.Be:
                startActivity(new Intent(this,Basic.class));
                return true;
            case R.id.Ad:
                startActivity(new Intent(this,Adv.class));
                return true;
            case R.id.Pro:
                startActivity(new Intent(this,Pro.class));
                return true;
            case R.id.Interr:
                startActivity(new Intent(this,Inter.class));
                return true;
            case R.id.about:
                startActivity(new Intent(this,Aboutus.class));
                return true;
            case R.id.exit:
                finish();
                return true;

            default:
                return true;
        }
    }
}
