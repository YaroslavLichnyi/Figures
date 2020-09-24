package figures;

public class Square extends Figure{
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
        area = calculateArea();
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
        area = calculateArea();
    }

    public double calculateArea() {
        return Math.pow(sideLength, 2);
    }

    @Override
    public String toString() {
        return "Фигура: квадрат" +
                ", сторона:" + sideLength +
                " ед., цвет:" + color.getRussianName() +
                ", площадь:" + area + " кв. ед.";
    }

    public void draw() {
        for (int i=0; i < (int)sideLength; i++){
            for (int j=0; j < (int)sideLength; j++){
                System.out.println("*");
            }
        }
    }
}
