import processing.core.PApplet;

public class FourBallsOops extends PApplet {

    public static final int WIDTH = 1080;
    public static final int HEIGHT = 720;
    public static final int DIAMETER = 20;
    balls ballOne, ballTwo, ballThree, ballFour;

    public static void main(String[] args) {
        PApplet.main("FourBallsOops", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ballOne = new BallOne();
        ballTwo = new BallTwo();
        ballThree = new BallThree();
        ballFour = new BallFour();
    }

    @Override
    public void draw() {
        drawCircle(ballOne);
        drawCircle(ballTwo);
        drawCircle(ballThree);
        drawCircle(ballFour);
    }

    private void drawCircle(balls currentBall) {
        ellipse(currentBall.speed, currentBall.HEIGHT, DIAMETER, DIAMETER);
//        System.out.println(currentBall.speed);
        currentBall.increaseSpeed();
    }
}
