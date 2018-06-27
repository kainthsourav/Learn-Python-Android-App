package com.example.kainthsourav.python;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Adv extends AppCompatActivity {

    Intent i;
    ListView le;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv);
        String [] se=getResources().getStringArray(R.array.advance);
        le=(ListView)findViewById(R.id.ls2);
        ArrayAdapter<String> ad1=new ArrayAdapter<String>(this,R.layout.listviewer,R.id.label,se);
        le.setAdapter(ad1);
        le.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    i=new Intent(Adv.this,Object_Oriented.class);
                    startActivity(i);
                }
                if(position==1)
                {
                    i=new Intent(Adv.this,Regular_Expressions.class);
                    startActivity(i);
                }
                if(position==2)
                {
                    i=new Intent(Adv.this,CGI_Programming.class);
                    startActivity(i);
                }
                if(position==3)
                {
                    i=new Intent(Adv.this,MySQLDatabaseAccess.class);
                    startActivity(i);
                }
                if(position==4)
                {
                    i=new Intent(Adv.this,NetworkProgramming.class);
                    startActivity(i);
                }
                if(position==5)
                {
                    i=new Intent(Adv.this,SMTP.class);
                    startActivity(i);
                }
                if(position==6)
                {
                    i=new Intent(Adv.this,Multithreading.class);
                    startActivity(i);
                }
                if(position==7)
                {
                    i=new Intent(Adv.this,XMLProcessing.class);
                    startActivity(i);
                }
                if(position==8)
                {
                    i=new Intent(Adv.this,GUIProgramiming.class);
                    startActivity(i);
                }

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
