package MathEasy;

import java.util.HashMap;
import java.util.Map;

class RomanInteger {

    public static void main(String[] args) {
        String n = "MCMXCIV";
        System.out.println(romanToInt(n));
    }

    static Map<String, Integer> values = new HashMap<>();
    
    static {
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);
    }

    public static int romanToInt(String s) {
        int sum = 0;

        int i = 0;

        while(i < s.length()) {
            String current = s.substring(i, i + 1);

            int currentValue = values.get(current);

            int nextValue = 0;

            if(i + 1 < s.length()) {
                String next = s.substring(i+1, i+2);
                nextValue = values.get(next);
            }

            if(currentValue < nextValue) {
                sum = sum + (nextValue - currentValue);
                i += 2;
            } else {
                sum += currentValue;
                i += 1;
            }
        }
        return sum;
    }
}