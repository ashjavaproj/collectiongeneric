package Generic_TASKS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2_MixPrimitive_Instanceof {

	public static void main(String[] args) {
		List<Object> al=new ArrayList();
		al.add(73.30f);
		al.add(256.39d);
		al.add(11);
		al.add(77l);
		al.add(79.10);
		al.add(87D);
		al.add(581);
		al.add('c');
		al.add("aaa");
		/*Iterator<Object> itr=al.iterator();
		while(itr.hasNext())
		{
	        Object o=itr.next();
	         if(o instanceof Integer)
	        {
	        	Integer a=(Integer)o;
	        	System.out.println(a);
	        }
	         else if(o instanceof Float)
	        {
	        	Float a=(Float)o;
	        	System.out.println(a);
	        }
	        else if(o instanceof Double)
	        {
	        	Double a=(Double)o;
	        	System.out.println(a);
	        }
	        else if(o instanceof Long)
	        {
	        	Long a=(Long)o;
	        	System.out.println(a);
	        }
		    }*/
		for(Object o:al)
		{
			if(o instanceof Float)
			{
				System.out.println(o);
			}
			else if(o instanceof Double)
			{
				System.out.println(o);
			}
			else if(o instanceof Long)
			{
				System.out.println(o);
			}
			else if(o instanceof Integer)
			{
				System.out.println(o);
			}
			else
			{
				System.out.println(o);
		}
	}
}
}