package org.vti.Test;

import org.vti.Repository.AddressRepository;
import org.vti.Entity.Address;

import java.util.List;

public class AddressTest {
    public static void main(String[] args) {
        AddressRepository addressRepository = new AddressRepository();

        List<Address> addressList = addressRepository.getAllAddresses();

        for (Address addressInfo: addressList
             ) {
            System.out.println(addressInfo);
        }
    }
}
