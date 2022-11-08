package basicJava;
import java.util.ArrayList;

import java.util.List;
public class WrapperinArrayList {




/*
 * Its usefulness with ArrayList:
 * 
 * 
 * Various data structures that are present in a collection framework can only
 * hold objects and not primitive data types. The ArrayList is such a collection
 * that can only hold class objects and not primitive data types thus here the
 * wrapper class objects provide a way to create and use collections of various
 * primitive data types using the wrapper class.
 * 
 * 
 * The wrapper class objects support synchronization in the case of
 * multithreading.
 * 
 * 
 * It allows various features of ArrayList such as dynamic sizing and
 * implementation of associated functions which are only defined on class
 * objects.
 * 
 * 
 * Without a wrapper class it will be very difficult to implement an ArrayList.
 * 
 * 
 * 
 * The below program code implements an ArrayList int_list consisting of Integer
 * objects
 * 
 * Note: Kindly replace the terms (isLessThanSymbol) and (isGreaterThanSymbol)
 * with appropriate symbols as it is essential.
 */





  public static void main(String[] args) {

 
  
  List<Integer> int_list=new ArrayList<Integer>();

  for(int v= 0; v< 20; v++){

	  int_list.add(v);

  }

  System.out.println(int_list);

  }

}