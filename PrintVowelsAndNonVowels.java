import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    String stringAnalysis = "";
    int vowelACount = 0;
    int vowelECount = 0;
    int vowelICount = 0;
    int vowelOCount = 0;
    int vowelUCount = 0;
    int nonVowelCount = 0;
    int spaceCount = 0;
    Scanner userInput = new Scanner(System.in);

    System.out.println("[ PLEASE ENTER A STRING ]: ");
    stringAnalysis = userInput.nextLine().toLowerCase();

    userInput.close();

    for(int i = 0; i < (stringAnalysis.length() - 1); i++)
    {
      switch (stringAnalysis.charAt(i)) {
        case 'a':
          vowelACount++;
          break;

        case 'e':
          vowelECount++;
          break;

        case 'i':
          vowelICount++;
          break;

        case 'o':
          vowelOCount++;
          break;

        case 'u':
          vowelUCount++;
          break;

        case ' ':
          spaceCount++;
          break;

        default:
          nonVowelCount++;
          break;
      }
    }

    System.out.println("[<< STRING ANALYSIS >>]\n['A'] - " + vowelACount + "\n['E'] - " + vowelECount + "\n['I'] - " + vowelICount + "\n['O'] - " + vowelOCount + "\n['U'] - " + vowelUCount + "\n[Space Count] - " + spaceCount + "\n[Non Vowel Count] - " + nonVowelCount);









  }
}
