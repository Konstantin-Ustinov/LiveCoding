package net.livecoding.www;

public class WrongNumberException extends RuntimeException {
    public WrongNumberException() {
    }

    public WrongNumberException(String message) {
        super(message);
    }
}
