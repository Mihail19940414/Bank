package com.example.bank.repositories;

import com.example.bank.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long>{
    @Override
    List<User> findAll();

    @Query("select u from User u")
    List<User> findByUsername(String userName);

    @Override
    <S extends User> S save(S entity);

    @Override
    Optional<User> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(User entity);

    @Override
    void deleteAll();
}
