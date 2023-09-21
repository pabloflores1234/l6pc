package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "job_history", schema = "hrlab5")
public class JobHistoryEntity {


    @Id
    @Column(name = "job_history_id", nullable = false)
    private int jobHistoryId;

    @Id
    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private EmployeesEntity employee;

    @Id
    @Column(name = "start_date", nullable = false)
    private Date startDate;

    @Column(name = "end_date", nullable = false)
    private Timestamp endDate;

    @ManyToOne
    @JoinColumn(name = "job_id", nullable = false)
    private JobsEntity jobs;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentsEntity department;
}
