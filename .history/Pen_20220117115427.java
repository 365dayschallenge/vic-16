public class Pen {
    public void Show() {
        System.out.println("Hello World from show");
    }

    String Color;
    String type;

    public void Second() {
        Color = "red";
        type = "Bic";
    }

    public static void main(String[] args) {
        Pen sasa = new Pen();
        sasa.Show();

        Pen Bic = new Pen();

        Bic.Second();
        System.out.println("The pen type is " + Bic.type + " and the color is " + Bic.Color);
    }
}
