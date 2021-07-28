/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test public void testJsLinter(){
        //no errors
        //input
        String path = "E:\\Coding\\LTUC Course\\401\\java-fundamentals\\linter\\resources\\no-errors.js";
        //output
        List<String> outputMessage = new ArrayList<String>();

        assertEquals(outputMessage,App.JsLinter(path),"this method return string with error if semicolon is missing");

        //one error
        //input
        String path2 = "E:\\Coding\\LTUC Course\\401\\java-fundamentals\\linter\\resources\\one-error.js";
        //output
        List<String> outputMessage2 = Arrays.asList("Line 7: Missing semicolon");

        assertEquals(outputMessage2,App.JsLinter(path2),"this method return string with error if semicolon is missing");

        //few errors
        //input
        String path3 = "E:\\Coding\\LTUC Course\\401\\java-fundamentals\\linter\\resources\\few-errors.js";
        //output
        List<String> outputMessage3 = Arrays.asList("Line 1: Missing semicolon","Line 7: Missing semicolon");

        assertEquals(outputMessage3,App.JsLinter(path3),"this method return string with error if semicolon is missing");

        //many errors
        //input
        String path4 = "E:\\Coding\\LTUC Course\\401\\java-fundamentals\\linter\\resources\\many-errors.js";
        //output
        List<String> outputMessage4 = Arrays.asList("Line 1: Missing semicolon", "Line 7: Missing semicolon", "Line 8: Missing semicolon", "Line 9: Missing semicolon", "Line 10: Missing semicolon", "Line 11: Missing semicolon", "Line 12: Missing semicolon");

        assertEquals(outputMessage4,App.JsLinter(path4),"this method return string with error if semicolon is missing");

        //empty file
        //input
        String path5 = "E:\\Coding\\LTUC Course\\401\\java-fundamentals\\linter\\resources\\empty.js";
        //output
        List<String> outputMessage5 = new ArrayList<String>();

        assertEquals(outputMessage5,App.JsLinter(path5),"this method return string with error if semicolon is missing");
    }
}
