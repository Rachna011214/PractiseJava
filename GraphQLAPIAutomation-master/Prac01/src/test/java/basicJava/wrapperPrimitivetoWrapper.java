package basicJava;

public class wrapperPrimitivetoWrapper {

	public static void main(String[] args) {
		int a = 20;

		/*
		 * The automatic conversion of primitive data type into its corresponding
		 * wrapper class is known as autoboxing
		 */
		Integer b = Integer.valueOf(a);
		Integer c = a;
		System.out.println(a + " " + b + " " + " " + c);
		
		/*Unboxing-The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing. */
		//Converting Integer to int  .Since its a depreciated one so commenting it
		
		/*Integer a=new Integer(3);    
		int i=a.intValue();//converting Integer to int explicitly  
		int j=a;//unboxing, now compiler will write a.intValue() internally    
		    
		System.out.println(a+" "+i+" "+j);    
		}*/
		
	}    

	}


