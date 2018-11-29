package AbstractClassConcept;

public class Rectangle extends Shape {
	
	int length, width;
    
    // constructor
    Rectangle(int length, int width, String name)
    {
         
        super(name);
        this.length = length;
        this.width = width;
    }
     
    @Override
    public void draw() 
    {
        System.out.println("Above figure has been drawn with width and lenght of "+length + " and " + width + " respectively"); 
    }
     
    @Override
    public double area() 
    {
        return (double)(length*width);
    }
    
   
}
