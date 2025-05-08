
public class Main {
	public static void main(String[] args) {
	Triangulo t1=new Triangulo("Triangulo",20,10,15);
	Cuadrado t=new Cuadrado("Cuadrado",20);
	Rectangulo t2=new Rectangulo("Rectangulo",20,10);
	
	Main.imprimirCalculos(t);
	Main.imprimirCalculos(t1);
	Main.imprimirCalculos(t2);
	}
	
	public static void imprimirCalculos(Figuras t1) {
		System.out.println(t1);
		System.out.println("+-------------------------------------+");
		System.out.println("|El area de  ["+t1.getNombre()+"]");
		System.out.println("|es :"+ t1.calcularArea());
		System.out.println("|el perimetro de ["+t1.getNombre() +"]");
		System.out.println("|es:"+t1.calcularPerimetro());
	}
}