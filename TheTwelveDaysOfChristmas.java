public class TheTwelveDaysOfChristmas {
  public static void main(String[] args){
    String songLines = "";
    String date = "";
    for(int i = 1; i < 13; i++){
      switch (i){
        case 1:
          date = "1st";
          break;
        case 2:
          date = "2nd";
          break;
        case 3:
          date = "3rd";
          break;
        case 4:
          date = "4th";
          break;
        case 5:
          date = "5th";
          break;
        case 6:
          date = "6th";
          break;
        case 7:
          date = "7th";
          break;
        case 8:
          date = "8th";
          break;
        case 9:
          date = "9th";
          break;
        case 10:
          date = "10th";
          break;
        case 11:
          date = "11th";
          break;
        case 12:
          date = "12th";
          break;

        default:
          break;
      }
      System.out.println("On the " + date + " day of Christmas, my true love gave to me\n");
      switch(i){
        case 1:
          songLines = "A partridge in a pear tree.\n" + songLines;
          break;
        case 2:
          songLines = "Two turtle doves, and\n" + songLines;
          break;
        case 3:
          songLines = "Three French hens,\n" + songLines;
          break;
        case 4:
          songLines = "Four calling birds,\n" + songLines;
          break;
        case 5:
          songLines = "Five golden rings,\n" + songLines;
          break;
        case 6:
          songLines = "Six geese a-laying,\n" + songLines;
          break;
        case 7:
          songLines = "Seven swans a-swimming,\n" + songLines;
          break;
        case 8:
          songLines = "Eight maids a-milking,\n" + songLines;
          break;
        case 9:
          songLines = "Nine ladies dancing,\n" + songLines;
          break;
        case 10:
          songLines = "Ten lords a-leaping,\n" + songLines;
          break;
        case 11:
          songLines = "Eleven pipers piping,\n" + songLines;
          break;
        case 12:
          songLines = "Twelve drummers drumming," + songLines;
          break;
      }
      System.out.println(songLines);
    }
  }
}
