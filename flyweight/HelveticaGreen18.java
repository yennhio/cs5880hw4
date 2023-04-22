package flyweight;

import java.awt.Color;
import java.awt.Font;

public class HelveticaGreen18 implements Style {

    private String font;
    private String color;

    public HelveticaGreen18(String font, String color) {
        this.font = font;
        this.color = color;
    }

    @Override
    public Font getFont() {
        Font font = new Font("Helvetica", Font.PLAIN, 18);   
        return font;    
    }

    @Override
    public Color getColor() {
        Color color = Color.GREEN;
        return color;
    }

    public String getDescription() {
        return "HelveticaGreen18";
    }
}
