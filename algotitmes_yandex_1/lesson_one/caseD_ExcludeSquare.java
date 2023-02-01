import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.Scanner;

/**
 * Решите в целых числах уравнение:
 a, b, c – данные целые числа: найдите все решения или сообщите, что решений в целых числах нет.
Формат ввода
Вводятся три числа a, b и c по одному в строке.
Формат вывода
Программа должна вывести все решения уравнения в порядке возрастания, либо NO SOLUTION (заглавными буквами),
 если решений нет. Если решений бесконечно много, вывести MANY SOLUTIONS.
 Не убрал все исключения. Валится на тесте
 **/
public class caseD_ExcludeSquare.java {


    public void squareSolution() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        getResult(a,b,c);
    }

     public String getResult(int a, int b, int c){
        String result = "";

        if (c < 0) {
            result = Main.TypeAnswer.NO_SOLUTION.nameOfEnum;
        }
        else if (c == 0) {
            if (a == 0) {
                result = b == 0 ? Main.TypeAnswer.MANY_SOLUTIONS.nameOfEnum : Main.TypeAnswer.NO_SOLUTION.nameOfEnum;
            }else {
               result = String.valueOf (b == 0? 0 : (-b/a));
            }
        }else {
            if (a == 0){
                if (b ==0){
                   result = Main.TypeAnswer.NO_SOLUTION.nameOfEnum;
                }else {
                    result = c*c == b ? Main.TypeAnswer.MANY_SOLUTIONS.nameOfEnum : Main.TypeAnswer.NO_SOLUTION.nameOfEnum;
                }
            }else {
                result = String.valueOf(b == 0? c*c/a : (c*c-b)/a);
            }
        }
         System.out.println(result);
        return result;
    }


    public enum TypeAnswer {
        NO_SOLUTION("NO SOLUTION"),
        MANY_SOLUTIONS("MANY SOLUTIONS");
        public String nameOfEnum;

        TypeAnswer(String nameOfEnum) {
            this.nameOfEnum = nameOfEnum;
        }
    }
}
