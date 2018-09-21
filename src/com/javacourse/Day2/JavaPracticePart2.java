package com.javacourse.Day2;

// ====== part 2
// 1.принимает массив чаров, возвращает строку состоящую из символов массива
// 2.принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с начала массива. Если значения в массиве нет возвращает -1
// 3.принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с конца массива. Если значения в массиве нет возвращает -1
// 5.приминает массив интов и число, выводит на екран только елементы массива которые кратны этому числу
// 6.метод принимает массив интов сортирует его по возрастанию
// 7.принимает массив байт, если в массиве есть повторяющиеся елементы, возвращает тру
// 8.принимает 2 массива чаров, проверяет есть ли в 1 массиве, такая же последовательность символов которую представляет собой второй массив. Возвращает булеан
// 9. Принимает массив строк и просто строку, возвращает массив строк которые содержат данную подстроку. т.е. отфильтрованый из первого
class JavaPracticePart2 {
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c'};

        System.out.println(convertChar(a));

        int[] array = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1, 8, 9, 9, 45, 87, 1, 3, 5};
        System.out.println(matchValueInArrayFromBegin(array, 1));
        System.out.println(matchValueInArrayFromEnd(array, 1));
        System.out.println(showDividedBy2(array, 4));
        int[] mysortArray = sortArray(array);
        for (int i : mysortArray)
            System.out.print(i + " ");
        System.out.println();
        char[] charArray = {'q', 'w', 'e', 'r', 't', 'y'};
        char[] charSubArray = {'r', 't', 'y'};
        System.out.println(findSequence(charArray, charSubArray));

        String[] arrayWords = {"abc", "bcd", "cde"};
        String str = "bc";
        String[] arrayMatched = showMatchedString(arrayWords, str);
        for (String value : arrayMatched)
            System.out.println(value);
    }

    // 1.принимает массив чаров, возвращает строку состоящую из символов массива
    static String convertChar(char[] array) {
        String s = "";
        //for(int i=0;i<array.length; i++)
        //	s=s+array[i];
        for (char c : array)
            s += c;
        return s;
    }


    // helper
    static int matchValueInArray(int[] array, int value, boolean isAsc) {
        int index = -1;
        if (isAsc) {
            for (int i = 0; i < array.length; i++) {
                if (value == array[i]) {
                    return i;
                }
            }
        } else {
            for (int i = array.length - 1; i >= 0; i--) {
                if (value == array[i]) {
                    return i;
                }
            }
        }
        return index;
    }

    // 2.принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с начала массива. Если значения в массиве нет возвращает -1
    static int matchValueInArrayFromBegin(int[] array, int value) {
        return matchValueInArray(array, value, true);
    }

    // 3.принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с конца массива. Если значения в массиве нет возвращает -1
    static int matchValueInArrayFromEnd(int[] array, int value) {
        return matchValueInArray(array, value, false);
    }

    // 5.приминает массив интов и число, выводит на екран только елементы массива которые кратны этому числу
    static String showDividedBy2(int[] array, int value) {
        String result = "";
        for (int i = 0; i < array.length; i++)
            if (array[i] % value == 0)
                result = result + array[i] + ",";

        return result;
    }


    //  3,4,6,1,2,9,8,1
    //3,1,2
// 6.метод принимает массив интов сортирует его по возрастанию
    static int[] sortArray(int[] array) {
        int tmp;
        for (int i = 0; i < array.length - 1; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[i]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
        return array;
    }

    // 7.принимает массив байт, если в массиве есть повторяющиеся елементы, возвращает тру
    static boolean showSimilar(char[] array) {

        for (int i = 0; i < array.length; i++) {
            if (i > 0 && array[i] == array[i - 1])
                return true;
        }
        return false;
    }

    // 8.принимает 2 массива чаров, проверяет есть ли в 1 массиве, такая же последовательность символов которую представляет собой второй массив. Возвращает булеан
    static boolean findSequence(char[] array, char[] subArray) {
        for (int i = 0; i < array.length; i++) {
            int countOfMatch = 0;
            for (int j = 0; j < subArray.length; j++) {
                if ((subArray[j] == array[i] && countOfMatch == 0) || (countOfMatch > 0 && i + j < array.length && subArray[j] == array[i + j])) {
                    countOfMatch++;
                }
            }
            if (countOfMatch == subArray.length) {
                return true;
            }
        }
        return false;
    }

    // 9. Принимает массив строк и просто строку, возвращает массив строк которые содержат данную подстроку. т.е. отфильтрованый из первого
    static String[] showMatchedString(String[] array, String str) {

        int index = 0;
        String[] tmpArray = new String[array.length];

        for (String value : array) {
            if (value.contains(str)) {
                tmpArray[index] = value;
                index++;
            }
        }
        String[] result = new String[index];
        for (int i = 0; i < index; i++) {
            result[i] = tmpArray[i];
        }
        return result;
    }
}