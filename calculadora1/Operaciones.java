package calculadora1;
import java.util.Scanner;

public class Operaciones {
   Scanner entrada= new Scanner(System.in);
        double num1;
        double num2;
        double resultado;
        
        public void datos(){
System.out.println("ingresa un numero:");
num1=entrada.nextDouble();
System.out.println("ingrese un segundo numero:");
num2=entrada.nextDouble();
        }
        public void suma(){
        resultado=num1+num2;
        System.out.println("el resultdo es: " +resultado);
        }
        
        public void resta(){
        resultado=num1-num2;
        System.out.println("el resultdo es: " +resultado);
        }
         public void multiplicacion(){
        resultado=num1*num2;
        System.out.println("el resultdo es: " +resultado);
        }
        public void division(){
        resultado=num1/num2;
        System.out.println("el resultdo es: " +resultado);
        }
    
    
}
