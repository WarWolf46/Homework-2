public class Main {
    public static void main(String[] args) {

        var totalHours = 640;
        var workHoursPerEmployee = 8;

        var employees = totalHours / workHoursPerEmployee;

        employees = employees + 94;

        var newTotalHours = employees * workHoursPerEmployee;

        System.out.println("Если в компании работает " + employees +
                " человек, то всего " + newTotalHours + " часа работы может быть поделено между сотрудниками.");
    }
}