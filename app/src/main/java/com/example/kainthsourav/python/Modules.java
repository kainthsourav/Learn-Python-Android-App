package com.example.kainthsourav.python;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Toast;

public class Modules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modules);
        WebView Helloworld_webview=(WebView)findViewById(R.id.basic_mod);
        Helloworld_webview.getSettings().setJavaScriptEnabled(true);
        Helloworld_webview.loadUrl("file:///android_asset/Basic/python_modules.html");
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
