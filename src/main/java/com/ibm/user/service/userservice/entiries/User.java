package com.ibm.user.service.userservice.entiries;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "myuser")
public class User {

    @Id
    @Column(name = "userid")
    private String userId;
    @Column(name = "username",length = 15)
    private String userName;
    @Column(name = "useremail")
    private String userEmail;
    @Column(name = "userabout")
    private String userAbout;

    @Transient
    private List<Rating> ratings=new ArrayList<Rating>();
}
