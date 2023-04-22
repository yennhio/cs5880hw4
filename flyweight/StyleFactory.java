package flyweight;

import java.util.HashMap;
import java.util.Map;

public class StyleFactory {

    private static Map<String, Style> styleObjects = new HashMap<>();

    public static Style getStyle(String description) {
        Style s = null;

        if (styleObjects.containsKey(description))
            s = styleObjects.get(description);
        else
        {
            switch(description)
            {
                case "ArialRed12":
                    s = new ArialRed12("Arial", "red");
                    break;
                case "CalibriBlue14":
                    s = new CalibriBlue14("Calibri", "blue");
                    break;
                case "HelveticaGreen18":
                    s = new HelveticaGreen18("Helvetica", "green");
                    break;
                case "VerdanaBlack16":
                    s = new VerdanaBlack16("Verdana", "black");
                    break;
                default:
                    System.out.println("Invalid");
            }
            styleObjects.put(description, s);
        }
        return s;
    }


    
}
