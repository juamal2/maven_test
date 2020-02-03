package com.qa.tutorial;

public class Runner {

	public static void main(String[] args) {
		Runner runner = new Runner();
		System.out.println(runner.greeting() + " " + runner.insult());

	}
	
	public String greeting() {
		return "hello world";
	}
	
	public String insult() {
		return "is trash";
	}
	

}
