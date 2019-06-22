package cg;
import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		// non generic collection
		Set col=new HashSet();
		col.add("ram");
		col.add("shyam");
		col.add("abdul");
		col.add(55); //new integer(55); //autoboxing
		col.add(null);
		col.add("ganesh");
		col.add("ram");
		System.out.println(col);
		System.out.println(col.size());

	}

}
