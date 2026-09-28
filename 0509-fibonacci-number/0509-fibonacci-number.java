class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
    /* without recursion
        int a = 0;
        int b = 1;
        int count = 1;
         while(count <= n){
            int temp = a+b;
            a=b;
            b=temp;
            count++;
       }
    //     return a;*/
        return fib(n-1)+fib(n-2)   ;
    }
}