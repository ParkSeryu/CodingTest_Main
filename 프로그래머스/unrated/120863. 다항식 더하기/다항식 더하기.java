class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] temp = polynomial.split(" ");
        int x = 0;
        int su = 0;
        for(int i = 0; i < temp.length; i++){
            String t = "";
            if(temp[i].contains("x")){
                if(temp[i].charAt(0) == 'x'){
                    x += 1;
                }else{
                    for(int j = 0; j < temp[i].length() - 1; j++){
                        t += temp[i].charAt(j);
                    }
                    x += Integer.parseInt(t);
                }
            }else if(!temp[i].equals("+")){
                su += Integer.parseInt(temp[i]);
            }
        }
        
        if(su > 0 && x > 0){
            if(x == 1){
                answer = "x" + " + " + String.valueOf(su);    
            }else
            answer = String.valueOf(x) + "x" + " + " + String.valueOf(su);    
        }
        else if(su > 0){
            answer = String.valueOf(su);    
        }
        else{
             if(x == 1){
                answer = "x";    
            }else
            answer = String.valueOf(x) + "x";
        }
        
        
        
        
        return answer;
    }
}