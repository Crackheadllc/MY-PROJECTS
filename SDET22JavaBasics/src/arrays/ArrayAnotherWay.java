package arrays;

public class ArrayAnotherWay {
    public static void main(String[] args) {


        String [] names={"James", "Jane", "Jack", "Jacob", "John"};

        System.out.println(names[2]);
        System.out.println(names[4]);

        int size= names.length;
        System.out.println(size);

        //how to retrieve all elements from my array

        for (int i=0; i<size; i++){

            System.out.println(names[i]);
        }
    }
}
