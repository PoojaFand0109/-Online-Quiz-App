package com.java.quiz;

public class Question {

	String question;
	String[] options;
	char correctAnswer;

	public Question(String question, String[] options, char correctAnswer) {

		this.question = question;
		this.options = options;
		this.correctAnswer = correctAnswer;
	}

	public void displayQuestion() {
		System.out.println(question);
		char optionLabel = 'A';
		for (String option : options) {
			System.out.println(optionLabel + ")" + option);
			optionLabel++;
		}

	}

	public boolean checkAnswer(char userAnswer) {
		return Character.toUpperCase(userAnswer) == Character.toUpperCase(correctAnswer);

	}

}
