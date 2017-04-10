package com.example.cash.sdp;

/**
 * Created by Cash on 4/10/2017.
 */

public class Question {
    String Question;
    String a;
    String b;
    String c;
    String d;
    String ans;

    public Question(){

    }
    public Question( String Question, String a, String b, String c, String d, String ans){

        this.Question=Question;
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.ans=ans;


    }
    //checks if question is wrong or right
    boolean ans_check(String j){
        if(j.equals(ans))
        return true;
        else return false;
    }





}
