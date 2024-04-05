package org.commerceproject.cleartrip;

import org.commerceproject.cleartrip.Models.Flight_ClearTrip;
import org.commerceproject.cleartrip.Models.User;
import org.commerceproject.cleartrip.Repositories.FlightRepository;
import org.commerceproject.cleartrip.Repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClearTripApplication {
    private   UserRepository userRepository;
    private FlightRepository flightRepository;

    public static void main(String[] args) {
        SpringApplication.run(ClearTripApplication.class, args);
    }
    public void run(String... args) throws Exception {

        // This logic will be executed at application startup
        System.out.println("Hello from CommandLineRunner");
    }
    public void run(String... args) throws Exception {

        User user1 = new User("John", 5000.0);
        userRepository.save(user1);

        User user2 = new User("Jane", 7000.0);
        userRepository.save(user2);

        Flight_ClearTrip flight1 = new Flight_ClearTrip("A", "B");
        flightRepository.save(flight1);

        Flight_ClearTrip flight2 = new Flight_ClearTrip("C", "D");
        flightRepository.save(flight2);

        // and so on for Seat objects
    }
}
