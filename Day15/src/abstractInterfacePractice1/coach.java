package abstractInterfacePractice1;

public abstract class coach extends person {
    public coach() {
    }

    public coach(int age, String name) {
        super(age, name);
    }

    public abstract void teach();
}
