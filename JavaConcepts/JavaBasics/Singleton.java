package JavaBasics;

public class Singleton {
	
		//in OOP, a singleton class is class that can have only one instance(object) at a time in memeory.
		//How to define singleton class:
		//1. make private constructor
		//2. write a public static method (getInstance) that has a return type of Object of this singleton class 
		//Lazy Initialization
	
		//Normal class vs Singleton class
		//Normal class is initialized using constructor, singleton call we use "getInstance" method
			
			
	private String str;
	
	private static Singleton singleton_instance = null;
	
	
	private Singleton() {
		str = "Hey, this is singleton class pattern";
	}

	public static Singleton getInstance() {
		if (singleton_instance == null)
			singleton_instance = new Singleton();
		return singleton_instance;
	}
	
	
	public static void main(String[] args) {
		
		
		Singleton x = Singleton.getInstance();
		//Singleton y = Singleton.getInstance();
		//Singleton z = Singleton.getInstance();
		
		x.str = x.str.toUpperCase();
		
		System.out.println(x.str);
		
		Singleton y = Singleton.getInstance();
		
		//Singleton y = new Singleton();
		System.out.println(y.str);
		
		y.str = y.str.toLowerCase();
		
		System.out.println(y.str);
		System.out.println(x.str);
		
		
		

	}

}
