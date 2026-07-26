class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return " ";
        }
        // this is outer loop and treating out first string from array as referance 
        for(int i = 0 ; i<strs[0].length();i++){
            // taking each character at first index [0]
            char ch = strs[0].charAt(i);
            // Secod loop and it is comparing first string with next all strings
            for(int j=1;j<strs.length;j++){
            // returning substring
                if(i == strs[j].length() || strs[j].charAt(i) != ch){
                    return strs[0].substring(0,i);
                }
    
            }
        }
        return strs[0];
    }
}