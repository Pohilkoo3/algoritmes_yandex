import java.util.Scanner;

/**
 * В школе решили на один прямоугольный стол поставить два прямоугольных ноутбука.
 * Ноутбуки нужно поставить так, чтобы их стороны были параллельны сторонам стола.
 * Определите, какие размеры должен иметь стол, чтобы оба ноутбука на него поместились, и площадь стола была минимальна.
 * Формат ввода
 * Вводится четыре натуральных числа, первые два задают размеры одного ноутбука, а следующие два — размеры второго.
 * Числа не превышают 1000.
 * Формат вывода
 * Выведите два числа — размеры стола. Если возможно несколько ответов, выведите любой из них (но только один).
 **/
public class Noutbooks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int[] firstNote = getRightSize(a, b);
        a = firstNote[0];
        b = firstNote[1];
        int[] secondNote = getRightSize(c, d);
        c = secondNote[0];
        d = secondNote[1];
        if (b < d) {
            int[] newNote = getRightSize(b, d);
            b = newNote[1];
            d = newNote[0];
            a = a + c;
            c = a - c;
            a = a - c;

        }
        if (b == d) {
            if (c == a) {
                printResult(a, b + d);
                return;
            }
            printResult(b, a + c);
            return;
        } else if (b > d) {
            if (a >= d) {
                printResult(a, b + c);
                return;
            } else {
                if ((b + c) * d <= (a + c) * b) {
                    printResult(d, b + c);
                    return;
                } else {
                    printResult(b, a + c);
                    return;
                }
            }
        }
    }


    private static void printResult(int a, int b) {
        System.out.printf("%d %d", a, b);
    }

    private static int[] getRightSize(int a, int b) {
        int[] result = new int[]{a, b};
        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
            result[0] = a;
            result[1] = b;
        }
        return result;
    }
}

