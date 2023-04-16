package com.micro.user.service.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="micro_users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @Column(name="Id")
    private String userId;
    @Column(name="name",length =25)
    private String name;
    private String email;
    private String about;
    @Transient
    private List<Rating> ratings=new ArrayList<>();
}
