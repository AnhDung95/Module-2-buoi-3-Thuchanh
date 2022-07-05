import java.util.Scanner;
public class DaoNguocPhanTu {
    public static void main(String[] args) {
//        Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
//        Nhập giá trị phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
//        In mảng đã nhập
        System.out.printf("%-20s%s\n", "Elements in array: ", ""); // %s: in ra chuỗi
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
//        Đảo ngược thứ tự trong mảng
        for (int j=0; j< array.length/2;j++){
            int temp = array[j];
            array[j]=array[size-j-1];
            array[size-j-1]=temp;
        }
//        In mảng đảo ngược
        System.out.printf ("\n%-20s%s\n", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}

