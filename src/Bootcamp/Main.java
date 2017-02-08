package Bootcamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Pig Latin Translator!");

        String answer = "";
        //loop to keep translating if the user enters "yes"
        do {
            //Prompt user to enter a word
            System.out.print("Enter a word to translate: ");
            String word = scan.next().toLowerCase();



            //translate the english word
            String translated = translate(word);

            //output translation
            System.out.println(translated);

            //prompt the user to continue
            System.out.println("Do you want to continue? yes/no ");

            //get the response, turn it lower case
            answer = scan.next().toLowerCase();
        } while (answer.equals("yes"));
        //scan.close();
    }

    public static String translate(String word) {
        //find the first vowel
        int vowel = findVowel(word);

        //if it's an invalid word
        if (vowel == -1) {
            System.out.println("Invalid word!");
        }
        if (vowel == 0) {
            System.out.println(word + "way");
        }else {
            String s = (word.substring(5, vowel)) + (word.substring(0, vowel)) + "ay")
            System.out.println(String s);
        }



        return word;
    }

    public static int findVowel(String englishWord) {

        //for loop i from pos 0 to 4 (or end of word)
        for (int pos = 0; pos < 4; pos++) {

            // use charAt to get the letter
            char vowel = englishWord.charAt(pos);

            //if it's 'a' or 'e' or 'i' or 'o' or 'u'
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {

                // return position(variable pos)
                return pos;
            }
        }
        //if no vowel is found
        return -1;
    }
}

