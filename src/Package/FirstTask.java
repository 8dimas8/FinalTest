package Package;

public class FirstTask {

    public static void main(String[] args) {
        System.out.println("<--FOR-->");
        for(int i = 100; i <= 1000; i = i + 150){
            System.out.println(i);
        }
        System.out.println("<--WHILE-->");

        int k = 100;
        while(k <= 1000){
            System.out.println(k);
            k = k + 150;
        }
        System.out.println("<--DO WHILE-->");

        int a = 100;
        do{
            System.out.println(a);
            a = a + 150;
        }while (a <= 1000);
    }
}
