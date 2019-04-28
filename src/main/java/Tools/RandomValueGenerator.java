package Tools;

import java.util.Random;

public class RandomValueGenerator {

    public String generateRandomAlphaNumericString(int length) {
        String possibleCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstyxz1234567890";
        StringBuilder stringBuilder = new StringBuilder();
        Random rnd = new Random();
        while (stringBuilder.length() < length) {
            int index = (int) (rnd.nextFloat() * possibleCharacters.length());
            stringBuilder.append(possibleCharacters.charAt(index));
        }
        String result = stringBuilder.toString();
        return result;
    }

    public static int generateRandomNumericString(int length) {
        String possibleCharacters = "1234567890";
        StringBuilder stringBuilder = new StringBuilder();
        Random rnd = new Random();
        while (stringBuilder.length() < length) {
            int index = (int) (rnd.nextFloat() * possibleCharacters.length());
            stringBuilder.append(possibleCharacters.charAt(index));
        }
        String result = stringBuilder.toString();
        return Integer.valueOf(result);
    }

    public static long generateRandomNumericLong(int length) {
        String possibleCharacters = "1234567890";
        StringBuilder stringBuilder = new StringBuilder();
        Random rnd = new Random();
        while (stringBuilder.length() < length) {
            int index = (int) (rnd.nextFloat() * possibleCharacters.length());
            stringBuilder.append(possibleCharacters.charAt(index));
        }
        String result = stringBuilder.toString();
        return Long.valueOf(result);
    }

    public static String generateRandomAlphabeticString(int length) {
        String possibleCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstyxz";
        StringBuilder stringBuilder = new StringBuilder();
        Random rnd = new Random();
        while (stringBuilder.length() < length) {
            int index = (int) (rnd.nextFloat() * possibleCharacters.length());
            stringBuilder.append(possibleCharacters.charAt(index));
        }
        String result = stringBuilder.toString();
        return result;
    }

}
