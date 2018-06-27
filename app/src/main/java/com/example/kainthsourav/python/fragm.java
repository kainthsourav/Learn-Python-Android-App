package com.example.kainthsourav.python;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kainthsourav on 01-Dec-17.
 */

public class fragm extends Fragment
{
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        view=inflater.inflate(R.layout.frag,container,false);
        return view;
    }

}
