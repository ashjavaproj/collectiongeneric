package Generic_TASKS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5_College {
	public List m1()
	{
		
		Scanner sc=new Scanner(System.in);
		Task5_Student s=new Task5_Student();
		System.out.println("Enter First Student Information");
		System.out.println("---------------------------------------");
		System.out.print(" Rollno = ");
		s.setRollno(sc.nextInt());
		System.out.print(" Name = ");
		s.setName(sc.next());
		
		Task5_Student s1=new Task5_Student();
		System.out.println("Enter Second Student Information");
		System.out.println("---------------------------------------");
		System.out.print(" Rollno = ");
		s1.setRollno(sc.nextInt());
		System.out.print(" Name = ");
		s1.setName(sc.next());
		
		List<Task5_Student> al=new ArrayList();
		al.add(s);
		al.add(s1);
		return al;
		
	}

}
