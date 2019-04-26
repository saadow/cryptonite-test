package com.saadow.cryptonitetest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saadow.cryptonitetest.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
