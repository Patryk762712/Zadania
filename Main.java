import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Program służy do zamiany stopni celsjusza na stopnie ");



        boolean done = false;


        while (!done) {


            try {
                Scanner input = new Scanner(System.in); // użytkownik podaje liczbę
                System.out.println("Podaj trzy liczby: "); // napis podaj liczbę
                int liczba1 = input.nextInt();
                int liczba2 = input.nextInt();
                int liczba3 = input.nextInt();
                input.close(); // zamknięcie możliwości podania liczby

                if (liczba1 > liczba2) {
                    if (liczba1 > liczba3) {
                        System.out.println(liczba1 + "- największa");
                    } else if (liczba2 > liczba1) {
                        if (liczba2 >liczba3) {
                            System.out.println(liczba2 + "- największa");
                        }
                    }else

                }
                }


                    done = true;

            } catch (InputMismatchException exception) {
                System.out.println("Proszę podaj liczbę całkowitą");
            }


        }
    }
}
