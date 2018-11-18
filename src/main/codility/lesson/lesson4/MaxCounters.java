package codility.lesson.lesson4;

public class MaxCounters {

	public static void main(String[] args) {
		int[] result = solution(5, new int[]{3,4,4,6,1,4,4});
	}

	public static int[] solution(int N, int[] A) {

		int maxnum = 0;
		int savenum = 0;
		int[] scoreBoard = new int[N];

		for (int a : A) {
			int idx = a - 1;
			if (idx < N) {
				if(scoreBoard[idx] < maxnum) {
					scoreBoard[idx] = maxnum;
				}

				++scoreBoard[idx];

				if (savenum < scoreBoard[idx]) {
					savenum = scoreBoard[idx];
				}
			} else {
				maxnum = savenum;
			}
		}

		for (int i = 0 ; i < scoreBoard.length ; i++) {
			if (scoreBoard[i] < maxnum) {
				scoreBoard[i] = maxnum;
			}
		}

		return scoreBoard;
	}
}
