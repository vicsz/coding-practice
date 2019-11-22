import java.util.Arrays;

public class Test2 {

    static int findOddOccurrenceBruteForce(int[] intArray){

        for(int i=0; i < intArray.length; i++){

            int numberOfOccurrences = 0;

            for(int j=0; j < intArray.length; j++){
                if (intArray[i] == intArray[j])
                    numberOfOccurrences++;

            }

            if (numberOfOccurrences % 2 == 1)
                return intArray[i];
        }

        return -1;
    }

    static int findOddOccurrenceOptimized(int[] intArray){

        Arrays.sort(intArray);

        if(intArray.length == 0)
            throw new RuntimeException("Not Found");

        int currentValue = intArray[0];
        int numberOfOccurrences = 1;

        for(int i=1; i < intArray.length; i++){
            if(currentValue != intArray[i]){
                if (numberOfOccurrences % 2 == 1)
                    return currentValue;

                currentValue = intArray[i];
                numberOfOccurrences = 0;
            }

            numberOfOccurrences++;

        }

        throw new RuntimeException("Not Found");
    }

    public static void main(String[] args) {

        int[] intArray = {1,1,2,3,3,1,1};

        System.out.println(findOddOccurrenceBruteForce(intArray));

        System.out.println(findOddOccurrenceOptimized(intArray));

    }
}
