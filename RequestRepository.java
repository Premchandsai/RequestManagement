package com.gdc.requestmanagement.repository;

import com.gdc.requestmanagement.entity.Request;
import com.gdc.requestmanagement.enums.RequestStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {

    // Return Optional for better null handling
    Optional<List<Request>> findByUserId(Long userId);

    // Ensure driverId and status are not null
    List<Request> findByDriverIdAndStatus(@NonNull Long driverId, @NonNull RequestStatus status);
}
