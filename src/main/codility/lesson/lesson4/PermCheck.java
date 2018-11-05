package codility.lesson.lesson4;

public class PermCheck {

    static public void main(String[] args) {
        solution(new int[]{1, 5, 2, 4});
    }

    static public int solution(int[] A) {
        int[] tmp = new int[A.length];
        for (int i : A) {
            if (i <= A.length) {
                tmp[i - 1] = 1;
            }
        }
        int sum = 0;
        for (int i : tmp) {
            sum += i;
        }
        return sum == A.length ? 1 : 0;
    }
}
