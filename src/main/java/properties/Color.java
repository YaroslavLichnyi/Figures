package properties;

import java.util.Random;

public enum Color {
    RED ("красный"),
    BLUE ("синий"),
    YELLOW ("жёлтый"),
    GREEN ("зелёный"),
    WHITE ("белый"),
    BLACK ("чёрный");

    private String russianName;

    Color(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName(){
        return russianName;
    }

    public static Color getRandomColor() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
