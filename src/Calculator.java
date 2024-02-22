public class Calculator {
    public static <J extends Number, V extends Number> double sum(J j, V v){
        return j.doubleValue() + v.doubleValue();
    }
    public static <J extends Number, V extends Number> double multiply(J j, V v){
        return j.doubleValue() * v.doubleValue();
    }
    public static <J extends Number, V extends Number> double divide(J j, V v){
        return j.doubleValue() / v.doubleValue();
    }
    public static <J extends Number, V extends Number> double subtract(J j, V v){
        return j.doubleValue() - v.doubleValue();
    }


}
