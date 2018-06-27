package com.example.kainthsourav.python;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

public class Videos extends AppCompatActivity {

    ListView vl;
    VideoView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // String[] v=getResources().getStringArray(R.array.videos);
//        setContentView(R.layout.activity_videos);
//        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,R.layout.listviewer,R.id.label,s);
//        vl=(ListView)findViewById(R.id.vs);
//        vl.setAdapter(ad);
        v=(VideoView)findViewById(R.id.videoView);
        MediaController media=new MediaController(this);
        media.setAnchorView(v);
         String path="android"+ R.raw.s;
        Uri uri= Uri.parse(path);
        v.setMediaController(media);
        v.setVideoURI(uri);
        v.requestFocus();
        v.start();

    }
}
