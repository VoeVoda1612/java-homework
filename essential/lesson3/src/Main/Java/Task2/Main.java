package Task2;

public class Main {
    public static void main(String[] args) {
        ClassRoom classRoom=new ClassRoom();
        Pupil pupil1=new ExcelentPupil("Иван","Иванов");
        Pupil pupil2=new GoodPupil("Василий","Васильев");
        Pupil pupil3=new GoodPupil("Петр","Петров");
        Pupil pupil4=new BadPupil("Антон","Антонов");
        Pupil pupil5=new BadPupil("Анрей","Андреев");

        classRoom.addPupil(pupil1);
        classRoom.addPupil(pupil2);
        classRoom.addPupil(pupil3);
        classRoom.addPupil(pupil4);
        classRoom.addPupil(pupil5);

        classRoom.showResultsAllPupils();
    }
}
