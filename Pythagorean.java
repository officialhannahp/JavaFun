public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        int squareA = legA * legA;
        int squareB = legB * legB;
        int squareC = squareA + squareB;
        double legC = Math.sqrt(squareC);
        return legC;
    }
}