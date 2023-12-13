class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String C = A;
        if(C.equals(B)) return 0;
        for(int i = 0; i < A.length(); i++){
            C = C.substring(C.length() - 1) + C.substring(0, C.length() - 1); 
            if(C.equals(B)){
                return i + 1;
            }
        }
        
        return answer;
    }
}