class Solution {
    public String solution(String[] seoul) {
        int idx = 0;
        int x = 0;
        for(String s : seoul){
            if(s.equals("Kim")) {
                x = idx;
            }
            idx++;
        }
        
        String answer = String.format("김서방은 " + x + "에 있다");

        return answer;
    }
}