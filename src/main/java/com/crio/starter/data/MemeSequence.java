package com.crio.starter.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "database_sequences")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemeSequence {

  
    @Id
    private String id;

    private int sequenceNo;
}