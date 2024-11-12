package com.trojan.spring_boot_rest1.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
//@AllArgsConstructor
@Component
@Entity

public class JobPost{
    @Id
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public JobPost(int postId, String postProfile, String postDesc, int reqExperience) {
        this.postId = postId;
        this.postProfile = postProfile;
        this.postDesc = postDesc;
        this.reqExperience = reqExperience;
    }


//
//    public String getPostProfile() {
//        return postProfile;
//    }
//
//    public void setPostProfile(String postProfile) {
//        this.postProfile = postProfile;
//    }
//
//    public String getPostDesc() {
//        return postDesc;
//    }
//
//    public void setPostDesc(String postDesc) {
//        this.postDesc = postDesc;
//    }
//
//    public int getReqExperience() {
//        return reqExperience;
//    }
//
//    public void setReqExperience(int reqExperience) {
//        this.reqExperience = reqExperience;
//    }
//

}
