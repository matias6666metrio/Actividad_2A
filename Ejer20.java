import java.io.PrintStream;
import java.util.Scanner;

public class Ejer20 {

static PrintStream screen = System.out;
static Scanner keyboard = new Scanner (System.in);

public static void main(String[] args) { 
    int num=0;
    int res=0;
    String mensaje="";
    screen.println("ingrese un numero1");
    num= keyboard.nextInt();
    res= num%2;/*es para el residuo de la division */
    if(res==0){
     mensaje="el numero ingresado es par";
    }
    else{
    mensaje="el numero ingresado es impar";
    }
    screen.println(mensaje);/*para mostrar el mensaje en la pantalla*/
    }

}