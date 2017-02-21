package com.test;

/**
 * Hello world!
 *
 */
public class App implements Helloworld
 {
	public static void main(String[] args) {
		Helloworld.printout("Hello World!");

		Helloworld hello = (Helloworld) new App();
		hello.printout();

		InnerInterface internalint = (message) -> System.out.println("Out Put from  Inner interaface :"+message);
		internalint.sayMessage("Hello World!");
	}
	
	
	interface InnerInterface {
	      void sayMessage(String message);
	   }

}
