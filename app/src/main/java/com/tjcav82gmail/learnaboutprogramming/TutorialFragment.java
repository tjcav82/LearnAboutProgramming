package com.tjcav82gmail.learnaboutprogramming;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;



/**
 * Created by tjcav_000 on 3/29/2017.
 */

public class TutorialFragment extends Fragment{
   View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        myView = inflater.inflate(R.layout.fragment_tutorial,container, false);

        WebView view = (WebView)myView.findViewById(R.id.webview);
        view.loadUrl("https://www.tutorialspoint.com/computer_programming_tutorials.htm");
        /*final Button button = (Button) myView.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TutorialFragment.this, )
            }
        });

       */ return myView;
    }

}
