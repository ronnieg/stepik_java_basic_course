package Basic_Syntax.task07;

/*
* Реализуйте метод, проверяющий, является ли заданная строка палиндромом. Палиндромом называется строка, которая читается одинаково слева направо и справа налево (в том числе пустая). При определении "палиндромности" строки должны учитываться только буквы и цифры. А пробелы, знаки препинания, а также регистр символов должны игнорироваться. Гарантируется, что в метод попадают только строки, состоящие из символов ASCII (цифры, латинские буквы, знаки препинания). Т.е. русских, китайских и прочих экзотических символов в строке не будет.

Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.

Подсказки (не читайте, если хотите решить сами):

для удаления из строки всех символов, не являющихся буквами и цифрами, можно воспользоваться регулярным выражением "[^a-zA-Z0-9]"; найдите в классе String метод, выполняющий замену по регулярному выражению;
для перестановки символов строки в обратном порядке можно воспользоваться методом reverse(), который находится в классе StringBuilder;
в классе String есть методы для преобразования всей строки в верхний и нижний регистр.
* */

import java.util.Arrays;

public class Main {

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^A-Za-z1-9]+","").toLowerCase();
        String[] arrayText = text.split("");
        String[] arrayTextTwo = text.split("");

        for (int i = 0; i < arrayText.length / 2; i++) {
            String temp = arrayText[i];
            arrayText[i] = arrayText[arrayText.length - 1 -i];
            arrayText[arrayText.length - 1 -i] = temp;
        }
        return Arrays.toString(arrayTextTwo).equals(Arrays.toString(arrayText));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }

}
