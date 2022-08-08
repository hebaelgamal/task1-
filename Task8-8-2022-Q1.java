
package task882022q1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
;

public class Task882022Q1 {

          
          


     public static void main(String [ ] args) throws FileNotFoundException {
              new Task882022Q1().findLongestWords();
         }

     public String findLongestWords() throws FileNotFoundException {

       String longestWord = "";
       String current;
       Scanner sc = new Scanner(new File("/home/students/test.txt"));


       while (sc.hasNext()) {
          current = sc.next();
           if (current.length() > longestWord.length()) {
             longestWord = current;
           }

       }
         System.out.println("\n"+longestWord+"\n");
            return longestWord;
            }
}
        
    
    

