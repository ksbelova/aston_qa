public class Main {
    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidArraySizeOptionOne = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };

        String[][] invalidArraySizeOptionTwo = {
                {"1", "2", "3"},
                {"5", "6", "7"},
                {"9", "10", "11"},
                {"13", "14", "15"}
        };

        String[][] invalidArrayData = {
                {"1", "2", "три", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = ArrayProcessing.arryProcess(validArray);
            System.out.println ("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println ("Ошибка: " + e.getMessage());
        }

        try {
            int result = ArrayProcessing.arryProcess(invalidArraySizeOptionOne);
            System.out.println ("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println ("Ошибка: " + e.getMessage());
        }

        try {
            int result = ArrayProcessing.arryProcess(invalidArraySizeOptionTwo);
            System.out.println ("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println ("Ошибка: " + e.getMessage());
        }

        try {
            int result = ArrayProcessing.arryProcess (invalidArrayData);
            System.out.println ("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println ("Ошибка: " + e.getMessage());
        }
    }
}

