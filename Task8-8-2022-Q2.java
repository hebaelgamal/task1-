/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task882022q2;
import java.util.Scanner;
/**
 *
 * @author max
 */
public class Task882022Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            String variableName=input.nextLine();
            variableName = variableName.toLowerCase();
                    char[]charArray = variableName.toCharArray();
                    boolean foundSpace=true;
                    for(int i=0;i<charArray.length;i++){
        if(Character.isLetter(charArray[i])){
            if(foundSpace){
              charArray [i]= Character.toUpperCase(charArray[i]);
               foundSpace=false;
            }
        }
        else foundSpace=true;
        variableName = String.valueOf(charArray);
        variableName = variableName.replaceAll("\\s", "");
                System.out.println(variableName);
                
            }
        }
    }
                    
        // TODO code application logic here
    
    

