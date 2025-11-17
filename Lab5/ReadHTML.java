package DS.Lab5;

import java.io.*;
import java.util.Stack;
import java.util.regex.*;

public class ReadHTML {
    public static boolean readHTML(String filename){
        Stack<String> stack = new Stack<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            br.readLine();

            while((line = br.readLine()) != null){
                int start = 0;

                while ((start = line.indexOf('<', start)) != -1) {
                    int end = line.indexOf('>', start);
                    if (end == -1) {
                        System.out.println("Error: Missing '>' in line: " + line);
                        return false;
                    }
                
                    String tag = line.substring(start+ 1, end).trim();

                    if (tag.startsWith("!--")) {
                        start = end + 1;
                        continue;
                    }

                    if (tag.toUpperCase().startsWith("!DOCTYPE")) {
                        start = end + 1;
                        continue;
                    }

                    if (tag.endsWith("/")) {
                        start = end + 1;
                        continue;
                    }

                    if (tag.startsWith("/")) {
                        String closingTag = tag.substring(1);

                        System.out.println("\nFound an ending tag: " + closingTag);

                        if (stack.isEmpty()) {
                            System.out.println("No opening tag for: " + closingTag);
                            return false;
                        }

                        String openTag = stack.pop();

                        if (openTag.equals(closingTag)) {
                            System.out.println("The ending tag is correct");
                        } else {
                            System.out.println("The ending tag is NOT correct");
                            return false;
                        }

                        System.out.println("Current stack: " + stack);
                    }
                    else {
                        System.out.println("Pushing into stack: " + tag);
                        stack.push(tag);
                        System.out.println("\nCurrent Stack: " + stack);
                    }

                    start = end + 1;
                }
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
            return false;
        }

        if (!stack.isEmpty()) {
            System.out.println("Error: Missing closing tag for <" + stack.peek() + ">");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String file = "C:\\Users\\Dao Phang\\Documents\\Java\\DS\\Lab5\\sample.txt"; 
        if (readHTML(file)) {
            System.out.println("All tags are correct!");
        } else {
            System.out.println("HTML file has errors.");
        }
    }
}
