package experiment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Arrayprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {1,2,4,3,6,4,7,5,9,10};
		Integer b[]= {1,2,3,4,5,6,7,8,9,10,11,12};
		List<Integer> ts=new ArrayList(new TreeSet(Arrays.asList(a)));
		List<Integer> ts1=new ArrayList(new TreeSet(Arrays.asList(b)));
//		if(ts.size()<ts1.size())
//		{
//			for(int i=0;i<ts1.size();i++)
//			{
//				if(ts1.get(i)!=ts.get(i))
//					System.out.println(ts1.get(i));
//			}
//		}
		/*
		 * ts={1,2,3,4,5,6,7,9,10};
		 * ts1={1,2,3,4,5,6,7,8,9,10};
		 */
		for(int i=0;i<ts1.size();i++)
		{
			int j;
			for(j=0;j<ts.size();j++)
			{
				if(ts1.get(i)==ts.get(j))
					break;
			}
			if(j==ts.size())
			{System.out.println(i+" "+j);
				System.out.println(ts1.get(i));
			}
		}
	}

}
