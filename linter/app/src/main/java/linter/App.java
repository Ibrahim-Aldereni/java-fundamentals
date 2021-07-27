/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    // JavaScript Linter
    public static List<String> JsLinter(String pathName) {
        File file = new File(pathName);
        List<String> outputMessage = new ArrayList<String>();
        try {
            Scanner scanner = new Scanner(file);
            int lineCounter = 0;
            while (scanner.hasNextLine()) {
                lineCounter++;
                String nextLine = scanner.nextLine();
                if (!nextLine.endsWith(";") && !nextLine.endsWith("{") &&
                !nextLine.endsWith("}") && !nextLine.contains("else") && !nextLine.contains("if") &&
                !nextLine.isEmpty()) {
                    outputMessage.add("Line " + lineCounter + ": Missing semicolon");
                }
            }
        } catch (FileNotFoundException e) {
            outputMessage.add("file not found");
        }
        return outputMessage;
    }

    public static void main(String[] args) {
        // JavaScript Linter
        String path = "resources/empty.js";
        for (String s : JsLinter(path)) {
            System.out.println(s);
        }
        System.out.println(JsLinter(path));
    }
}
