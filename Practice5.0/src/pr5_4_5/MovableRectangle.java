package pr5_4_5;

class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(
            int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);

        if (!hasSameSpeed(topLeft, bottomRight)) {
            throw new IllegalArgumentException("Обе точки должны двигаться одинаково.");
        }
    }

    private boolean hasSameSpeed(MovablePoint p1, MovablePoint p2) {
        return p1.xSpeed == p2.xSpeed && p1.ySpeed == p2.ySpeed;
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "Top Left: " + topLeft + ", Bottom Right: " + bottomRight;
    }
}
