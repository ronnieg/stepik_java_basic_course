package Basic_Syntax.task05;

/*
* Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.

В качестве примера написано заведомо неправильное выражение. Исправьте его.
* */

public class Main {
    public static char charExpression(int a) {
        int s = '\\';
        int total = s + a;
        char unicode = (char) total;
        return unicode;
    }

    public static void main(String[] args) {
        System.out.println(charExpression(32));
    }
}
