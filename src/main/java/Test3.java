import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test3 {

    static void fizzBuzz(){
        for(int i = 1; i <= 100; i++){

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
                continue;
            }

            if(i % 3 == 0){
                System.out.println("Fizz");
                continue;
            }

            if(i % 5 == 0){
                System.out.println("Buzz");
                continue;
            }

            System.out.println(i);
        }
    }

    static void fizzBuzzOptimized(){
        for(int i = 1; i <= 100; i++){

            StringBuilder stringBuilder = new StringBuilder();

            if(i % 3 == 0){
                stringBuilder.append("Fizz");
            }

            if(i % 5 == 0){
                stringBuilder.append("Buzz");
            }

            if (stringBuilder.length() == 0)
                stringBuilder.append(i);

            System.out.println(stringBuilder.toString());
        }
    }

    public static void main(String[] args) {

        fizzBuzz();

        fizzBuzzOptimized();

    }


}
