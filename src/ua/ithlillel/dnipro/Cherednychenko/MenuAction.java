package ua.ithlillel.dnipro.Cherednychenko;

import java.util.Scanner;

public interface MenuAction {

    void doAction ();

    String getName();

    default boolean closeAfter(){
        boolean close=false;

        System.out.println("If you want to close the program - please enter '5'. If you want to continue - please enter  any other digit");

        if (new Scanner(System.in).nextInt()==5){
            close=true;
            System.out.println("The program is closing");
        }
        return close;
    }

}
