import java.util.*;

class Solution {
    public ArrayList solution(int[] progresses, int[] speeds) {
		Queue<Integer> daysQueue = new LinkedList<>();
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < progresses.length; i++) {
			int remainingWork = 100 - progresses[i];
			int days = (remainingWork % speeds[i] == 0) ? (remainingWork / speeds[i]) : (remainingWork / speeds[i] + 1);
			daysQueue.offer(days);
		}

		while (!daysQueue.isEmpty()) {
			int currentDay = daysQueue.poll(); // 작업 완료까지의 일자
			int count = 1; // 현재 배포 그룹의 작업 수

			while (!daysQueue.isEmpty() && daysQueue.peek() <= currentDay) {
				daysQueue.poll();
				count++;
			}
			result.add(count);
		}
		return result;
	}
}