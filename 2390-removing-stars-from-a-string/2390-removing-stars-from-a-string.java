class Solution {
    public String removeStars(String s) {
        ArrayList<Character> charr = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                charr.remove(charr.size() - 1);
            } else {
                charr.add(ch);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : charr) {
            sb.append(ch);
        }

        return sb.toString();
    }
}