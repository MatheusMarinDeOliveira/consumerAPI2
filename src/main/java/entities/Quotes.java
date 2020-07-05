package entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
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

    @JsonProperty("QuoteDateTime")
    @Column
    private String QuoteDateTime;
}
