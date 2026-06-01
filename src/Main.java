public class Main {
    public static void main(String[] args) {

        var totalHours = 640;
        var workHoursPerEmployee = 8;

        var employees = totalHours / workHoursPerEmployee;

        System.out.println("Всего работников в компании - " + employees + " человек");
    }
}