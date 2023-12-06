import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < strArr.length; i++){
            if(map.containsKey(strArr[i].length())){
                map.put(strArr[i].length(), map.get(strArr[i].length()) + 1);
            }else{
                map.put(strArr[i].length(), 1);
            }
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

         for (Integer key : keySet) {
             return map.get(key);
        }
        return 0;
    }
}