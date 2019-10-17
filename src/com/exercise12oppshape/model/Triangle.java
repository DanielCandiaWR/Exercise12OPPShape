package com.exercise12oppshape.model;

public class Triangle extends Shape{
	private double base;
	private double height;
	
	public Triangle(){
		
	}
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double CalculateArea(double base, double height) {
		return (base*height)/2;
	}
	public double CalculatePerimeter(double base, double heigth, double hypotenuse) {
		return base+height+hypotenuse;
	}
	
	//Getters and Setters
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getBase() {
		return this.base;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
}
