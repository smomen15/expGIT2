/**
 * 
 */
package com.mycompany.expgit2.chapter1;

/**
 * @author shakib2013
 *
 */
public class MyClass {
	private String name;
	private String lastName;
	
	public MyClass(String name){
		this.name = name;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BEGIN");
		staticMethod("Shakib");
		System.out.println("END");
	}
	
	public static void staticMethod(String inp){
		System.out.println("Hi, input is" + inp);
		System.out.println("Bye");
	}
	
	public String getName() {
		return name;
	}
}
