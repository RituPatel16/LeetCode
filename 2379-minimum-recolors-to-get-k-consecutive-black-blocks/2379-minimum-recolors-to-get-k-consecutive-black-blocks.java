class Solution {
    public int minimumRecolors(String blocks, int k) {
        int w = 0, min = 0;

        for(int i = 0; i < k; i++){
            if(blocks.charAt(i) == 'W'){
                w++;
            }
        }

        min = w;

        for(int i = k; i < blocks.length(); i++){

            if(blocks.charAt(i - k) == 'W'){
                w--;
            }

            if(blocks.charAt(i) == 'W'){
                w++;
            }
            

            min = Math.min(w,min);
        }

        return min;
    }
}