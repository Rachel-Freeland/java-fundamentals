public class Main 
{
  public static String pluralize(String string, int num)
  {
    String string1 = string;
    String plural = string + "s";
    if (num != 1){
      // } else {
        //   return string1;
        // }
      }
      return plural;
  } 
  
  // public static void flipNHeads(int num)
  // {
  //   int headcount = 0;
  //   int flipcount = 0;

  // }
  
  // public static void clock (String[] args)
  // {
  //   //
  // }
  public static void main(String[] args)
  {
    int dogCount = 1;
    int catCount = 2;
    int turtleCount = 0;
    System.out.println("I own " + dogCount + " " + pluralize("dog", 1));
    System.out.println("I own " + catCount + " " + pluralize("cat", 1));
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", 1));

  }
}