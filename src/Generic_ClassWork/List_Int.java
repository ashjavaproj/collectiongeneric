package Generic_ClassWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Int {

	public static void main(String[] args) {


		List<Integer> al=new ArrayList();
		al.add(45);
		al.add(46);
		al.add(47);
		/*Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			Integer a=itr.next();
			System.out.println(a);
		}*/
		for(Integer a:al)
		{
			System.out.println(a);
		}
	}
}