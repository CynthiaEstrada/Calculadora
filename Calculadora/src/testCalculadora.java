import java.util.Scanner;

/**
 * Created by Administrador on 25/08/2016.
 */
public class testCalculadora {
    static int opcion;
    static double n1, n2;

    public static void main (String[] args){
        //Para leer datos del teclado
        Scanner lector = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        do {
            System.out.println("M E N U");
            System.out.println("1.- SUMAR");
            System.out.println("2.- RESTAR");
            System.out.println("3.- MULTIPLICAR");
            System.out.println("4.- EVALUAR SI UN NUMERO ES PAR");
            System.out.println("5.- EVALUAR SI UN NUMERO ES PRIMO");
            System.out.println("6.- NUMERO FACTORIAL");
            System.out.println("0.- SALIR");
            System.out.println("OPCIÓN: ");
            opcion = lector.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Programa finalizado");
                    break;
                case 1:
                    System.out.println("Numero 1: ");
                    n1 = lector.nextDouble();
                    System.out.println("Numero 2: ");
                    n2 = lector.nextDouble();
                    System.out.println("La suma es " + calc.sumar(n1, n2));
                    break;
                case 2:
                    System.out.println("Numero 1: ");
                    n1=lector.nextDouble();
                    calc.setNum1(n1);
                    System.out.println("Numero 2: ");
                    n2=lector.nextDouble();
                    calc.setNum2(n2);
                    System.out.println("El resultado de la resta es : " + calc.restar());//no se pone nada en parentesis porque el metodo no retorna nada
                    break;
                case 3:
                    System.out.println("Numero 1: ");
                    n1=lector.nextDouble();
                    calc.setNum1(n1);
                    System.out.println("Numero 2: ");
                    n2=lector.nextDouble();
                    calc.setNum2(n2);
                    calc.multiplicar();
                    System.out.println("El resultado de la multiplicacion es : " + calc.getResultado());
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Numero a evaluar");
                    n1 = lector.nextDouble();
                    System.out.println("");
                    System.out.println(calc.par(n1));
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Numero a evaluar");
                    n1 = lector.nextDouble();
                    System.out.println("");
                    calc.setNum1(n1);
                    System.out.println(calc.primo());
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Numero a evaluar");
                    n1 = lector.nextDouble();
                    System.out.println("");
                    calc.setNum1(n1);
                    calc.factorial();
                    System.out.println(calc.getFac());
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Dividendo");
                    n1 = lector.nextDouble();
                    System.out.println("Dividendo");
                    n2 = lector.nextDouble();
                    System.out.println("El resultado de la division es: " + calc.dividir(n1, n2));
                    System.out.println("");
                    break;




            }

        }
        while (opcion != 0);
    }
}
