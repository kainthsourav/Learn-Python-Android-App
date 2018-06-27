package com.example.kainthsourav.python;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Basic extends AppCompatActivity {

    ListView l;
    Intent basic_i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        String[] s=getResources().getStringArray(R.array.b);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,R.layout.listviewer,R.id.label,s);
        l=(ListView)findViewById(R.id.ls);
        l.setAdapter(ad);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    basic_i=new Intent(Basic.this,Intro.class);
                    startActivity(basic_i);
                }
                if(position==1)
                {
                    basic_i=new Intent(Basic.this,Overview.class);
                    startActivity(basic_i);
                }
                if(position==2)
                {
                    basic_i=new Intent(Basic.this,BasicSyntax.class);
                    startActivity(basic_i);
                }
                if(position==3)
                {
                    basic_i=new Intent(Basic.this,VariableTypes.class);
                    startActivity(basic_i);
                }
                if(position==4)
                {
                    basic_i=new Intent(Basic.this,BasicOperations.class);
                    startActivity(basic_i);
                }
                if(position==5)
                {
                    basic_i=new Intent(Basic.this,DesicionMaking.class);
                    startActivity(basic_i);
                }
                if(position==6)
                {
                    basic_i=new Intent(Basic.this,IFStatement.class);
                    startActivity(basic_i);
                }
                if(position==7)
                {
                    basic_i=new Intent(Basic.this,ElseStatement.class);
                    startActivity(basic_i);
                }
                if(position==8)
                {
                    basic_i=new Intent(Basic.this,NestedIF.class);
                    startActivity(basic_i);
                }
                if(position==9)
                {
                    basic_i=new Intent(Basic.this,Loops.class);
                    startActivity(basic_i);
                }
                if(position==10)
                {
                    basic_i=new Intent(Basic.this,Break.class);
                    startActivity(basic_i);
                }
                if(position==11)
                {
                    basic_i=new Intent(Basic.this,Pass.class);
                    startActivity(basic_i);
                }
                if(position==12)
                {
                    basic_i=new Intent(Basic.this,Numbers.class);
                    startActivity(basic_i);
                }
                if(position==13)
                {
                    basic_i=new Intent(Basic.this,Strings.class);
                    startActivity(basic_i);
                }
                if(position==14)
                {
                    basic_i=new Intent(Basic.this,Lists.class);
                    startActivity(basic_i);
                }
                if(position==15)
                {
                    basic_i=new Intent(Basic.this,Tuples.class);
                    startActivity(basic_i);
                }
                if(position==16)
                {
                    basic_i=new Intent(Basic.this,Dict.class);
                    startActivity(basic_i);
                }
                if(position==17)
                {
                    basic_i=new Intent(Basic.this,datetime.class);
                    startActivity(basic_i);
                }
                if(position==18)
                {
                    basic_i=new Intent(Basic.this,Functions.class);
                    startActivity(basic_i);
                }
                if(position==19)
                {
                    basic_i=new Intent(Basic.this,Modules.class);
                    startActivity(basic_i);
                }
                if(position==20)
                {
                    basic_i=new Intent(Basic.this,Filesio.class);
                    startActivity(basic_i);
                }
                if(position==21)
                {
                    basic_i=new Intent(Basic.this,handling.class);
                    startActivity(basic_i);
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
