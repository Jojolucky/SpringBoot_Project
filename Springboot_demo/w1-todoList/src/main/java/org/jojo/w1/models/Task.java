package org.jojo.w1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  // JPA annotation, means this class map to one table in the database
@Data  // automatically create getter、setter、toString、equals and hashCode
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // this is the primary key which will be auto generated
    private Long id;
    private String task;
    private boolean completed;
}
