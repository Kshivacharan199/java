//package shiva_day8;
//import java.util.*;
//
//
//public class csre2 {
//	
//
//	public static void main(String[] args) {
//		List<Integer> l1=new ArrayList<Integer>();
//		l1.add(1);
//		l1.add(19);
//		l1.add(154);
//		Iterator i1=l1.iterator();
//		while(i1.hasNext())  {
//			System.out.println(i1.next());
//		}
//		// TODO Auto-generated method stub
//
//	}
//
//}
package shiva_day8;
import java.util.*;


public class csre2 {
	

	public static void main(String[] args) {
		Vector<Integer> l1=new Vector<Integer>();
		l1.add(45);
		l1.add(63);
	l1.add(93);
	l1.add(33);
		System.out.println(l1);
		Enumeration i1=l1.elements();
		
		while(i1.hasMoreElements())  {
			System.out.println(i1.nextElement());
		}
		// TODO Auto-generated method stub

	}

}
