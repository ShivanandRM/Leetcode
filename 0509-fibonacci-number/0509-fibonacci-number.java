class Solution {
    public int fib(int n) {
       int a = 0;
       int b = 1;
       int count = 1;
       while(count <= n){
            int temp = a+b;
            a=b;
            b=temp;
            count++;
       }
        return a;
    }
}