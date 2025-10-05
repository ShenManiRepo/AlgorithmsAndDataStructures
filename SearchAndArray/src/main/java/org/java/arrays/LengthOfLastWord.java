package org.java.arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String input = "This is a sample word count is";
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        int length = lengthOfLastWord.lengthOfLastWord(input);
        System.out.println("Length of last word: " + length);
    }
    public int lengthOfLastWord(String s){
        int length_0f_last_word = 0;
        int right = s.length() - 1;
        // Skip trailing spaces
        while(right >=0 && s.charAt(right) == ' '){
            right--;
        }
        int left = right;
        while(left >=0 && s.charAt(left) != ' '){

            left--;
        }
        return right-left;
    }
}
