package com.dinsaren.bbuappserver.repository;

import com.dinsaren.bbuappserver.models.RefreshToken;
import com.dinsaren.bbuappserver.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
  Optional<RefreshToken> findByToken(String token);
  @Modifying
  int deleteByUser(User user);
}