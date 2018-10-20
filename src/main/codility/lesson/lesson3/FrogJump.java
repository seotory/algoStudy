package codility.lesson.lesson3;

public class FrogJump {
    /**
     * @param X : 최초 개구리의 위치
     * @param Y : Y보다 크거나 같은 위치로 가고 싶어함
     * @param D : 개구리는 항상 고정된 D의 값으로 점프를 함
     * @return
     */
    public int solution(int X, int Y, int D) {
        return (int)(Math.ceil(((double)Y-(double)X)/(double)D));
    }
}
