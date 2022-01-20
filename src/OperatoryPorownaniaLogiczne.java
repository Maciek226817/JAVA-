public class OperatoryPorownaniaLogiczne {
    public static void main(String[] args){
        int a = 5, b = 6;
         boolean logiczna = a == b; //porownanie
         boolean logiczna1 = a != b; //rozne
         boolean logiczna2 = a > b; // a wieksze od b
         boolean logiczna3 = a < b; // a mnniejsze od b
         boolean logiczna4 = a <= b; // a mnniejsze rowne od b
         boolean logiczna5 = a >= b && 6>1;// and *
         boolean logiczna6 = a >= b || 6>1;// or lub +
         System.out.println(logiczna);
         System.out.println(logiczna1);
         System.out.println(logiczna2);
         System.out.println(logiczna3);
         System.out.println(logiczna4);
         System.out.println(logiczna5);
         System.out.println(logiczna6);
    }
}
