package Generic_TASKS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task4_Calculator {
	int a=60,b=6,c=0;
	
	   public int add(){
		   c=a+b;
		   return c;
		   
	   }
	   public int sub(){
		   c=a-b;
		   return c;
	   }
	  public int mul(){
		  c=a*b;
		  return c;
	   }
	   public int div(){
		   c=a/b;
		   return c;
	   }
	   public static void main(String args[]){
	    
	      Task4_Calculator c=new Task4_Calculator();
	       //call all methods here
	     int x=c.add();
	      int y=c.sub();
	     int z=c.mul();
	     int q=c.div();
	      //add to the list
	      List<Integer> al=new ArrayList();
	     al.add(x);
	     al.add(y);
	     al.add(z);
	     al.add(q);
	      //iterator list using iterator
	    /* Iterator<Integer> itr=al.iterator();
			while(itr.hasNext())
			{
				int a=itr.next();
				 System.out.println(a);
				
			}*/
	     for(Integer a:al)
	    	 System.out.println(a);
	    }
	}



