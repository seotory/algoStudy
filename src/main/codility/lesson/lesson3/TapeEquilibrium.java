package codility.lesson.lesson3;

public class TapeEquilibrium {

    static public void main(String[] args) {
        System.out.println(solution(new int[]{1, -1, 7, 9, 9 ,10}));
    }

    static public int solution(int[] A) {

        int left = A[0];
        int right = 0;
        int min = 0;

        for (int i = 1; i < A.length; i++) {
            right += A[i];
        }
        min = Math.abs(left - right);

//         System.out.println("P = 0 difference = |" + left + " - " + right + "| = " + Math.abs(left - right));

        for (int i = 1; i < A.length - 1; i++) {
            left = left + A[i];
            right = right - A[i];
            min = Math.min(min, Math.abs(left - right));

//            System.out.println("P = " + i + ", difference = |" + left + " - " + right + "| = " + Math.abs(left - right));
        }

        return min;
    }

}
