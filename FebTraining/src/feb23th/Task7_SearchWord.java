 package feb23th;

 import java.io.BufferedReader;
 import java.io.FileReader;
 import java.io.IOException;
 import java.util.Scanner;

 public class Task7_SearchWord {
     public static void main(String[] args) throws IOException {

         Scanner sc = new Scanner(System.in);
         System.out.print("Enter word to search: ");
         String word = sc.nextLine();

         BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
         String line;
         int lineNumber = 1;

         while ((line = br.readLine()) != null) {
             if (line.contains(word)) {
                 System.out.println("Word found at line: " + lineNumber);
             }
             lineNumber++;
         }

         br.close();
         sc.close();
     }
 }