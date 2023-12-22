package model.entities;

import model.enums.Color;

public class Rectangle extends Shape{
	// Atributos
	private Double width;
	private Double height;
	
	// Métodos Getters e Setters
	public void setWidth(Double width) {
		this.width = width;
	}
	
	public Double getWidth() {
		return width;
	}
	
	public void setHeight(Double height) {
		this.height = height;
	}
	
	public Double getHeight() {
		return height;
	}
	
	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	// Métodos
	
	
	@Override
	public double area() {
		return width * height;
	}
	
}
