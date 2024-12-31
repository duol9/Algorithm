import java.util.HashSet;
import java.util.Set;

// 중복 거르고 종류가 몇 개 담겨잇는지 알아야지
// 만약 종류가 배열 길이 / 2 보다 길다면... 배열길이/2을 리턴해

class Solution {
    public int solution(int[] nums) {
        Set<Integer> poketMon = new HashSet<>();
		for (int num : nums) {
			poketMon.add(num);
		}
		return Math.min(nums.length/2, poketMon.size());
    }
}