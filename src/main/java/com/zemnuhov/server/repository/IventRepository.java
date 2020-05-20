package com.zemnuhov.server.repository;

import com.zemnuhov.server.entity.Ivent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IventRepository extends JpaRepository<Ivent,Long> {

}
