package DSA.Strings;

public class Longest_Common_Prefix {

   public String longestCommonPrefix(String[] strs) {

       StringBuilder res = new StringBuilder(strs[0]);
       for(int i=1; i<strs.length; i++){
           int right = 0;
           for(right = 0; right < res.length() && right < strs[i].length(); right++){
               if(strs[i].charAt(right) != res.charAt(right)) break;
           }
           res.setLength(right);
       }
       return res.toString();

   }
   
}
