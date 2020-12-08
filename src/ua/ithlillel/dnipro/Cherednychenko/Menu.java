package ua.ithlillel.dnipro.Cherednychenko;

import java.util.Scanner;

public class Menu {

    Scanner scanner;
    MenuAction[] menuAction;

    public Menu(Scanner scanner, MenuAction[] menuAction) {
        this.scanner = scanner;
        this.menuAction = menuAction;
    }

    public void addAction(MenuAction menuAction) {
        menuAction.doAction();
    }

    public void run() {

        boolean close = false;

        while(!close) {
            for (int i = 0; i < menuAction.length; i++) {
                System.out.println((i + 1) + ". - " + menuAction[i].getName());
            }

            System.out.println("Enter your choice, please: ");

            try {
                int choice = scanner.nextInt() - 1;
                scanner.nextLine();

                if (choice >= 0 && choice<=4)
                {
                     addAction(menuAction[choice]);
                     close = menuAction[choice].closeAfter();
                }

                else {
                    System.out.println("Incorrect input. Please choose only index from the menu.");
                }
            } catch (Exception E) {
                System.out.println("Incorrect input. You could try again");
                scanner.nextLine();
            }
        }

    }
}
