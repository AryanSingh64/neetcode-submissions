class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arra = s.toCharArray();
        char[] arrb = t.toCharArray();
        Arrays.sort(arra);
        Arrays.sort(arrb);
        
        return Arrays.equals(arra,arrb);
    }
}
