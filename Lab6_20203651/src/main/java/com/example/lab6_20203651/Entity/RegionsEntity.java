package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "regions", schema = "hrlab5")
public class RegionsEntity {

    @Id
    @Column(name = "region_id", nullable = false)
    private Integer regionId;

    @Column(name = "region_name", length = 25)
    private String regionName;

}
