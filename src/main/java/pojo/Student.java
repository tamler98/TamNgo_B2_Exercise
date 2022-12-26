package pojo;

public class Student {
    private Circle circle;
    private Retangle retangle;
    private Square square;

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public void setRetangle(Retangle retangle) {
        this.retangle = retangle;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public void drawCicle(String name, double radius) {
        circle.draw(name);
        System.out.print("draw a circle with radius = "+radius);
    }

    public void drawRetangle(String name, double height, double width) {
        retangle.draw(name);
        System.out.print("draw a retangle with height = "+height+ " and width = "+width);
    }

    public void drawSquare(String name,  double side) {
        square.draw(name);
        System.out.println("draw a square with side = "+side);
    }
}
