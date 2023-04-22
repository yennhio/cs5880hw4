package flyweight;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextEditor {

    public static void main(String[] args) {

        Style style1 = StyleFactory.getStyle("ArialRed12");
        Style style2 = StyleFactory.getStyle("CalibriBlue14");
        Style style3 = StyleFactory.getStyle("VerdanaBlack16");
        Style style4 = StyleFactory.getStyle("HelveticaGreen18");
        Style style5 = StyleFactory.getStyle("CalibriBlue14");



        File file = new File("/Users/yennhidang/Documents/cpp/swe/hw4/flyweight/text.doc");

        try {
            FileWriter writer = new FileWriter(file);

            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("<html>");
            bufferedWriter.write("<font face='" + style1.getFont().getName() + "' color='" + toHexString(style1.getColor()) + "' size='" + style1.getFont().getSize() + "'>");
            bufferedWriter.write("HelloWorldCS5800");
            bufferedWriter.write("</font>");

            bufferedWriter.write("<br>");

            bufferedWriter.write("<font face='" + style2.getFont().getName() + "' color='" + toHexString(style2.getColor()) + "' size='" + style2.getFont().getSize() + "'>");
            bufferedWriter.write("HelloWorldCS5800");
            bufferedWriter.write("</font>");

            bufferedWriter.write("<br>");

            bufferedWriter.write("<font face='" + style3.getFont().getName() + "' color='" + toHexString(style3.getColor()) + "' size='" + style3.getFont().getSize() + "'>");
            bufferedWriter.write("HelloWorldCS5800");
            bufferedWriter.write("</font>");

            bufferedWriter.write("<br>");

            bufferedWriter.write("<font face='" + style4.getFont().getName() + "' color='" + toHexString(style4.getColor()) + "' size='" + style4.getFont().getSize() + "'>");
            bufferedWriter.write("HelloWorldCS5800");
            bufferedWriter.write("</font>");

            bufferedWriter.write("<br>");

            bufferedWriter.write("<font face='" + style5.getFont().getName() + "' color='" + toHexString(style5.getColor()) + "' size='" + style5.getFont().getSize() + "'>");
            bufferedWriter.write("Repeated style: HelloWorldCS5800");
            bufferedWriter.write("</font>");
            bufferedWriter.write("</html>");

            bufferedWriter.flush();
            bufferedWriter.close();

            System.out.println("Text written to file successfully and doc saved successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        System.out.println(loadDocument("/Users/yennhidang/Documents/cpp/swe/hw4/flyweight/text.doc"));

    }

    private static String toHexString(Color color) {
        return String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
    }

    public static String loadDocument(String fileName) {
        String content = "";
        try {
            File file = new File(fileName);
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content += line + "\n";
            }
            bufferedReader.close();
            System.out.println("Document loaded successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while loading the document.");
            e.printStackTrace();
        }
        return content;
    }
    
}
