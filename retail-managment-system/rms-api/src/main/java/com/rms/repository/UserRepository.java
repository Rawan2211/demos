package com.rms.repository;

import com.rms.domain.security.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User , Integer> {


    @Query(value = "SELECT u FROM User u LEFT JOIN FETCH u.employee WHERE u.id= :id")
    Optional<User> findById(@Param("id") Integer id);

    @Query("select u from User u where u.userName = :userName")
    Optional<User> findByUserName(@Param("userName") String userName);


    @Query(value = "Select u.userName FROM User u WHERE u.userName= :username ")
    Optional<String> checkUsername(@Param("username") String username);


}
