package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "jobs", schema = "hrlab5")
public class JobsEntity {


    @Id
    @Column(name = "job_id", length = 10)
    private String jobId;
    
    @Column(name = "job_title", length = 35, nullable = false)
    private String jobTitle;
    
    @Column(name = "min_salary")
    private Integer minSalary;
    
    @Column(name = "max_salary")
    private Integer maxSalary;

}
