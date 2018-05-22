package org.woehlke.learn.learnneo4j.components.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortinfoRepository extends JpaRepository<Portinfo,Long> {
}
