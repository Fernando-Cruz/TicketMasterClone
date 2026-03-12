package com.fernandoCruz.api.repositories;

import com.fernandoCruz.api.domain.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AdrressRepository extends JpaRepository<Address, UUID
        > {
}
