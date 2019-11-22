import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test7 {

    public static Set<Integer> getFactors(int input){

        Set<Integer> factors = new HashSet<>();

        for(int i = 1; i <= Math.sqrt(input); i++){
            if(input % i == 0){
                factors.add(i);
                factors.add(input/i);
            }
        }

        return factors;

    }

    public static void main(String[] args){

        Set<Integer> factors1 = getFactors(1);

        System.out.println(factors1.size() == 1);
        System.out.println(factors1.contains(1));

        Set<Integer> factors15 = getFactors(15);

        System.out.println(factors15.size() == 4);
        System.out.println(factors15.contains(1));
        System.out.println(factors15.contains(3));
        System.out.println(factors15.contains(5));
        System.out.println(factors15.contains(15));

        //f(15) -> 1,3,5,15

    }
}
