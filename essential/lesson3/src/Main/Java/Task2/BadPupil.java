package Task2;

public class BadPupil extends Pupil{
    @Override
    public void showPupilsResult(){
        System.out.println(getName()+" "+getFirstName()+
                "\nГруппа учеников c плохой успеваемостью"+
                "\nучиться - "+study+", читает - "+read+", пишет - "+write+", отдыхает - "+play);
    }

    public BadPupil(String name, String firstName) {
        super(name, firstName);
        write="удовлетворительно";
        read="удовлетворительно";
        play="удовлетворительно";
        study="удовлетворительно";
    }
}
