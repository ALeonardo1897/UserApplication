package com.nisum.assessments.users.repositories;

import com.nisum.assessments.users.models.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PhoneRepository extends JpaRepository<Phone, UUID> {
}
