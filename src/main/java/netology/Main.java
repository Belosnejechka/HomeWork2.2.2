package netology;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("10","11100")); //28 + 2 = 30 - 11110
        System.out.println(bins.mult("11100","10")); //28 * 2 = 56 - 111000
    }
}