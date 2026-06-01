public class Main {
    public static void main(String[] args) {

        var boxerOne = 78.2;
        var boxerTwo = 82.7;

        var totalWeight = boxerOne + boxerTwo;
        System.out.println("Общая масса бойцов: " + totalWeight + " кг");

        var weightDivide = boxerTwo % boxerOne;
        System.out.println("Остаток от деления между массами бойцов: " + weightDivide + " кг");
    }
}