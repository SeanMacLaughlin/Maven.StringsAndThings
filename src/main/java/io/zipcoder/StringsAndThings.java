package io.zipcoder;


import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        int endsIn = 0;
        String temp2 = "";
        Character lastChar;
        String[] splitString = input.split(" ");

        for (int i = 0; i < splitString.length; i++) {
            temp2 = splitString[i];
            lastChar = temp2.charAt(temp2.length() - 1);
            if(lastChar == 'y' || lastChar == 'z') {
                endsIn++;
            } else {
                break;
            }
        }
        return endsIn;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
    return base.replaceAll(remove, "");
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
    int countIf = 0;
    int countNot = 0;
    boolean returnAns;


    String findIf = "if";
    String findNot = "not";
        {

            String a[] = input.split(" ");


            for (int i = 0; i < a.length; i++)
            {

                if (findIf.equals(a[i]))
                    countIf++;
            }
            for (int j = 0; j < a.length; j++)
            {
                if (findNot.equals(a[j])) {
                    countNot++;
                }
            }


        }
        if(countNot == countIf) {
            returnAns = true;
        } else {
            returnAns = false;
        }

        return returnAns;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
       int gCheck = 0;
       int happyGCheck = 0;
       boolean happyBool;
       int i = 0;

       while(i < input.length() - 1) {
           if((input.charAt(i) == 'g') && (input.charAt(i) == input.charAt(i + 1) || input.charAt(1) == input.charAt(i - 1))) {
               happyGCheck++;

               i++;
           } else if (input.charAt(i) == 'g') {
               gCheck++;
               i++;
           } else {
               i++;

           }
       }

       if (gCheck == happyGCheck) {
           happyBool = true;
       } else {
           happyBool = false;
       }


        return happyBool;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){

       int trips = 0;
       int i = 0;

        while(i < input.length() - 2) {
            if(input.charAt(i) == input.charAt(i + 1) && input.charAt(i) == input.charAt(i + 2)) {
                trips++;

                i++;
            } else {
                i++;

            }
        }

        return trips;
    }

}
