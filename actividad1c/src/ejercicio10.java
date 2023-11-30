import java.io.PrintStream;
import java.util.Scanner;

public class ejercicio10 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args){
        double anchotel;
        double altotel;
        double pulg;
        screen.println(" ingrese el ancho de su televisor");
        anchotel= keyboard.nextDouble();
        screen.println(" ingrese el alto de su televisor");
        altotel= keyboard.nextDouble();
        pulg= Math.sqrt(Math.pow(anchotel,2)+Math.pow(altotel,2));
        screen.println(" las pulgadas de su televisor son:"+pulg);
    }
}
