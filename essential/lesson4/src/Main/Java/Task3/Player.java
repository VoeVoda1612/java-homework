package Task3;


public class Player implements Playable,Recodable{
    @Override
    public void play() {
        System.out.println("Проигрывание идёт");
    }

    @Override
    public void record() {
        System.out.println("Запись идёт");
    }

    @Override
    public void pause() {
        System.out.println("Пауза");
    }

    @Override
    public void stop() {
        System.out.println("Стоп");
    }
}
