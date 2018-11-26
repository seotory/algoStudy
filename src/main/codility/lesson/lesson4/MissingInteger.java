package codility.lesson.lesson4;

import java.util.HashMap;
import java.util.Map;

public class MissingInteger {

	static public void main(String[] args) {
		solution(new int[]{1, 3, 6, 4, 1, 2}); // = 5
	}

	static public int solution(int[] A) {
		Map<Integer, Boolean> map = new HashMap();
		int max = 1;

		for (int a : A) {
			if (a > 0) {
				map.put(a,true);
				if (max < a) {
					max = a;
				}
			}
		}

		for (int i=1 ; i <= max ; i++) {
			if (max == i && map.containsKey(i)) {
				return i+1;
			}
			if (!map.containsKey(i)){
				return i;
			}
		}
		return 1;
	}

}
