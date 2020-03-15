package com.capgemini.OnlineTest.TestDao;

import java.math.BigDecimal;
import com.capgemini.OnlineTest.util.*;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import com.capgemini.OnlineTest.dto.*;

import com.capgemini.OnlineTest.Exceptions.ResultException;
import com.capgemini.OnlineTest.dto.QuestionsDTO;
import com.capgemini.OnlineTest.dto.TestsDTO;

public class GetTestResultDaoImplementation implements GetTestResultDao {



	public TestsDTO getTest(BigInteger testId){
		
		TestRepository testRepository = new TestRepository();
		Set<TestsDTO> testSet= testRepository.getTests();
		Iterator<TestsDTO> iterator=testSet.iterator();
		while(iterator.hasNext())
		{
			TestsDTO test=iterator.next();
			if(test.getTestId()==testId)
			{
				return test;
			}
		}
		return null;
	}

		
	

		

}