class MaxParaNest {
    public int maxDepth(String s) {
        int opened = 0;
        int res = 0;
        
        for(char ch : s.toCharArray()){
            if(ch == '(') opened++;
            else if(ch == ')') opened--;
            res = Math.max(res,opened);
        }   

        return res;
    }
}