package DSA.Trie.ImplementTrie;

public class Trie {

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {

        TrieNode curr = root;
        for(char ch: word.toCharArray()){
            if(curr.childChars[ch - 'a'] == null){
                curr.childChars[ch - 'a'] = new TrieNode();
            }

            curr = curr.childChars[ch - 'a'];
        }

        curr.endString = true;
        
    }
    
    public boolean search(String word) {
        TrieNode curr = root;
        for(char ch : word.toCharArray()){
            if(curr.childChars[ch - 'a'] == null) return false;

            curr = curr.childChars[ch - 'a'];
        }

        return curr.endString;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for(char ch : prefix.toCharArray()){
            if(curr.childChars[ch - 'a'] == null) return false;

            curr = curr.childChars[ch - 'a'];
        }

        return true;
    }
}