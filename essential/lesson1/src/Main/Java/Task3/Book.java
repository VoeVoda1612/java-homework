package Task3;

public class Book {
    private Author author;
    private Content content;
    private Title title;

    public Book(String author, String title,String content) {
        this.author=new Author(author);
        this.content=new Content(content);
        this.title=new Title(title);
    }

    public void show(){
        author.show();
        title.show();
        content.show();
    }

    public void setAuthor(String author) {
        this.author.setString(author);
    }

    public void setContent(String content) {
        this.content.setString(content);
    }

    public void setTitle(String title) {
        this.title.setString(title);
    }
}
