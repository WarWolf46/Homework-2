public class Main {
    public static void main(String[] args) {
        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Собака = " + dog + "\nКошка = " + cat + "\nБумага = " + paper);
        // Задача 2
                var dog = 8.0;
                var cat = 3.6;
                var paper = 763789;

                System.out.println("Собака = " + dog + 4 + "\nКошка = " + cat + 4 + "\nБумага = " + (paper + 4));
        // Задача 3
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Собака = " + (dog - 3.5) + "\nКошка = " + (cat - 1.6) + "\nБумага = " + (paper - 7639));
        // Задача 4
        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);
        // Задача 5
        var frog = 3.5;
        System.out.println(frog);

        frog = (frog * 10);
        System.out.println(frog);

        frog = (frog / 3.5);
        System.out.println(frog);

        frog = (frog + 4);
        System.out.println(frog);
        // Задача 6
        var boxerOne = 78.2;
        var boxerTwo = 82.7;

        var totalWeight = boxerOne + boxerTwo;
        System.out.println("Общая масса бойцов: " + totalWeight + " кг");

        var weightDifference = boxerTwo - boxerOne;
        System.out.println("Разница между массами бойцов: " + weightDifference + " кг");
        // Задача 7
        var boxerOne = 78.2;
        var boxerTwo = 82.7;

        var totalWeight = boxerOne + boxerTwo;
        System.out.println("Общая масса бойцов: " + totalWeight + " кг");

        var weightDivide = boxerTwo % boxerOne;
        System.out.println("Остаток от деления между массами бойцов: " + weightDivide + " кг");
        // Задача 8.1
        var totalHours = 640;
        var workHoursPerEmployee = 8;

        var employees = totalHours / workHoursPerEmployee;

        System.out.println("Всего работников в компании - " + employees + " человек");
        // Задача 8.2
        var totalHours = 640;
        var workHoursPerEmployee = 8;

        var employees = totalHours / workHoursPerEmployee;

        employees = employees + 94;

        var newTotalHours = employees * workHoursPerEmployee;

        System.out.println("Если в компании работает " + employees +
                " человек, то всего " + newTotalHours + " часа работы может быть поделено между сотрудниками.");
    }
}