package edu.miu.cs.cs425_project.job_hunter.repository;

import edu.miu.cs.cs425_project.job_hunter.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface Job_Repository extends JpaRepository<Job,Long> {

    //Job findJobByDescriptionAndPostDate(String description, LocalDate date);




    List<Job> findAllByDescriptionContainsOrTitleContains(String searchBy, String searchBy1);

}
