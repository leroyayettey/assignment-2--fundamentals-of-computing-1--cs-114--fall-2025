import java.util.Scanner;

public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    int numberOfVerses = 0;
    int numberOfBeers = 100;

    System.out.println("Enter the desired number of verses to print from the traveling song ' One Hundred Bottles of Beer. ' ");
    int input = userInput.nextInt();

    if (input > 100 || input < 1){
      System.out.println("** INVALID INPUT **\nCHOSEN NUMBER OF VERSES MUST BE WITHIN THE RANGE (1 - 100) ");
    }
    else{
      numberOfVerses = input;
    }
    for(int i = 0; i < numberOfVerses; i++){
      System.out.println(numberOfBeers + " bottles of beer on the wall\n" + numberOfBeers + " bottles of beer\nIf one of those bottles should happen to fall\n" + (numberOfBeers--) + " bottles of beer on the wall\n");
    }
    userInput.close();
    }


  }
