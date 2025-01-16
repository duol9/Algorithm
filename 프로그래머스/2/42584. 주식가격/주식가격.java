import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> queue = new LinkedList<>();
        
        // 일단 큐에 다 넣자..
        for (int price : prices) {
            queue.offer(price);
        }
        
        for (int i=0; i<prices.length; i++) {
            int current = queue.poll();
            for (int q : queue) {
                if (current > q) { // 현재 가격보다 낮은 가격이 있다면
                    answer[i]++;
                    break;
                }
                if (current <= q) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}