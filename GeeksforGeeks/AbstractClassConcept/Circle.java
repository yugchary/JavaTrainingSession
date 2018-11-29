package AbstractClassConcept;

public class Circle extends Shape {
	
	final double pi = 3.14;
    int radius;
     
    //constructor
    Circle(int radius, String name)
    {
         
        super(name);
        this.radius = radius;
    }
     
    @Override
    public void draw()
    {
         
        System.out.println("Circle has been drawn with radius "+radius); 
    }
     
    @Override
    public double area() 
    {
    	
        return (double)((pi*radius*radius)/2);
    }

}
