public class CountFlips {
  public static void main(String[] args) {
    int headsCount = 0;
    int tailsCount = 0;
    Coin flippableCoin = new Coin();

    for(int z = 0; z < 100; z++)
    {
      flippableCoin.flip();
      if (flippableCoin.toString() == "Heads"){
        headsCount++;
      }
      else{
        tailsCount++;
      }
    }
    System.out.println("*Flipping a coin 100 times...*\n[HEADS]: " + headsCount + "\n[TAILS]: " + tailsCount);



  }
}
