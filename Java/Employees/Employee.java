package ru.homework.lessonOne.GeekBrainsLessons.Employees;

public class Employee // Task 1.
{
    private String fullName;
    private String position;
    private String email;
    private String numPhone;
    private int salary;
    private int age;

    // Task 2.
    Employee(String fullName, String position, String email, String numPhone, int salary, int age)
    {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.numPhone = numPhone;
        this.salary = salary;
        this.age = age;
    }

    public int checkAge() {
        return this.age;
    }





    void showInfoOfEmployee() {
     System.out.println(fullName + " " + position + " " +  email + " " + numPhone + " " + salary + " " + age);
        }
    }


