package com.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter @Setter
@EqualsAndHashCode(of = "id")
@ToString
@NoArgsConstructor
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "created_on")
    private LocalDateTime createdOn;
    @Column(name = "update_on")
    private LocalDateTime updatedOn;

    @PrePersist
    public void beforeSave() {
        createdOn = LocalDateTime.now();
    }

    @PreUpdate
    public void beforeUpdate() {
        updatedOn = LocalDateTime.now();
    }
}