package com.mycompany.group234.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.mycompany.group234.model.Course;
import com.mycompany.group234.model.Training;
import com.mycompany.group234.model.Employee;
import com.mycompany.group234.model.Feedback;

@Entity(name = "TrainingCourseList")
@Table(schema = "\"generated_app\"", name = "\"TrainingCourseList\"")
@Data
public class TrainingCourseList{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"TrainingId\"")
	private Integer trainingId;

    
    @Column(name = "\"CourseId\"")
    private String courseId;
 
}