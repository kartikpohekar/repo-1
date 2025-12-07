package com.example.beans;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
    Integer taskId;
    String title;
    @Column(length = 2000)
    String description;
    String status;

    @ManyToOne
    @JoinColumn(name = "assignee_id")
    User assignee;
}
