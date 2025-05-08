public class Rombo implements Figuras {
    private String nombre;
    private double diagonalMenor;
    private double diagonalMayor;
    private double lado;

    public Rombo(String nombre, double diagonalMenor, double diagonalMayor,double lado) {
		super();
		this.nombre = nombre;
		this.diagonalMenor = diagonalMenor;
		this.diagonalMayor = diagonalMayor;
		this.lado=lado;
	}
    
    

	public double getLado() {
		return lado;
	}



	public void setLado(double lado) {
		this.lado = lado;
	}



	public double getDiagonalMenor() {
		return diagonalMenor;
	}


	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}


	public double getDiagonalMayor() {
		return diagonalMayor;
	}


	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
    public String getNombre() {
        return nombre; // Correctly return the nombre field
    }

    @Override
    public double calcularArea() {
        return getDiagonalMayor() * getDiagonalMenor()/2; // You can directly use the "lado" field
    }

    @Override
    public double calcularPerimetro() {
        return 4 * getLado(); // You can directly use the "lado" field
    }
}