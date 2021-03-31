package com.madhu.springAssignment8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;


@Component
public class Lifecycle2 
{
	public String message;

	public void setMessage(String message)
	{
		this.message=message;
	}

	public void getMessage()
	{
		System.out.println("My Message:" +message);
	}

	@PostConstruct
	public void init()
	{
		System.out.println("Init method called");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("Destroy method called");
	}
	

}


