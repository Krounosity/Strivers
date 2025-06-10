package DSA.Strings;

public class Is_Anagram {

    public boolean isAnagram(String s, String t) {
        int freq[] = new int[26];
        
        for(int i=0; i<s.length() && i<t.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int fr : freq){
            if(fr != 0) return false;
        }

        return s.length() == t.length();
    }

}
