// Only 100 test cases are passedout of 120
class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
        // your c,Integerode here
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
