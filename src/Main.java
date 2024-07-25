public class Main {
    public static void main(String[] args) {
        Employee [] employeeArray = new Employee [5];

        employeeArray [0] = new Employee("Иванов Иван Иванович", "Руководитель  проекта", "ivanovii@mail.ru", "+7 (000) 000-00-00", 500000, 40);
        employeeArray [1] = new Employee("Николаев Николай Николаевич", "Менеджер", "nikolaevnn@mail.ru", "+7 (000) 000-00-11", 400000, 30);
        employeeArray [2] = new Employee("Александров Александр Александрович", "Разработчик", "aleksanrovaa@mail.ru", "+7 (000) 000-00-022", 300000, 25);
        employeeArray [3] = new Employee("Сергеев Сергей Сергеевич", "Дизайнер", "sergeeevss@mail.ru", "+7 (000) 000-00-33", 200000, 23);
        employeeArray [4] = new Employee("Макаров Макар Макарович", "Тестировщик", "makarovmm@mail.ru", "+7 (000) 000-00-44", 100000, 27);

        for (Employee employee : employeeArray) {
            employee.infoEmployee();
            System.out.println();
        }
//        Park park = new Park("Центральный парк");
//        Park.Аttraction attraction1 = park.new Аttraction("Колесо обозрения", "10:00 - 23:00", 1500);
//
//        System.out.println("Название парка: " + park.namePark);
//        System.out.println("Аттракцион 1:");
//        attraction1.infoАttraction();
    }
}