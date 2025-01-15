import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int sum = 0; // 다리에 있는 트럭 무게 합

        Queue<Integer> queue = new LinkedList<>();
        // 큐에 담아야 하는데. 큐 합이 10을 넘으면 안된다 맞나..
        for (int truck_weight: truck_weights) {
            while (true) {
                if (queue.isEmpty()) { // 다리에 트럭 없어
                    queue.offer(truck_weight);
                    sum += truck_weight;
                    time++;
                    break;
                } else if (queue.size() == bridge_length) { // 다리에 트럭 꽉 참
                    sum -= queue.poll();
                } else { // 다리에 트럭이 덜 참
                    if (sum + truck_weight <= weight) { // 이번 트럭 포함해도 덜 참
                        queue.offer(truck_weight);
                        sum+=truck_weight;
                        time++;
                        break;
                    } else { // 이번 트럭 포함하면 무게 초과함
                        queue.offer(0);
                        time++;
                    }
                }
            }
        }
        return time + bridge_length;
    }
}