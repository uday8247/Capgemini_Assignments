package org.myspring.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp 

{
public static void main(String args[])
{
	//Triangle triangle=new Triangle();
	//using BeanFactory
	
	BeanFactory factory= new XmlBeanFactory(new FileSystemResource("springxml.xml"));
	
	//triangle.draw();
}
}
