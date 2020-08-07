package com.Register.Loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import com.Register.Loan.models.RegisterLoanDetail;
import com.Register.Loan.repository.RegisterLoanRepository;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class RegisterLoanApplication {

	private static final Logger LOGGER = LogManager.getLogger(RegisterLoanApplication.class);
	
	
	public static void main(String[] args) {

		LOGGER.info("The RegisterLoan app");
		LOGGER.debug("Debug level log message");
		LOGGER.error("Error level log message");

		SpringApplication.run(RegisterLoanApplication.class, args);
	}
}
