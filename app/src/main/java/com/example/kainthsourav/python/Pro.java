package com.example.kainthsourav.python;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
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

public class Pro extends AppCompatActivity {

    Intent pro_i;
    ListView pro_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro);
         String [] pro_s=getResources().getStringArray(R.array.prog);
        pro_list=(ListView)findViewById(R.id.pro_l);
        ArrayAdapter<String> ad3=new ArrayAdapter<String>(this,R.layout.listviewer,R.id.label,pro_s);
        pro_list.setAdapter(ad3);
        pro_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    pro_i=new Intent(Pro.this,Helloworld.class);
                    startActivity(pro_i);
                }
                if(position==1)
                {
                    pro_i=new Intent(Pro.this,Count10.class);
                    startActivity(pro_i);
                }
                if(position==2)
                {
                    pro_i=new Intent(Pro.this,Desi.class);
                    startActivity(pro_i);
                }
                if(position==3)
                {
                    pro_i=new Intent(Pro.this,debugg.class);
                    startActivity(pro_i);
                }
                if(position==4)
                {
                    pro_i=new Intent(Pro.this,fun.class);
                    startActivity(pro_i);
                }
                if(position==5)
                {
                    pro_i=new Intent(Pro.this,listss.class);
                    startActivity(pro_i);
                }
                if(position==6)
                {
                    pro_i=new Intent(Pro.this,loopss.class);
                    startActivity(pro_i);
                }
                if(position==7)
                {
                    pro_i=new Intent(Pro.this,experess.class);
                    startActivity(pro_i);
                }
                if(position==8)
                {
                    pro_i=new Intent(Pro.this,dicto.class);
                    startActivity(pro_i);
                }
                if(position==9)
                {
                    pro_i=new Intent(Pro.this,mod.class);
                    startActivity(pro_i);
                }
                if(position==10)
                {
                    pro_i=new Intent(Pro.this,molis.class);
                    startActivity(pro_i);
                }
                if(position==11)
                {
                    pro_i=new Intent(Pro.this,rstr.class);
                    startActivity(pro_i);
                }
                if(position==12)
                {
                    pro_i=new Intent(Pro.this,fio.class);
                    startActivity(pro_i);
                }
                if(position==13)
                {
                    pro_i=new Intent(Pro.this,glo.class);
                    startActivity(pro_i);
                }
                if(position==14)
                {
                    pro_i=new Intent(Pro.this,faq.class);
                    startActivity(pro_i);
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
