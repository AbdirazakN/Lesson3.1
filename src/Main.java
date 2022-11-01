import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Атынызды жазыныз: ");
        String name = scanner.nextLine();
        System.out.println("Фамилиянызды жазыныз: ");
        String surname = scanner.nextLine();
        System.out.println("Туулган жылынызды жазыныз: ");
        int age = scanner.nextInt();
        System.out.println("Жумушка кайсы жылы киргенсиз: ");
        int exp = scanner.nextInt();

        System.out.println("Аты: "+name);
        System.out.println("Фамилиясы: "+surname);
        System.out.println("Жашы: "+(2022-age));
        System.out.println("Стажы: "+(2022-exp));


    }
}