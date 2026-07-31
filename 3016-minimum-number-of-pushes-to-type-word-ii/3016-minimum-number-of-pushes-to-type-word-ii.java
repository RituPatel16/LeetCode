class Solution {
    public int minimumPushes(String word) {
        int freq[] = new int[26];

        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            freq[idx]++;
        }
        Arrays.sort(freq);

        int index = 0;
        int res = 0;

        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0)
                break;

            res += (index / 8 + 1) * freq[i];
            index++;
        }
        return res;

    }
}