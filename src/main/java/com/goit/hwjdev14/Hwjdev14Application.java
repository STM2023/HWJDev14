package com.goit.hwjdev14;

import com.goit.hwjdev14.service.Note;
import com.goit.hwjdev14.service.NoteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class Hwjdev14Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Hwjdev14Application.class, args);

         NoteService noteService = new NoteService();
		Note n= new Note();
		n.setTitle("title11111111");
		n.setContent("body 11111111");
		noteService.add(n);

		Note n1= new Note();
		n1.setTitle("title 22222222");
		n1.setContent("body 2222222");
		noteService.add(n1);

		System.out.println("listAll = "+noteService.listAll().toString());
		//UUID id =n1.getId();
          long id=n1.getId();
		noteService.update(n1);
		noteService.deleteById(id);

		id=(long)(Math.random()*100);
		System.out.println("id ="+id);


	try{
         noteService.getById(id);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	try{
		noteService.deleteById(id);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}

		System.out.println("listAll = "+noteService.listAll().toString());

	}

}
