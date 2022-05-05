package com.hillel.fedorenko.lessons.lesson10;

public class HomeWork10 {
    public static void main(String[] args) {
        Employer employer1 = new Employer("Fedor", "student", "helenko81@gmail.com",
                380685351419L, 0, 23);
        Employer employer2 = new Employer("Maxim", "junior", "Maxim1994@gmail.com",
                380734367813L, 800, 24);
        Employer employer3 = new Employer("Roman", "middle", "Roman1993@gmail.com",
                380964512345L, 2500, 31);
        Employer employer4 = new Employer("Timur", "senior", "Timur1992@gmail.com",
                380638769313L, 4500, 41);
        Employer employer5 = new Employer("Igor", "director", "Igor1991@gmail.com",
                380509011031L, 10000, 45);
        Employer[] employees = {employer1, employer2, employer3, employer4, employer5};

        for (Employer employee : employees) {
            if (employee.age > 40) {
                employee.showinfo();
            }
        }
    }
}
