package Testing_Materials;

import java.lang.reflect.Array;

public class Practice1 {

	public static void main(String[] args) {
		
		String Name ="Java Training";
		String Name2 ="Traing 1";
		System.out.println(Name.charAt(8));
		System.out.println(Name.indexOf('a'));
		System.out.println(Name.concat(Name2));
		System.out.println(Name.substring(3, 8));
		System.out.println(Name.substring(5));
		System.out.println(Name.trim());
		System.out.println(Name.replace('T', 'F'));
		String [] a= Name.split(" ");
		System.out.println(a[0]);
		System.out.println(a[1]);
	}

}
