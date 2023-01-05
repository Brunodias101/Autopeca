package com.autopeca.autopeca.repository;

import com.autopeca.autopeca.entity.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AutoPecaRepository extends JpaRepository <Estoque, Long> {
}
