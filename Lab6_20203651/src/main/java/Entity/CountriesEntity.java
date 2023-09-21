package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "countries", schema = "hrlab5")
public class CountriesEntity {

    @Id
    @Column(name = "country_id", length = 2)
    private String countryId;

    @Column(name = "country_name", length = 40)
    private String countryName;


    @ManyToOne
    @JoinColumn(name="region_id")
    private RegionsEntity region;


}
