public class Pen {
    public void Show() {
        System.out.println("Hello Worldfrom show");
    }

    String Color;
    String type;

    public void Second() {
        Color = "red";
        type = "Bic";
        System.out.println("The pen type is" + type + "and the color is " + Color);
    }

    public static void main(String[] args) {
        Pen sasa = new Pen();
        sasa.Show();

        Pen Bic = new Pen();

        Bic.Second();

    }
}
