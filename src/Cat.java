class Cat extends Animal {
    private boolean satiety;
    private static int catCount = 0;

    public Cat (String name) {
        super (name, 200, 0);
        this.satiety = false;
        catCount++;
    }

    public void run (int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м");
        }
    }

    public void swim (int distance) {
        System.out.println(name + " не умеет плавать");
    }

    public void eat (Bowl bowl, int amountFood) {
        if (bowl.getFood() >= amountFood) {
            bowl.eatingFood(amountFood);
            this.satiety = true;
            System.out.println(name + " поел и теперь сыт - " + isSatiety());
        } else {
            System.out.println(name + " не поел, так как не хватило еды в миске - " + isSatiety());
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public static int getCatCount() {
        return catCount;
    }
}