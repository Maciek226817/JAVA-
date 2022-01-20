import java.util.Random;
import java.util.Scanner;

public class ProstaGra {
    public static void main(String[] args){
        int i = 0;
        int los;
        int odp;

        Random rnd = new Random();
        los = rnd.nextInt(10)+1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("zgadnij liczbe od 1 do 10");
        do{
            i++;
            System.out.print("Podajl liczbe");
            odp = scanner.nextInt();
            if(odp > los){
                System.out.println("moja liczba mniejsza");
            }
            else if(odp< los){
                System.out.println("liczba wieksza");
            }

        }while(odp != los);
        System.out.println("odgadles za" + i + "razem");


    }
}
