class Solution {
    public boolean isValid(String s) {
        //build a stack
        //add all into it
        //chk condition
        //if start and not end return false
        //chk the order 
        Stack<Character> st = new Stack<>();
        //hashmap
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(char c : s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                // 
                //if c = ( the map.get(c) => )
                if(top != map.get(c)){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}