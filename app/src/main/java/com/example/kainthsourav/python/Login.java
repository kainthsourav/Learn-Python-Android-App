package com.example.kainthsourav.python;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Login extends AppCompatActivity {
    Button l,u;
    EditText li,us;
    String file = "myfile.txt";
    String lo,use;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        l=(Button)findViewById(R.id.Login);
        u=(Button)findViewById(R.id.signup);
        li=(EditText)findViewById(R.id.user);
        us=(EditText)findViewById(R.id.pass);

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String uss=li.getText().toString();
                String pa=us.getText().toString();

                try {
                    FileInputStream fin=openFileInput(file);
                    int c;
                    String temp="";
                    while ((c=fin.read())!=-1)
                    {

                        temp=temp+Character.toString((char)c);
                        if(temp.equals(uss))
                        {
                            Intent i=new Intent(Login.this,MainActivity.class);
                            startActivity(i);
                        }
                        else
                        {
                            Toast.makeText(Login.this,"Wrong ",Toast.LENGTH_SHORT).show();
                        }

                    }

                    Toast.makeText(getBaseContext(),"File Read",Toast.LENGTH_SHORT).show();

                        fin.close();


                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(Login.this,Signup.class);
                startActivity(i);
//                android.app.FragmentManager fm=getFragmentManager();
//                fm.beginTransaction().add(R.id.FL,new Frag()).commit();


            }
        });


    }
}
