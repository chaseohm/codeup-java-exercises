package util;

import java.util.Scanner;

public class User {
    private static Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    private String username;
    private String password;
    private long numberOfSuccessfulLogins;
    private int numberOfFailedLoginAttempts;
    private boolean isLoggedIn;
    private static int numberOfUsers;
}
