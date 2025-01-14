import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder()); // 큰 수부터 꺼내기
        for (int priority : priorities) {
            queue.add(priority);
        }
        
        int answer = 0;

        while (!queue.isEmpty()) {
            for (int i=0; i < priorities.length; i++) {
                if (priorities[i] == queue.peek()) {
                    queue.poll();
                    answer++;   

                    if(i == location) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}