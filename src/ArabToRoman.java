class ArabToRoman {
    public static String arabToRoman(int num) {
        var keys = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        var vals = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder a = new StringBuilder();
        int b = 0;
        while (b < keys.length) {
            while (num >= vals[b]) {
                var d = num / vals[b];
                num = num % vals[b];
                for (int i = 0; i < d; i++)
                    a.append(keys[b]);
            }
            b++;
        }
        return a.toString();
    }
}

