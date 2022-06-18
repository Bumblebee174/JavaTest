package ru.geekbrains.javatest.hw5;
import java.text.MessageFormat;
public class FifthHW {
    private String fullName; // Ф.И.О.
    private String position; // Должность
    private String email; // емаил
    private String phone; // Телефон
    private int salary; // Зарплата
    private int age; // Возраст

    public FifthHW(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String workerInfo() {
        String pattern = "fullName: {0}, position: {1}, email: {2}, phone: {3}, salary: {4}, age: {5}";
        return MessageFormat.format(pattern, this.fullName, this.position, this.email, this.phone, this.salary, this.age);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Java Developer", "java1@mail.ru", "89279111", 37000, 45);
        employeeArray[1] = new Employee("Petrov Petr", "Teamlead", "teamdlead@mail.ru", "89279222", 39000, 44);
        employeeArray[2] = new Employee("Morozov Kirill", "QA-Engineer", "qa1@mail.ru", "89279333", 38000, 35);
        employeeArray[3] = new Employee("Danilov Nik", "Java Developer", "java2@mail.ru", "89279344", 38000, 35);
        employeeArray[4] = new Employee("Dmitriev Dima", "QA-Engineer", "qa2@mail.ru", "89279555", 38000, 28);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].print();
            }
        }
    }
    public class Cat {
        private String name;
        private int age;
        public void setAge(int age) {
            if (age >= 40) {
                this.age = age;
            } else {
                System.out.println("Введен некорректный возраст");
            }
        }
        public int getAge() {
            return age;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }


}