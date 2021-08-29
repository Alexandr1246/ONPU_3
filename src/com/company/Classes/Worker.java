package com.company.Classes;

import com.company.Interfaces.IWoker;

import java.util.Comparator;

public class Worker implements IWoker {
    int id;
    double pay;
    String name;

    public Worker(Worker worker) {
        setId(worker.id);
        setName(worker.name);
        setPay(worker.pay);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id > 0 ? id : - 1;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double GetSalary() {
        return 0;
    }

    public Worker(int id, double pay, String name) {
        setId(id);
        setName(name);
        setPay(pay);
    }

    @Override
    public String toString() {
        return "Worker{" + "id=" + id + ", pay=" +String.format("%10.2f",GetSalary()) + ", name='" + name + '\'' + '}';
    }
    public static Comparator<Worker> ByNameASC()
    {
        return new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
    }
    public static Comparator<Worker> BySalary = new Comparator<Worker>() {
        @Override
        public int compare(Worker o1, Worker o2) {
            return (int) ((o1.GetSalary()-o2.GetSalary()));
        }
    };
}

