public class Main {
    public static void main(String[] args) {

//        System.out.println(Calculator.sum(54, 55));
//        System.out.println(Calculator.divide((int)35, 10));
//        System.out.println(Calculator.multiply((byte)35, 10));
//        System.out.println(Calculator.subtract((float)35.5, 10));
        Object[] arr1 = {1, 3, 5, 4};
        Object[] arr2 = {1.0, 3.0, 5.0, 4.0};
        Object[] arr3 = {5, 6, 7, 8};
        System.out.println(CompareArrays.compareArrays(arr1, arr2));
        System.out.println(CompareArrays.compareArrays(arr1, arr3));
        System.out.println(new Pair<>("Hello", "user").toString());

    }
}