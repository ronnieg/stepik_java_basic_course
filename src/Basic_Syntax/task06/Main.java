package Basic_Syntax.task06;

/*
* Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.

Решать можно разными способами:

воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
применив пару трюков из двоичной арифметики;
написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра соответствующих уроков).
Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
* */
public class Main {

    public static boolean isPowerOfTwo(int value) {
        value = Math.abs(value);
        while (value > 1 && value % 2 == 0) {
            value = value / 2;
        }
        return (value == 1);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-2));
    }
}
