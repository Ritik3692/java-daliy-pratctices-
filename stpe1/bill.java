import java.util.Scanner;

public class bill {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         float a = sc.nextFloat();
         float b = sc.nextFloat();
         float c = sc.nextFloat();
        float d = a+b+c;
        System.out.println("pencil =" +a + "\n" + "pen = " +b  + "\n"+ " eraser =" +c +  "\n" + "here the bil of All item ="+ d);
    }
}
