package machine;

public class Machine {
    public static void main(String[] args) {
        boolean continueWorking = true;
        while (continueWorking) {
            continueWorking = Action.process();
        }
    }
}
