import java.util.Scanner;

public class Num3
{
    public Num3()
    {
        
    }
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
