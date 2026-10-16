import java.util.HashMap;
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0) +1);
        } 
        int length = 0;
        boolean hasOdd = false;
        for(int count : map.values()) {
            length += (count/2) *2;
            if(count%2==1) {
                hasOdd = true;
            }
        }
        if(hasOdd) {
            length++;
        }
        return length;
    }
}