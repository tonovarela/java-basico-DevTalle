package collecciones;

import java.util.ArrayList;

public class Estructura {
    static void main() {

//        Integer[] number ={ 1 ,2 ,3 };
//        number[0] =100;
//        System.out.println(number[0]);
//
//        int[] fixedArray = { 1,2,3};
//        System.out.println(fixedArray.length);
//
//        int[] fixedArray2 = new int [100];
//        System.out.println(fixedArray2.length);
//        ArrayList<Integer> numbers2 = new ArrayList<>();
//        numbers2.add(1);
//        numbers2.add(5);
//        numbers2.add(8);
//        System.out.println(numbers2);
//        System.out.println(numbers2.size());
//        int[] numberPrimitive = new int[5];
//        numberPrimitive[0] =10;
//        numberPrimitive[1] =20;
//        int[] newNumbers = new int[numberPrimitive.length +1];
//        System.arraycopy(numberPrimitive,0,newNumbers,0,newNumbers.length-1);
//        newNumbers[5] =500;
//
//
//        for (int number: newNumbers) {
//            System.out.println(number);
//        }
//        Integer[] numbersWrapper = new Integer[5];
//        numbersWrapper[0]= 30;
//        numbersWrapper[1] =40;
//
//        for (Integer i : numbersWrapper) {
//            System.out.println(i);
//        }
        int[] numberPrimitives = {1, 2, 3, 4, 5, 6, 0, 9};
        int deletePosition = 2;

        for (int i = deletePosition; i < numberPrimitives.length -1 ; i++)
            numberPrimitives[i] = numberPrimitives[i + 1];

        numberPrimitives[numberPrimitives.length - 1] = 0;

        for (int number : numberPrimitives)
            System.out.println(number);


    }
}
