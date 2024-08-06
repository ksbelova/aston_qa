public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog ("Бобик");
        Dog dog2 = new Dog ("Жучка");
        Cat cat1 = new Cat ("Барсик");
        Cat cat2 = new Cat ("Персик");
        Cat cat3 = new Cat ("Феликс");

        System.out.println ("Задание 1");

        dog1.run (150);
        dog1.swim (5);

        dog2.run (550);
        dog2.swim (15);

        cat1.run (100);
        cat1.swim (5);

        cat2.run (250);

        Bowl bowl = new Bowl(10);

        Cat[] cats = {cat1, cat2, cat3};
        for (Cat cat : cats) {
            cat.eat(bowl, 5);
        }

        System.out.println ("Всего животных: " + Animal.getAnimalCount());
        System.out.println ("Всего собак: " + Dog.getDogCount());
        System.out.println ("Всего котов: " + Cat.getCatCount());

        System.out.println ("Задание 2");

        Shapes circle = new Circle (5, "Чёрный", "Белый");
        printShapeInfo ("Круг", circle);

        Shapes rectangle = new Rectangle (5, 10, "Жёлтый", "Синий");
        printShapeInfo ("Прямоугольник", rectangle);

        Shapes triangle = new Triangle(5, "Красный", "Зелёный");
        printShapeInfo ("Треугольник", triangle);
    }

    private static void printShapeInfo (String name, Shapes shapes) {
        System.out.println (name + ":");
        System.out.println ("Перимерт: " + shapes.getPerimeter());
        System.out.println ("Площадь: " + shapes.getSquare());
        System.out.println ("Цвет фона: " + shapes.getFillColor());
        System.out.println ("Цвет границ: " + shapes.getBorderColor());
    }
}