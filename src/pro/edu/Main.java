
/*
 * Classname Main
 *
 * Version info 1
 *
 * Copyright Ivanov Ivan KNTEU
 */
package pro.edu;

public class Main {

    public static void main(String[] args) {

   //  String word = "ABBA";
     String word = "\"Ба-бах!\" - у уха баб";
      word = word.toLowerCase();

            word = word.replaceAll(" ","");
            word = word.replaceAll("–","");
            word = word.replaceAll("\\.","");
            word = word.replaceAll("\\?","");
            word = word.replaceAll("\"","");



     String template = "";

        for (int i = 0; i < word.length(); i++) {
            int index = word.length() - i -1;
            template += word.charAt(index);
        }

        String[] palindroms = new String[5];
        palindroms[0] = "А в Енисее – синева";
        palindroms[1] = "А кобыле цена дана, да не целы бока";

        for (int i = 0; i < palindroms.length; i++) {

        }

      //  "А кобыле цена дана, да не целы бока"
        //

        System.out.println(template);

        if (word.equals(template)) {
            System.out.println(" This word is palindrom   TRUE ");
        } else{
            System.out.println(" This word is not palindrom  FALSE");
        }


    }
}
