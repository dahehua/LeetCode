
public class lengthOfLongestSubstring {
    
    public static int solution(String s) {
        //StringBuilder s1 = new StringBuilder(s);
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        int length = 0;
        int start = 0;
        if(c.length == 0) {
            return 0;
        }
        else {
            //sb.append(c[0]);
            for(int i=0; i<c.length; i++) {
                String c1 = String.valueOf(c[i]);

                if(sb.indexOf(c1) == -1){
                    sb.append(c1);
                }
                else{
                    if(sb.length() > length){
                        length = sb.length();
                    }
                    start = sb.indexOf(c1);
                    String s2 = sb.substring(start+1, sb.length());
                    sb = new StringBuilder();
                    sb.append(s2);
                    sb.append(c1);
                    // sb.delete(0, sb.length());
                    // for(int j=start+1; j<=i; j++){
                    //     sb.append(c[j]);
                    // }
                }

            }
            if(sb.length() > length){
                length = sb.length();
            }
        }
        return length;
    }



    public static void main(String[] args) {
        String s = new String(" ");
        StringBuilder sb = new StringBuilder(s);
        //String s1 = sb.substring(1,8);
        System.out.println(solution(s));
    }
        
}
