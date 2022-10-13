package com.devmountain.training.algorithm.caesarcipher;

public class AsciiBasedCaesarCipherExample {

    public String cipher(String message, int offset) {
        StringBuilder result = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (character != ' ') {
//            if (!characterIsLetter(character)) {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    private boolean characterIsLetter(char character) {
        boolean isLetter = true;
//        int pos = character - 'a';
//        int aPos = 'a';
//        if(pos < aPos || pos > (aPos + 25))
//            isLetter = false;
        if (character == ' ')
            isLetter = false;
        return isLetter;
    }

    public String decipher(String message, int offset) {
        return cipher(message, 26 - (offset % 26));
    }

    public static void main(String[] args) {
        AsciiBasedCaesarCipherExample caesarCipher = new AsciiBasedCaesarCipherExample();
        String message = "this is a test";
        int offset = 5;
        System.out.println("The original string = " + message);
        String encryptedString = caesarCipher.cipher(message, offset);
        System.out.println("The encrypted string = " + encryptedString);

        String decryptedString = caesarCipher.decipher(encryptedString, offset);
        System.out.println("The decrypted string = " + decryptedString);
    }
}
