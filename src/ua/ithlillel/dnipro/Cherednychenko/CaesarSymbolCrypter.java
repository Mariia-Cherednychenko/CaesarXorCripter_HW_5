package ua.ithlillel.dnipro.Cherednychenko;

public class CaesarSymbolCrypter implements SymbolCrypter{

   int key;

    public void setKey(int key) {
        this.key= key;
    }

    @Override
    public char crypt(char c){
        return (char) (c+key);
    }

    @Override
    public char uncrypt(char c){
        return (char) (c-key);
   }
}
