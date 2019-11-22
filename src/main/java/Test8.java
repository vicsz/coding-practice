public class Test8 {

    public static void main(String[] args){

        //f(dog) --> false
        System.out.println(isPalidromeRaw("dog") == false);

        //f(bob) --> true
        System.out.println(isPalidromeRaw("bob") == true);

        //f(Bob) --> true (case insensitive)
        System.out.println(isPalidromeRaw("Bob") == true);
    }

    private static boolean isPalidrome(String input) {

        return new StringBuilder(input.toLowerCase()).reverse().toString().equals(input.toLowerCase());
    }

    private static boolean isPalidromeRaw(String input) {

        String lowerCaseInput = input.toLowerCase();

        for(int i = 0; i < (lowerCaseInput.length() / 2); i++){
            if(!(lowerCaseInput.charAt(i) == lowerCaseInput.charAt(lowerCaseInput.length() - i - 1)))
                return false;
        }

        return true;
    }
}
