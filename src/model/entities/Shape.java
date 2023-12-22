package model.entities;

import model.enums.Color;

public abstract class Shape {
	// Shape = Forma
	// Atributos
	private Color color;
	
	// Método Construtor
	public Shape(Color color) {
		this.color = color;
	}
	
	// Métodos Getters e Setters
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	// Métodos
	public abstract double area(); // Operações abstratas normalmente não usa {}(chaves)
}
