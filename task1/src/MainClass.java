public class MainClass {
    public static void main (String args[]){
        System.out.println("task 1");
        int a = 2;
        float b = 3.4f;
        int c = 7;
        float d = 7.2f;
        String name = "Саша";
        int year = 2020;
        System.out.println(three(a, c, b, d));
        System.out.println(four(a, c));
        System.out.println(five(a));
        System.out.println(six(c));
        seven(name);
        System.out.println(year + eight(year));
        nine();
    }

    static float three(int a, int c, float b, float d){
/*Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d – входные параметры этого метода;*/
        return a * (b + (c / d));
    }

    static boolean four(int a, int c){
/*Написать метод, принимающий на вход два числа, и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
 если да – вернуть true, в противном случае – false;*/
        return (a + c > 10 && a + c <= 20)? true : false;
    }

    static String five(int a){
/*Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
положительное число передали или отрицательное (Замечание: ноль считаем положительным числом.);*/
    return (a >= 0)? "Number is positive" : "Number is negative";
    }

    static boolean six(int c){
/*Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;*/
        return (c < 0)? true : false;
    }

    static void seven(String name){
//Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        System.out.println("Привет, " + name + "!");
    }

    static String eight(int year){
/*Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го,
при этом каждый 400-й – високосный.*/
        return (year%4==0 && year%100!=0 || year%400==0)? " год - високосный." : " год - не високосный.";
    }

    static void nine(){
/*Не набирая код в IDE, ответьте на следующий вопрос. Есть два метода:
void myMethod(int a, String b) {}
void myMethod(String b, int a) {}
Это две разных сигнатуры одного метода или один и тот же метод?*/
        System.out.println("две разные сигнатуры");
    }




}
