package com.kiran.health;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
    // Spring Data JPA automatically handles Save, FindAll, Update, and Delete logic!
}