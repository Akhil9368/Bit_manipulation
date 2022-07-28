public class Power_Of_two {
    public static void main(String[] args) {
        int n=8;
        int count =0;
        while(n>0){
            if((n & 1) == 1){
                count++;
            }
            n=n>>1;
        }
       if(count ==1){
           System.out.println("Yes it's Power of two");
       }
       else
           System.out.println("No it's not the power of two");
    }
}
