package org.vti.Frontend;


import org.vti.Backend.AddressRepository;
import org.vti.Backend.UsersRepository;
import org.vti.Entity.Address;
import org.vti.Entity.Users;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        UsersRepository usersRepository = new UsersRepository();
        AddressRepository addressRepository = new AddressRepository();


        List<Address> addressList = addressRepository.getAllAddress();
        List<Users> usersList = usersRepository.getAllUsers();

        for (Users userInfo: usersList
             ) {
            System.out.println(userInfo.toString());
        }

        for (Address addressInfo: addressList
             ) {
            System.out.println(addressInfo.toString());
        }
    }
}
