package Generic_TASKS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1_MixPrimitive_Instanceof {
	
	public static void main(String args[])
	{
		List<Object> al=new ArrayList();
		al.add(34);
		al.add("abc");
		al.add('m');
		al.add(45);
		al.add("xyz");
		al.add('A');
		/*Iterator<Object> itr=al.iterator();
		while(itr.hasNext())
		{
			Object a=itr.next();
			if(a instanceof Integer)
			{
				int x=(int)a;
				System.out.println(x);
			}
			else if(a instanceof String)
			{
				String x=(String)a;
				System.out.println(x);
				
			}
			else if(a instanceof Character)
			{
				
				Character x=(Character)a;
				System.out.println(x);
			}
			}*/
		
		for(Object a : al)
		{
			if(a instanceof Integer)
			{
			System.out.println(a);
			}
			
			else if(a instanceof String)
			{
			System.out.println(a);
			}
			
			else if(a instanceof Character)
			{
			System.out.println(a);
			}
			}
		}
	}


