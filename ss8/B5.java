package ss8;

import java.util.Scanner;

public class B5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        do {
            System.out.println("-----------------------MENU-----------------------");
            System.out.println("1. Nhập giá trị n phần tử trong mảng");
            System.out.println("2. In ra các giá trị phần tử trong mảng");
            System.out.println("3. Tính trung bình các phần tử > 0 trong mảng");
            System.out.println("4. In ra vị trí các phần tử có giá trị bằng k");
            System.out.println("5. Tính số lượng các phần tử là số nguyên tố trong mảng");
            System.out.println("6. Thoát chương trình");
            System.out.printf("Lựa chọn của bạn: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for(int i = 0; i < n; i++){
                        System.out.printf("num[%d] = ", i);
                        numbers[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    for(int i = 0; i < n; i++){
                        System.out.printf("num[%d] = %d\n", i, numbers[i]);
                    }
                    break;
                case 3:
                    int sum = 0;
                    double average = 0;
                    int count = 0;
                    for(int i = 0; i < numbers.length; i++){
                        if(numbers[i] > 0){
                            count++;
                            sum += numbers[i];
                        }
                        average = (double)sum / count;
                    }
                    System.out.printf("Trung bình các phần tử > 0 trong mảng là: %.2f\n", average);
                    break;
                case 4:
                    System.out.println("Nhập giá trị cần tìm");
                    int k = sc.nextInt();

                    int index = 0;
                    boolean isFound = false;

                    for(int i = 0; i < numbers.length; i++){
                        if(numbers[i] == k){
                            index = i;
                            isFound = true;
                        }
                    }

                    if(!isFound){
                        System.out.println("Không tìm thấy phan tu");
                    }else{
                        System.out.printf("Phan tử %d nằm ở vị trí %d\n", k, index);
                    }

                    break;
                case 5:
                    int countPrime = 0;
                    for(int i = 0; i < numbers.length; i++){
                        boolean isPrime  = true;

                        if(numbers[i] < 2){
                            isPrime = false;
                        }else {
                            for (int j = 2; j <= Math.sqrt(numbers[i]); j++) {
                                if (numbers[i] % j == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                        }

                        if(isPrime){
                            countPrime++;
                        }
                    }
                    if(countPrime != 0){
                        System.out.printf("Số lượng số nguyên tố trong mảng là: %d\n", countPrime);
                    }else{
                        System.out.println("Không có số nguyên tố trong mảng");
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập lại từ 1 đến 6");
            }
        }while(true);
    }
}