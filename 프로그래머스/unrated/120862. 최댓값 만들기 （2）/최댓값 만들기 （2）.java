import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Integer[] conv = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(conv, Collections.reverseOrder());
        int a = conv[0] * conv[1];
        int b = conv[conv.length - 1] * conv[conv.length - 2];
        return a > b ? a : b;

    }
}