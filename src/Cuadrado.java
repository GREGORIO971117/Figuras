public class Cuadrado implements Figuras {
    private String nombre;
    private double lado;

    public Cuadrado(String nombre, double lado) {
        this.nombre = nombre;
        this.lado = lado;
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
    public String getNombre() {
        return nombre; // Correctly return the nombre field
    }

    @Override
    public double calcularArea() {
        return lado * lado; // You can directly use the "lado" field
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado; // You can directly use the "lado" field
    }
}
