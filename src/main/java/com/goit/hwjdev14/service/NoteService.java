package com.goit.hwjdev14.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
public class NoteService {
    private List<Note> notes=new ArrayList<>();
   public List<Note> listAll(){
      // System.out.println("---listAll");
       return this.notes;
    }

    public Note add(Note note){
     //   System.out.println("---add");
    //  note.setId(UUID.randomUUID());
        long z =(int)(Math.random()*100);
    //    System.out.println(" z="+z);

      note.setId(z);
      this.notes.add(note);
     return note;
    }

    public   void deleteById(long id)  throws Exception {
        System.out.println("---deleteById   id="+id);
        try {Note idNote=getById(id);
             this.notes.remove(idNote);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        }

    public   void update(Note note) throws Exception {
       // System.out.println("--- update");
        try { Note idNote=getById(note.getId());
               idNote.setTitle(note.getTitle());
               idNote.setContent(note.getContent());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

            }
    public    Note getById(long id) throws Exception {
        System.out.println("--- getById   id="+id);
        Note nn= new Note();
        boolean flag=true;
        for(Note ss: this.notes ){
           //System.out.println(" ss=" +ss.toString());
           if (ss.getId()==id){
               return ss;
           }
       }
        if (flag) {
            throw new Exception("***Method- getById- id not found !!!");
        }
     return nn;
    }
}
