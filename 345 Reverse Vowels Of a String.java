class Solution {
    public String reverseVowels(String str) {

        int n=str.length();
        int last=n;
        StringBuilder s=new StringBuilder(str);

        for(int i=0;i<last;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                for(int j=last-1;j>=i;j--){
                    if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u'||s.charAt(j)=='A'||s.charAt(j)=='E'||s.charAt(j)=='I'||s.charAt(j)=='O'||s.charAt(j)=='U'){
                        char temp=s.charAt(j);
                        // System.out.println(i+""+s.charAt(i));
                        // System.out.println(j+""+s.charAt(j));

                        s.setCharAt(j,s.charAt(i));
                        s.setCharAt(i,temp);
                        // System.out.println(i+""+s.charAt(i));
                        // System.out.println(j+""+s.charAt(j));
                        // s.charAt(j)=;
                        // s.charAt(i)=temp;
                        last=j;
                        break;
                    }

                }
            }
        }

        return s.toString();
        
    }
}
