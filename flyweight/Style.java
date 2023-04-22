package flyweight;

import java.awt.Color;
import java.awt.Font;

public interface Style {
    Font getFont();
    Color getColor();
    String getDescription();
}