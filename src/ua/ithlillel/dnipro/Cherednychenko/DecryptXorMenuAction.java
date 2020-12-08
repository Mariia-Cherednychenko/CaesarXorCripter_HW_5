package ua.ithlillel.dnipro.Cherednychenko;

import java.util.Scanner;

public class DecryptXorMenuAction extends MenuActionAbstrClass {

    public DecryptXorMenuAction(Scanner scanner, SymbolCrypter symbolCrypter, StringCrypter stringCrypter) {
        super(scanner, symbolCrypter, stringCrypter);
    }

    @Override
    public String getName() {
        return "Xor code decryption";
    }
}
