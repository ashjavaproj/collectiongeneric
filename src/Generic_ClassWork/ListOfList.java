package Generic_ClassWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfList {
	public static void main(String[] args) {
		List<String> mh=new ArrayList();
		mh.add("pune");
		mh.add("Mumbai");
		
		List<String> gj=new ArrayList();
		gj.add("Surat");
		gj.add("Ahemdabad");
		
		List<List<String>> india=new ArrayList();
		india.add(mh);
		india.add(gj);
		
		/*	Iterator<List<String>> itr1=india.iterator();
		while(itr1.hasNext())
		{
			List a=itr1.next();
		Iterator itr2=a.iterator();
			while(itr2.hasNext())
			{
			String	aa=(String) itr2.next();
			System.out.println(aa);
			
		    }
		}*/
		for(List<String> a:india )	
			
		{
			for(String aa:a)
			{
				System.out.println(aa);
			}
		}
			
			
	}
	

}



