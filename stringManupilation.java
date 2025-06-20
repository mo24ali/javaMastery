package strings;

public class stringManupilation {


  public static void main(String[] args) {
    String myString = "House";
    //myString.charAt(0) = 'M';//if expected Mouse, that's an error because in java unlike arrays strings are immutable
    //however string can't be manipulated by changing one character inside the string cause they're immutable
    //but they can be re-assigned that's how strings can be manipulated
    //myString = "Mouse";
    System.out.println(myString);
    /**
     * now will check the contains() method, return a boolean , and mainly used for
     * checking if a strings exists inside another bigger string
     * */

    //example
    String motherString = "I got into the House 10mins ago";
                        //"0123456789
    System.out.println(motherString.contains(myString));//contains is case sensitive so House isn't house
    /**
     * now will check the substring(int startIndex, int finishIndexExcluded) method
     * this method used to extract a substring from a mother string
     */

    System.out.println(motherString.substring(6,10));//this shout extract into (6,7)  will get you only the letter i with the same analysis

    /**
     * now let's see the escape a quote in java
     *
     */
  }

}
