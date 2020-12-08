package ua.ithlillel.dnipro.Cherednychenko;

public interface SymbolCrypter {
    void setKey(int i);
    char crypt (char c);
    char uncrypt(char c);
}
