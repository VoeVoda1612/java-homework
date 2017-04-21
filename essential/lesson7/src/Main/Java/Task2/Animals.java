package Task2;


public enum  Animals {
    Lion(5),Pig(7),Cow(10);

    int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString()+" Возраст - "+age;
    }
}
