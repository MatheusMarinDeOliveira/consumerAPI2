package entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Quotes {

    @JsonProperty("QuoteId")
    @Id
    private String quoteId;

    @JsonProperty("MinPrice")
    @Column
    private Double minPrice;

    @JsonProperty("Direct")
    @Column
    private String direct;

    @JsonProperty("OutboundLeg")
    @OneToOne(cascade = {CascadeType.ALL})
    private BoundLeg outboundLeg;

    @JsonProperty("InboundLeg")
    @OneToOne(cascade = {CascadeType.ALL})
    private BoundLeg inboundLeg;

    @JsonProperty("QuoteDateTime")
    @Column
    private String QuoteDateTime;
}
