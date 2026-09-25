class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();


        int left = 0;

        int maxlength = 0;

        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);

            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
           
                set.add(ch);
                maxlength = Math.max(maxlength, i - left + 1);
            

            
        }

        return maxlength;
    }
}