package org.egov.infra.admin.master.repository;

import java.util.List;

import org.egov.infra.admin.master.entity.Boundary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BoundaryRepository extends JpaRepository<Boundary, Long> {
    
    Boundary findByName(String name);
    
    List<Boundary> findByNameContainingIgnoreCase(String name);
    
    List<Boundary> findBoundariesByBoundaryType(@Param("boundaryTypeId") Long boundaryTypeId);
    
    Page<Boundary> findBoundariesByBoundaryType(@Param("boundaryTypeId") Long boundaryTypeId, Pageable page);
}
