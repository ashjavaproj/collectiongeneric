package Generic_TASKS;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Task3_NonPrimitive_Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Task3_NonPrimitive_Student s=new Task3_NonPrimitive_Student();
		System.out.println("Enter First Student Information");
		s.setRollno(sc.nextInt());
		s.setName(sc.next());
		s.setAddr(sc.next());
		
		Task3_NonPrimitive_Student s1=new Task3_NonPrimitive_Student();
		System.out.println("Enter Second Student Information");
		s1.setRollno(sc.nextInt());
		s1.setName(sc.next());
		s1.setAddr(sc.next());
		
		Task3_NonPrimitive_Student s2=new Task3_NonPrimitive_Student();
		System.out.println("Enter Third Student Information");
		s2.setRollno(sc.nextInt());
		s2.setName(sc.next());
		s2.setAddr(sc.next());
		
		List<Task3_NonPrimitive_Student> al=new ArrayList();
		al.add(s);
		al.add(s1);
		al.add(s2);
		
		/*Iterator<Task3_NonPrimitive_Student> itr=al.iterator();
		System.out.println("Rollno         Name          Address ");
		while(itr.hasNext())
		{
			Task3_NonPrimitive_Student a=itr.next();
			System.out.print("   "+a.getRollno());
			System.out.print("            "+a.getName());
			System.out.print("             "+a.getAddr());
			System.out.println();
			
		}*/
		for(Task3_NonPrimitive_Student a:al)
		{
			System.out.print("   "+a.getRollno());
			System.out.print("            "+a.getName());
			System.out.print("             "+a.getAddr());
			System.out.println();
		}
		
	}

}
