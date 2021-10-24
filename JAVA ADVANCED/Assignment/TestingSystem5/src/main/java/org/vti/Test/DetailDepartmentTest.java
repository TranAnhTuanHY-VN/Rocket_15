package org.vti.Test;

import org.vti.Repository.AddressRepository;
import org.vti.Repository.DetailDepartmentRepository;
import org.vti.Entity.DetailDepartment;

import java.util.List;

public class DetailDepartmentTest {
    public static void main(String[] args) {
        DetailDepartmentRepository repository = new DetailDepartmentRepository();
        AddressRepository addressRepository = new AddressRepository();

        System.out.println("***********GET ALL***********");

        List<DetailDepartment> DetailDepartments = repository.getAllDetailDepartments();

        for (DetailDepartment detailDepartment : DetailDepartments) {
            System.out.println(detailDepartment);
        }
    }
}
