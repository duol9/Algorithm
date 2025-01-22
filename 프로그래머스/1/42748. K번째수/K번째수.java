import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i = 0;
        for (int[] command : commands) {
            int start = command[0];
            int end = command[1];
            int k = command[2];

            int[] indexing_array = Arrays.copyOfRange(array, start-1, end);
            Arrays.sort(indexing_array);
            answer[i++] = indexing_array[k-1];
        }
        return answer;
    }
}