package mum.edu.springbatchhomework1.batch;

import mum.edu.springbatchhomework1.model.Student;
import mum.edu.springbatchhomework1.repository.StudentRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Student> {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void write(List<? extends Student> students) throws Exception {
        System.out.println("Data Saved for Students: " + students);
        studentRepository.saveAll(students);
    }
}
