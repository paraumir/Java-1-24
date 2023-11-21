package pr3_2;

public class TestBall
{
    public static void main(String[] args)
    {
        Ball ball = new Ball(3.0, 4.0);

        System.out.println("Мяч создан по координатам: " + ball);

        ball.setXY(5.0, 7.0);
        System.out.println("Координаты мяча: " + ball);

        ball.move(-2.0, 3.0);
        System.out.println("Координаты мяча: " + ball);
    }
}