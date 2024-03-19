package p1Z0_808_2;

public class SpecialException extends Exception{
    public SpecialException(String message) {
        super(message);
        System.out.println(message);
    }
}
