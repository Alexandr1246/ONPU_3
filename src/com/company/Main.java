package com.company;

import com.company.Classes.FullTimeWorker;
import com.company.Classes.PartTimeWorker;
import com.company.Classes.Staff;
import com.company.Classes.Worker;

import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        FullTimeWorker fullTimeWorker = new FullTimeWorker(1, 10000, "fullTime Alexandr");
        System.out.println(fullTimeWorker );
        PartTimeWorker partTimeWorker = new PartTimeWorker(1, 10, "partTime Andrey", 123);
        System.out.println(partTimeWorker);
        Staff staff = new Staff();
        staff.Add(fullTimeWorker);
        staff.Add(partTimeWorker);
        staff.Add(new PartTimeWorker(3, 60, "Killer", 160) );
        staff.Add(new PartTimeWorker(5, 30, "Jim", 100));
        System.out.println(staff);

        Collections.sort(staff.Staff(), new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o2.getId()- o1.getId();
            }
        });
        System.out.println(staff);
        Collections.sort(staff.Staff(), new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });

        Collections.sort(staff.Staff(), Worker.ByNameASC());
        System.out.println(staff);
        Collections.sort(staff.Staff(), Worker.BySalary);
        System.out.println(staff);
        
    }

}
