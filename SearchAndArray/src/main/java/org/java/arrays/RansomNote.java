package org.java.arrays;

public class RansomNote {
    public static void main(String[] args) {
        String magazine = "abcdeafdzz";
        String ransom = "fizz";
        RansomNote ransomNote = new RansomNote();
        boolean canConstruct = ransomNote.canConstruct(magazine,ransom);
        System.out.println("Can Construct: " + canConstruct);
    }
    public boolean canConstruct(String magazine,String ransom){
        int[] charCount = new int[26];
        for(int i=0;i<magazine.length();i++){
            char c = magazine.charAt(i);
            //System.out.println("Magazine Char: " + c + " Index: " + (c - 'a'));
            charCount[c-'a']++;//[2,1,1,1,2]
        }
        for(int i=0;i<ransom.length();i++){
            char c = ransom.charAt(i);
            if(charCount[c-'a'] ==0) return false;
            charCount[c-'a']--;

        }

        return true;


    }
}
