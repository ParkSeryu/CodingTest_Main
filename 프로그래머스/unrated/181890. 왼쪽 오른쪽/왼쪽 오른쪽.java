
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer1 = {};
        int idx = 0;
        int breakIndex = 0;
        
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")){
                breakIndex = i;
                String[] answer = new String[breakIndex];
                for(int j = 0; j < breakIndex; j++){
                    answer[idx++] = str_list[j];
                }
                return answer;

            }else if(str_list[i].equals("r")){
                breakIndex = i;
                String[] answer = new String[str_list.length - breakIndex - 1];
                for(int j = breakIndex + 1; j < str_list.length; j++){
                    answer[idx++] = str_list[j];
                }
                return answer;
            }
        }
        return answer1;
    }
}