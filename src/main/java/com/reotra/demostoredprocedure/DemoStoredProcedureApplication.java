package com.reotra.demostoredprocedure;

import com.reotra.demostoredprocedure.domain.Car;
import com.reotra.demostoredprocedure.repo.CarRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class DemoStoredProcedureApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoStoredProcedureApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CarRepo carRepo) {
        return args -> {
            carRepo.deleteAll();

            carRepo.saveAll(
                    Arrays.asList(
                            Car.builder().model("MAZDA").year(2021).build(),
                            Car.builder().model("TOYOTA").year(1992).build(),
                            Car.builder().model("NISSAN").year(2021).build(),
                            Car.builder().model("MAZDA").year(2020).build()
                    )
            );
            carRepo.findAll().forEach(System.out::println);
            System.out.println("COUNT ::: " + carRepo.getTotalCarsByModel("MAZDA"));
            carRepo.findCarsAfterYear(2020).forEach(System.out::println);
        };
    }
}
