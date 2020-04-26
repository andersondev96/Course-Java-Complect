package br.com.exercicio01;

public class rectangle {
	public double width, height;

public double Area()
{
	return width * height;
}

public double Perimeter() {
	return 2 * (width + height);
}

public double Diagonal() {
	return Math.sqrt((width * width) + (height * height));
}

}
