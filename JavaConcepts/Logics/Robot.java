package Logics;

public class Robot {

	String name;
	String color;
	int weight;
	
	
	Robot(String name, String color, int weight){
		this.name = name;
		this.color = color;
		this.weight = weight;
	}
	
	public Robot() {
		// TODO Auto-generated constructor stub
	}

	void introduceSelf() {
		System.out.println("My name is "+ this.name);
	}
	
	void sleep(String obj) {
		System.out.println("i am sleeping on the " + obj);
	}
	
	
}
