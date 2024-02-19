package com.goit.hwjdev14.service;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Note {

    private long id;
 //   private UUID id;
    private String title;
    private String content;
}
