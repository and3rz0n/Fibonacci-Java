import java.util.Scanner;

public class Fibonacci{
  public static void main(String args[]){
   Scanner fibo = new Scanner(System.in);
   int cantidad = 0;
   int numUno = 0, numDos = 1, resultado = 0;

   System.out.println("Ingrese un numero:");
   cantidad = fibo.nextInt ();
   System.out.println("\n");
   System.out.println(numUno);
   System.out.println(numDos);
   for (int i=2; i<cantidad; i++){

      resultado = numUno + numDos;
      numUno=numDos;
      numDos = resultado;
      System.out.println(resultado);
   }

 }
}
