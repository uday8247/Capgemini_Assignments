package com.madhu.springAssignment2;

import java.util.Iterator;
//import java.util.Map;
//import java.util.Map.Entry;
import java.util.Set;

//import java.util.Iterator;
//import java.util.List;

public class Question 
{
	private int questionId;
	private String question;
	private Set <String> answers;
	//private Map<String,String> answers;
//using list
/*	private List<String> answers;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	public void questionInfo()
	{
		System.out.println(questionId + " " +question);
		System.out.println("Answer for the question is");
		Iterator<String> itr= answers.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}*/
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Set<String> getAnswers() {
		return answers;
	}
	public void setAnswers(Set<String> answers) {
		this.answers = answers;
	}

	public void questionInfo()
	{
		System.out.println(questionId + " " +question);
		System.out.println("Answer for the question is");
		Iterator<String> itr= answers.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

	//Using Map
	/*
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Map<String, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
	
	public void questionInfo()
	{
		System.out.println(questionId + " " +question);
		System.out.println("Answers for the given question are:");
		Set<Entry<String,String>> set=answers.entrySet();
		Iterator<Entry<String,String>> itr=set.iterator();
		
		while(itr.hasNext())
		{
			Entry<String,String> entry=itr.next();
			System.out.println("Answer:"+entry.getKey()+ " Answered By:" +entry.getValue());
			
		}
		
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
}
