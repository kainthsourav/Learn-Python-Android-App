package com.example.kainthsourav.python;

import android.app.ActionBar;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=4000;
    Button b1,b2,b3,b4,b6,b7;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b6=(Button)findViewById(R.id.button6);
       // b7=(Button)findViewById(R.id.vid);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               i=new Intent(MainActivity.this,Basic.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=new Intent(MainActivity.this,Adv.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=new Intent(MainActivity.this,Pro.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=new Intent(MainActivity.this,Inter.class);
                startActivity(i);
            }
        });
    b6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            i=new Intent(MainActivity.this,Aboutus.class);
            startActivity(i);

        }
    });
//        b7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v)
//            {
//
//                i=new Intent(MainActivity.this,Videos.class);
//                startActivity(i);
//            }
//        });

    }



//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        AlertDialog.Builder alert=new AlertDialog.Builder(this);
//        alert.setTitle("Confirmation");
//        alert.setMessage("Do you want to close?");
//        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                finish();
//            }
//        });
//        alert.setNegativeButton("No,I want to stay", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                dialog.dismiss();
//            }
//        });
//        alert.show();
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.opti,menu);
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
                i=new Intent(MainActivity.this,Aboutus.class);
                startActivity(i);
                return true;

            case R.id.ext:

                AlertDialog.Builder alert=new AlertDialog.Builder(this);

                    alert.setTitle("Confirmation");
                  alert.setMessage("Do you want to close?");
               alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                finish();
            }
        });
        alert.setNegativeButton("No,I want to stay", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alert.show();

            default:
                return true;
        }
    }
}
