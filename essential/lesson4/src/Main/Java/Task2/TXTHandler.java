package Task2;

public class TXTHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("Документ открыт в формате txt");
    }

    @Override
    public void create() {
        System.out.println("Документ создан в формате txt");
    }

    @Override
    public void change() {
        System.out.println("Документ изменён в формате txt");
    }

    @Override
    public void save() {
        System.out.println("Документ сохранён в формате txt");
    }
}
