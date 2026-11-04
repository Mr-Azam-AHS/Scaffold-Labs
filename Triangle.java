//(c) A+ Computer Science
// www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import java.lang.Math.*;

public class Triangle
{
	private int sideA, sideB, sideC;
	private double perimeter;
	private double theArea;

	public Triangle()
	{
	   setSides(0,0,0);
	   perimeter=0;
	   theArea=0;
	}

	public Triangle(int a, int b, int c)
	{
		setSides(a,b,c);

	}


	public void setSides(int a, int b, int c)
	{

		sideA = a;
		sideB = b;
		sideC = c;
	}

	public double getPerimeter(){
		calcPerimeter();
		return perimeter;
	}

	//write a getter method for Area;

	public void calcPerimeter( )
	{

		//need to calculate perimeter and then store in variable perimeter.
	}

	public void calcArea( )
	{
		double s;

		//calculate the area and store in double theArea;


	}

	public void print( )
	{


		System.out.println("\n\n");
	}
}