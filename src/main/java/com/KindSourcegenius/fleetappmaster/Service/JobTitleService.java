package com.KindSourcegenius.fleetappmaster.Service;

import com.KindSourcegenius.fleetappmaster.Repository.JobTitleRepo;
import com.KindSourcegenius.fleetappmaster.model.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobTitleService {
    @Autowired
    private JobTitleRepo jobTitleRepo;

    public List<JobTitle>findAll(){
      return   jobTitleRepo.findAll();
    }
    public Optional<JobTitle>finaBuId(int id){
         return  jobTitleRepo.findById(id);
    }

    public void SaveJobTitle(JobTitle jobTitle){
        jobTitleRepo.save(jobTitle);
    }
    public void deleteJobTile(int id){
        jobTitleRepo.deleteById(id);
    }
}
