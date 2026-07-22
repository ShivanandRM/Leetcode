class Solution {
    public int heightChecker(int[] heights) {
        // get the expected array by using clone method. it cloned the heights array to 
        // expected array
        int[] expected = heights.clone();
        // perform the sorting technique
        sorting(expected);
        return compare(heights, expected);
    }

    static int compare(int[] heights, int[] expected) {
        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }
       
       

        static void sorting(int[] expected){
            for(int i = 0; i<expected.length - 1; i++){
                for(int j = i+1; j>0;j--){
                    if(expected[j]<expected[j-1]){
                        swap(expected, j, j-1);
                    }else{
                        break;
                    }
                }
            }
        }
        static void swap(int[] expected, int start, int end){
            int temp = expected[start];
            expected[start] = expected[end];
            expected[end] = temp;
        }

    
}