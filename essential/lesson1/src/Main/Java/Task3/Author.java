package Task3;


public class Author {
    private String string;

    public Author(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void show(){
        System.out.println("Автор - "+string);
    }
}
