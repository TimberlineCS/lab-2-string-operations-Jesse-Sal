public class StringOperations{
  public static void main (String args[]){
    //Flipped words
    String word ="YourWordHere";
    int wordLength = word.length();
    int half = (int)wordLength/2;
    String a = word.substring(0,half);
    String b = word.substring(half);
    System.out.print(b.toLowerCase());
    System.out.print(a.toLowerCase());

    System.out.println();

    //ASKII Art
    /*
           __
      (___()'`;
      /,    /`
      \\"--\\
    */
    System.out.print("     __\n(___()'`;\n/,    /`\n\\\\\"--\\\\");
  }
}