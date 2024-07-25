public class Employee {
    private static int idNext = 1;
    public int idEmployee;
    private String fullName;
    private String post;
    private String email;
    private String number;
    private int salary;
    private int age;

    public Employee (String fullName, String post, String email, String number, int salary, int age) {
        this.idEmployee = idNext++;
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void infoEmployee() {
        System.out.println("ID: " + idEmployee);
        System.out.println("Фамилия имя отчество: " + fullName);
        System.out.println("Должность: " + post);
        System.out.println("E-mail: " + email);
        System.out.println("Номер телефона: " + number);
        System.out.println("Заработная плата: " + salary);
        System.out.println("Возраст: " + age);
    }
}
