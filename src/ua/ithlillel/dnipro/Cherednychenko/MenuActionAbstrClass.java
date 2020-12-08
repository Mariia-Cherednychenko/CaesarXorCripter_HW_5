package ua.ithlillel.dnipro.Cherednychenko;

import java.util.Scanner;

abstract class MenuActionAbstrClass implements MenuAction {

    Scanner scanner;
    StringCrypter stringCrypter;
    SymbolCrypter symbolCrypter;


    public MenuActionAbstrClass(Scanner scanner, SymbolCrypter symbolCrypter, StringCrypter stringCrypter) {
        this.scanner = scanner;
        this.symbolCrypter = symbolCrypter;
        this.stringCrypter = stringCrypter;
    }

    @Override
    public void doAction() {
        System.out.println("Please enter some string for the " + getName());
        String userString = scanner.nextLine();
        System.out.println("Please enter the key for the " +getName());
        symbolCrypter.setKey(scanner.nextInt());
        scanner.nextLine();
        System.out.println("The result of "+getName()+" is " + stringCrypter.crypt(userString));

    }

    @Override
    public String getName() {
        return "Menu Action";
    }
}
