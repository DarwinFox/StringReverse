import java.util.Scanner;

/**
 * Created by Home on 11/11/15.
 */
public class StringReverse {


    public static void main(String[] args) {
        String wordToReverse;

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a word to reverse please: ");
        wordToReverse = scan.next();
        WordReverser word = new WordReverser();
        wordToReverse = word.Reverse(wordToReverse);

        System.out.println("The word you entered to reverse is: " + wordToReverse);

    }
}
