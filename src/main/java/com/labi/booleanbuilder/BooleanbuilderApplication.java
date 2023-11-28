package com.labi.booleanbuilder;

import com.labi.booleanbuilder.model.ModelEntity;
import com.labi.booleanbuilder.repository.ModelEntityRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BooleanbuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooleanbuilderApplication.class, args);
	}

	@Autowired
	private ModelEntityRepository modelEntityRepository;

	@PostConstruct
	public void create() {
		ModelEntity me1 = new ModelEntity("pessego", 1, "abacaxi");
		ModelEntity me2 = new ModelEntity("abacaxi", 2, "pessego");
		ModelEntity me3 = new ModelEntity("abacate", 3, "abacate");
		ModelEntity me4 = new ModelEntity("abacate", 4, "abacate");

		modelEntityRepository.save(me1);
		modelEntityRepository.save(me2);
		modelEntityRepository.save(me3);
		modelEntityRepository.save(me4);
	}
}
