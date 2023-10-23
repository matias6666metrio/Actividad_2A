import java.io.PrintStream;
import java.util.Scanner;

public class Ejer21 {

static PrintStream screen = System.out;
static Scanner keyboard = new Scanner (System.in);

public static void main(String[] args) {
    int num;
    String mensaje="";
    screen.println("ingrese un numero");
    num= keyboard.nextInt();
    if(num<0){
        mensaje="el numero es negativo";
    }
    else if(num==0){
        mensaje="el numero es cero";
    }
    else{
        mensaje="el numero es positivo";
    }
    screen.println(mensaje);
    }

}