package Task2;

public class ExcelentPupil extends Pupil {
    @Override
    public void showPupilsResult(){
        System.out.println(getName()+" "+getFirstName()+
                          "\nГруппа лучших учеников"+
                          "\nучиться - "+study+", читает - "+read+", пишет - "+write+", отдыхает - "+play);
    }

    public ExcelentPupil(String name, String firstName) {
        super(name, firstName);
        write="отлично";
        read="отлично";
        play="отлично";
        study="отлично";
    }
}
