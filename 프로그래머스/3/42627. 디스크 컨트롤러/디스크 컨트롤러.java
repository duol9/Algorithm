import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (Comparator.comparingInt(o -> o[0]))); // 요청시점 오름차순
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[1])); // 작업 시간 순 오름차순

        int count = 0; // 총 작업 개수
        int currentTime = 0; // 현재 시간
        int totalWaitingTime = 0; // 기다린 시간
        int index = 0; // 작업 순서

        while (jobs.length > count) { // 작업 전부 완료 할 떄까지
            while (index < jobs.length && currentTime >= jobs[index][0]) { 
                queue.offer(jobs[index++]);
            }
            if (queue.isEmpty()) { // 처리할 작업이 없으면 다음 작업으로 이동
                currentTime = jobs[index][0];
            }
            
            // 작업 수행
            int[] job = queue.poll();
            if (job == null) continue;
            
            currentTime += job[1];
            totalWaitingTime += currentTime - job[0];
            count++;
        }
        return totalWaitingTime / jobs.length;
    }
}