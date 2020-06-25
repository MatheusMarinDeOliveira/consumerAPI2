package entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PlacesQuoteApi {

    @JsonProperty("PlaceId")
    @Id
    private String placeId;

    @JsonProperty("IataCode")
    @Column
    private String iataCode;

    @JsonProperty("Name")
    @Column
    private String name;

    @JsonProperty("Type")
    @Column
    private String type;

    @JsonProperty("SkyscannerCode")
    @Column
    private String skyscannerCode;

    @JsonProperty("CityName")
    @Column
    private String cityName;

    @JsonProperty("CityId")
    @Column
    private String cityId;

    @JsonProperty("CountryName")
    @Column
    private String countryName;

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSkyscannerCode() {
        return skyscannerCode;
    }

    public void setSkyscannerCode(String skyscannerCode) {
        this.skyscannerCode = skyscannerCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
