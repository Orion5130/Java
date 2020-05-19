import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
    /*
    блок настроек игры
     */
    private static char[][] map;   //матрица игры
    private static int SIZE = 3;   //размерность поля

    private static final char DOT_EMPTY = '•';   //пустое поле
    private static final char DOT_X = 'X';       //крестик
    private static final char DOT_O = 'O';       //нолик

    private static final boolean SILLY_MODE = false; //режим глупого компьютера

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args){
        initMap();
        System.out.println("Игра началась");
        printMap();

        while(true){
            humanTurn();
            if(isEndGame(DOT_X)){
                break;
            }

            computerTurn();
            if(isEndGame(DOT_O)){
                break;
            }
            printMap();
        }
        System.out.println("Игра закончена");
    }

    /**
     * Метод подготовки игрового поля
     */
    private static void initMap(){
        map = new char[SIZE][SIZE];
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    /**
     * Метод вывода игрового поля на экран
     */
    private static void printMap(){
        for(int i = 0; i <= SIZE; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 0; i < SIZE; i++){
            System.out.print((i+1) + " ");
            for(int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * ход человека
     */
    private static void humanTurn() {
        int x, y;

        do{
            System.out.println("Введите координаты ячейки через пробел");
            x = scanner.nextInt() -1;
            y = scanner.nextInt() -1;
        }while(!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    /**
     * ход компьютера
     */
    private static void computerTurn() {
        int x = -1;
        int y = -1;
        if(SILLY_MODE) {
            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            } while (!isCellValid(x, y));
        }
       else{
            boolean movefound = false;
            for(int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) {
                        if (i - 1 >= 0 && j - 1 >= 0 && map[i - 1][j - 1] == DOT_O) {
                            x = i;
                            y = j;
                            movefound = true;
                            //System.out.println("LU");
                        }
                        else if (i - 1 >= 0 && map[i - 1][j] == DOT_O) {
                            x = i;
                            y = j;
                            movefound = true;
                            //System.out.println("U");
                        }
                        else if (j - 1 >= 0 && map[i][j - 1] == DOT_O) {
                            x = i;
                            y = j;
                            movefound = true;
                            //System.out.println("L");
                        }
                        else if (i + 1 < SIZE && j - 1 >= 0 && map[i + 1][j - 1] == DOT_O) {
                            x = i;
                            y = j;
                            movefound = true;
                            //System.out.println("LD");
                        }
                        else if (i + 1 < SIZE && map[i + 1][j] == DOT_O) {
                            x = i;
                            y = j;
                            movefound = true;
                            //System.out.println("D");
                        }
                        else if (i - 1 >= 0 && j + 1 < SIZE && map[i - 1][j + 1] == DOT_O) {
                            x = i;
                            y = j;
                            movefound = true;
                            //System.out.println("RU");
                        }
                        else if (j + 1 < SIZE && map[i][j + 1] == DOT_O) {
                            x = i;
                            y = j;
                            movefound = true;
                            //System.out.println("R");
                        }
                        else if (i + 1 < SIZE && j + 1 < SIZE && map[i + 1][j + 1] == DOT_O) {
                            x = i;
                            y = j;
                            movefound = true;
                            //System.out.println("RD");
                        }
                    }
                    if(movefound) break;
                }
                if(movefound) break;
            }
            if(x == -1) {
                do {
                    x = random.nextInt(SIZE);
                    y = random.nextInt(SIZE);
                } while (!isCellValid(x, y));
            }
        }
        map[x][y] = DOT_O;
        System.out.println("Компьютер выбрал ячейку " + (x + 1) + " " + (y +1));
    }

    /**
     * Метод выбора выгодного хода
     * @param newboard новое поле
     * @param playerSymbol - символ игрока
     */
   /* private static void minimax(int newboard, char playerSymbol){


    }*/

    /**
     * Метод валидации запрашиваемой ячейки
     * @param x - координата по вертикали
     * @param y - координата по горизонтали
     * @return boolean - признак валидности
     */
    private static boolean isCellValid(int x, int y) {
        boolean result = true;

        if(x < 0 || x >= SIZE || y < 0 || y >= SIZE){
            result = false;
        }
        if(map[x][y] != DOT_EMPTY){
            result = false;
        }

        return result;
    }

    /**
     * Метод проверки игры на завершенность
     * @param playerSymbol - символ, которым играет игрок
     * @return boolean - признак завершения игры
     */
    private static boolean isEndGame(char playerSymbol){
        boolean result = false;
        if(checkWin(playerSymbol)){
            System.out.println("Победили " +  playerSymbol);
            result = true;
        }
        if(isMapFull()){
            System.out.println("Ничья");
            result = true;
        }
        return result;
    }

    /**
     * Проверка 100% заполнения поля
     * @return boolean признак оптимальности
     */
    private static boolean isMapFull(){
        boolean result = true;
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                if(map[i][j] == DOT_EMPTY){
                    result = false;
                }
            }
        }
        return result;
    }

    /**
     * Метод проверки выйгрыша
     * @param playerSymbol - символ, которым играет игрок
     * @return boolean признак выйгрыша
     */
    private static boolean checkWin(char playerSymbol){
        boolean result = false;

        if(
          (map[0][0] == playerSymbol && map[0][1] == playerSymbol && map[0][2] == playerSymbol) ||
          (map[1][0] == playerSymbol && map[1][1] == playerSymbol && map[1][2] == playerSymbol) ||
          (map[2][0] == playerSymbol && map[2][1] == playerSymbol && map[2][2] == playerSymbol) ||
          (map[0][0] == playerSymbol && map[1][0] == playerSymbol && map[2][0] == playerSymbol) ||
          (map[0][1] == playerSymbol && map[1][1] == playerSymbol && map[2][1] == playerSymbol) ||
          (map[0][2] == playerSymbol && map[1][2] == playerSymbol && map[2][2] == playerSymbol) ||
          (map[0][0] == playerSymbol && map[1][1] == playerSymbol && map[2][2] == playerSymbol) ||
          (map[2][0] == playerSymbol && map[1][1] == playerSymbol && map[0][2] == playerSymbol)
        ){
                    result = true;
        }
        return result;
    }



}
