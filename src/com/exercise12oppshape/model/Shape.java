package com.exercise12oppshape.model;

public abstract class Shape implements Shapeable{

	@Override
	public String Draw() {
		// TODO Auto-generated method stub
		return "Figure is being drawn";
	}

	@Override
	public String ChangeColor() {
		// TODO Auto-generated method stub
		return "Figure is being chenged it's color";
	}

	@Override
	public String Erase() {
		// TODO Auto-generated method stub
		return "Figure is being erased";
	}

	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public double CalculatePerimeter() {
		// TODO Auto-generated method stub
		return 0.0;
	}

}
