package com.vti.backend;

import com.vti.entity.E6Q1.*;

public class Exercise6 {
    public void Q1(){
        Phone phone = new VietNamesePhone();
        phone.removeContact("Hoang");
        phone.insertContact("Tuan","0192733873");
        phone.searchContact("Tung");
        phone.updateContact("Hong","01933838287");
    }

    public void Q2_3() {
        Employee employee = new Employee("Trần Tuấn", 6.9);
        employee.displayInfo();

        Manager manager = new Manager("Nguyễn Quang", 9.6);
        manager.displayInfo();

        Waiter waiter = new Waiter("Ba Lô", 2.6);
        waiter.displayInfo();
    }
}
