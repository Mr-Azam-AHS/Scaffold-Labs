//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a word :: ");
		String word = keyboard.next();
		StringOddOrEven demo = new StringOddOrEven(word);
		out.println(demo);   //cat

		out.print("Enter a word :: ");
		word = keyboard.next();
		demo.setString(word);
		out.println(demo);  //boot

		out.print("Enter a word :: ");
		word = keyboard.next();
		demo.setString(word);
		out.println(demo);  //it

		out.print("Enter a word :: ");
		word = keyboard.next();
		demo.setString(word);
		out.println(demo);  //a

		out.print("Enter a word :: ");
		word = keyboard.next();
		demo.setString(word);
		out.println(demo);  //eleven

		out.print("Enter a word :: ");
		word = keyboard.next();
		demo.setString(word);
		out.println(demo);  //thirteen

		out.print("Enter a word :: ");
		word = keyboard.next();
		demo.setString(word);
		out.println(demo);  //odd

		out.print("Enter a word :: ");
		word = keyboard.next();
		demo.setString(word);
		out.println(demo);  //even
	}
}