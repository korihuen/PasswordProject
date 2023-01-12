package model;

import java.security.SecureRandom;
import java.lang.String;

public class Generator {
    private static final int upperBound = 132;
    private SecureRandom random;
    String password = "";
    String lowercase = "abcdefghijklmnopqrstuv";
    String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String numbers = "1234567890";
    String symbols = "!@#$%^&*()_+-=[]{}|;':,./<>?`~";

    public Generator(int length) {
        initializer();
        passwordGenerator(length);
    }

    public void initializer() {
        random = new SecureRandom();
    }



    private void passwordGenerator(int length) {
        for(int i = 0; i < length; i++) {
            if(random.nextInt(upperBound) < 33) {
                password += lowercase.charAt(random.nextInt(lowercase.length()-1));
            } else if (random.nextInt(upperBound) < 66) {
                password += uppercase.charAt(random.nextInt(uppercase.length() - 1));
            } else if (random.nextInt(upperBound) < 99){
                password += numbers.charAt(random.nextInt(numbers.length() - 1));
            } else {
                password += symbols.charAt(random.nextInt(symbols.length() - 1));
            }
        }

    }

    public String getPassword() {
        return  password;
    }

}
