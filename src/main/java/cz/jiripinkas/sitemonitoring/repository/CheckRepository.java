package cz.jiripinkas.sitemonitoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.jiripinkas.sitemonitoring.entity.Check;

public interface CheckRepository extends JpaRepository<Check, Integer>{

}
