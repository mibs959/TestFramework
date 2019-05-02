package Non_WebAutomation_Related_Tests.DeepMind_Tests;

import org.junit.Assert;


/**
 * SPECIAL NOTE: I havent run this Class as it was suppose to be in Text and it wouldn't be fair to run it as it would
 * be somehow as cheating, therefore this has never been tested/run.
 */
public class DeepmindTests_CaesarCipher {


    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private char[] alphabetArray = alphabet.toCharArray();

    /**
     * Small method to get the Char Index on an given Input Array, in our case this is used to find the
     * positions of the Letters on the Alphabet.
     *
     * @param inputChar
     * @param inputCharArray
     * @return
     */
    private int FindCharIndexOnGivenCharArray(char inputChar, char[] inputCharArray){

        for(int i = 0; i < inputCharArray.length; i++){

            if(inputChar == inputCharArray[i]){
                return i;
            }
        }
        return 0;
    }

    /**
     * With this method we make sure that the input will be always a valid INT number.
     *
     * @param input
     * @return
     */
    private int TransformIntToNotSurpassTheAlphabetCharArrayLength (int input){

        int alphabetLenght = 26;

        if(input >= alphabetLenght){

            while (input >=  26){
                input = input - 26;
            }
        }

        return input;
    }


    /**
     * Small method to verify if its a letter or not.
     *
     * @param input
     * @return
     */
    private boolean VerifyIfCharBelongsToAlphabet (char input){

        for(int i = 0; i < alphabetArray.length; i++){
            if(input == alphabetArray[i]) {
                return true;
            }
        }
        return false;
    }



    public String CaesarCipher (String input, int shiftAlphabetChar){

        // We make sure everything is in LowerCase
        input = input.toLowerCase();

        // We turn the shiftAlphabetChar into a valid number
        shiftAlphabetChar = TransformIntToNotSurpassTheAlphabetCharArrayLength(shiftAlphabetChar);

        String result = "";

        char[] inputArray = input.toCharArray();



        for (int i = 0; i < inputArray.length; i++){

            char currentChar = inputArray[i];

            if (!VerifyIfCharBelongsToAlphabet(currentChar)){

                result = result + currentChar;

            } else {

                int findCharPositionInAlphabet = FindCharIndexOnGivenCharArray(currentChar, alphabetArray);
                currentChar = alphabetArray[findCharPositionInAlphabet + shiftAlphabetChar];
                result = result + currentChar;

            }

        }

        return result;

    }


    // Unit Tests

    private void Test_CaesarCipher_ValidInput (){
        Assert.assertEquals("ifmmp", CaesarCipher("hello", 1));
    }

    private void Test_CaesarCipher_EmptyInput (){
        Assert.assertEquals("", CaesarCipher("", 1));
    }

    private void Test_CaesarCipher_LettersAndNumbers (){
        Assert.assertEquals("ifmmp123", CaesarCipher("hello123", 1));
    }

    private void Test_CaesarCipher_LettersNumbersAndSpaces (){
        Assert.assertEquals("ifmmp 123", CaesarCipher("hello 123", 1));
    }

    private void Test_CaesarCipher_JustEmptySpaces (){
        Assert.assertEquals("   ", CaesarCipher("   ", 1));
    }

    private void Test_CaesarCipher_LettersNumbersAndSpecialCharacters (){
        Assert.assertEquals("(ifmmp) 123", CaesarCipher("(hello) 123", 1));
    }

    // I could continue keep adding Tests, but due to the time I just picked those Scennarios that I consider as the most critical ones.

}
