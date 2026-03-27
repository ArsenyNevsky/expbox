package ru.garage.nevars.expbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class ExpboxApplication {

	public static void main(String[] args) {
        //SpringApplication.run(ExpboxApplication.class, args);
        Set<String> ids = Set.of("a", "b", "c");
        Set<String> found = Set.of("b");
        Set<String> diff = new HashSet<>(ids);
        diff.removeAll(found);
        System.out.println(diff);
	}

}
