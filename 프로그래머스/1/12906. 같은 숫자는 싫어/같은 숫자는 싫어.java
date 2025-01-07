import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public List<Integer> solution(int[] arr) {
		return IntStream.range(0, arr.length)
			.filter(i -> i == 0 || arr[i] != arr[i - 1])
			.mapToObj(i -> arr[i])
			.collect(Collectors.toList());
	}
}