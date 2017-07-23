package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // test your code here

        File file = new File("src/shortList.txt");
        // all words are in file src/wordList.txt
        WordInspection w = new WordInspection(file);
        int t = w.wordCount();
        System.out.println(t);
        List<String> z = w.wordsEndingInL();
        System.out.println(z.size());

    }
}
