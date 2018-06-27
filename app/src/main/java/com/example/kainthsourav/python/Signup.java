package com.example.kainthsourav.python;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileOutputStream;

public class Signup extends AppCompatActivity {
    EditText e1,e2,e3;
    Button bx;
    String e1e, e2e, e3e;
 String file = "myFile.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        e1 = (EditText) findViewById(R.id.full);
        e2 = (EditText) findViewById(R.id.Usern);
        e3 = (EditText) findViewById(R.id.no);
        bx = (Button) findViewById(R.id.Join);
        bx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(e1.getText().toString()!=null && e2.getText().toString()!=null && e3.getText().toString()!=null)
                {
                    e1e = e1.getText().toString();
                    e2e = e2.getText().toString();
                    e3e = e3.getText().toString();

                    try {
                        FileOutputStream fout = openFileOutput(file, MODE_PRIVATE);
                        fout.write(e1e.getBytes());
                        fout.write(e2e.getBytes());
                        fout.write(e3e.getBytes());
                        fout.close();
                        Toast.makeText(getBaseContext(), "Succesfully Done", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Signup.this, Login.class);
                        startActivity(i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if(e1.getText().toString().isEmpty() && e2.getText().toString().isEmpty()&& e3.getText().toString().isEmpty())
                {
                    Toast.makeText(getBaseContext(), "Fill All The Fileds", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
