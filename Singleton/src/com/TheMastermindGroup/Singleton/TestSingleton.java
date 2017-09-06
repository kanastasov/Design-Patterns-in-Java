package com.TheMastermindGroup.Singleton;

public class TestSingleton {

	 public static void main(String[] args) {
	      Singleton firstSingleton = Singleton.getInstance( );
	      Singleton secondSingleton = Singleton.getInstance( );
	      Singleton thirdSingleton = Singleton.getInstance( );
	      
	      System.out.println("Instance firstSingleton: " + firstSingleton.getInstance());
	      System.out.println("Instance secondSingleton: " + secondSingleton.getInstance());
	      System.out.println("Instance thirdSingleton: " + thirdSingleton.getInstance());
	      
	   }
}
