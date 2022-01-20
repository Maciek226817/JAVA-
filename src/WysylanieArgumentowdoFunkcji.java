public class WysylanieArgumentowdoFunkcji {
    public static void main(String[] args){
//        int y = 5;
//        zmien(y);
//        System.out.println(y);
//    }
//    public static void zmien(int x){
//        x += 5;
//        System.out.println(x);
//        int y = 5;
//        y = zmien(y); //5
//        System.out.println(y);
//    }
//    public static int zmien(int x){
//        x += 5;
//        System.out.println(x);
//        return x;

        // typ zlozony przechowuje referencje
        int[] y = {5};
        zmien(y);
        System.out.println(y[0]);
    }
    public static void zmien(int[] x){
        x = new int[1];
        x[0] += 5;
        System.out.println("metoda :" +x[0]);
    }
}
