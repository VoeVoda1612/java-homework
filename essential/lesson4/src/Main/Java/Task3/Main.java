package Task3;

public class Main {
    public static void main(String[] args) {
        Playable playable=new Player();
        Recodable recodable=new Player();

        playable.play();
        playable.pause();
        playable.stop();

        System.out.println("---------");

        recodable.record();
        recodable.pause();
        recodable.stop();
    }
}
