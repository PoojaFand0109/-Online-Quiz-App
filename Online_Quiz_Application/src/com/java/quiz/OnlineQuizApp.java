package com.java.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineQuizApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Question> questions = new ArrayList<>();
		questions.add(new Question("What is the capital of India?",
				new String[] { "Mumbai", "New Delhi", "Kolkata", "Chennai" }, 'B'));
		questions.add(new Question("Which data structure uses LIFO?",
				new String[] { "Stack", "Queue", "Tree", "Graph" }, 'A'));
		questions.add(new Question("What is the value of 2 + 2 * 2?", new String[] { "6", "8", "4", "10" }, 'A'));
		questions.add(new Question("Which language runs in a web browser?",
				new String[] { "Java", "C", "Python", "JavaScript" }, 'D'));
		
		int score=0;
		System.out.println("*****Welcome to Quiz Application*****");
		for(int i=0;i<questions.size();i++) {
			System.out.println("\n Question" +(i +1)+ ":");
			questions.get(i).displayQuestion();
			System.out.println("Your answer (A/B/C/D):");
			char userAnswer= sc.next().charAt(0);
			
			if(questions.get(i).checkAnswer(userAnswer)) {
				System.out.println("Correct!");
				score++;
			}else {
				System.out.println("Incorrect. Correct answer:" + questions.get(i).correctAnswer);
			}
		}
		System.out.println("\n ***** Quiz Compleated*****");
		System.out.println("Your Score:" + score + " out of " + questions.size());
		sc.close();

	}

}
