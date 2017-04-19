package Task2;

public class ClassRoom {
    private Pupil[] pupils=new Pupil[4];

    public void addPupil(Pupil pupil){
        for (int i = 0; i < pupils.length; i++) {
            if (pupils[i]==null){
                pupils[i]=pupil;
                System.out.println(pupil.getName()+" "+pupil.getFirstName()+" успешно в клас добавлен");
                return;
            }
        }
        System.out.println("Свободного места в классе нет");
    }

    public void showResultsAllPupils(){
        for (int i = 0; i < pupils.length; i++) {
            pupils[i].showPupilsResult();
        }
    }
}
