package ua.ithlillel.dnipro.Cherednychenko;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SymbolCrypter caesarSymbolCrypter=new CaesarSymbolCrypter();
        SymbolCrypter xorSymbolCrypter = new XorSymbolCrypter();
        StringCrypter caesarStringCrypter = new StringCrypter(caesarSymbolCrypter);
        StringCrypter xorStringCrypter = new StringCrypter(xorSymbolCrypter);

         MenuAction[] menuActions = {
                new EncryptCaesarMenuAction(scanner,caesarSymbolCrypter,caesarStringCrypter),
                new DecryptCaesarMenuAction(scanner,caesarSymbolCrypter,caesarStringCrypter),
                new EncryptXorMenuAction(scanner,xorSymbolCrypter,xorStringCrypter),
                new DecryptXorMenuAction(scanner,xorSymbolCrypter,xorStringCrypter),
                new CloseProgramMenuAction()};

        System.out.println("CRYPT PROGRAM \nPlease choose the menu index");
        Menu menu = new Menu(scanner,menuActions);
        menu.run();
    }
}
