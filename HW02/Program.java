package HW02;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
На языке Java реализовать интерфейс "Животное" со следующими полями:
1.Рост животного
2.Вес животного
3.Цвет глаз животного
И методы:
1.Издать звук
2.Напечатать информацию о животном
Так же реализовать следующие интерфейсы, реализующие интерфейс Животное:
1.Домашнее животное со следующими свойствами:
1.1 Кличка
1.2 Порода
1.3 Наличие прививок
1.4 Цвет шерсти
1.5 Дата рождения
И методами:
1.5 Проявлять ласку
2.Дикое животное со следующими свойствами:
2.1 Место обитания
2.2 Дата нахождения
Реализовать классы следующих животных, реализующих интерфейсы домашнего животного или дикого животного(надеюсь сами поймёте какое животное домашнее, а какое - дикое):
1.Кот со свойством:
1.1 Наличие шерсти(доступным только для чтения внешним классам)
2.1 Тигр
3.Собака со свойством:
3.1 Наличие дрессировки(доступным только для чтения внешним классам)
и методом:
3.2 Дрессировать
4.Волк со свойством:
4.1 Вожак стаи(доступным только для чтения внешним классам)
Так же реализовать абстрактный класс "Птица", реализующий интерфейс животное, у которого будет защищённое поле:
1.Высота полёта
и метод:
2. Летать, выводящий на экран фразу "Я лечу на x метрах, где x - высота полёта
и защищённый конструктор:
3.Конструктор принемающий высоту полёта
И следующие классы-наследники:
1.Курица
2.Аист
Для всех классов реализовать методы издавать звук, чтобы он печатал на консоль звук, примерно похожий на звук, который издаёт животное в реальном мире, а метод напечатать информацию, печатающий на экран все свойства, которые есть у данного животного. Так же для всех классов реализовать набор конструкторов, которые необходимы для задания всех свойств объекта, которые они у него есть.
Так же реализовать класс "Зоопарк", в котором будет храниться любая структура данных животных(массив, стек, очередь), в котором организовать приватный массив объектов-животных со следующими методами:
1.Добавить животное в зоопарк(добавляет новое животное в структуру данных, для массива использовать следующий алгоритм https://gospodaretsva.com/urok-27-vstavka-elementov-v-massiv.html , для стека и очереди вы алгоритмы уже знаете)
2.Убирает животное с номером i из зоопарка(Использовать этот алгоритм https://gospodaretsva.com/urok-26-udalenie-elementa-iz-odnomernogo-massiva.html для удаления из массива, для удаления из стека и очереди вы алгоритмы знаете)
3.Посмотреть информацию о животном с номером i
4.Заставить животное с номером i издать звук
5.Напечатать информацию о животных, которые есть на данный момент в зоопарке
6.Заставить всех животных, которые на данный момент есть в зоопарке, издать звук
Предоставить пользователю консольный интерфейс(консольное меню), который позволяет пользователю добавлять новых животных в зоопарк, убирать животных из зоопарка, печатать информацию о конкретном животном(вводя его номер), печатать информацию о всех животных в зоопарке на данный момент, заставлять животное издавать звук(введя номер животное), заставлять издавать звук всех животных, которые на данный момент есть в зоопарке)
Сделать возможность у животных летать, если это животное птица, проявлять ласку, если это домашнее животное и дрессировать, если это животное собака.
*/
public class Program {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.add(new Cat(20, 4, "голубой", "Мурка", "Шотландская", "есть",
                "Черный", LocalDate.of(2011, 11, 01), "есть"));
        zoo.add(new Dog(50, 20, "Зеленый", "Рекс", "Пудель",
                "есть", "белый", LocalDate.of(2015, 3, 3), "да"));
        zoo.add(new Wolf(90, 60, "желтый", "Лес",
                LocalDate.of(2023, 03, 25), "да"));
        zoo.add(new Tiger(95, 65, "зеленый", "Джунгли",
                LocalDate.of(2015, 10, 15)));
        zoo.add(new Chicken(15, 10, "красный", 1));
        zoo.add(new Stork(33, 18, "желтый", 100));

        try (Scanner scanner = new Scanner(System.in)) {
            myZoo(scanner, zoo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void myZoo(Scanner scanner, Zoo zoo) {
        while (true) {
            System.out.println("Меню");
            System.out.println("\t1. Посмотреть информацию о животном");
            System.out.println("\t2. Показать информацию о всех животных");
            System.out.println("\t3. Добавить животное");
            System.out.println("\t4. Удалить животное");
            System.out.println("\t5. Заставить животное издать звук");
            System.out.println("\t6. Заставить всех животных издать звук");
            System.out.println("\t7. Навыки животных");
            System.out.println("\t0. Выход");
            System.out.print("Выберите действие: ");

            int input = scanner.nextInt();

            switch (input) {
                case 1 -> getAnimalToShow(scanner, zoo);
                case 2 -> {
                    zoo.showAll();
                }
                case 3 -> getAnimalToAdd(scanner, zoo);
                case 4 -> getAnimalToRemove(scanner, zoo);
                case 5 -> getAnimalForMakeSound(scanner, zoo);
                case 6 -> zoo.makeSoundAll();
                case 7 -> showAllActivities(zoo);
                case 0 -> {
                    return;
                }
            }
        }
    }

    static void getAnimalToAdd(Scanner scanner, Zoo zoo) {
        System.out.println("\t1. Добавить кошку");
        System.out.println("\t2. Добавить собаку");
        System.out.println("\t3. Добавить волка");
        System.out.println("\t4. Добавить тигра");
        System.out.println("\t5. Добавить курицу");
        System.out.println("\t6. Добавить аиста");
        System.out.println("\t0. Отмена");
        System.out.print("Выберите действие: ");

        Map<String, Object> properties = new HashMap<>();
        int input = scanner.nextInt();

        switch (input) {
            case 1 -> {
                properties.putAll(getAnimalProperties(scanner));
                properties.putAll(getPetProperties(scanner));
                properties.putAll(getCatProperties(scanner));
                zoo.add(getNewCat(properties));
                System.out.println("Кошка добавлена в зоопарк!");
                return;
            }
            case 2 -> {
                properties.putAll(getAnimalProperties(scanner));
                properties.putAll(getPetProperties(scanner));
                properties.putAll(getDogProperties(scanner));
                zoo.add(getNewDog(properties));
                System.out.println("Собака добавлена в зоопарк!");
                return;
            }
            case 3 -> {
                properties.putAll(getAnimalProperties(scanner));
                properties.putAll(getWildAnimalProperties(scanner));
                properties.putAll(getWolfProperties(scanner));
                zoo.add(getNewWolf(properties));
                System.out.println("Волк добавлен в зоопарк!");
                return;
            }
            case 4 -> {
                properties.putAll(getAnimalProperties(scanner));
                properties.putAll(getWildAnimalProperties(scanner));
                zoo.add(getNewTiger(properties));
                System.out.println("Тигр добавлен в зоопарк!");
                return;
            }
            case 5 -> {
                properties.putAll(getAnimalProperties(scanner));
                properties.putAll(getBirdProperties(scanner));
                zoo.add(getNewChicken(properties));
                System.out.println("Курица добавлена в зоопарк!");
                return;
            }
            case 6 -> {
                properties.putAll(getAnimalProperties(scanner));
                properties.putAll(getBirdProperties(scanner));
                zoo.add(getNewStork(properties));
                System.out.println("Аист добавлен в зоопарк!");
                return;
            }
            case 0 -> {
                return;
            }
        }
    }

    static void getAnimalToRemove(Scanner scanner, Zoo zoo) {
        System.out.println("Удаление животного");
        zoo.showAll();
        System.out.print("Выберите животное для удаления: ");
        int input = scanner.nextInt() - 1;
        zoo.remove(input);
        System.out.println("Животное удалено!");
    }

    static void getAnimalToShow(Scanner scanner, Zoo zoo) {
        System.out.println("Просмотр информации");
        zoo.showAll();
        System.out.print("Выберите номер животного: ");
        int input = scanner.nextInt() - 1;
        zoo.show(input);
        showActive(zoo.getAnimal(input));
    }

    static void showActive(Animal animal) {
        if (animal instanceof Caress) {
            System.out.println(animal.getClass().getSimpleName() +
                    ((Caress) animal).caress());
        }
        if (animal instanceof Training) {
            System.out.println(animal.getClass().getSimpleName() +
                    ((Training) animal).training());
        }
        if (animal instanceof Fly) {
            System.out.println(animal.getClass().getSimpleName() +
                    ((Fly) animal).fly());
        }

    }

    static void showAllActivities(Zoo zoo) {
        for (Animal animal :
                zoo.getAll()) {
            showActive(animal);
        }
    }

    static void getAnimalForMakeSound(Scanner scanner, Zoo zoo) {
        System.out.println("Музыкальная пауза");
        zoo.showAll();
        System.out.print("Выберите номер животного: ");
        int input = scanner.nextInt() - 1;
        zoo.makeSound(input);
    }

    static HashMap<String, Object> getAnimalProperties(Scanner scanner) {
        HashMap<String, Object> map = new HashMap<>();
        System.out.print("Рост: ");
        map.put("growth", scanner.nextInt());
        System.out.print("Вес: ");
        map.put("weight", scanner.nextInt());
        System.out.print("Цвет галз: ");
        map.put("eyeColor", scanner.next());
        return map;
    }

    static HashMap<String, Object> getPetProperties(Scanner scanner) {
        HashMap<String, Object> map = new HashMap<>();
        System.out.print("Кличка: ");
        map.put("name", scanner.next());
        System.out.print("Порода: ");
        map.put("breed", scanner.next());
        System.out.print("Вакцинация (да/нет): ");
        map.put("vaccination", scanner.next());
        System.out.print("Цвет шерсти: ");
        map.put("coatColor", scanner.next());
        System.out.print("Дата рождения (день.месяц.год) >: ");
        map.put("dateBirth", parseDate(scanner.next()));
        return map;
    }

    static HashMap<String, Object> getWildAnimalProperties(Scanner scanner) {
        HashMap<String, Object> map = new HashMap<>();
        System.out.print("Место обитания: ");
        map.put("habitat", scanner.next());
        System.out.print("Дата нахождения (день.месяц.год): ");
        map.put("dateLocation", parseDate(scanner.next()));
        return map;
    }

    static HashMap<String, Object> getBirdProperties(Scanner scanner) {
        HashMap<String, Object> map = new HashMap<>();
        System.out.print("Высота полёта: ");
        map.put("flightAltitude", scanner.nextInt());
        return map;
    }

    static HashMap<String, Object> getCatProperties(Scanner scanner) {
        HashMap<String, Object> map = new HashMap<>();
        System.out.print("Наличие шерсти у животного (да/нет) >: ");
        map.put("wool", scanner.next());
        return map;
    }

    static HashMap<String, Object> getDogProperties(Scanner scanner) {
        HashMap<String, Object> map = new HashMap<>();
        System.out.print("Дрессирован (да/нет): ");
        map.put("wool", scanner.next());
        return map;
    }

    static HashMap<String, Object> getWolfProperties(Scanner scanner) {
        HashMap<String, Object> map = new HashMap<>();
        System.out.print("Вожак стаи (да/нет): ");
        map.put("leader", scanner.next());
        return map;
    }

    static Cat getNewCat(Map<String, Object> properties) {
        return new Cat((int) properties.get("growth"),
                (int) properties.get("weight"),
                (String) properties.get("eyeColor"),
                (String) properties.get("name"),
                (String) properties.get("breed"),
                (String) properties.get("vaccination"),
                (String) properties.get("coatColor"),
                (LocalDate) properties.get("dateBirth"),
                (String) properties.get("wool"));
    }

    static Dog getNewDog(Map<String, Object> properties) {
        return new Dog((int) properties.get("growth"),
                (int) properties.get("weight"),
                (String) properties.get("eyeColor"),
                (String) properties.get("name"),
                (String) properties.get("breed"),
                (String) properties.get("vaccination"),
                (String) properties.get("coatColor"),
                (LocalDate) properties.get("dateBirth"),
                (String) properties.get("training"));
    }

    static Wolf getNewWolf(Map<String, Object> properties) {
        return new Wolf((int) properties.get("growth"),
                (int) properties.get("weight"),
                (String) properties.get("eyeColor"),
                (String) properties.get("habitat"),
                (LocalDate) properties.get("dateLocation"),
                (String) properties.get("leader"));
    }

    static Tiger getNewTiger(Map<String, Object> properties) {
        return new Tiger((int) properties.get("growth"),
                (int) properties.get("weight"),
                (String) properties.get("eyeColor"),
                (String) properties.get("habitat"),
                (LocalDate) properties.get("dateLocation"));
    }

    static Chicken getNewChicken(Map<String, Object> properties) {
        return new Chicken((int) properties.get("growth"),
                (int) properties.get("weight"),
                (String) properties.get("eyeColor"),
                (int) properties.get("flightAltitude"));
    }

    static Stork getNewStork(Map<String, Object> properties) {
        return new Stork((int) properties.get("growth"),
                (int) properties.get("weight"),
                (String) properties.get("eyeColor"),
                (int) properties.get("flightAltitude"));
    }

    static LocalDate parseDate(String date) {
        String[] dateArr = date.split("\\.");
        int day = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]);
        int year = Integer.parseInt(dateArr[2]);
        return LocalDate.of(year, month, day);
    }
}
