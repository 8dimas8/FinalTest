package Package;

public class SecondTask {
    public static void main(String[] args){
        System.out.println("Сума послідовності чисел від 5 до 10 дорівнює" + " " + sum(5));
    }
    static int sum(int num){
        if (num == 10){
            return 10;
        }
        return  num + sum(num +1);
    }
}
