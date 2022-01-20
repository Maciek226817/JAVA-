import java.util.Scanner;

public class PierwszyProgram {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Podaj swoje imie: ");
        name = scanner.next();
        System.out.print("Hello " + name);

    }
}
