package LessonSix;

public class LessonSix {
    static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }

    public class LessonSix {

        public static int processArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
            if (arr.length != 4 || arr[0].length != 4) {
                throw new MyArraySizeException("Массив должен быть размером 4x4.");
            }

            int sum = 0;

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: \"" + arr[i][j] + "\"");
                    }
                }
            }

            return sum;
        }

        public static void main(String[] args) {
            String[][] goodArray = {
                    {"1", "2", "3", "4"},
                    {"5", "6", "7", "8"},
                    {"9", "10", "11", "12"},
                    {"13", "14", "15", "16"}
            };

            String[][] badDataArray = {
                    {"1", "2", "3", "4"},
                    {"5", "6", "X", "8"},
                    {"9", "10", "11", "12"},
                    {"13", "14", "15", "16"}
            };

            String[][] badSizeArray = {
                    {"1", "2", "3"},
                    {"4", "5", "6"}
            };

            try {
                int result = processArray(goodArray);
                System.out.println("Сумма элементов массива: " + result);
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }

            try {
                int[] test = new int[2];
                test[5] = 10; // ошибка
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Поймано исключение ArrayIndexOutOfBoundsException: " + e.getMessage());
            }
        }
    }

}
