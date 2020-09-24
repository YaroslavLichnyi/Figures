package figures;

public class Trapezoid extends Figure {
    private double height;
    private double topBase;
    private double bottomBase;

    public Trapezoid(double height, double topBase, double bottomBase) {
        this.height = height;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.area = calculateArea();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        area = calculateArea();
    }

    public double getTopBase() {
        return topBase;
    }

    public void setTopBase(double topBase) {
        this.topBase = topBase;
        area = calculateArea();
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public void setBottomBase(double bottomBase) {
        this.bottomBase = bottomBase;
        area = calculateArea();
    }

    public double calculateArea() {
        return 0.5 * (topBase + bottomBase) * height;
    }

    @Override
    public String toString() {
        return "Фигура: трапеция " +
                ", высота:" + height +
                "ед., верхнее основание:" + topBase +
                "ед., нижнее освнование:" + bottomBase +
                "ед., color=" + color.getRussianName() +
                ", цвет:" + area;
    }

    public void draw() {
        int width = 10;
        int rows = 10;
        for (int i = rows - 1; i >= 0; --i)
        {
            int blocks = width - i * 2;
            for (int j = 0; j < i; ++j)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < blocks; ++j)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
