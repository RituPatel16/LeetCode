class Solution {
    public boolean checkString(String s) {
        int i = 0;

        while(i < s.length() && s.charAt(i) == 'a'){
            i++;
        }

        for(int j = i; j < s.length(); j++){
            if(s.charAt(j) == 'a'){
                return false;
            }
        }

        return true;
    }
}