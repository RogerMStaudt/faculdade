public class Main {
    public static void main(String[] args) {
        recursivo(4);
    }

     public static int A(int i){
        if(i > 10) return 0;
        int x = 5 + i;
        i += 3;
        System.out.print(1);
        return x + A(i);
    }

      public static int recursivo(int x){
        if(x == 2) return x;
        return -6 * recursivo(x-2) + x;
    }
}