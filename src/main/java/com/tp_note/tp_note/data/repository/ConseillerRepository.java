package com.tp_note.tp_note.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tp_note.tp_note.data.Entity.ConseillerEntity;


@Repository
public interface ConseillerRepository extends JpaRepository<ConseillerEntity, Integer> {

}
