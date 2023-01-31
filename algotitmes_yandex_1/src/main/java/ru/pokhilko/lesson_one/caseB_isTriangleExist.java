package ru.pokhilko.lesson_one;

import java.util.Scanner;

/**
 * Даны три натуральных числа. Возможно ли построить треугольник с такими сторонами. Если это возможно,
 * выведите строку YES, иначе выведите строку NO.
 *
 * Треугольник — это три точки, не лежащие на одной прямой.
 *
 * Формат ввода
 * Вводятся три натуральных числа.
 *
 * Формат вывода
 * Выведите ответ на задачу.
 */
public class caseB_isTriangleExist
{
    
    
    public void isTriangleExist(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String result = (a > b+c || b > a+c || c > a+b) ? "NO" : "YES";
        System.out.println(result);
    }
}
