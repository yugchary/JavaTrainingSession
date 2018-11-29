package InterfaceConcept;

public interface Shape {
	

	
	 //Prior to JDK 8, interface could not define implementation. We can now add default implementation for interface methods. 
	//This default implementation has special use and does not affect the intention behind interfaces	
	default void display()
    {
        System.out.println("defalult implementation of interface");
    }
	
	
	//Another feature that was added in JDK 8 is that we can now define static methods in interfaces which can be called independently without an object. 
	//Note: these methods are not inherited.
	static void display1()
    {
        System.out.println("hello");
    }
	
	// abstract method
    void draw();
    double area();

}
