package abstraction;

public class CheckAbstraction extends AbstractDemo implements InterfaceDemo {
    @Override//annotation
    void showData() {

    }

    public static void main(String[] args) {
        CheckAbstraction abstraction=new CheckAbstraction();
        abstraction.showData();
    }
}
