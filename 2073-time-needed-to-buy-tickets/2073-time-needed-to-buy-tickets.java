class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        int i = 0;

        int n = tickets.length;

        int time = 0;

        while(true){

            if(tickets[k] == 0){
                return time;
            }

            if (i == n) {       
                i = 0;
            }

            if (tickets[i] > 0){  
                tickets[i]--;
                time++;
            }

            i++;
        }
    }
}