package mum.edu.springbatchhomework1.batch;


import mum.edu.springbatchhomework1.model.Student;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<Student, Student> {
    @Override
    public Student process(Student student) throws Exception {
        Integer age = student.getAge();
        Integer year = Year.now().getValue() - age;
        LocalDate dob = LocalDate.of(year,1,1);
        student.setDob(dob);
        System.out.println(String.format("Converted from [%d] to [%d]", age, year));
        return student;
    }
}
