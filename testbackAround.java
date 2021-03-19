public class testbackAround{
public void backAround(String str) {
	String last = str.substring(str.length() -1);
	System.out.println(last + str + last);
}
public static void main (String[] args)
 {  testbackAround obj = new testbackAround();
    obj.backAround("cat");
       testbackAround obj2 = new testbackAround();
	obj2.backAround("Hello");
	 testbackAround obj3 = new testbackAround();
	     	obj3.backAround("a");
}
}
