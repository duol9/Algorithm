import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minQue = new PriorityQueue<>();
        PriorityQueue<Integer> maxQue = new PriorityQueue<>(Collections.reverseOrder());

		for (String operation : operations) {
			String[] str = operation.split(" ");
			char op = str[0].charAt(0);
			int num = Integer.parseInt(str[1]);
			switch (op) {
				case 'I':
					minQue.add(num);
					maxQue.add(num);
					break;
				case 'D':
					if (num == -1 && !minQue.isEmpty()) { //최소값 삭제
						int del = minQue.poll();
						maxQue.remove(del);
					}
					if (num == 1 && !maxQue.isEmpty()) { //최대값 삭제
						int del = maxQue.poll();
						minQue.remove(del);
					}
			}
		}
        int min = minQue.isEmpty() ? 0 : minQue.poll();
        int max = maxQue.isEmpty() ? 0 : maxQue.poll();

        return new int[]{max, min};
    }
}