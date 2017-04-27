package com.example.cash.sdp;

import java.util.ArrayList;

/**
 * Created by Cash on 4/10/2017.
 */

public class QuestionsClass {
    ArrayList<Question>k=new ArrayList<>();


    public QuestionsClass(){
        k.add(new Question("Which of these are data types?","New","For","Double","While","Double"));
        k.add(new Question("Which of the following is not a pillar of object oriented programming?","Encapsulation","Polymorphism","Inheritance","Dynamic","Dynamic"));
        k.add(new Question("What is inheritance?","One class acquires the properties and functionalities of another class","Having more than one method with the same name butter different types of arguments.","Localization of the information or knowledge within an object.","A class that can’t create an object of abstract class.","One class acquires the properties and functionalities of another class"));
        k.add(new Question("Which of the following modifiers can be applied to the inner classes?","Private","Public","Final","All of the above","All of the above"));
        k.add(new Question("Java is a ___________ language.","Procedural oriented","System oriented","Platform oriented","Object oriented","Object oriented"));
        k.add(new Question("Java is developed by ___________.","Microsoft","Oracle","Sun","Google","Oracle"));
        k.add(new Question("What does GUI stand for?","Grand User Interface","Graphical User Interface","Graphical Useful Interface","Gimme Ur Internet","Graphical User Interface"));
        k.add(new Question("What would the following display? Int [] nums = {1,2,3,4,5}; System.out.println(nums[1]+nums[2]);","3","4","5","2","5"));
        k.add(new Question("Given the declaration : int [ ] ar = {1,2,3,4,5}; What is the value of ar[3]?","2","3","4","5","4"));
        k.add(new Question("Given the declaration int [ ] nums = {8, 12, 23, 4, 15}, what expression will display the first element in the array (ie the number 8)","System.out.print(The number is : + nums[0]);.","System.out.print(\"The number is : \" + nums[1]);","System.out.print(\"The number is : \" + nums[8]);","System.out.print(\"The number is : \" + nums);","System.out.print(The number is : + nums[0]);."));
        k.add(new Question("If we declare int [ ] ar = {1,2,3,4,5,6}; The size of array ar is:","6","5","7","0","6"));
        k.add(new Question("Choose the appropriate data type for this value: volatile   ","Int","String","Double","Boolean","String"));
        k.add(new Question("What is the keyword used in java to create an object?","This","New","Sync","New","New"));
    }

}
