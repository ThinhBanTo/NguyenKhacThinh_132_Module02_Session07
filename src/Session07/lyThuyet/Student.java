package Session07.lyThuyet;

import java.util.Scanner;

public class Student {
    //Atributes
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private String address;
    private boolean status;

    //Constructor
    public Student() {}

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student(String studentId, String studentName, int age, boolean sex, String address, boolean status) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.status = status;
    }

    //Methods
    //3.1: Getter/Setter (Tinh mo goi)


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //3.2: Behavior methods: The hien hanh vi doi tuong
    //phuong thuc nhieu tham so
    public int addNumber(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;  //khong go lenh j sau RETURN
    }
    //phuong thuc 1 tham so:
    protected void helloTeacher(String teacherName) {
        System.out.println("Hello "+teacherName);
    }
    public void inputData(Scanner scanner){
        System.out.print("Nhập vào mã sinh viên: ");
        this.studentId = scanner.nextLine();
        System.out.print("Nhập vào tên sinh viên: ");
        this.studentName = scanner.nextLine();
        System.out.print("Nhập vào tuổi sinh viên: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào giới tính sinh viên: ");
        //.....

    }
}
