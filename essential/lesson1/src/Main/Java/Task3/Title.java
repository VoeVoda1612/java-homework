package Task3;


public class Title {
    private String string;

    public Title(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void show(){
        System.out.println("Содержание - "+string);
    }
}
