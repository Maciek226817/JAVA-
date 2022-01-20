public class OperatoryArytmetyczne {
    public static void main(String[] args){
        int a = 20;
        int b = 10;
        int wynik = a + b;
        int wynik2 = a - b;
        int wynik3 = a * b;
        double wynik4 = (double)a / b;
        int wynik5 = a % b; //reszta z dzielenia
        int wynik6 = 2+(2*2);
        a += b;//a = a+b
        Math.pow(2,3);//potegowanie 2do3
        Math.sqrt(9); //pierwiatek
        Math.abs(-50); //wartosc bezwzgledna
        a++; // inkremetacja zwiekszanie o 1
        a--; //dekrementacja zmniejszenie o 1

        System.out.println(wynik);
        System.out.println(wynik2);
        System.out.println(wynik3);
        System.out.println(wynik4);
        System.out.println(wynik5);
        System.out.println(wynik6);
        System.out.println(a);
        System.out.println(Math.pow(2,3));
        System.out.println(++a);//21
        System.out.println(a++);
        System.out.println(a);// 2 liniki zeby bylo 21
    }

}
