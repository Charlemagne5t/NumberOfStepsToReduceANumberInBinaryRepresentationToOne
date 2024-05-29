public class Solution {
    public int numSteps(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() != 1) {
            if (sb.charAt(sb.length() - 1) == '0') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                boolean extra = true;
                for (int i = sb.length() - 1; i >= 0; i--) {
                    if (sb.charAt(i) == '1') {
                        sb.setCharAt(i, '0');
                    } else {
                        sb.setCharAt(i, '1');
                        extra = false;
                        break;
                    }
                }
                if (extra) {
                    sb.insert(0, '1');
                }
            }
            count++;
        }
        return count;
    }
}
