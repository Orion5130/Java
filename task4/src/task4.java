//9. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой – 600 м.*/
public class task4 {

    public static void main(String[] args){

        Employee tom = new Employee("Tom", "middle", "v@mailbox.com", "83849", 2500, 21);
        tom.displayInfo();

        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("Lia", "junior", "i@mailbox.com", "83849", 2500, 20);
        empArr[1] = new Employee("Bob", "middle", "j@mailbox.com", "83849", 2500, 22);
        empArr[2] = new Employee("Sam", "senior", "k@mailbox.com", "83849", 2500, 41);
        empArr[3] = new Employee("Nik", "middle", "o@mailbox.com", "83849", 2500, 34);
        empArr[4] = new Employee("Joe", "junior", "u@mailbox.com", "83849", 2500, 17);

        for(int i = 0; i < empArr.length; i++){
            if(empArr[i].age >= 40){
                empArr[i].displayInfo();
            }
        }

       Animals[] animalsArr = new Animals[3];
        animalsArr[0] = new Cat("Барсик");
        animalsArr[1] = new Dog("Бим");
        animalsArr[2] = new SuperCat("Хвост");

        for(Animals animal : animalsArr){
            animal.run(150);
            animal.jump(2.5);
            animal.swim(5);
        }
    }
}


