class Solution {
    public int numSteps(String s) {
        int res = 0;
        int carry = 0;
        for(int i = s.length() - 1; i > 0; i--) {
            int ch = s.charAt(i) - '0';
            if(ch + carry == 1) {
                carry = 1;
                res++;
            }
            res++;
        }
        if(carry + s.charAt(0) - '0' ==2) {
            res++;
        }

        return res;
    }
}