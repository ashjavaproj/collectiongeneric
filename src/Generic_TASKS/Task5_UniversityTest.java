package Generic_TASKS;

import java.util.Iterator;
import java.util.List;

public class Task5_UniversityTest {

	public static void main(String[] args) {
		Task5_College c=new Task5_College();
       List<Task5_Student> data=c.m1();
    	/*Iterator<Task5_Student> itr=data.iterator();
		System.out.println("  Rollno           Name        ");
	 while(itr.hasNext())
		{
			
			
			Task5_Student a=itr.next();
			
			System.out.print("   "+a.getRollno());
			System.out.print("               "+a.getName());
			System.out.println();

	} */
       System.out.println("  Rollno            Name     ");
		System.out.println("------------------------------");
		
		for(Task5_Student a:data)
		{
		
			System.out.print("   "+a.getRollno());
			System.out.print("               "+a.getName());
			System.out.println();

		}
}
	
	
}