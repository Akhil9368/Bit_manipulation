public class Xor {
    public static void main(String[] args) {
   int x =3;
   int y= 5;
   // Step -1 neg of x and neg of y
        int result = (x | y) - (x & y);
        System.out.println(result);


    }
}
