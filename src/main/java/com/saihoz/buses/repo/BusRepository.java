package com.saihoz.buses.repo;

import com.saihoz.buses.model.Bus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {
    Page<Bus> findAllByOrderByCreatedAtDesc(Pageable pageable);
}
