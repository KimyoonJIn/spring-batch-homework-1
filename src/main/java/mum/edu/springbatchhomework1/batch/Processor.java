package mum.edu.springbatchhomework1.batch;


import mum.edu.springbatchhomework1.model.Student;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<Student, Student> {

//    private static final Map<String, String> DEPT_NAMES =
//            new HashMap<>();
//
//    public Processor() {
//        DEPT_NAMES.put("001", "Technology");
//        DEPT_NAMES.put("002", "Operations");
//        DEPT_NAMES.put("003", "Accounts");
//    }

    @Override
    public Student process(Student student) throws Exception {
        Integer age = student.getAge();
        Integer year = Year.now().getValue() - age;
        student.setAge(year);
        System.out.println(String.format("Converted from [%d] to [%d]", age, year));
        return student;
    }
}