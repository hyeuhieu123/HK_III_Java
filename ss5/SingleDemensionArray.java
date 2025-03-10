import java.util.Scanner;
public class SingleDemensionArray {
    public static void main(String[] args) {
        /*
        * Xây dựng ứng dụng java console in menu và thực hiện các chức năng theo menu
        *  1. Khai báo và khởi tạo mảng số nguyên 1 chiều gồm 100 phần tử
        *  2. In menu và thực hiện các chức năng theo menu
        *  ******************MENU*********************
        *  1. Nhập giá trị các phần tử mảng
        *  2. In giá trị các phần tử mảng
        *  3. Tính tổng các phần tử mảng
        *  4. In ra các phần tử chia hết cho 3 và tính tổng
        *  5. In ra các phần tử là số nguyên tố và tính tổng
        *  6. Thoát
        * */
        // Syntax : Datatype[] arrayName = new Datatype[size]
        // Khai báo và khởi tạo mảng 2 chiều số nguyên gồm 100 phần tử
        int[] numbers = new int[100];
        // In menu và thực hiện các chức năng theo menu
        Scanner scanner = new Scanner(System.in);
        int currentIndex = 0;
        do{
            System.out.println("******************MENU*********************");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. In giá trị các phần tử mảng");
            System.out.println("3. Tính tổng các phần tử mảng");
            System.out.println("4. In ra các phần tử chia hết cho 3 và tính tổng");
            System.out.println("5. In ra các phần tử là số nguyên tố và tính tổng");
            System.out.println("6. Thoát");
            System.out.println("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập số phần tử cần nhập giá trị");
                    int n = Integer.parseInt(scanner.nextLine());
                    for(int i = 0; i < n; i++){
                        System.out.printf("numbers[%d] ", numbers[currentIndex]);
                        numbers[currentIndex] = Integer.parseInt(scanner.nextLine());
                        currentIndex++;
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử trong mảng là");
                    for(int j = 0; j < currentIndex; j++){
                        System.out.printf("numbers[%d] ", numbers[j]);
                    }
                    break;
                case 3:
                    int sum = 0;
                    for(int j = 0; j < currentIndex; j++){
                        sum += numbers[j];
                    }
                    System.out.printf("sum = %d", sum);
                    break;
                case 4:
                int tong =0;
                    for(int i=0;i<numbers.length;i++){
                        if(numbers[i]%3==0){
                            System.out.println(numbers[i]);
                            tong+=numbers[i];
                        }
                    ;
                    }
                    System.out.println(tong);
                    break;
                case 5:
                    
                    break;
                case 6:
System.exit(0);
                default:
                    System.err.println("Vui lòn nhập từ 1 đến 6");
            }
        }while(true);

    }
}