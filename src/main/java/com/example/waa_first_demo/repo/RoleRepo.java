package com.example.waa_first_demo.repo;

import com.example.waa_first_demo.domain.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepo extends CrudRepository<Role, Long> {
}
