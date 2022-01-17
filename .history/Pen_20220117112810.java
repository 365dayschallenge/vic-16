public class Pen {
    public void Show() {
        System.out.println("from show");
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        Show sasa = new Show();
        sasa.Show();
    }
}
