package Basic_Syntax.task09;


/*
* Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив. Массивы могут быть любой длины, в том числе нулевой.

Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив. Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась. К сожалению, автоматически это не проверить, так что это остается на вашей совести :)

Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.

Пример

Если на вход подаются массивы {0, 2, 2} и {1, 3}, то на выходе должен получиться массив {0, 1, 2, 2, 3}
* */

import java.util.Arrays;

public class Main {
    public static int[] mergeArrays(int[] a1, int[] a2)
    {
        int[] result = new int [a1.length + a2.length];

        System.arraycopy(a1, 0, result, 0, a1.length);
        System.arraycopy(a2, 0, result, a1.length, a2.length);
        Arrays.sort(result);
        return result;
    }

    public static int[] mergeArrays2(int[] a1, int[] a2)
    {
        int[] result = new int [a1.length + a2.length];
        int idxOne = 0;
        int idxTwo = 0;

        for (int i = 0; i < result.length; i++)
        {
            if (idxTwo >= a2.length || idxOne < a1.length && a1[idxOne] < a2[idxTwo]) {
                result[i] = a1[idxOne];
                idxOne++;
            } else {
                result[i] = a2[idxTwo];
                idxTwo++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = new int[] {0, 2, 2};
        int[] b = new int[] {1, 3};
        System.out.println(Arrays.toString(mergeArrays(a, b)));
        System.out.println(Arrays.toString(mergeArrays2(a, b)));
    }
}
