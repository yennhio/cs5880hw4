package flyweight;

import java.awt.Color;
import java.awt.Font;

public class ArialRed12 implements Style {

    private String font;
    private String color;

    public ArialRed12(String font, String color) {
        this.font = font;
        this.color = color;
    }
    
    @Override
    public Font getFont() {
        Font font = new Font("Arial", Font.PLAIN, 12);
        return font;
    }

    @Override
    public Color getColor() {
        Color color = Color.RED;
        return color;
    }

    public String getDescription() {
        return "ArialRed12";
    }

}
