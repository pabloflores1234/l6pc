package Entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "employees", schema = "hrlab5")
public class EmployeesEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "employee_id", nullable = false)
    private Integer employeeId;
    
    @Column(name = "first_name", length = 20)
    private String firstName;
    
    @Column(name = "last_name", length = 25, nullable = false)
    private String lastName;
    
    @Column(name = "email", length = 25, nullable = false, unique = true)
    private String email;
    
    @Column(name = "password", length = 65)
    private String password;
    
    @Column(name = "phone_number", length = 20)
    private String phoneNumber;
    
    @Column(name = "hire_date")
    private Date hireDate;

    @ManyToOne
    @JoinColumn(name = "job_id", nullable = false)
    private JobsEntity job;
    
    @Column(name = "salary")
    private BigDecimal salary;
    
    @Column(name = "commission_pct")
    private BigDecimal commissionPct;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private EmployeesEntity manager;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentsEntity department;
    
    @Column(name = "enabled")
    private Integer enabled;
    
}
