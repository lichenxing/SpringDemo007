/**
 * Spring��ע�뼯��ֵ
 */
package com.telek.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author Administrator
 *
 */
public class Chinese implements Person {
	//������ϵ�м�������
	private List<String> schools;
	private Map scores;
	private Map<String,Axe> phaseAxes;
	private Properties health;
	private Set axes;
	private String[] books;
	
	public Chinese(){
		System.out.println("Spring ʵ��������bean��Chineseʵ��������");
	}

	public void setSchools(List<String> schools) {
		this.schools = schools;
	}

	public void setScores(Map scores) {
		this.scores = scores;
	}

	public void setPhaseAxes(Map<String, Axe> phaseAxes) {
		this.phaseAxes = phaseAxes;
	}

	public void setHealth(Properties health) {
		this.health = health;
	}

	public void setAxes(Set axes) {
		this.axes = axes;
	}

	public void setBooks(String[] books) {
		this.books = books;
	}
     
     //��������ȫ���ļ�������
     public void test(){
    	 System.out.println(schools);
    	 System.out.println(scores);
    	 System.out.println(phaseAxes);
    	 System.out.println(health);
    	 System.out.println(axes);
    	 System.out.println(Arrays.toString(books));
     }
     

	
	
	
	
	
	
	
	

}
