package com.mycompany.group234.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.mycompany.group234.model.Course;
import com.mycompany.group234.model.Training;
import com.mycompany.group234.model.Employee;
import com.mycompany.group234.model.Feedback;
import com.mycompany.group234.converter.DurationConverter;
import com.mycompany.group234.converter.UUIDToByteConverter;
import com.mycompany.group234.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Course")
@Table(name = "\"Course\"", schema =  "\"generated_app\"")
@Data
                        
public class Course {
	public Course () {   
  }
	  
  @Id
  @Column(name = "\"CourseId\"", nullable = true )
  private String courseId;
	  
  @Column(name = "\"InhouseAvailabe\"", nullable = true )
  private Boolean inhouseAvailabe;
  
	  
  @Column(name = "\"CourseName\"", nullable = true )
  private String courseName;
  
	  
  @Column(name = "\"CoachId\"", nullable = true )
  private String coachId;
  
	  
  @Column(name = "\"CoachName\"", nullable = true )
  private String coachName;
  
	  
  @Column(name = "\"CourseSyllabus\"", nullable = true )
  private String courseSyllabus;
  
	  
  @Column(name = "\"CourseType\"", nullable = true )
  private String courseType;
  
  
  
  
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"CourseCourseFeedBack\"", referencedColumnName = "\"FeedbackId\"", insertable = false, updatable = false)
	private Feedback courseFeedBack;
	
	@Column(name = "\"CourseCourseFeedBack\"")
	private Integer courseCourseFeedBack;
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Course [" 
  + "CourseId= " + courseId  + ", " 
  + "InhouseAvailabe= " + inhouseAvailabe  + ", " 
  + "CourseName= " + courseName  + ", " 
  + "CoachId= " + coachId  + ", " 
  + "CoachName= " + coachName  + ", " 
  + "CourseSyllabus= " + courseSyllabus  + ", " 
  + "CourseType= " + courseType 
 + "]";
	}
	
}