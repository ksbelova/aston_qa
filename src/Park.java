public class Park {
    public String namePark;

    public Park (String namePark) {
        this.namePark = namePark;
    }

    public class Аttraction {
        public String nameАttraction;
        public String workingTime;
        public int price;

        public Аttraction (String nameАttraction, String workingTime, int price) {
            this.nameАttraction = nameАttraction;
            this.workingTime = workingTime;
            this.price = price;
        }

        public void infoАttraction () {
            System.out.println("Название аттракциона: " + nameАttraction);
            System.out.println("Время работы: " + workingTime);
            System.out.println("Стоимость: " + price + "₽");
        }
    }
}
