package com.capgemini.OnlineTest.util;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.capgemini.OnlineTest.dto.QuestionsDTO;
import com.capgemini.OnlineTest.dto.TestsDTO;


public class TestRepository 
{	
	static Set<QuestionsDTO> questions=new HashSet<QuestionsDTO>();
	static List<String> questionOptions=new ArrayList<String>();
	
	static {
		QuestionsDTO ques1=new QuestionsDTO(new BigInteger("1111"), questionOptions,"Ques1",2,new BigDecimal (4),1,new BigDecimal (0));
		QuestionsDTO ques2=new QuestionsDTO(new BigInteger("1112"), questionOptions,"Ques2",1, new BigDecimal(4), 1,new BigDecimal (4));
		QuestionsDTO ques3=new QuestionsDTO(new BigInteger("1113"), questionOptions,"Ques3",2,new BigDecimal (4),2,new BigDecimal (4));
		QuestionsDTO ques4=new QuestionsDTO(new BigInteger("1114"), questionOptions,"Ques4",1, new BigDecimal(4),1,new BigDecimal (4));
		QuestionsDTO ques5=new QuestionsDTO(new BigInteger("1115"), questionOptions,"Ques5",2,new BigDecimal(4),2,new BigDecimal (4));
				
		questions.add(ques1);
		questions.add(ques2);
		questions.add(ques3);
		questions.add(ques4);
		questions.add(ques5);
		
		
	}
	public static Set<QuestionsDTO> getQuestions() {
		return questions;
	}
	public static List<String> getQuestionOptions() {
		return questionOptions;
	}
	
	public static Set<TestsDTO> tests=new HashSet<TestsDTO>();
	static {
		TestsDTO tests = new TestsDTO(new BigInteger("10001"),questions,new BigDecimal(20),new BigDecimal(16));
	}
	public static Set<TestsDTO> getTests()
	{
		return tests;
	}
	
}

