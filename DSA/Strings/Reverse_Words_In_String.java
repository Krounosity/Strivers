package DSA.Strings;

public class Reverse_Words_In_String {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        for(int i=0; i<words.length/2; i++){
            String temp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = temp;
        }

        return String.join(" ",words);
    }
}
