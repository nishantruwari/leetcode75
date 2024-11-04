class Solution {
    public String mergeAlternately(String word1, String word2) {

        int n=word1.length();
        int m=word2.length();
        StringBuilder str=new StringBuilder();
        int i;
        for( i=0;i<Math.min(m,n);i++){
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));

        }

        if(i==n){
            for(;i<m;i++){
            str.append(word2.charAt(i));
            }

        }else{
            for(;i<n;i++){
            str.append(word1.charAt(i));
            }
        }

        return str.toString();
        
    }
}
