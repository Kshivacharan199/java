package shiva_day9;
import java.util.*;
public class eee1 {

	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();
		l1.add(12);
		l1.add(34);
		l1.add(67);
		l1.add(2,67);
		System.out.println(l1);
		List<Object> extra=new Arrays.asList(4,8);
		l1.addAll(1,extra);
		System.out.println(l1.get(6));
		System.out.println(l1.indexOf(90));
		Object[] arr=l1.toArray();
		for(Object a1:arr) {
			System.out.println(a1);
		}
		
		
		
		
	}

}
