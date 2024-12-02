class Solution {
    public boolean solution(int x) {
        boolean answer = true;
  
        String[] stringX = String.valueOf(x).split("");
        int result = 0;
        
        for(int i = 0; i<stringX.length; i++) {
            result += Integer.parseInt(stringX[i]);    
        }
        
        if (x % result != 0) {
            answer = false;
        }
        
        return answer;
    }
}