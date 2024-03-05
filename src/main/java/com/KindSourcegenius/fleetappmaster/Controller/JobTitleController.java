package com.KindSourcegenius.fleetappmaster.Controller;

import com.KindSourcegenius.fleetappmaster.Service.JobTitleService;
import com.KindSourcegenius.fleetappmaster.model.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Optional;


@Controller
public class JobTitleController {
    @Autowired
    private JobTitleService jobTitleService;
    @GetMapping("/findAll")
    public String  findAll(Model model){
        model.addAttribute("jobTitle",jobTitleService.findAll());
        return "jobTitle";
    }
    @PostMapping("/FindJpbTitleById")
    public Optional<JobTitle>findByID(int id){
        return  jobTitleService.finaById(id);
    }
    @PutMapping("/addNewJobTitle")
    public String addNew(JobTitle jobTitle){
         jobTitleService.SaveJobTitle(jobTitle);
         return "redirect:/jobTitles";
    }
    @PutMapping("updateJobTitle")
    public String update(JobTitle jobTitle){
        jobTitleService.SaveJobTitle(jobTitle);
    return     "redirect:/jobTitles";
    }
    @DeleteMapping("/deleteJobTitle")
    public String deleteJobTitle(int id){
        jobTitleService.deleteJobTile(id);
        return "redirect:/jobTitles";
    }







}
