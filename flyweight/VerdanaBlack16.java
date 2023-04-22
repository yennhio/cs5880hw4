package flyweight;

import java.awt.Color;
import java.awt.Font;

public class VerdanaBlack16 implements Style {

    private String font;
    private String color;

    public VerdanaBlack16(String font, String color) {
        this.font = font;
        this.color = color;
    }

    @Override
    public Font getFont() {
        Font font = new Font("Verdana", Font.PLAIN, 16);   
        return font;    
    }

    @Override
    public Color getColor() {
        Color color = Color.BLACK;
        return color;
    }

    public String getDescription() {
        return "VerdanaBlack16";
    }
}
