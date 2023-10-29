import java.util.*;

class Solution {
    public long solution(String numbers) {
        String answer = "";
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
       while (numbers.length() > 0) {
            for (String word : map.keySet()) {
                if (numbers.startsWith(word)) {
                    answer += map.get(word);
                    numbers = numbers.substring(word.length());
                    break;
                }
            }
        }
        
        return Long.parseLong(answer);
    }
}