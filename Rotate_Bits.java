
class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
        // your c,Integerode here
        D= D%16;
        int resultl =0;
        int resultr =0;
        int rotate = 16-D;
    ArrayList<Integer> arr = new ArrayList<>();
    resultl = ((N << D) | (N >> rotate)) & 0xFFFF;
    arr.add(resultl);
    resultr = ((N >> D) | (N << rotate)) & 0xFFFF;
    arr.add(resultr);
    
    return arr;
    
     
     
    }
}
