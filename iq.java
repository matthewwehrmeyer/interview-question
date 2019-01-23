import java.util.Scanner;
/**
 * Write a description of class Num3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Num3
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class Num3
     */
    public Num3()
    {
        
    }

    /**
     * 
     *
     * 
     * 
     */
    public void com(String word1, String word2)
    {
        String outcome;
        int w1 = word1.length();
        int w2 = word2.length();
         
        if (w1 < w2) {
            outcome = "There has been an insertion edit"; 
        } else if (w1 > w2) {
            outcome = "There has been a removal edit";
        } else { 
            if (word1.compareTo(word2) == 0) {
                outcome = "There has been no edits";
            } else {
                outcome = "There has been a replacement edit";
            }
        }
        System.out.println(outcome);
        
    }
}
