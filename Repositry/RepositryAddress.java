package com.example.demo.Repositry;

import com.example.demo.Model.Address;
import com.example.demo.Service.ServiceAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface RepositryAddress extends JpaRepository<Address,Integer> {

    Address findAddressById(Integer id);
    Address getAddressByArea(String area);
    Address getAddressByStreet(String street);
    Address getAddressByBuildingNumber(Integer buildingNumber);

}
