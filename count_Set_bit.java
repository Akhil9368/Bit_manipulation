public class count_Set_bit {
    public static void main(String[] args) {
    int n=15;
    int count =0;
    while(n>0){
        if((n & 1) == 1){
            count++;
        }
        n=n>>1;
    }
        System.out.println(count);

    }
}
