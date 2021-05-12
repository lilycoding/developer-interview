package foundation.sortAlgorithm;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class SortStabilization {
    /**
     * 稳定
     * @param products
     */
    public static void bubbleSort(Product[] products) {
        for (int i = 0; i < products.length - 1; i++) { //每次循环第一个数确定位置
            for (int j = products.length - 1; j > i; j--) { //从后往前判断交换
                if (products[j].getPrice() < products[j - 1].getPrice()) {
                    Product temp = products[j];
                    products[j] = products[j - 1];
                    products[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < products.length - 1; i++) { //每次循环第一个数确定位置
            for (int j = products.length - 1; j > i; j--) { //从后往前判断交换
                if (products[j].getSale() < products[j - 1].getSale()) {
                    Product temp = products[j];
                    products[j] = products[j - 1];
                    products[j - 1] = temp;
                }
            }
        }

    }

    /**
     * 不稳定
     * @param products
     */
    public static void bubbleSort2(Product[] products) {
        for (int i = 0; i < products.length - 1; i++) { //每次循环第一个数确定位置
            for (int j = products.length - 1; j > i; j--) { //从后往前判断交换
                if (products[j - 1].getPrice() >= products[j].getPrice()) {
                    Product temp = products[j];
                    products[j] = products[j - 1];
                    products[j - 1] = temp;
                }
            }
        }

        for (Product product: products) {
            System.out.println(product.toString());
        }
        System.out.println();

        for (int i = 0; i < products.length - 1; i++) { //每次循环第一个数确定位置
            for (int j = products.length - 1; j > i; j--) { //从后往前判断交换
                if (products[j - 1].getSale() >= products[j].getSale()) {
                    Product temp = products[j];
                    products[j] = products[j - 1];
                    products[j - 1] = temp;
                }
            }
        }

    }

    public static void bubbleSort3(Product[] products) {
        for (int i = 0; i < products.length - 1; i++) { //每次循环第一个数确定位置
            for (int j = products.length - 1; j > i; j--) { //从后往前判断交换
                if (products[j].compareTo(products[j - 1]) < 0) {
                    Product temp = products[j];
                    products[j] = products[j - 1];
                    products[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product(3, 10);
        Product product2 = new Product(1, 9);
        Product product3 = new Product(2, 9);
        Product product4 = new Product(0, 9);
        Product[] products = new Product[]{product1, product2, product3, product4};
        bubbleSort3(products);
        for (Product product: products) {
            System.out.println(product.toString());
        }
    }
}
