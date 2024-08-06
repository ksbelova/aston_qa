class Dog extends Animal {
    private static int dogCount = 0;

    public Dog (String name) {
        super (name, 500, 10);
        dogCount++;
    }

    public void run (int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м");
        }
    }

    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}