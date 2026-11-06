class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {

        int m = queries.length;
        int[] ans = new int[m];

        Arrays.sort(logs, (a,b) -> Integer.compare(a[1],b[1]));

        int[][] q = new int[m][2];

        for(int i=0;i<m;i++){
            q[i][0] = queries[i];
            q[i][1] = i;
        }

        Arrays.sort(q, (a,b) -> Integer.compare(a[0],b[0]));

        int[] freq = new int[n+1];
        int l=0, r=0, active=0;

        for(int[] query : q){

            int start = query[0]-x;
            int end = query[0];

            while(r<logs.length && logs[r][1]<=end){
                if(freq[logs[r][0]]++ == 0) active++;
                r++;
            }

            while(l<r && logs[l][1]<start){
                if(--freq[logs[l][0]] == 0) active--;
                l++;
            }

            ans[query[1]] = n-active;
        }

        return ans;
    }
}