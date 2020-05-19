public class MainClass {
    public static void main (String args[]){
        System.out.println("task 1");
        int a = 2;
        float b = 3.4f;
        int c = 7;
        float d = 7.2f;
        boolean e = four(a, c);
        String name = "Саша";
        int year = 2020;
        three(a, c, b, d);
        System.out.println(e);//System.out.println(four(a, c));
        five(a);
        System.out.println(six(c));
        seven(name);
        eight(year);
        nine();
    }
    static void three(int a, int c, float b, float d){
/*Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d – входные параметры этого метода;*/
        float e = a * (b + (c / d));
        System.out.print("a * (b + (c / d)) = ");
        System.out.println(e);
    }
    static boolean four(int a, int c){
/*Написать метод, принимающий на вход два числа, и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
 если да – вернуть true, в противном случае – false;*/
        int sum = a + c;
        if(sum>10 && sum<=20)
            return true;
        else
            return false;

    }
    static void five(int a){
/*Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
положительное число передали или отрицательное (Замечание: ноль считаем положительным числом.);*/
    if(a>=0)
        System.out.println("Number is positive");
    else
        System.out.println("Number is negative");
    }
    static boolean six(int c){
/*Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;*/
        if(c<0)
            return false;
        else
            return true;
    }
    static void seven(String name){
//Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        System.out.println("Привет, " + name + "!");
    }
    static void eight(int year){
/*Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го,
при этом каждый 400-й – високосный.*/
        if(year%4==0 || year%100!=0 && year%400==0)
            System.out.println(year + " год - високосный.");
        else
            System.out.println(year + " год - не високосный.");
    }
    static void nine(){
/*Не набирая код в IDE, ответьте на следующий вопрос. Есть два метода:
void myMethod(int a, String b) {}
void myMethod(String b, int a) {}
Это две разных сигнатуры одного метода или один и тот же метод?*/
        System.out.println("две разные сигнатуры");
    }




}
