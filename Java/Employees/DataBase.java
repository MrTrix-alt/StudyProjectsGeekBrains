package ru.homework.lessonOne.GeekBrainsLessons.Employees;

public class DataBase
{
    public static void main(String[] args)
    {
        // Task 2.
        Employee[] emp = new Employee[5];
        emp[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 25);
        emp[1] = new Employee("Ivanov Alexandr", "Teacher", "ivialex@mailbox.com", "8923134313", 25000, 28);
        emp[2] = new Employee("Ivanov Peter", "Taxi driver", "ivipeter@mailbox.com", "892245432", 22000, 30);
        emp[3] = new Employee("Ivanov Alexey", "Designer", "ivialexey@mailbox.com", "8923543413", 45000, 50);
        emp[4] = new Employee("Ivanov Boris", "Journalist", "iviboris@mailbox.com", "892314535", 35000, 41);

        System.out.println("Task 4.");
        for (Employee persArr : emp)
        {
            persArr.showInfoOfEmployee();
        }

        System.out.println("Task 5.");

        for (Employee person : emp)
        {
            if (person.checkAge() > 40)
            {
                person.showInfoOfEmployee();
            }
        }
    }
}

