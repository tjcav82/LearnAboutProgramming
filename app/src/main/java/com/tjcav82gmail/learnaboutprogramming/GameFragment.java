package com.tjcav82gmail.learnaboutprogramming;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tjcav_000 on 3/29/2017.
 */

public class GameFragment extends Fragment implements View.OnClickListener{
   View myView;
    public QuestionsClass questions=new QuestionsClass();
    public Question currentquestion;
    RadioButton a;
    RadioButton b;
    RadioButton c;
    RadioButton d;
    TextView qust;
    int index=0;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        myView = inflater.inflate(R.layout.fragment_game,container, false);
       getQuestion(index,qust,a,b,c,d);
        a=(RadioButton)myView.findViewById(R.id.radioButton);
        b=(RadioButton)myView.findViewById(R.id.radioButton2);
        c=(RadioButton)myView.findViewById(R.id.radioButton3);
        d=(RadioButton)myView.findViewById(R.id.radioButton4);
       
       a.setOnClickListener(this);
       b.setOnClickListener(this);
       c.setOnClickListener(this);
       d.setOnClickListener(this);
        return myView;
    }
    public Question getQuestion(int index, TextView qview, RadioButton a, RadioButton b, RadioButton c, RadioButton d){

        currentquestion=questions.k.get(index);
        qview.setText(currentquestion.Question);
        a.setText(currentquestion.a);
        b.setText(currentquestion.b);
        c.setText(currentquestion.c);
        d.setText(currentquestion.d);
  return currentquestion;
    }

    @Override
    public void onClick(View v) {
        RadioButton g=(RadioButton)v;
        if(index<questions.k.size()) {
            if (currentquestion.ans_check(g.getText().toString())) {
                index++; //go to next question
                getQuestion(index, qust, a, b, c, d);
            }
        }
    }
}
