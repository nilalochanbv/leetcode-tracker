// Last updated: 7/9/2026, 9:49:54 AM
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        int n = s.length();

        // IP address must be split into 4 parts
        for (int i = 1; i < 4 && i < n; i++) {
            for (int j = i + 1; j < i + 4 && j < n; j++) {
                for (int k = j + 1; k < j + 4 && k < n; k++) {
                    String a = s.substring(0, i);
                    String b = s.substring(i, j);
                    String c = s.substring(j, k);
                    String d = s.substring(k);

                    if (isValid(a) && isValid(b) && isValid(c) && isValid(d)) {
                        res.add(a + "." + b + "." + c + "." + d);
                    }
                }
            }
        }
        return res;
    }

    private boolean isValid(String part) {
        if (part.length() > 1 && part.startsWith("0")) return false; // no leading zeros
        if (part.isEmpty() || part.length() > 3) return false;
        int val = Integer.parseInt(part);
        return val >= 0 && val <= 255;
    }
}
