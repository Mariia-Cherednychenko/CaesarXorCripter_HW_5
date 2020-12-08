package ua.ithlillel.dnipro.Cherednychenko;

import java.util.Scanner;

public class DecryptCaesarMenuAction extends MenuActionAbstrClass{

    public DecryptCaesarMenuAction(Scanner scanner, SymbolCrypter symbolCrypter, StringCrypter stringCrypter) {
        super(scanner, symbolCrypter, stringCrypter);
    }

    @Override
    public void doAction() {
        System.out.println("Please enter some string for the " + getName());
        String userString = scanner.nextLine();
        System.out.println("Please enter the key for the " +getName());
        symbolCrypter.setKey(scanner.nextInt());
        scanner.nextLine();
        System.out.println("The result of "+getName()+" is " + stringCrypter.uncrypt(userString));

    }

    @Override
    public String getName() {
        return "Caesar's code decryption";
    }
}
