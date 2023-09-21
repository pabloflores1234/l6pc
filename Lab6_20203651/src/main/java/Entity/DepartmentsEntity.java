package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "departments", schema = "hrlab5")

public class DepartmentsEntity {
    
    @Id
    @Column(name = "department_id")
    private Integer departmentId;
    
    @Column(name = "department_name", length = 30)
    private String departmentName;


    @ManyToOne
    @JoinColumn(name = "manager_id")
    private EmployeesEntity employeemanager;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private LocationsEntity location;

}
