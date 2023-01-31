package ru.pokhilko.lesson_one;

import java.util.Scanner;

public class case2_isTriangleExist
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
