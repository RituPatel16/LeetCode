class Solution {
    public String makeGood(String s) {
        ArrayList<Character> charr = new ArrayList<>();

        for (char ch : s.toCharArray()) {

            if (charr.isEmpty()) {
                charr.add(ch);
            } else {
                char last = charr.get(charr.size() - 1);

                if (last + 32 == ch || last - 32 == ch) {
                    charr.remove(charr.size() - 1);
                } else {
                    charr.add(ch);
                }
            }
        }

        StringBuilder ans = new StringBuilder();

        for (char ch : charr) {
            ans.append(ch);
        }

        return ans.toString();
    }
}