public class Test1 {

    private static int stringToInt(String input){

       int returnValue = 0;
       int digitCount = 0;

       for (int i = input.length() - 1 ; i >= 0; i--){

           char currentChar = input.charAt(i);

           if (currentChar >= '0' && currentChar <= '9'){
                returnValue += (currentChar - '0') * (Math.pow(10,digitCount));
                digitCount++;
           }

       }

       return returnValue;
    }

    public static void main(String[] args) {

        //Simple Test
        System.out.println(stringToInt("123a"));

    }
}
