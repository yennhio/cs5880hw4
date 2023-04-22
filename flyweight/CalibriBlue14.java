package flyweight;

import java.awt.Color;
import java.awt.Font;

public class CalibriBlue14 implements Style {

    private String font;
    private String color;

    public CalibriBlue14(String font, String color) {
        this.font = font;
        this.color = color;
    }

    @Override
    public Font getFont() {
        Font font = new Font("Calibri", Font.PLAIN, 14);   
        return font;    
    }

    @Override
    public Color getColor() {
        Color color = Color.BLUE;
        return color;
    }

    public String getDescription() {
        return "CalibriBlue14";
    }
}
