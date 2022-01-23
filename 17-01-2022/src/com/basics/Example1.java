package com.basics;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) 
	{
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter the input value:");
  
  String str = scanner.next();
  scanner.close();
  
  switch (str)
  
  {
	  case "0":
	  case "1":
	  case "2":
	  case "3":
	  case "4":
	  case "5":
	  case "6":
	  case "7":
	  case "8":
	  case "9":
		  System.out.println("Your character is DIGIT");
		  break;
		 
	  case "a":
	  case "A":
	  case "b":
	  case "B":
	  case "c":
	  case "C":
	  case "d":
	  case "D":
	  case "e":
	  case "E":
	  case "f":
	  case "F":
	  case "g":
	  case "G":
	  case "h":
	  case "H":
		  
		  System.out.println("the given character is Alphabet");
		  break;
		  
		  default:
			  System.out.println("the given charecter is special Character");
			  break;
  }
	}

}
