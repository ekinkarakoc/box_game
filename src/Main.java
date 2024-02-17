public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ekin",10,120,100);
        Fighter f2 = new Fighter("Ali",10,105,100);

        Match match = new Match(f1,f2,90,110);
        match.run();

    }
}