package Quiz1;

import java.util.HashSet;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

class Animal {
    public int i=12;
     
    public Animal(){
        i=13;
    }
    public String toString(){
        return "Animal"+i;
    }
}
public class Test {
    public static void main(String [] args) throws Exception {
    	
    	
    		
    		
    		
    		
    		
    		
    		 PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\akkyu01\\Documents\\yug.txt"));
    		    for (int i = 1; i <= 100000; i++) {
    		      /*int die = (int) (1 + 6 * Math.random());
    		      pw.print(die);
    		      pw.print(' ');
    		      if (i % 20 == 0)*/
    		        pw.println(i);
    		    }
    		    pw.println();
    		    pw.close(); // Without this, the output file may be empty
    	
    	
       
    }
}