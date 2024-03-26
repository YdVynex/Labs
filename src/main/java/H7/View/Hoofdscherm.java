package H7.View;
import H7.App.Boundary;
import H7.Model.Webshop;
import H7.App.App;

public class Hoofdscherm implements Boundary {

    public void start() {
        while (true) {
            System.out.println("Welkom bij fake.webshop.com");
            System.out.println("------------------------------------------------------");
            System.out.println("Typ de fake webshop met een .com erachter waar je een bestelling wilt maken");
            System.out.println("Typ 'Stop' als je niets wilt bestellen");

            try {
                switch (App.readLine()) {
                    case "Stop" -> {
                        System.out.println("Tot ziens.");
                        return;
                    }
                    default -> {
                        System.out.println("Welkom bij " + App.readLine());
                        Webshop.createDummy(App.readLine() + ".com");
                    }
                }
             } catch (Exception e) {
                System.out.println("Het is echt niet zo moeilijk om .com achter iets te typen");
                return;
            }
            System.out.println("Doe maar even een account maken");
            System.out.println("Typ hier je naam");
        }
    }
}
