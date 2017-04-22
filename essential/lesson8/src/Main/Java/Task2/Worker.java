package Task2;

public class Worker {
    private String fullName;
    private String position;
    private int year;

    @Override
    public String toString() {
        return "ФИО - "+fullName+" Год поступления на работу - "+year+" Должность - "+position;
    }

    public static Worker[] sortWorkers(Worker[] workers){
        for (int i = 0; i < workers.length; i++) {

            for (int j = i; j < workers.length; j++) {

                char indexI=workers[i].fullName.charAt(0);
                char indexJ=workers[j].fullName.charAt(0);

                if(indexJ<indexI){
                    Worker tempWorkerI=workers[i];
                    Worker tempWorkerJ=workers[j];

                    workers[i]=tempWorkerJ;
                    workers[j]=tempWorkerI;
                }
            }
        }
        return workers;
    }

    public static Worker olderWorker(Worker [] workers){
        Worker olderWorker=workers[0];

        for (int i = 0; i < workers.length; i++) {
            if (olderWorker.year>workers[i].year) olderWorker=workers[i];
        }

        return olderWorker;
    }

    public Worker(String fullName, String position, int year) throws Exception{
        if ((year>1930)&&(year<2017)) {
            this.fullName = fullName;
            this.position = position;
            this.year = year;
        }
        else {
            throw new Exception("Неверно введены парметры");
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
