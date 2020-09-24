import figures.*;
import properties.Color;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int figureNumber = scanFigureNumber();
        List<Figure> figures = new ArrayList<Figure>();
        for (int i = 0; i < figureNumber; i++) {
            int randomNumber = 1 + (int) (Math.random() * 4);
            Figure figure = null;
            switch (randomNumber){
                case 1:
                    figure = new Circle((double) (1 + (int) (Math.random() * 10)));
                    break;
                case 2:
                    figure = new Square((double) (1 + (int) (Math.random() * 10)));
                    break;
                case 3:
                    figure = new Trapezoid((double) (1 + (int) (Math.random() * 10)),
                            (double) (1 + (int) (Math.random() * 10)),
                            (double) (1 + (int) (Math.random() * 10))
                    );
                    break;
                case 4:
                    figure = new Triangle((double) (1 + (int) (Math.random() * 10)),
                                             (double) (1 + (int) (Math.random() * 10)));
                    break;
                default:
                    System.out.println("Ошибка генерации случайного числа");
                    break;
            }
            figure.setColor(Color.getRandomColor());
            figures.add(figure);
        }
        for (Figure figure: figures) {
            System.out.println(figure.toString());
        }
    }

    private static int scanFigureNumber(){
        while (true){
            System.out.println("Пожалуйста, введите количество фигур: ");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            Scanner scan = new Scanner(System.in);
            try {
                int figureNumber = scan.nextInt();
                return figureNumber;
            } catch (Exception e){
                System.out.println("Вам нужно ввести целое число.");
            }

        }
    }
}
