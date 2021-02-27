package com.richa;

import java.util.Date;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Gender gender; //Enum
    private String address;
    private String city;
    private String pinCode;
    private String cellPhone;
    private String email;
    private String department;
    private float marks[];
    private float totalMarks;
    private float percentage;
    private String grade;

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public Student(int studentId, String firstName, String lastName, Date birthDate, Gender gender, String address, String city, String pinCode, String cellPhone, String email, String department, float[] marks) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.pinCode = pinCode;
        this.cellPhone = cellPhone;
        this.email = email;
        this.department = department;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    private void setTotalMarks(float totalMarks) {
        this.totalMarks = totalMarks;
    }

    public float getPercentage() {
        return percentage;
    }

    private void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getGrade() {
        return grade;
    }

    private void setGrade(String grade) {
        this.grade = grade;
    }

    public void calculateTotalMarks(){
        float total = 0.00f;
        for(int i = 0 ; i < marks.length ; i ++){
            total += marks[i];
        }
        setTotalMarks(total);
    }

    public void calculatePercentage(){
        totalMarks = getTotalMarks();
        int count = marks.length;
        percentage = (totalMarks / (count * 100)) * 100;
        setPercentage(percentage);
    }

    public void calculateGarde(){
        percentage = getPercentage();
        if(percentage >= 94 && percentage <= 100){
            setGrade("A+");
        }else if(percentage >= 87 && percentage <= 93){
            setGrade("A");
        }
        else if(percentage >= 80 && percentage <= 86){
            setGrade("A-");
        }
        else if(percentage >= 77 && percentage <= 79){
            setGrade("B+");
        }
        else if(percentage >= 73 && percentage <= 76){
            setGrade("B");
        }
        else if(percentage >= 70 && percentage <= 72){
            setGrade("B-");
        }
        else if(percentage >= 67 && percentage <= 69){
            setGrade("C+");
        }
        else if(percentage >= 63 && percentage <= 66){
            setGrade("C");
        }
        else if(percentage >= 60 && percentage <= 62){
            setGrade("C-");
        }
        else if(percentage >= 50 && percentage <= 59){
            setGrade("D");
        }
        else {
            setGrade("F");
        }

    }
}
