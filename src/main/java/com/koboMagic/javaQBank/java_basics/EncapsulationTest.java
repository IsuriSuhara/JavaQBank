package main.java.com.koboMagic.javaQBank.java_basics;

import java.util.ArrayList;
import java.util.Collections;

public class EncapsulationTest {
    private ArrayList<Integer> scores;//private key word added as the answer
    private double average;

    public EncapsulationTest(ArrayList<Integer> scores) {
        this.setScores(scores);
        this.computeAverage();
    }

    public ArrayList<Integer> getScores() {
        return new ArrayList(this.scores); //the answer
//        return scores;
    }

    public void setScores(ArrayList<Integer> scores) {
        this.scores = scores;
    }

    public double getAverage() {
        return average;
    }

    private void computeAverage() {
        //valid code to compute average
        Integer totScore = getScores().stream().reduce(0, Integer::sum);
        average = (double) totScore / getScores().size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Collections.addAll(arr, 1, 2);
        EncapsulationTest cal = new EncapsulationTest(arr);
        System.out.println(cal.getAverage());

    }
}

//choices
//Make the class private.
//Make the scores instance field private.//correct
//Make getScores() protected.
//Make computeAverage() public
//Change getScores to return a copy of the scores list: public ArrayList<Integer> getScores(){ return new ArrayList(scores); }//correct

//An important aspect of encapsulation is that other classes should not be able to modify the state fields of a class
// directly. Therefore, the data members should be private (or protected if you want to allow subclasses to inherit
// the field) and if the class wants to allow access to these fields, it should provide appropriate setters and getters
// with public access.

// If you return the same scores list, the caller would be able to add or remove elements from it, thereby rendering
// the average incorrect. This can be prevented by returning a copy of the list.
