package figures;

public class Triangle extends Figure{
    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
        area = calculateArea();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        area = calculateArea();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        area = calculateArea();
    }

    public double calculateArea() {
        return (width*height)/2;
    }

    @Override
    public String toString() {
        return "Фигура: треугольник" +
                ", ширина:" + width +
                " ед., высота:" + height +
                " ед., цвет:" + color.getRussianName() +
                ", площадь:" + area + "кв. ед.";
    }

    public void draw() {
        for (int i = 1; i <= (int)width; i++) {
            for (int j = (int)width; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
