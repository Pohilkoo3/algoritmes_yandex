package ru.pokhilko.lesson_one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 За многие годы заточения узник замка Иф проделал в стене прямоугольное отверстие размером D × E.
 Замок Иф сложен из кирпичей, размером A × B × C. Определите, сможет ли узник выбрасывать кирпичи в море через это отверстие,
 если стороны кирпича должны быть параллельны сторонам отверстия.

 Формат ввода
 Программа получает на вход числа A, B, C, D, E.

 Формат вывода
 Программа должна вывести слово YES или NO.
 **/

public class caseI_PrisonerCastleIf
{
        public void isWindowEnough(){
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            int e = scanner.nextInt();
            String result = "";
            List<Integer> window = new ArrayList<>();
            window.add(a);
            window.add(b);
            window.add(c);
            Collections.sort(window);
            if (d > e) {
                int tmp = d;
                d = e;
                e = tmp;
            }
            a = window.get(0);
            b = window.get(1);
            if (d >= a && e >= b) {
                result = "YES";
            } else {
                result = "NO";
            }
            System.out.println(result);
        }
}
