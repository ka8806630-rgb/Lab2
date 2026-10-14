package lab2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int charCount = text.length();
        String[] words = text.trim().isEmpty() ? new String[0] : text.trim().split("\\s+");
        int wordCount = words.length;

        System.out.println("Characters count: " + charCount);
        System.out.println("Words count: " + wordCount);

        StringBuilder capLast = new StringBuilder();
        for (String w : words) {
            if (!w.isEmpty()) {
                if (w.length() == 1) {
                    capLast.append(w.toUpperCase());
                } else {
                    capLast.append(w.substring(0, w.length() - 1))
                            .append(Character.toUpperCase(w.charAt(w.length() - 1)));
                }
                capLast.append(" ");
            }
        }
        System.out.println("Capitalized last letter: " + capLast.toString().trim());

        String replacedText = text.replace('i', 'y').replace('I', 'Y');
        System.out.println("Replaced 'i' with 'y': " + replacedText);

        sc.close();
    }
}