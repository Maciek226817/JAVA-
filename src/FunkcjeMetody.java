public class FunkcjeMetody {
    public static void main(String[] args) {
        System.out.println(dodaj());
        System.out.println(dodaj(3));
        System.out.println(dodaj(3 , 6));
    }

    static int dodaj(){
        return 0;
    }
    static int dodaj(int x){ //void -typ zwracany metoda void nic nie zwraca
        return ++x;
    }

    static int dodaj(int x, int y){
        return x + y;
    }// przeciazenoe
}
