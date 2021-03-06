package com.kswkev;

import java.util.List;

public class Company {

    private List<Staff> staff;

    public Company(List<Staff> staff) {
        this.staff = staff;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "Company{" +
                "staff=" + staff.toString() +
                '}';
    }
}
