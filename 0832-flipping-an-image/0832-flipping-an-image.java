class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int left=0;
            int right=image[i].length-1;

            while(left<right){
                swap(image[i], left, right);

                image[i][left] = 1-image[i][left];
                image[i][right] = 1-image[i][right];

                left++;
                right--;
            }
            if(left==right){
                image[i][left] = 1-image[i][left];
            }
        }
        return image;
    }
    static void swap(int[] arr, int left, int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}