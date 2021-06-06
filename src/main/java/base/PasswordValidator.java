/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Harding
 */

package base;

import java.util.Scanner;

public class PasswordValidator {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    PasswordValidator pass = new PasswordValidator();
    String pw = pass.obtainPassword();
    System.out.println(pass.checkPassword(pw));
  }

  public String obtainPassword() {
    System.out.print("What is the password? ");
    return input.next();
  }

  public String checkPassword(String pw) {
    String truePassword = "abc$123";
    if (pw.equals(truePassword)) {
      return "Welcome!";
    }
    else {
      return "I don't know you.";
    }
  }
}
