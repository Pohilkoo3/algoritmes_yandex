package ru.pokhilko.lesson_one;

import lombok.Data;

import java.util.Scanner;

@Data
public class case1_Conditioner {


    public void getTemp() {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String[] in = first.split(" ");
        int tmpRoom = Integer.parseInt(in[0]);
        int tmpCond = Integer.parseInt(in[1]);
        String mode = scanner.nextLine();
        int result = 0;
        switch (mode) {
            case ("fan"):
                result = tmpRoom;
                break;
            case ("auto"):
                result = tmpCond;
                break;
            case ("freeze"):
                result = tmpRoom >= tmpCond ? tmpCond : tmpRoom;
                break;
            case ("heat"):
                result = tmpRoom >= tmpCond ? tmpRoom : tmpCond;
                break;
        }
        System.out.println(result);
    }
}
