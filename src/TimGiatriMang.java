import java.util.Scanner;
public class TimGiatriMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên sinh viên:");
        String input_name=scanner.nextLine();
//        duyệt mảng sinh viên  đã khai báo
        boolean isExist= false;
        for (int i = 0; i < students.length; i++) {
//            so sánh students và input_name
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + input_name + " in the list.");
            
        }
    }
}
