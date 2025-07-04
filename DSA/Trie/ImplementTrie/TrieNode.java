package DSA.Trie.ImplementTrie;

public class TrieNode{
    TrieNode[] childChars;
    boolean endString;

    public TrieNode(){
        childChars = new TrieNode[26]; // One for each character
        endString = false; 
    }
}
