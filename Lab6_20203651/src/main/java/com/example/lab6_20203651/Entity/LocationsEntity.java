package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "locations", schema = "hrlab5")
public class LocationsEntity {

    @Id
    @Column(name = "location_id")
    private Integer locationId;

    @Column(name = "street_address", length = 40)
    private String streetAddress;

    @Column(name = "postal_code", length = 12)
    private String postalCode;

    @Column(name = "city", nullable = false, length = 30)
    private String city;

    @Column(name = "state_province", length = 25)
    private String stateProvince;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private CountriesEntity countries;

}
