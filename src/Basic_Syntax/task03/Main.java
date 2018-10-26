package Basic_Syntax.task03;

/*
* Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
Допустимая погрешность – 0.0001 (1E-4)

Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.

В качестве примера написано заведомо неправильное выражение. Исправьте его.
* */

public class Main {

    public static boolean doubleExpression(double a, double b, double c) {
        if (java.lang.Math.abs((a + b) - c) < 1E-4 )
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1, 0.2, 0.3));
    }

}
