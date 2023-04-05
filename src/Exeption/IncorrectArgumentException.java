package Exeption;

import java.io.IOException;


public class IncorrectArgumentException extends Exception {
    private String argument;

    public IncorrectArgumentException(String argument) {
    }

    public String getArgument() {
        return argument;
    }

    @Override
    public String toString() {
        return "IncorrectArgumentException{" +
                "argument='" + argument + '\'' +
                '}';
    }
}
