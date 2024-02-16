import java.util.Scanner;

public class DataTypes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        if(type.equals("Integer"))
            System.out.println(Integer.SIZE/8);
        else if(type.equals("Long"))
            System.out.println(Long.SIZE/8);
        else if(type.equals("Float"))
            System.out.println(Float.SIZE/8);
        else if(type.equals("Double"))
            System.out.println(Double.SIZE/8);
         else
            System.out.println(Character.SIZE/8);
    }
}