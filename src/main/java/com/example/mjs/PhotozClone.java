package com.example.mjs;

import com.example.mjs.model.Photo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@SpringBootApplication
public class PhotozClone {

	public static void main(String[] args) {
		SpringApplication.run(PhotozClone.class, args);

	}

}
