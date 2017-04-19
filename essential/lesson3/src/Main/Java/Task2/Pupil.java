package Task2;


public class Pupil {
    private String name;
    private String firstName;
    protected String study;
    protected String write;
    protected String read;
    protected String play;

    public void showPupilsResult(){
        System.out.println(getName()+" "+getFirstName()+
                "\nУченик");
    }

    public Pupil(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}
}
