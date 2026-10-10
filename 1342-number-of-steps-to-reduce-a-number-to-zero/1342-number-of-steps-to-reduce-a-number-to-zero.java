class Solution {
    public int numberOfSteps(int num) {
        return count(num,0);
    }
    private int count(int num, int steps){
        if(num==0){
            return steps;
        }else if(num%2 == 0){
            return count(num/2, steps+1);
        }else{
            return count(num-1, steps+1);
        }
    }




        /* without recursion
        int count=0;
        if(num==0){
            return 0;
        }
        while(num>0){
            if(num%2==0){
                num /= 2;
                count++;
            }else{
                num -= 1;
                count++;
            }
        }
        return count;
        */
}