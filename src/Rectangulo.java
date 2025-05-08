public class Rectangulo implements Figuras {
    private String nombre;
    private double base;
    private double altura;

    

    public Rectangulo(String nombre, double base, double altura) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
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



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularArea() {
        return getBase() * getAltura();
    }

    @Override
    public double calcularPerimetro() {
        return 2 * getAltura()+2*getBase();
    }
}

