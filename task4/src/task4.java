/*1. Создать класс «Сотрудник» с полями: ФИО, должность, email, телефон, зарплата, возраст;
2. Конструктор класса должен заполнять эти поля при создании объекта;
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
4. Создать массив из 5 сотрудников:
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", " ivivan@mailbox.com ", "892312312", 30000,
30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

5. Создать классы Собака и Кот с наследованием от класса Животное;
6. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков);
7. У каждого животного есть ограничения на действия (бег: кот – 200 м., собака – 500 м.; прыжок: кот – 2 м., собака – 0.5 м.; плавание: кот не умеет плавать, собака – 10 м.);
8. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true);
9. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой – 600 м.*/
public class task4 {

    public static void main(String[] args){

        Employee tom = new Employee("tom", "middle", "ivivan@mailbox.com", "83849", 2500, 23);

        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("tom", "middle", "ivivan@mailbox.com", "83849", 2500, 23);
        empArr[1] = new Employee("bob", "middle", "ivivan@mailbox.com", "83849", 2500, 29);
        empArr[2] = new Employee("sam", "middle", "ivivan@mailbox.com", "83849", 2500, 45);
        empArr[3] = new Employee("nik", "middle", "ivivan@mailbox.com", "83849", 2500, 57);
        empArr[4] = new Employee("joe", "middle", "ivivan@mailbox.com", "83849", 2500, 77);

        for(int i = 0; i < empArr.length; i++){
            if(empArr[i].age >= 40){
                empArr[i].displayInfo();
            }
        }

       Animals[] animalsArr = new Animals[3];
        animalsArr[0] = new Cat("tom");
        animalsArr[1] = new Dog("bob");
        animalsArr[2] = new Cat("sam");

        for(Animals animal : animalsArr){
            animal.run(150);
            animal.jump(2.5);
            animal.swim(5);
        }
    }
}


