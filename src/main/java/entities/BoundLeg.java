package entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class BoundLeg {
    @JsonProperty("CarrierIds")
    @ElementCollection
    @Column(name ="carriesIds")
    private List<String> carriesIds;

    @JsonProperty("OriginId")
    @Id
    private String originId;

    @JsonProperty("DestinationId")
    @Column
    private String destinationId;

    @JsonProperty("DepartureDate")
    @Column
    private String departureDate;

    public List<String> getCarriesIds() {
        return carriesIds;
    }

    public void setCarriesIds(List<String> carriesIds) {
        this.carriesIds = carriesIds;
    }

    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }
}
