package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program {
	public static void main(String[] args) {
		// Herdar vs. Cumprir Contrato
		
		//Instanciando dois objetos do tipo: (Circulo, Retangulo)
		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
		
		// Exibindo informações do circulo
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		// Exibindo informações do retangulo
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
		
		
		
		
	}
}
