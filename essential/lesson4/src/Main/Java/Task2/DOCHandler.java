package Task2;

public class DOCHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("Документ открыт в формате doc");
    }

    @Override
    public void create() {
        System.out.println("Документ создан в формате doc");
    }

    @Override
    public void change() {
        System.out.println("Документ изменён в формате doc");
    }

    @Override
    public void save() {
        System.out.println("Документ сохранён в формате doc");
    }
}
