package shiva_day9;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		Queue<Integer> q1=new PriorityQueue<Integer>();
		q1.add(12);
		q1.offer(45);
		q1.offer(93);
		q1.offer(17);
		System.out.println(q1);
		q1.poll();
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
		
		
	}

}
