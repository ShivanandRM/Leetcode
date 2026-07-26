class Solution {
    public int maxVowels(String s, int k) {

        int count = 0;
        for(int i =0; i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
            int mCount = count;
            // slide the window
            for(int i = k;i<s.length();i++){
                // remove the left elememt from slide
                if(isVowel(s.charAt(i-k))){
                    count--;
                }

                // add next element to slide
                if(isVowel(s.charAt(i))){
                    count++;
                }

                if(count>mCount){
                    mCount = count;
                }
            }
            return mCount;
        
    }
    static boolean isVowel(char ch) {
        return ch =='a'|| ch =='e' || ch =='i' || ch == 'o' || ch == 'u';
    }
}