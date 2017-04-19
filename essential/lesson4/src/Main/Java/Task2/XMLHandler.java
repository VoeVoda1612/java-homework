package Task2;

public class XMLHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("Документ открыт в формате xml");
    }

    @Override
    public void create() {
        System.out.println("Документ создан в формате xml");
    }

    @Override
    public void change() {
        System.out.println("Документ изменён в формате xml");
    }

    @Override
    public void save() {
        System.out.println("Документ сохранён в формате xml");
    }
}
