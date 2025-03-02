public class Bai4 {
    public static class Person {
        public String name;
        public int age;
        public String country;

        public Person(String name, int age, String country) {
            this.name = name;
            this.age = age;
            this.country = country;
        }

        public void display() {
            System.out.printf("| %-20s | %-4d | %-15s |\n", name, age, country);
        }
    }

    public static void main(String[] args) {
        Person[] people = new Person[8];
        people[0] = new Person("Nguyễn Văn An", 20, "Việt Nam");
        people[1] = new Person("Trần Thị Bích", 22, "Nhật Bản");
        people[2] = new Person("Lê Hoàng Nam", 19, "Hàn Quốc");
        people[3] = new Person("Phạm Minh Đức", 25, "Mỹ");
        people[4] = new Person("Hoàng Lan Chi", 21, "Anh");
        people[5] = new Person("Đỗ Thùy Dương", 23, "Đức");
        people[6] = new Person("Bùi Thanh Tùng", 24, "Pháp");
        people[7] = new Person("Vũ Hải Yến", 26, "Canada");
        System.out.println("+----------------------+------+-----------------+");
        System.out.printf("| %-20s | %-4s | %-15s |\n", "Họ và tên", "Tuổi", "Quốc Gia");
        System.out.println("+----------------------+------+-----------------+");
        for (Person person : people) {
            person.display();
        }
        System.out.println("+----------------------+------+-----------------+");
    }
}
