import java.io.PrintStream;
import java.util.Scanner;
public class Ejer24 {
    static PrintStream screen = System.out; 
    static Scanner keyboard = new Scanner (System.in);
    public static void main(String[] args) {
        int A1=0;
        int A2=0;
        int A3=0;
        screen.println("ingrese la altura de la persona 1: ");
        A1= keyboard.nextInt();
        screen.println("ingrese la altura de la persona 2: ");
        A2= keyboard.nextInt();
        screen.println("ingrese la altura de la persona 3: ");
        A3= keyboard.nextInt();
        if(A1>A2){
            if(A1>A3){
                if(A2>A3){
                    screen.println("el orden de altura es: "+A1+","+A2+","+A3);
                }
                else{
                    screen.println("el orden de altura es: "+A1+","+A3+","+A2);
                }
            }
            else{
                screen.println("el orden de altura es: "+A3+","+A1+","+A2);
            }
        }
        else if(A2>A3){
            if(A3>A1)
                screen.println("el orden de altura es: "+A2+","+A3+","+A1);
            else{
                screen.println("el orden de altura es"+A2+","+A1+","+A3);
            }
        }
        else{
            screen.println("el orden de altura es: "+A3+","+A2+","+A1);
        }
    }
}