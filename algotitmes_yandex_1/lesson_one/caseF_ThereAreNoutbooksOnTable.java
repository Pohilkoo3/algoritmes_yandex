import java.io.IOException;
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

    public static void main(String[] args) throws IOException {
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
        if (b == d) {
            if (c == a) {
                addResult(a, b + d);
                return;
            }
            addResult(b, a + c);
            return;
        } else if (b > d) {
            if (a >= d) {
                addResult(a, b + c);
                return;
            } else {
                if ((b + c) * d <= (a + c) * b) {
                    addResult(d, b + c);
                    return;
                } else {
                    addResult(b, a + c);
                    return;
                }
            }
        } else {
            if (c >= b) {
                addResult(c, d + a);
                return;
            } else {
                if ((d + a) * b <= (a + c) * d) {
                    addResult(b, d + a);
                    return;
                } else {
                    addResult(d, a + c);
                    return;
                }
            }
        }


    }

    private static void addResult(int a, int b) {
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

