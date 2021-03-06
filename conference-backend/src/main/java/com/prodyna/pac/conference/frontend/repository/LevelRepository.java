package com.prodyna.pac.conference.frontend.repository;

import com.prodyna.pac.conference.frontend.entity.Event;
import com.prodyna.pac.conference.frontend.entity.Level;
import com.prodyna.pac.conference.frontend.entity.Talk;
import io.micrometer.core.annotation.Timed;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path="/levels")
@Timed
public interface LevelRepository extends Neo4jRepository<Level,Long> {

}
