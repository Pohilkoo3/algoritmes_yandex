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
            int[] stone = new int[]{a, b, c};
            stone = sortedSizeStone(stone);
            if (d > e) {
                int tmp = d;
                d = e;
                e = tmp;
            }
            a = stone[0];
            b = stone[1];
            if (d >= a && e >= b) {
                result = "YES";
            } else {
                result = "NO";
            }
            System.out.println(result);
        }

    public static int[] sortedSizeStone(int[] stone) {
        int count = 0;
        do {
            count = 0;
            for (int i = 1; i < stone.length; i++) {
                if (stone[i - 1] > stone[i]) {
                    int tmp = stone[i - 1];
                    stone[i - 1] = stone[i];
                    stone[i] = tmp;
                    count++;
                }
            }
        } while (count > 0);
        return stone;
    }
}
