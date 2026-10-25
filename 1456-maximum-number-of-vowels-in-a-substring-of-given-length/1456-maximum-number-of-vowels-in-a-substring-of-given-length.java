class Solution {

    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public int maxVowels(String s, int k) {

        int vowel = 0, max = 0;
        
        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i))){
                vowel++;
            }
        }

        max = vowel;

        for(int i = k; i < s.length(); i++){
            if (isVowel(s.charAt(i - k))) vowel--;
            if (isVowel(s.charAt(i))) vowel++;

            max = Math.max(vowel,max);
        }

        return max;
    }
}