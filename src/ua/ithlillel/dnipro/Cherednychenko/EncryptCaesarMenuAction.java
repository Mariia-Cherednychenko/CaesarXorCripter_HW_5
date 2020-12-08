package ua.ithlillel.dnipro.Cherednychenko;

import java.util.Scanner;

public class EncryptCaesarMenuAction extends MenuActionAbstrClass {


    public EncryptCaesarMenuAction(Scanner scanner, SymbolCrypter symbolCrypter, StringCrypter stringCrypter) {
        super(scanner, symbolCrypter, stringCrypter);
    }

    @Override
    public String getName() {
        return "Caesar's code encryption";
    }
}
