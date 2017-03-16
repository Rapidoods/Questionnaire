package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //Animals:
        Questionnaire q1 = new Questionnaire(1, "Barking animal?", "dog");
        Questionnaire q2 = new Questionnaire(2, "Meowing animal?", "cat");
        Questionnaire q3 = new Questionnaire(3, "Birds that swims?", "penguins");
        Questionnaire q4 = new Questionnaire(4, "Fastest land animal?", "cheetah");
        Questionnaire q5 = new Questionnaire(5, "Birds that swims?", "penguins");

        //Avengers:
        Questionnaire q6 = new Questionnaire(6, "Peter Parker?", "Spider-Man");
        Questionnaire q7 = new Questionnaire(7, "Tony stark?", "Iron-Man");
        Questionnaire q8 = new Questionnaire(8, "Steve Rogers?", "Captain America");
        Questionnaire q9 = new Questionnaire(9, "Dr. Banner?", "Hulk");
        Questionnaire q10 = new Questionnaire(10, "Natasha Romanoff?", "Black Widow");

        int score = 0;
        String userAns;
        int randomID;

        Scanner reader = new Scanner(System.in);
        Random random = new Random();

        while (score != 5) {

            System.out.println("5 Correct answers to finish the game.\n");

            //Question Generator

            randomID = random.nextInt(10) + 1;

            System.out.println("Question No." + randomID + ":");

            if (q1.mQuestionID == randomID) {
                System.out.println(q1.mQuestion);
            } else if (q2.mQuestionID == randomID) {
                System.out.println(q2.mQuestion);
            } else if (q3.mQuestionID == randomID) {
                System.out.println(q3.mQuestion);
            } else if (q4.mQuestionID == randomID) {
                System.out.println(q4.mQuestion);
            } else if (q5.mQuestionID == randomID) {
                System.out.println(q5.mQuestion);
            } else if (q6.mQuestionID == randomID) {
                System.out.println(q6.mQuestion);
            } else if (q7.mQuestionID == randomID) {
                System.out.println(q7.mQuestion);
            } else if (q8.mQuestionID == randomID) {
                System.out.println(q8.mQuestion);
            } else if (q9.mQuestionID == randomID) {
                System.out.println(q9.mQuestion);
            } else if (q10.mQuestionID == randomID) {
                System.out.println(q10.mQuestion);
            }

            userAns = reader.nextLine();
            System.out.println("Answer: " + userAns);

            //Answer Checker

            if (q1.mQuestionID == randomID && userAns.equals(q1.mAnswer)) {
                System.out.println("Correct!\n");
                score++;
                System.out.println("Current Score: " + score);
            } else if (q2.mQuestionID == randomID && userAns.equals(q2.mAnswer)) {
                System.out.println("Correct!\n");
                score++;
                System.out.println("Current Score: " + score);
            } else if (q3.mQuestionID == randomID && userAns.equals(q3.mAnswer)) {
                System.out.println("Correct!\n");
                score++;
                System.out.println("Current Score: " + score);
            } else if (q4.mQuestionID == randomID && userAns.equals(q4.mAnswer)) {
                System.out.println("Correct!\n");
                score++;
                System.out.println("Current Score: " + score);
            } else if (q5.mQuestionID == randomID && userAns.equals(q5.mAnswer)) {
                System.out.println("Correct!\n");
                score++;
                System.out.println("Current Score: " + score);
            } else if (q6.mQuestionID == randomID && userAns.equals(q6.mAnswer)) {
                System.out.println("Correct!\n");
                score++;
                System.out.println("Current Score: " + score);
            } else if (q7.mQuestionID == randomID && userAns.equals(q7.mAnswer)) {
                System.out.println("Correct!\n");
                score++;
                System.out.println("Current Score: " + score);
            } else if (q8.mQuestionID == randomID && userAns.equals(q8.mAnswer)) {
                System.out.println("Correct!\n");
                score++;
                System.out.println("Current Score: " + score);
            } else if (q9.mQuestionID == randomID && userAns.equals(q9.mAnswer)) {
                System.out.println("Correct!\n");
                score++;
                System.out.println("Current Score: " + score);
            } else if (q10.mQuestionID == randomID && userAns.equals(q10.mAnswer)) {
                System.out.println("Correct!\n");
                score++;
                System.out.println("Current Score: " + score);
            } else {
                System.out.println("Wrong! Try Again! You need " + (5 - score) + " more correct answer to finish the game!\n");
            }

        }

        System.out.println("Good Job!");
    }

}