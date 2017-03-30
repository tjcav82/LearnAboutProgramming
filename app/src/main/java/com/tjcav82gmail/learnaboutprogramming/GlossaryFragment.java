package com.tjcav82gmail.learnaboutprogramming;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by tjcav_000 on 3/29/2017.
 */

public class GlossaryFragment extends Fragment {
    View myView;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        myView = inflater.inflate(R.layout.fragment_tutorial,container, false);
        return myView;
    }
}
