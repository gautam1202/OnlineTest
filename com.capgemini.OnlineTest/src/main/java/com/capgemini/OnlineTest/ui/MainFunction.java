package com.capgemini.OnlineTest.ui;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.capgemini.OnlineTest.Exceptions.ResultException;
import com.capgemini.OnlineTest.TestDao.GetTestResultDaoImplementation;
import com.capgemini.OnlineTest.dto.QuestionsDTO;
import com.capgemini.OnlineTest.dto.TestsDTO;
import com.capgemini.OnlineTest.services.IResultsServices;
import com.capgemini.OnlineTest.services.ResultsServicesImplementation;
public class MainFunction {
	static IResultsServices resultsobj=new ResultsServicesImplementation();
    
	public static void main(String[] args) {
		
         
		Set<QuestionsDTO> questions=new HashSet<QuestionsDTO>();
			List<String> questionOptions=new ArrayList<String>();
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
			TestsDTO tests = new TestsDTO(new BigInteger("10001"),questions,new BigDecimal(20),new BigDecimal(16));
			
		int choice=0;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("SELECT ACTION \n");
        System.out.println("1. Get Result");
        System.out.println("2. Calculate Marks");
        
        try {
        	choice=sc.nextInt();
        switch(choice){
                case 1: System.out.println( resultsobj.getResult(tests));
                                break;
                case 2: System.out.println(resultsobj.calculateTotalMarks(tests));
                                break;    
        			  }
	}
    catch(ResultException ex)
        {
    	System.out.println(ex.getMessage());
        }
        catch(Exception ex)
        {
        	System.out.println(ex);
        }
	}}

    		
    		
	