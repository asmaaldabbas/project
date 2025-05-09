import java.util.Scanner;

  public class Abbreviation{
  public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int n = scanner.nextInt(); 
 scanner.nextLine(); 
 
  for (int i = 0; i < n; i++) {
    String word = scanner.nextLine();
              
  if (word.length() > 10) {
     String abbreviation = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
  System.out.println(abbreviation);
    } else {
       System.out.println(word);
}}}
  















}/*Sometimes some words like "localization" or "internationalization" are so long that writing them many times in one text is quite tiresome.

Let's consider a word too long, if its length is strictly more than 10 characters. All too long words should be replaced with a special abbreviation.

This abbreviation is made like this: we write down the first and the last letter of a word and between them we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.

Thus, "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".

Input
The first line contains an integer n (1 ≤ n ≤ 100). Each of the following n lines contains one word. All the words consist of lowercase Latin letters and possess the lengths of from 1 to 100 characters.

Output
Print n lines. The i-th line should contain the result of replacing of the i-th word from the input data */
