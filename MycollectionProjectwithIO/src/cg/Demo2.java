package cg;

import java.util.HashSet;
import java.util.*;

public class Demo2 {

	public static void main(String[] args) {
		// generic collection
		//Set<String> col=new HashSet<String>();
		//Set<String> col=new LinkedHashSet<String>(); //ordered => maintains insertion order //no duplicates
		//Set<String> col=new TreeSet<String>();
		//does not accept null as object throws NullPointException
		//no insertion order
		//sorted elements
		List<String> col=new ArrayList<String>();
		col.add("ram");
		col.add("shyam");
		col.add("abdul");
		//col.add(55); //new integer(55); //autoboxing
		col.add(null);
		col.add("ganesh");
		col.add("ram");
		System.out.println(col);
		System.out.println(col.size());
		System.out.println("=============");
		for(String s:col)
		{
			System.out.println("s");
		}
		System.out.println("=============");
		Iterator<String> it=col.iterator();
		while(it.hasNext())
		{
			String ss=it.next();
			System.out.println(ss);
		}
	}

}
