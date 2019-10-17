package com.exercise12oppshape.model;

public class Square extends Shape{
	public double side;
	
	public Square() {
	}
	public Square(double side) {
		this.side = side;
	}
	public double CalculateArea(double area) {
		return side*side;
	}
	public double CalculatePerimeter(double area) {
		return 4*side;
	}
	
	//Getters and Setters
	public void setSide(double side) {
		this.side = side;
	}
	public double getSide() {
		return side;
	}
}
