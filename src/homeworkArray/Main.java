    package homeworkArray;

    public class Main {

        public static void main(String[] args) {

            //Задание 1
            int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};//инициализация массива array.

            int[] arrayNew = changeArray(array);//присвоение новой переменной новых значений.

            System.out.print("Задание №1:" + " ");

            for (int i = 0; i < arrayNew.length; i++) {//распечатка массива.

                System.out.print(arrayNew[i] + ", ");//выводим измененный массив.
            }

            System.out.println(" ");//переход на следующую строку

            //Задание 2
            int[] fillArray = fillArray();//инициализация пустого массива fillArray

            System.out.print("Задание №2:" + " ");

            for (int j = 0; j < fillArray.length; j++) {//распечатка массива.

                System.out.print(fillArray[j] + " ");//выводим измененный массив.
            }

            System.out.println(" ");

            //Задание 3
            int[] givenArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};//инициализация массива givenArray;

            int[] multiplyArray = changeMultiplyArray(givenArray);//присваиваем новой переменной полученные значения.

            System.out.print("Задание №3:" + " ");

            for (int k = 0; k < multiplyArray.length; k++) {//распечатка массива.

                System.out.print(multiplyArray[k] + " ");//выводим измененный массив.
            }

            System.out.println(" ");

            //Задание 4
            int[][] twoDimensionalArray = fillDiagonalArray();

            System.out.print("Задание №4:" + " ");
            System.out.println();

            for (int n = 0; n < twoDimensionalArray.length; n++) {
                for (int m = 0; m < twoDimensionalArray.length; m++) {
                    System.out.print(twoDimensionalArray[n][m] + " ");
                }
                System.out.println();
            }

            //Задание 5
            int[] array2 = {4, 3, 16, 8, 22, 12};

            System.out.print("Задание №5.1:" + " ");
            System.out.println(getMin(array2) + " минимальное значение");
            System.out.print("Задание №5.2:" + " ");
            System.out.println(getMax(array2) + " максимальное значение");

            //Задание 6
            int[] array3 = {4, 3, 2, 6, 3, 7, 1, 1, 3};

            System.out.print("Задание №6:" + " ");
            System.out.println(isEquationArray(array3));

            //Задание 7
            int[] array4 = {3, 5, 4, 8, 2, 4, 11};
            int n = 2;
            array4 = mutableArray(array4, n);//присвоение новой переменной новых значений.
            System.out.print("Задание №7:" + " ");
                for (int m = 0; m < array4.length; m++) {
                    System.out.print((array4[m]) + " ");
                }
        }

        /**
         * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
         * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         * С помощью цикла и условия заменить 0 на 1, 1 на 0;
         *
         * @param array
         * @return новый массив с противоположными элементами
         */
        private static int[] changeArray(int[] array) {
            int[] arrayNew = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) {
                    arrayNew[i] = 0;
                } else {
                    arrayNew[i] = 1;
                }
            }
            return arrayNew;
        }

        /**
         * 2. Задать пустой целочисленный массив размером 8.
         * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
         * @return заполненный массив 0, 3, 6, 9, 12, 15, 18, 21
         */
        private static int[] fillArray() {

            int[] fillArray = new int[8];
            int prevVal = 0;//создание первого целочисленного элемента массива

            for (int j = 1; j < fillArray.length; j++) {
                prevVal = prevVal + 3;
                fillArray[j] = prevVal;
            }
            return fillArray;
        }

        /**
         * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
         * и числа меньшие 6 умножить на 2;
         *
         * @param givenArray
         * @return массив с элементами умноженными на 2 multiplyArray
         */
        private static int[] changeMultiplyArray(int[] givenArray) {
            int[] multiplyArray = new int[givenArray.length];
            for (int k = 0; k < givenArray.length; k++) {
                if (givenArray[k] < 6) {
                    multiplyArray[k] = givenArray[k] * 2;
                } else {
                    multiplyArray[k] = givenArray[k];
                }
            }
            return multiplyArray;
        }

        /**
         * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
         *
         * @return массив с элементами по диагонали равными единице
         */
        private static int[][] fillDiagonalArray() {

            int[][] twoDimensionalArray = new int[9][9];
            for (int n = 0; n < twoDimensionalArray.length; n++) {
                twoDimensionalArray[n][n] = 1;
                twoDimensionalArray[n][(twoDimensionalArray.length - 1) - n] = 1;
            }
            return twoDimensionalArray;
        }

        /**
         * 5.1 ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)
         *
         * @param array
         * @return min элементы массива array.
         */
        private static int getMin(int[] array) {
            int min = array[0];
            for (int p = 1; p < array.length; p++) {
                if (array[p] < min) {
                    min = array[p];
                }
            }
            return min;
        }

        /**
         * 5.2 ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)
         *
         * @param array
         * @return max элементы массива array.
         */
        private static int getMax(int[] array) {
            int max = array[0];
            for (int p = 1; p < array.length; p++) {
                if (array[p] > max) {
                    max = array[p];
                }
            }
            return max;
        }

        /**
         * 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
         * если в массиве есть место, в котором сумма левой и правой части массива равны.
         * Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
         * граница показана символами ||, эти символы в массив не входят.
         *
         * @param array
         * @return true or false
         */
        private static boolean isEquationArray(int[] array) {
            float sumOfArray = 0;//складываем все элементы массива
            for (int i = 0; i < array.length; i++) {
                sumOfArray += array[i];
            }
            float divisionOfSum = sumOfArray / 2;//разделим полученную сумму на два, так как нужно разделить массив на две части и сравнить

            float sumOfArrayPart = 0;//находим сумму элементов одной из частей массива и если она будет равна divisionOfSum, то true
            int i = 0;
            while (sumOfArrayPart < divisionOfSum) {//работает счётчик, поочередно прибавляя элементы, пока сумма не станет равной divisionOfSum
                sumOfArrayPart += array[i];
                i++;
            }
            if (sumOfArrayPart == divisionOfSum) {
                return true;//если сумма некоторых элементов в массиве оказалось равной divisionOfSum, то true
            } else{
                return false;
            }
        }//Почему в предудущем ДЗ он не считал это за ошибку???

        /**
         * 7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
         * или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
         * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
         * @param array
         * @return одномерный массив со смещёнными элементами на n позиций
         */
        private static int[] mutableArray(int[] array, int n){
            int counter = 0;
            int i = 0;
            while(i < array.length){
                i++;
                int curVal = array[counter];
                int nextVal = array[n];
                array[n] = curVal;
                counter += n;
                if(counter > array.length - 1){
                    counter -= array.length - 1;
                }

                array[counter] = nextVal;

            }
            return array;//НЕ СМОГ РЕШИТЬ!!!!!!!!!!!!!!!!!!!
        }
    }