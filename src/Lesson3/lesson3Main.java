package Lesson3; // дефолтные значения примитивных типов.



public class lesson3Main {
    public static void main(String[] args) {
//    int [] arr = new int [5];
//    arr [0] = 1;
//    arr [2] = 2;
//    arr [4] = 3;

//        int [] arr = {1, 2, 4, 5};
//        arr [3] = 10;
//        int amountArray = arr.length;
//        arr[amountArray - 1] = 53;
//
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

//        int [] k = new int[]{1, 2, 3, 4};
//        int [] j = {1,46,23,784,84};{
//        } for (int num: j) {
//            System.out.println(num);
//        }

//        String[] s = new String[]{"one", "two", "three", "four"};
//        int amountChars = s.length;
//        String[] reversed = new String[amountChars];
//        while (amountChars > 0){
//            System.out.println(s[amountChars -1]);
//            reversed[4- amountChars] = s[amountChars -1];
//            amountChars--;
//        }
//    System.out.println("");
        int [] [] someArray = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}};
        for (int  i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++)
            System.out.println(""+someArray[i][j]+"");
        }
    }



}

//        int i;
//        for (i = 0; i < 5; i++) {
//            if (i >= 2) {
//                break;
//            }
//            System.out.println("Hello V");
//        }
//        System.out.println("Counter equals to: "+i);
//    public static void main(String[] args) {
//    int k = 1;
//    do {
//        System.out.println(k);
//        k++;
//    } while (k <= 10);
//
//    }
//        int i = 10;
//        while (i > 0){
//            System.out.println(i);
//            i--;
//        }
//
//    }


//        public static void main(String args[]){    //Улучшенный цикл for
//            int [] numbers = {10, 20, 30, 40, 50};
//
//            for(int x : numbers ){                 //Объявление: к новому объявленному блоку переменной осуществляется доступ, который имеет тип совместимый с элементами массива.
//                                                      Выражение: вычисляет нужное Вам в массиве цикла. Выражение может быть переменной или методом массива, вызов которого возвращает массив.
//                System.out.print( x );
//                System.out.print(",");
//            }
//            System.out.print("\n");
//            String [] names ={"Олег", "Иван", "Дима", "Юля"};
//            for( String name : names ) {
//                System.out.print( name );
//                System.out.print(",");
//            }
//        }
//    }
//public static void main(String[] args) {        /while
//    int x = 10;
//
//    while( x < 16 ) {
//        System.out.print("Значение x: " + x );
//        x++;
//        System.out.print("\n");
//    }
//}
