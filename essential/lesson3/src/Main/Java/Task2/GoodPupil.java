package Task2;

public class GoodPupil extends Pupil {
    @Override
    public void showPupilsResult(){
        System.out.println(getName()+" "+getFirstName()+
                "\nГруппа учеников c хорошей успеваемостью"+
                "\nучиться - "+study+", читает - "+read+", пишет - "+write+", отдыхает - "+play);
    }

    public GoodPupil(String name, String firstName) {
        super(name, firstName);
        write="хорошо";
        read="хорошо";
        play="хорошо";
        study="хорошо";
    }
}
