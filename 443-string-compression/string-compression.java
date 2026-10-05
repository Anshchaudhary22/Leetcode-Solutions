class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int read = 0;

        while (read < chars.length) {

            char ch = chars[read];
            int count = 0;

            // Same character ka count nikalo
            while (read < chars.length && chars[read] == ch) {
                count++;
                read++;
            }

            // Character store karo
            chars[write++] = ch;

            // Agar count > 1 hai, to count ke digits store karo
            if (count > 1) {
                String s = String.valueOf(count);

                for (char c : s.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}
