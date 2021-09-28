package com.reotra.demostoredprocedure.repo;

import com.reotra.demostoredprocedure.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @création 10/06/2021
 * @projet demo-stored-procedure
 * @auteur sory.traore
 * @package com.reotra.demostoredprocedure.repo
 */
@Repository
public interface CarRepo extends JpaRepository<Car, Long> {
    @Procedure("GET_TOTAL_CARS_BY_MODEL")
    int getTotalCarsByModel(String model);

    @Query(value = "CALL FIND_CARS_AFTER_YEAR(:year_in);", nativeQuery = true)
    List<Car> findCarsAfterYear(@Param("year_in") Integer year_in);
}
