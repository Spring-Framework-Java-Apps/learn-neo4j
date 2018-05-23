package org.woehlke.learn.learnneo4j.model.orm.portinfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.woehlke.learn.learnneo4j.model.orm.Portinfo;

@Repository
public interface PortinfoRepository extends JpaRepository<Portinfo,Long> {
}
