package com.test;

public interface Helloworld {

	default void printout() {

		System.out.println("OutPut From default  method "+"Hellow world");
	}

	static void printout(String message) {
		System.out.println("OutPut From Static  method "+message);
	}

	
	
	
}
