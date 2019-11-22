public class Test9 {

    public static void main(String[] args) {

        int[] input = {1,4,0,2};

        int[] output = sort(input);

        System.out.println(output[0] == 0);
        System.out.println(output[1] == 1);
        System.out.println(output[2] == 2);
        System.out.println(output[3] == 4);

        System.out.println(output[0]);
        System.out.println(output[1]);
        System.out.println(output[2]);
        System.out.println(output[3]);
    }

    private static int[] sort(int[] input) {

        int[] output = new int[input.length];

        System.arraycopy(input, 0, output, 0, input.length);

        for(int i = 0; i < (output.length-1); i++){
            for (int j = (i+1); j < output.length; j++){
                if (output[i] > output[j]){
                    int temp = output[i];
                    output[i] = output[j];
                    output[j] = temp;
                }
            }
        }

        return output;
    }
}
