package DS.Lab5;

import java.io.*;
import java.util.Stack;
import java.util.regex.*;

public class ReadHTML {
    public static boolean readHTML(String filename){
        Stack<String> stack = new Stack<>();
        Pattern tagPattern = Pattern.compile("<(/?)([a-zA-Z0-9]+)[^>]*?>");

        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dao Phang\\Documents\\Java\\DS\\Lab5\\sample.txt"))) {
            String line;
            int lineNumber = 0;
            

        } catch (Exception e) {
        }
    }
}
