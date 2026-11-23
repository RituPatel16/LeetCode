class Solution {
    public String gcdOfStrings(String str1, String str2) {

        int n1 = str1.length();
        int n2 = str2.length();

        int p1 = 0;
        int p2 = 0;

        StringBuilder sb = new StringBuilder();

        int min = Math.min(n1, n2);

        for (int i = 0; i < min; i++) {

            if (str1.charAt(p1) == str2.charAt(p2)) {
                sb.append(str1.charAt(p1));
                p1++;
                p2++;
            } else {
                break;
            }
        }

        String ans = sb.toString();

        for (int i = ans.length(); i > 0; i--) {

            String temp = ans.substring(0, i);

            if (n1 % i == 0 && n2 % i == 0) {

                if (temp.repeat(n1 / i).equals(str1) &&
                        temp.repeat(n2 / i).equals(str2)) {

                    return temp;
                }
            }
        }

        return "";

    }
}