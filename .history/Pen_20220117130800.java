import java.io.Console;

public class Pen {
    public void Show() {
        System.out.println("Hello World from show");
    }

    String Color;
    String type;
    String action;
    Boolean Action;

    public void Second() {
        Color = "red";
        type = "Bic";
        Action = false;

    }

    public static void main(String[] args) {
        Pen sasa = new Pen();
        sasa.Show();

        Pen Bic = new Pen();

        Bic.Second();
        System.out.println("What do you want to do to the pen?");
        Console console = System.console();
        Bic.action = console.readLine();
        System.out.println("The pen type is " + Bic.type + " and the color is " + Bic.Color);

        if (Bic.action == "open") {
            Bic.Action = true;
        }
        if (Bic.action == "close") {
            Bic.Action = false;
        }
        System.out.println("Your pen is " + Bic.action + "hence the state is " + Bic.Action);
    }
}
