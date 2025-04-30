package arrays;

public class ContinueKeyword {
    public static void main(String[] args) {


        int[] numbers={9, 66, 100, 8, 10, 78, 5, 101, 99};

        for (int i=0; i< numbers.length; i++){

            if (numbers[i]%2==0){
                continue;
            }
            System.out.println(numbers[i]);
        }
    }
}
