package ua.ithlillel.dnipro.Cherednychenko;

public class StringCrypter {
    SymbolCrypter symbolCrypter;

    public StringCrypter(SymbolCrypter symbolCrypter) {
        this.symbolCrypter = symbolCrypter;
    }

    public String crypt (String userString){
       String newString = "";
        for (char letter : userString.toCharArray()){
             newString +=symbolCrypter.crypt(letter);
        }
        return newString;
    }

    public String uncrypt (String userString){
        String newString = "";
        for (char letter : userString.toCharArray()){
            newString +=symbolCrypter.uncrypt(letter);
        }
        return newString;
    }
}
