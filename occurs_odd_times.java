public class occurs_odd {
    public static void main(String[] args) {
    int result = 0;
    int arr [] = {10,10,10,10,10,20,30,20,30,40,40};
            for(Integer elements : arr){
                result= result^elements;
            }
        System.out.println(result);

    }
}
