package com.usb.labchecker.controller;

import com.usb.labchecker.model.dto.StudentByTelegramIdDto;
import com.usb.labchecker.model.dto.StudentDto;
import com.usb.labchecker.model.entity.Student;
import com.usb.labchecker.model.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Object> createStudent(@RequestBody StudentDto studentDto) {
        System.out.println(studentDto);
        Student newStudent = studentService.createStudent(studentDto);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(newStudent.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping("/telegramId/{id}")
    public StudentByTelegramIdDto getStudentIdByTelegramId(@PathVariable("id") Integer telegramId){
        return studentService.getStudentIdByTelegramId(telegramId);
    }

    @GetMapping("/{githubId}/variant")
    public Integer getStudentVariantByGithubId(@PathVariable("githubId") String githubId, @RequestParam("labRepoName") String labRepoName){
        return studentService.getStudentVariantByGithubIdAndLabRepoName(githubId, labRepoName);
    }


}
