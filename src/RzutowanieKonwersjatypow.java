public class RzutowanieKonwersjatypow {
    public static void main(String[] args){
        //short a = 25;
        //int b = a;
//        int a = 25;  //blad
//        short b = (short)a;//rzutowanie
        float a = 5.9f;
        int b = (int)a;
        String liczba = Integer.toString(b);
        int c = Integer.parseInt(liczba);
        System.out.println(c);
    }
}
