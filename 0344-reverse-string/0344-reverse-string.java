class Solution {
    public void reverseString(char[] s) {
        // int start = 0;
        // int end = s.length-1;
        // while(start<end){
        //     char temp = s[start];
        //     s[start] = s[end];
        //     s[end] = temp;

        //     start++;
        //     end--;
        // }



    // another technique

        for(int i =0;i<s.length/2;i++){
            int start = i;
            int end = s.length - 1 - i;
            
             swap(s, start, end);
        }
    }
    static void swap(char[] s,int start,int end){
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
       }
    
}