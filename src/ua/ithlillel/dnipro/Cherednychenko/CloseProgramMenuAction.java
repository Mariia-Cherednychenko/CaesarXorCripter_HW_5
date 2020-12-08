package ua.ithlillel.dnipro.Cherednychenko;

public class CloseProgramMenuAction implements MenuAction{

    @Override
    public void doAction() {
        System.out.println("The program is closing");
    }

    @Override
    public String getName() {
        return "Close Crypter Program";
    }

    @Override
    public boolean closeAfter() {
        return true;
    }
}
