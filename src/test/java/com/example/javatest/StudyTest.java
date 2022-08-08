package com.example.javatest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudyTest {

	@Test
	void create(){
		Study study = new Study();

	}

	@BeforeAll //TEST가 실행되기 전 딱 한번 실행됨, 반드시 static으로 사용해야함
	static void beforeAll(){
		System.out.println("beforeAll");
	}
	


	@AfterAll //Test가 실행 된 후 딱 한번 실행됨
	static void afterAll(){
		System.out.println("After All" );
	}

	@BeforeEach //각각의 테스트가 실행되기 전에 매번 실행
	void beforeEach(){
		System.out.println("BeforeEach" );
	}

	@AfterEach//각각의 테스트가 실행된 후 매번 실행
	void AfterEach(){
		System.out.println("AfterEach" );
	}
}
