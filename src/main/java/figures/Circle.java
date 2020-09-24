package figures;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        area = calculateArea();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        area = calculateArea();
    }

    public double calculateArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Фигура: круг" +
                ", радиус:" + radius +
                " ед., цвет:=" + color.getRussianName() +
                ", площадь:=" + area + " кв. ед.";
    }

    public void draw() {
        int a = 10;
        int b = 10;
        int x = 5 - a;
        int y = 15 - b;
        int xSquared = (x - a)*(x - a);
        int ySquared = (y - b)*(y - b);
        for (int i = 0;i <=20; i++) {
            for (int j = 1;j <=20; j++) {
                if (Math.abs(xSquared) + (ySquared) >= radius*radius && Math.abs(xSquared) + (ySquared) <= radius*radius) {
                    System.out.println("#");
                } else {
                    System.out.println(" ");
                }
            }

        }
    }
}
