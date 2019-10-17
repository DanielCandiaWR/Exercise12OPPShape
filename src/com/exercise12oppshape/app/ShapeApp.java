package com.exercise12oppshape.app;
import com.exercise12oppshape.model.*;
import java.util.*;
public class ShapeApp {
	public static void main(String[] args) {
		Square square1 = new Square();
		Circle circle1 = new Circle();
		Triangle triangle1 = new Triangle();
		
		Square square2 = new Square(10.2);
		Circle circle2 = new Circle(5.3);
		Triangle triangle2 = new Triangle(5.4, 6.8);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input the radio of the circle: ");		
		circle1.setRadio(input.nextDouble());
		
		System.out.println("The area of the circle is: "+circle1.CalculateArea(circle1.getRadio()));
		
	}
}
