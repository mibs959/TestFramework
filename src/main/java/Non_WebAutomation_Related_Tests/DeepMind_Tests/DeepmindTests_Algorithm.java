package Non_WebAutomation_Related_Tests.DeepMind_Tests;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * SPECIAL NOTE: I havent run this Class as it was suppose to be in Text and it wouldn't be fair to run it as it would
 * be somehow as cheating, therefore this has never been tested/run.
 */
public class DeepmindTests_Algorithm {


    ///// Fibonacci Exercise

    private int FibonacciAlgorithmEngine (int iterations){

        if (iterations == 0){
            return 0;
        }

        int result = 1;
        int previousNumber = 0;


        for(int i = 0; i < iterations; i++){

            result = result + previousNumber;
            previousNumber = result;

        }

        return result;

    }


    private boolean IsItInTheFibonacciSequence (int input){

        int fibonacciRun = 0;

        while (FibonacciAlgorithmEngine(fibonacciRun) <= input){

            if(FibonacciAlgorithmEngine(fibonacciRun) == input){
                return true;
            }

            fibonacciRun++;

        }

        return false;

    }

    public int GetNextFibonacciNumber (int givenNumber){

        int result = 0;

        if(IsItInTheFibonacciSequence (givenNumber)){

            int fibonacciRun = 0;

            while (FibonacciAlgorithmEngine(fibonacciRun) <= givenNumber){

               if (FibonacciAlgorithmEngine(fibonacciRun) > givenNumber){
                   return FibonacciAlgorithmEngine(fibonacciRun);
               }

                fibonacciRun++;

            }
        }

        return result;

    }


    // Unit Tests

    private void Test_Fibonacci_ValidInput (){
        Assert.assertEquals(5, GetNextFibonacciNumber(3));
    }

    private void Test_Fibonacci_InvalidInput (){
        Assert.assertEquals(0, GetNextFibonacciNumber(6));
    }





    ///// Distinct Elements Exercise

    private boolean IsNumberOnTheList(List<Integer> list, int number){

        for(int i = 0; i < list.size(); i++){

            if(list.get(i) == number){
                return true;
            }
        }
        return false;
    }

    public int[] DistinctElements(int[] input){

        List<Integer> distinctElements = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();

        distinctElements.add(input[0]);

        for (int i = 1; i < input.length; i++){

            if(!IsNumberOnTheList(distinctElements, input[i])){


                int numberOfTimesThatNumberIsOnGivenArray = 0;

                for(int j = 0; j < input.length; j++){
                    if(input[j] == input[i]){
                        numberOfTimesThatNumberIsOnGivenArray++;
                    }
                }

                resultList.add(i, numberOfTimesThatNumberIsOnGivenArray);

            }
        }

        // Here we transform the List into an Array
        int[] intArrayResult = new int[resultList.size()];

        for (int i = 0; i < resultList.size(); i++){

            intArrayResult[i] = resultList.get(i);

        }

        return intArrayResult;

    }







}
