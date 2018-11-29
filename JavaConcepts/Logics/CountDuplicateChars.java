package Logics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDuplicateChars {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 String ch;
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      System.out.print("Enter the Statement:");
	      ch=br.readLine();
	      int count=0,len=0;
	      char name[] = null;
	        do
	        {  
	          try
	          {
	        	  name=ch.toCharArray();
	              len=name.length;
	              count=0;
	              for(int j=0;j<len;j++)
	               {
	                  //if((name[0]==name[j])&&((name[0]>=65&&name[0]<=91)||(name[0]>=97&&name[0]<=123)))
	            	  if(name[0]==name[j])
	                      count++;
	               }
	              //if(count>1) {
	                System.out.println(name[0]+" "+count+" Times");
	                //break;
	              //}
	              //ch=ch.replace(""+name[0],""); 
	                //System.out.println("str:"+name);
	              ch=ch.replace(""+name[0],"");  
	          }
	          catch(Exception ex){}
	        }
	        while(len!=1);
	        System.out.println("str:"+name.toString());
	   }

}
