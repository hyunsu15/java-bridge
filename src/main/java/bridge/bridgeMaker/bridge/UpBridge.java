package bridge.bridgeMaker.bridge;

public class UpBridge implements Bridge {
    @Override
    public String getDirection() {
        return "U";
    }

    @Override
    public int getValue() {
        return 1;
    }
}