package com.trojan.spring_boot_rest1.repo;

import com.trojan.spring_boot_rest1.model.JobPost;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer>{

}


/*


    // arrayList to  store JobPost objects
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
           new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2),
           new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 1),
           new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4),
            new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5)
    ));

    public List<JobPost> getAllJobs() {
        return jobs;
    }

    // method to save a job post object into arrayList
    public void addJob(JobPost job) {
        jobs.add(job);
    }

    public JobPost getJob(int postId) {

        for(JobPost job : jobs)
        {
            if(job.getPostId() == postId)
            {
                return job;
            }
        }

        return null;
    }

    public void updateJob(JobPost jobPost) {
        for(JobPost jobPost1 : jobs)
        {
            if(jobPost1.getPostId() == jobPost.getPostId())
            {
                jobPost1.setPostProfile(jobPost.getPostProfile());
                jobPost1.setPostDesc(jobPost.getPostDesc());
                jobPost1.setReqExperience(jobPost.getReqExperience());
            }

        }

    }

    public void deleteJob(int postId) {
        for(JobPost jobPost : jobs){
            if(jobPost.getPostId() == postId)
                jobs.remove(jobPost);
        }

    }


 */