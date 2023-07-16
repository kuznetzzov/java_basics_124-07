package com.company.lesson9;

import java.util.*;

public class lab9 {
    public static void main(String[] args) {

        // Задание 2
        CloneDelete cloneDelete = new CloneDelete();

        Collection<String> cars = new ArrayList<>();
        cars.add("audi");
        cars.add("bmw");
        cars.add("audi");
        cars.add("bmw");

        Collection<String> uniqCars = cloneDelete.getDel(cars);
        System.out.println(uniqCars);


        // Задание 3
        /**
         * Время добавления элементов в ArrayList: 111 мс
         * Время добавления элементов в LinkedList: 551 мс
         * Время выбора элементов из ArrayList: 63 мс
         * Время выбора элементов из LinkedList: 199565 мс
         *
         * Предположения:
         * 1) Поскольку LinkedList создает новый узел и только настраивает ссылку последнего элемента на новый узел - он должен заполняться быстрее.
         * 2) LinkedList выбирает элементы дольше потому что ему требуется пройти через список от начала или конца до нужного индекса.
         */
        int elements = 1000000;
        int randomElements = 100000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время добавления элементов в ArrayList: " + (endTime - startTime));

        LinkedList<Integer> linkedList = new LinkedList<>();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            linkedList.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время добавления элементов в LinkedList: " + (endTime - startTime));

        Random random = new Random();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < randomElements; i++) {
            int randomIndex = random.nextInt(elements);
            int selectedElement = arrayList.get(randomIndex);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время выбора элементов из ArrayList: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < randomElements; i++) {
            int randomIndex = random.nextInt(elements);
            int selectedElement = linkedList.get(randomIndex);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время выбора элементов из LinkedList: " + (endTime - startTime));


        // Задание 4
        System.out.println();
        Map<User, Integer> pointsByUser = new HashMap<>();
        pointsByUser.put(new User("Lilu"), 3);
        pointsByUser.put(new User("Alice"), 7);
        pointsByUser.put(new User("Ann"), 9);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        String name = scanner.nextLine();
        User user = new User(name);
        Integer points = pointsByUser.get(user);
        if (points != null) {
            System.out.println("Количество очков для пользователя " + user.getName() + ": " + points);
        } else {
            System.out.println("У пользователя " + user.getName() + " нет очков");
        }

    }
}
