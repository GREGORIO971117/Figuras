
public class Triangulo implements Figuras {
	private String nombre;
	private double base;
	private double altura;
	private double lado;
	
	public Triangulo(String nombre, double base, double altura, double lado){
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}
	
	
	
	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public double getLado() {
		return lado;
	}



	public void setLado(double lado) {
		this.lado = lado;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public double calcularArea() {
		return(getBase()*getAltura())/2;
	}
	@Override
	public double calcularPerimetro() {
		return getLado()+getLado()+getLado();
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
}
