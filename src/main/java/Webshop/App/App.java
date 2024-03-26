package Webshop.App;

import Webshop.View.Hoofdscherm;
import Webshop.repos.AccountRepo;

import java.util.Scanner;

public class App {

    public static final AccountRepo accrepo = new AccountRepo();
    private static final Scanner scanner = new Scanner(System.in);

    public static String readLine() { return scanner.nextLine(); }

    public static String prompt(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static void main(String[] args) { new Hoofdscherm().start(); }
}
