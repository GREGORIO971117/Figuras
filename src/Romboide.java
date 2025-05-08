
public class Romboide implements Figuras{
	
	private String nombre;
	private double base;
	private double altura;
	public Romboide(String nombre, double base, double altura) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	@Override
	public String getNombre() {
		return nombre;
	}


	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return getBase()*getAltura();
	}


	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2*getBase()+2*getAltura();
	}
}

