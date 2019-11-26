package cn.itcast.demo1;

import java.util.HashSet;

import cn.itcast.demo3.Person;


public class HashSetDemo1 {
	public static void main(String[] args) {
	
		HashSet<Person> setPerson = new HashSet<Person>();
		setPerson.add(new Person("a",11));
		setPerson.add(new Person("b",10));
		setPerson.add(new Person("b",10));
		setPerson.add(new Person("c",25));
		setPerson.add(new Person("d",19));
		setPerson.add(new Person("e",17));
		System.out.println(setPerson);
	}
}
