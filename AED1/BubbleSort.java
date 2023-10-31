package AED1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] semOrdem = {1,5,8,4,3,21,11};
        System.out.println(Arrays.toString(semOrdem));
        bubbleSort(semOrdem);
        System.out.println(Arrays.toString(semOrdem));
    }

    public static void bubbleSort(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if(numbers[j] > numbers[j+1]){
                    int aux = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = aux;
                }
            }
        }
    }
}
