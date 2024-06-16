package com.example.sopra.repository;

import com.example.sopra.models.Pc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PcRepository extends JpaRepository<Pc,Long>  {
}
