import java.util.Scanner;

public class areaPoligno {

    public static void main(String[] args) {
        Scanner selector = new Scanner(System.in);
        Scanner lado1 = new Scanner(System.in);
        Scanner altura = new Scanner(System.in);
        Scanner base = new Scanner(System.in);
        


        System.out.println("1.cuadrado");
        System.out.println("2.triangulo");
        System.out.println("3.rectangulo");


        System.out.println("Seleccione una opcion");
        byte elector1 = selector.nextByte();

        switch (elector1) {
            case 1:
                System.out.println("cuadrado");
                System.out.println("ingrese el lado del cuadrado");
                double ladoCuadrado = lado1.nextDouble();
                double areaCuadrado = ladoCuadrado*ladoCuadrado;
                System.out.println("area del cuadrado " + areaCuadrado);
                break;
            
            case 2:
                System.out.println("triangulo");
                System.out.println("ingrese la alltura del triangulo"); double alturaTriangulo = altura.nextDouble();
                System.out.println("ingrese la base del triangulo"); double baseTriangulo = base.nextDouble();
                double areaTriangulo = alturaTriangulo*baseTriangulo/2;
                System.out.println("area del triangulo "+ areaTriangulo);

                break;
        
            case 3:
                System.out.println("triangulo");
                System.out.println("ingrese la alltura del rectangulo"); double alturaRectangulo = altura.nextDouble();
                System.out.println("ingrese la base del rectangulo"); double baseRectangulo = base.nextDouble();
                double areaRectangulo = alturaRectangulo*baseRectangulo;
                System.out.println("area del rectangulo "+ areaRectangulo);

                break;
            default:
                System.out.println("error");
                break;
        }
        
    }
}