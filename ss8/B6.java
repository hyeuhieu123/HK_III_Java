package ss8;

import java.util.Scanner;

public class B6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("------------------MENU CHÍNH-----------------");
            System.out.println("1. Xử lý chuỗi");
            System.out.println("2. Xu lý số nguyên");
            System.out.println("3. Thoát chương trình");
            System.out.printf("Lựa chọn của bạn: ");

            int choice = sc.nextInt();
            sc.nextLine();
            String str = new String("");
            switch (choice) {
                case 1:
                    while (true){
                        System.out.println("---------------------MENU XỬ LÝ CHUỖI-------------------");
                        System.out.println("1. Nhập chuỗi");
                        System.out.println("2. Loại bỏ khoảng trắng");
                        System.out.println("3. Đếm số lần xuất hiện của từng ký tự");
                        System.out.println("4. Chuyển đổi chuỗi thành dạng chuẩn");
                        System.out.println("5. Quay lại menu chính");
                        System.out.printf("Lựa chọn của bạn: ");

                        int choice2 = sc.nextInt();
                        sc.nextLine();
                        if(choice2 == 5){
                            break;
                        }
                        switch (choice2) {
                            case 1:
                                System.out.println("Nhập vào 1 chuỗi: ");
                                str = sc.nextLine();
                                break;
                            case 2:
                                System.out.println("Chuỗi sau khi loại bỏ khoanng trắng là: " + str.trim());
                                break;
                            case 3:
                                int count = 0;

                                StringBuilder result = new StringBuilder();
                                str = str.replaceAll("\\s+", "");

                                while (!str.isEmpty()){
                                    char tmp = str.charAt(0);
                                    for (int i = 0; i < str.length(); i++){
                                        if(tmp == str.charAt(i)){
                                            count++;
                                        }
                                    }
                                    result.append(tmp);
                                    result.append(count);
                                    count = 0;
                                    str = str.replaceAll(String.valueOf(tmp), "");
                                }
                                System.out.println(result);
                                break;
                            case 4:
                                String[] strArr = str.split(" ");
                                StringBuilder newStr = new StringBuilder();
                                for(int i = 0; i < strArr.length; i++){
                                    if(!strArr[i].isEmpty()){
                                        char firstChar = Character.toUpperCase(strArr[i].charAt(0));
                                        String remainChar = strArr[i].substring(1).toLowerCase();

                                        newStr.append(firstChar).append(remainChar);
                                        if(i < strArr.length - 1){
                                            newStr.append(" ");
                                        }
                                    }
                                }
                                System.out.println("Chuỗi sau khi chuẩn hóa: " + newStr);
                                break;
                            default:
                                System.out.println("Vui lòng nhập lại từ 1 đến 5");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Nhập số phần tử của mảng:");
                    int n = sc.nextInt();

                    int[] numbers = new int[n];

                    while(true){
                        System.out.println("-------------------MENU XỬ LÝ MẢNG SỐ NGUYÊN-----------------");
                        System.out.println("1. Nhập mảng số nguyên");
                        System.out.println("2. Tìm số nguyên tố lớn nhât trong mảng");
                        System.out.println("3. Đếm so phần tử có chữ so đầu tiên là số lẻ");
                        System.out.println("4. Kiểm tra mảng có phải là mảng đối xứng không");
                        System.out.println("5. Tro ve menu chính");
                        System.out.printf("Lựa chọn của bạn: ");

                        int choice3 = sc.nextInt();
                        sc.nextLine();
                        if(choice3 == 5){
                            break;
                        }
                        switch (choice3) {
                            case 1:
                                for (int i = 0; i < n; i++) {
                                    System.out.printf("num[%d] = ", i);
                                    numbers[i] = sc.nextInt();
                                }
                                break;
                            case 2:
                                int count = 0;

                                System.out.println("Danh sách các phần tử");
                                for (int i = 0; i < n; i++) {
                                    boolean isPrime = true;
                                    System.out.printf("num[%d] = %d\n", i, numbers[i]);
                                    if(numbers[i] < 2){
                                        isPrime = false;
                                    }else{
                                        for(int j = 2; j <= Math.sqrt(numbers[i]); j++){
                                            if(numbers[i] % j == 0){
                                                isPrime = false;
                                                break;
                                            }
                                        }
                                    }

                                    if(isPrime){
                                        count++;
                                    }
                                }

                                int[] primes = new int[count];
                                int index = 0;

                                for (int i = 0; i < n; i++) {
                                    boolean isPrime = true;
                                    if (numbers[i] < 2) {
                                        isPrime = false;
                                    } else {
                                        for (int j = 2; j <= Math.sqrt(numbers[i]); j++) {
                                            if (numbers[i] % j == 0) {
                                                isPrime = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (isPrime) {
                                        primes[index++] = numbers[i];
                                    }
                                }

                                int max = primes[0];

                                System.out.println("Danh sách các số nguyên tố");
                                for(int i=0; i < primes.length; i++){
                                    System.out.printf("primes[%d] = %d\n", i, primes[i]);
                                    if(max < primes[i]){
                                        max = primes[i];
                                    }
                                }

                                System.out.println("So nguyên to lớn nhất trong mảng là: " + max);
                                break;
                            case 3:
                                int countOdd = 0;
                                for(int i = 0; i < numbers.length; i++){
                                    char charArr = Integer.toString(numbers[i]).charAt(0);
                                    int firstDigit = Character.getNumericValue(charArr);

                                    if(firstDigit % 2 != 0){
                                        countOdd++;
                                    }
                                }
                                System.out.println("Số phần tử có chữ số đầu tiên là số lẻ là: " + countOdd);
                                break;
                            case 4:
                                boolean isSymmetry = true;
                                for(int i = 0; i < numbers.length / 2; i++){
                                    if(numbers[i] != numbers[n - i - 1]){
                                        isSymmetry = false;
                                        break;
                                    }
                                }

                                if(isSymmetry){
                                    System.out.println("Đây là mảng đối xứng");
                                }else{
                                    System.out.println("Đây không phải là mảng đối xứng");
                                }
                                break;
                            default:
                                System.out.println("Vui lòng chọn tu 1 den 5");
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập lại từ 1 đến 3");
            }
        }while (true);
    }
}