class Solution {
    public boolean checkIfPangram(String sentence) {
        int [] feq = new int[26];

        Arrays.fill(feq,0);

        for(char c:sentence.toCharArray()){
            feq[c-'a']++;
        }

        for(int i=0;i<26;i++){
            if(feq[i]==0){
                return false;
            }
        }
        return true;
    }
}