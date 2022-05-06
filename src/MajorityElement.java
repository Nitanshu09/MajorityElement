import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {
	public static int majorityElement(int[] nums) {
//		if (nums.length == 1) {
//			return nums[0];
//		}
//		int x = nums.length / 2;
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for (int i = 0; i < nums.length; i++) {
//			System.out.println("HashMap: " + map.toString());
////			if (map.getOrDefault(i, map.get(i) + 1) > x) {
//			if(map.) {
//				return i;
//			} else {
//				map.put(nums[i], 1);
//			}
//		}
//		return 1;
		if (nums.length == 1 || nums.length == 2) {
			return nums[0];
		}
		Arrays.sort(nums);
		int x = nums.length / 2;
		int l = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				l++;
				if (l >= x) {
					return nums[i];
				}
			} else if (nums[i] != nums[i + 1]) {
				l = 1;
			}
		}
		return l;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 3, 4 };
		System.out.println(majorityElement(arr));
	}

}
