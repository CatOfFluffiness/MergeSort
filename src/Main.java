import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int [] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }

        System.out.println("Before:");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("\nAfrer:");
        printArray(numbers);
    }

    private static void mergeSort(int[] inputArray) {                           //делим массив, рекурсией реализован способ поделить массив на меленькие массивы

        int inputLength = inputArray.length;

        if (inputLength < 2) {return;}                                          //если в массиве меньше двух элементов - его не нужно делить, возвращаем значение

        int midIndex = inputLength / 2;                                         //собственно деление

        int [] leftHalf = new int [midIndex];                                   //новый массив, левая половина старого
        int [] rightHalf = new int [inputLength - midIndex];                    //новый массив, правая половина старого

        for (int i = 0; i < midIndex; i++){                                     //заполнение левой половины, не более индекса, равного середине старого массива
            leftHalf[i] = inputArray [i];
        }

        for (int i = midIndex; i < inputLength; i++){                           //заполнение правой половины, отсчет с индекса, равного середине старого массива
            rightHalf[i - midIndex] = inputArray [i];                           //и не более длины старого массива
        }

        mergeSort(leftHalf);                                                    //рекурсия - дальнейшее деление массивов по левой стороне
        mergeSort(rightHalf);                                                   //рекурсия - дальнейшее деление массивов по правой стороне
    }

    private static void merge (int[] inputArray, int[] leftHalf, int [] rightHalf){

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize){
            if (leftHalf[i] <= rightHalf[i]){
                inputArray[k] = leftHalf[i];
            }
        }
    }

    private static void printArray(int[] numbers) {

    }
}