import java.io.PrintStream;
import java.util.Scanner;
public class Ejer26{
    static PrintStream screen = System.out; 
    static Scanner keyboard = new Scanner (System.in);
    public static void main(String[] args) {
        String num;
        System.out.println("ingrese el numero telefonico: ");
        num=keyboard.nextLine();
        double digitos= Double.parseDouble(num);
        digitos=digitos/10000000;
        digitos=Math.floor(digitos);
        System.out.println("su prefijo es: "+digitos);
        if(digitos== 310 || digitos==  311 || digitos==312 || digitos==313 ||digitos==314 || digitos==320 ||digitos==321 || digitos==322 || digitos==323){
            System.out.println("el numero pertenece a Claro");
            System.out.println("su operador es movil con red");
        }
      else if(digitos==300 || digitos==301 ||digitos==302 || digitos== 303 || digitos== 304){
            System.out.println("el numero pertenece a Tigo");
            System.out.println("su operador es movil con red");
      }
      else if(digitos==305){
            System.out.println("el numero pertenece a ETB");
            System.out.println("su operador es movil con red");
      }
      else if(digitos==315 || digitos==316 || digitos==317 || digitos==318 ||digitos==319){
            System.out.println("el numero pertenece a Movistar");
            System.out.println("su operador es movil con red");
      }
      else if(digitos==319){
            System.out.println("el numero pertenece a VirginMovile");
            System.out.println("su operador es movil virtual");
      }
      else if(digitos==350 || digitos==351){
            System.out.println("el numero pertenece a Avantel");
            System.out.println("su operador es movil con red");
      }
      else if(digitos==302 || digitos== 323 || digitos==324){
            System.out.println("el numero pertenece a Wom");
            System.out.println("su operador es movil con red");
      }
      else if(digitos==333){
        System.out.println("el numero pertenece a SETROC o Suma Movil");
        System.out.println("su operador es movil con red");
      }
    }
}
