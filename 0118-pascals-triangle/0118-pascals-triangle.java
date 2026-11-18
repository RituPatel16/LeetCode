class Solution {
    public List<List<Integer>> generate(int numRows) {

    List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<numRows;i++){
             List<Integer> list = new ArrayList<>();
             int ans =1;

            for(int j=0;j<=i;j++){
                list.add(ans);

                ans = ans*(i-j)/(j+1);
            }
            result.add(list);
        }
        return result;
    }
}   