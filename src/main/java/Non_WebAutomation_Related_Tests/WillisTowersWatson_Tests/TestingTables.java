package Non_WebAutomation_Related_Tests.WillisTowersWatson_Tests;

import org.junit.Assert;

public class TestingTables {


    /**
     * This is just to make things a bit more easy to read on the Methods.
     * @param inputA
     * @param inputB
     * @param rate
     * @return
     */
    private boolean IsExchangeRateValid (double inputA, double inputB, double rate){
        return inputB == inputA * rate;
    }


    /**
     * This method goes value by valie from 2 given Tables verifying that the values on the
     * Table B equals the values on the Table A after applying the Exchange Rate.
     *
     * Note: This method requires that BOTH tables being passed as parameters have the same size! - as thats what a valid scenario would look like.
     * @param tableA
     * @param tableB
     * @param rate
     */
    public void VerifyConversionRateBetween2GivenTables(double[][] tableA, double[][] tableB, double rate){

        // We make sure that both tables have the same lenght - just in case, so if it fails we know earlier why it failed
        Assert.assertEquals(tableA.length, tableB.length);

        // Navigating the 2D Array by Rows
        for (int i = 0; i < tableA[0].length; i++){

            // Navigating the 2D Array by Columns
            for (int j = 0; j < tableA[1].length; j++){

                try {

                    Assert.assertTrue(IsExchangeRateValid(tableA[i][j], tableB[i][j], rate));

                }catch (AssertionError e){

                    System.out.println();
                    System.out.println("Warning! Value from Table A and B at the Row: " + i + " Column: " + j + " does not have a valid Exchange Rate.");
                    System.out.println();

                }
            }
        }




    }





}
