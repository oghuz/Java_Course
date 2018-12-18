package com.java_course;



import java.util.ArrayList;
import java.util.LinkedList;

public class Class_Constructors_Inheritance {

    ArrayList<String> groceryList = new ArrayList<String>();

    private LinkedList<String> linkedListString = new LinkedList<String>();

    public Class_Constructors_Inheritance(ArrayList<String> groceryList, LinkedList<String> linkedListString) {
        this.groceryList = groceryList;
        this.linkedListString = linkedListString;
    }

    public void test() {
        linkedListString.push("Osmanjan");
        linkedListString.pop();

    }
}
