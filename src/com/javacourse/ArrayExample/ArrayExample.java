// принимает 2м массив интов, возвращает 2мерный массив чаров, каждый символ в позиции массива соответствует коду символа передаваемого инта
// принимает 2м массив интов,  ивертирует массив интов (каждое значение в передаваемом массиве меняет знак)
// Принимаем массив интов, меняет порядок элементов в массиве на противоположный ([1,2,3,4,5] -> [5,4,3,2,1])

class ArrayExample {
    public static void main(String[] args) {
        int[][] intArray = {
                {65, 66},
                {67, 68, -69}
        };
        System.out.println(intArray.length);
        System.out.println(intArray[1].length);
        int[] tmpArray;

        System.out.println("=====");
        // for(int i = 0; i<intArray.length; i++)
        // {
        // 	tmpArray = intArray[i];
        // 	System.out.println(tmpArray.length);
        // }


        char[][] charArray = arrayToChar(intArray);
        System.out.println("=====");
        System.out.println(charArray[0][0]);
        System.out.println(charArray[1][2]);


        int[][] intTmpArray = arrayInverse(intArray);
        System.out.println("===intArray==");
        System.out.println(intTmpArray[0][0]);
        System.out.println(intTmpArray[1][2]);

        int[] directArray = {1, 2, 3, 4, 5};
        int[] reverseArray = arrayReverse(directArray);
        for (int value : reverseArray
        ) {
            System.out.print(value + " ");
        }
    }

    // принимает 2м массив интов, возвращает 2мерный массив чаров, каждый символ в позиции массива соответствует коду символа передаваемого инта
    static char[][] arrayToChar(int[][] array) {

        char[][] result = new char[array.length][];
        for (int i = 0; i < array.length; i++) {
            result[i] = new char[array[i].length];
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("i=" + i + " j=" + j + " a[i][j]=" + array[i][j] + " chr=" + (char) array[i][j]);
                result[i][j] = (char) array[i][j];
            }
        }
        return result;
    }

    // принимает 2м массив интов,  ивертирует массив интов (каждое значение в передаваемом массиве меняет знак)
    static int[][] arrayInverse(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            //result[i] = new char[array[i].length];
            for (int j = 0; j < array[i].length; j++) {
                //System.out.println("i="+i+" j="+j+" a[i][j]="+array[i][j]+ " chr="+(char)array[i][j]);
                array[i][j] = -1 * array[i][j];
            }
        }
        return array;
    }

    // Принимаем массив интов, меняет порядок элементов в массиве на противоположный ([1,2,3,4,5] -> [5,4,3,2,1])
    static int[] arrayReverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[array.length - 1 - i] = array[i];
        }
        return result;
    }
}