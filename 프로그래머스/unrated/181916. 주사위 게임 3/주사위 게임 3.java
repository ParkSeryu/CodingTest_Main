import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] dice = {-1, 0, 0, 0, 0, 0, 0};
        
        dice[a] += 1;
        dice[b] += 1;
        dice[c] += 1;
        dice[d] += 1;
        
        for(int i = 1; i <dice.length; i++){
            System.out.print(dice[i] + " ");
        }
        
        for(int i = 1; i < dice.length; i++){
            if(dice[i] == 4){
                return 1111 * i;
            }else if(dice[i] == 3){
                for(int j = 1; j < dice.length; j++){
                    if(dice[j] == 1){
                        return (10 * i + j) * (10 * i + j);
                    }
                }
            }else if(dice[i] == 2){
                int q = 0;
                for(int j = 1; j < dice.length; j++){
                    if(i == j) continue;
                    else if(dice[j] == 2){
                        return (i + j) * Math.abs(i - j);
                    }
                    
                    else if(dice[j] == 1){
                        if(q == 0){
                            q = j;
                        }else{
                            return q * j;
                        }
                        
                    }
                }
            }
        }
         for(int k = 1; k < dice.length; k++){
            if(dice[k] > 0){
                return k;
            }
         }
        return answer;
    }
}