package ua.ithlillel.dnipro.Cherednychenko;

import java.util.Scanner;

public class EncryptXorMenuAction extends MenuActionAbstrClass {

    public EncryptXorMenuAction(Scanner scanner, SymbolCrypter symbolCrypter, StringCrypter stringCrypter) {
        super(scanner, symbolCrypter, stringCrypter);
    }

    @Override
    public String getName() {
        return "Xor code encryption";
    }
}
