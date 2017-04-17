package Task3;

public class Content {
    private String string;

    public Content(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void show(){
        System.out.println("Контент - "+string);
    }
}
