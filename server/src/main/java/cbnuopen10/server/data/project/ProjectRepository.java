package cbnuopen10.server.data.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
//    List<ProjectEntity> findByUSER_ID(Long id);
//    @Query(nativeQuery = true, value = "select * from proeject_tb pt where pt.id = :id;")
//    List<ProjectDTO> getAllById(@Param("id") Long id);
}