package com.aws.LambdaAws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

	
	public class MyLambda implements RequestHandler<Object, Object>
	{

		public Object handleRequest(Object arg0, Context arg1)
		{
			System.out.println("Welcome to my lambda");
			return null;
		}
	}


