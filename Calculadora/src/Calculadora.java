/**
 * Created by Administrador on 25/08/2016.
 */
public class Calculadora {
    //Atributos
    public double num1;
    public double num2;
    public double resultado;
    public double par;
    public int c;
    public int d;
    public double fac;
    public int i;

    //Metodos
    public double sumar (double n1, double n2){
        return n1 + n2;
    }

    public double restar(){
        return num1-num2;}

    public void multiplicar (){
        resultado= num1*num2;
    }

    public double dividir (double n1, double n2){
        return n1 / n2;
    }

    public boolean par (double n1){
        par = n1 % 2;
        if (par == 0){
            return true;
        }
        else
        return false;
    }

    public boolean primo(){
        c = 1;
        d = 0;
       for (i=1; i<= num1; i++){
               if (num1 % i == 0) {
                   d = d + 1;
           }
       }
        if (d == 2){
            return true;
            }
        else
            return false;
    }

    public double factorial () {
        fac =1;
        for ( i=1; i<=num1; i++){

            fac*=i;
        }
        return fac;
    }

    public double getFac() {
        return fac;
    }

    public void setFac(double fac) {
        this.fac = fac;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
