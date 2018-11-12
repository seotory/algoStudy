package codility.lesson.lesson4;

public class FrogRiverOne {

	static public void main(String[] args) {
		System.out.println(solution(3, new int[]{1,4,3,3,1,2}));
	}

	static public int solution(int X, int[] A) {
		int[] tmp = new int[X];
		int leefs = 0;
		for (int i = 0 ; i<A.length ; i++) {
			int ps = A[i];
			if (ps <= X) {
				if (tmp[ps-1] == 0) {
					tmp[ps-1] = 1;
					leefs++;
					if (leefs == X) {
						return i;
					}
				}
			}
		}
		if (leefs != X) {
			return -1;
		}
		return 0;
	}
}
