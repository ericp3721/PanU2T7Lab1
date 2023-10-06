import java.util.Scanner;
public class U2T7Lab1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String word1 = scan.nextLine();
        System.out.print("Enter second string: ");
        String word2 = scan.nextLine();
        if (word1.length() > word2.length()) {
            System.out.println(word1 + " is longer");
        } else if (word1.length() == word2.length()){
            System.out.println("Both strings have the same length");
        }else {
                System.out.println(word2 + " is longer");
        }
        int start = word1.length() / 2;
        String firstWordHalf = word1.substring(0,start);
        String firstWordEnd = word1.substring(start);
        System.out.println("First half: " + firstWordHalf);
        System.out.println("Second half: " + firstWordEnd);
        int start2 = word2.length() / 2;
        String secondWordHalf = word2.substring(0,start2);
        String secondWordEnd = word2.substring(start2);
        System.out.println("First half: " + secondWordHalf);
        System.out.println("Second half: " + secondWordEnd);
        if (word1.indexOf(word2) != -1){
            System.out.println(word2 + " is found in " + word1 + " at index " + (word1.indexOf(word2)));
        }else {
            System.out.println(word2 + " is NOT found in " + word1);
        }
    }
}
