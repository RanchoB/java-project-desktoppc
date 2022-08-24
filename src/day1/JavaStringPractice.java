package day1;

import java.util.Arrays;

public class JavaStringPractice {
    public static void main(String[] args) {
        //System.out.println("Hello World");


        String sentence = "My name is Ajay Chaudharyldjfa lsdjfsoljfl sjdjfs ljdjfsure  and I am from Nepal.";
        System.out.println(sentence.length());
        System.out.println(sentence.charAt(25));

        char character = sentence.charAt(sentence.length()-1);

        System.out.println(character);

        String email = "  abcd@gmail.com  ";
        String sanitizedEmail = email.trim();
        System.out.print(sanitizedEmail);

        String sent = "             ";
        System.out.println("Empty:" + sent.isEmpty());
        System.out.println("Blank:" + sent.isBlank());
        System.out.println(sent.trim());

        String user1 = "Hari";
        String user2 = "hari";

        boolean same = user1.equalsIgnoreCase(user2);
        System.out.println(same);

        boolean isSame= user1.equals(user2);
        System.out.println(isSame);

        String sentence1 = "I am a boy; I like girl";


        String[] splittedSentence = sentence1.split(";");
        System.out.println(Arrays.toString(splittedSentence));

        System.out.println(splittedSentence[0]);
        System.out.println(splittedSentence[1].trim());

        //Another Exmaple

        String ANB = "12252 years";
        String[] splittedANB = ANB.split(" ");
        System.out.println(Arrays.toString(splittedANB));

        System.out.println(splittedANB[0]);
        System.out.println(splittedANB[1]);


    }
}






