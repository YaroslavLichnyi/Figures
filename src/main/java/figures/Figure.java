package figures;


import properties.Color;
import properties.Drawable;

public abstract class Figure implements Drawable {
    protected Color color;
    protected double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

     public abstract double calculateArea();
}
