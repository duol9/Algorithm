import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int sco : scoville) { // 힙에 넣어
            heap.add(sco);
        }
        
        while(heap.peek() < K) { // 스코빌 지수가 k보다 작으면
            if(heap.size() == 1) return -1; // 모든 음식 스코빌 지수를 K 이상으로 만들 수 없어
            heap.add(heap.poll() + heap.poll() * 2); 
            answer++;
        }
        
        return answer;
    }
}