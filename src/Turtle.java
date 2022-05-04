public class Turtle {
    String name = "";

    public void setName(String n) {
        System.out.println(n);
    }

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        turtle.setName("Arkasha");
        System.out.println(turtle.name);
    }
}
