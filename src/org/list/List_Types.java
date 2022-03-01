package org.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Types {

	public static void main(String[] args) {

		List<Object> l = new ArrayList<>();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add('S');
		l.add("SAI");
		l.add(35.5);

		System.out.println(l);
		
		l.add(4, 40);
		System.out.println(l);
		
		int a = l.size();
		System.out.println(a);
		
		Object b = l.get(6);
		System.out.println(b);
		
		l.set(2, 25);
		System.out.println(l);
		
		l.remove(5);
		System.out.println(l);
		
		int c = l.indexOf(40);
		System.out.println(c);
		
		boolean d = l.contains(60);
		System.out.println(d);
		
		List<Object> x = new LinkedList<>();
		
		x.add(10);
		x.add(20);
		x.add(30);
		
		System.out.println(x);
		
		l.addAll(x);
		System.out.println(l);
		
		l.retainAll(x);
		System.out.println(l);
		
		l.removeAll(x);
		System.out.println(l);
		
		l.clear();
		System.out.println(l);
	}
}
