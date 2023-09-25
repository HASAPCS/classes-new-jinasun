package com.example;

public class Student {
    private int score;

    public Student(int score) {
        this.score = score;
        // TODO: Initialize the score
    }

    public String grade() {
        // TODO: Calculate and return the grade based on the score. 
        // Use the following grading scale:
        // 90-100: "A"
        if (score >=90 && score <=100){
            return"A";
        }
        // 80-89: "B"
        else if (score >=80 && score<90){
            return "B";
        }
        // 70-79: "C"
        else if (score >=70 && score <80){
            return "C";
        }
        // 60-69: "D"
        else if (score >=60 && score <70){
            return "D";
        }
        // Below 60: "F"
        else{
            return "F";
        }
        // Change this default return statement
    }

    public boolean isPassing() {
        // TODO: Return true if the score is 60 or above, otherwise return false
        return score >= 60;  // Change this default return statement
    }
}
