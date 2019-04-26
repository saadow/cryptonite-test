package com.saadow.cryptonitetest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saadow.cryptonitetest.model.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer> {

}
