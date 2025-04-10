package LessonTwo;

public class LessonTwo {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra ", "01.02.2025 ", "Samsung Corp. ", "Korea ", 5599, true);
        productsArray[1] = new Product("Samsung S23 ", "01.03.2025 ", "Samsung Corp. ", "Korea ", 5000, false);
        productsArray[2] = new Product("Iphone 15 Pro ", "01.01.2023 ", "Apple Inc. ", "Usa ", 10000, true);
        productsArray[3] = new Product("Xiaomi 13T ", "15.12.2022 ", "Xiaomi Corp. ", "China ", 4000, true);
        productsArray[4] = new Product("Honor Watch GSPro-723 ", "01.02.2020 ", "Huawei Technologies  ", "China ", 1200, true);

        for (Product product : productsArray) {
            product.printInfo();
        }
    }
}
