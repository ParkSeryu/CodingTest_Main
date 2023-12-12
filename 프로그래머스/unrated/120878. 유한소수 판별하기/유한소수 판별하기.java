import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        
        for(int i = 1; i <= Math.min(a,b); i++){
            if(a % i == 0 && b % i == 0){
                a /= i;
                b /= i;
            }
        }
        
        for(int i = 2; i <= b; i++){
            while(b % i == 0){
                b /= i;
                if( ! (i == 2 || i == 5) ) {
                    return 2;
                }
            }
        }
        
        
        return answer;
    }
}