package entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.UUID;

@Entity(name = "checkout")
public class CheckoutVO {

    @JsonProperty("idCheckout")
    @Id
    private UUID idCheckout;

    @JsonProperty("name")
    @Column
    private String name;

    @JsonProperty("lastName")
    @Column
    private String lastName;

    @JsonProperty("cardNumber")
    @Column
    private String cardNumber;

    @JsonProperty("cvv")
    @Column
    private String cvv;

    @JsonProperty("expirationDate")
    @Column
    private String expirationDate;

    @JsonProperty("quotes")
    @OneToOne(cascade = {CascadeType.ALL})
    private Quotes quotes;

    @JsonProperty("placesQuoteApi")
    @OneToOne(cascade = {CascadeType.ALL})
    private PlacesQuoteApi placesQuoteApi;

    @Override
    public String toString() {
        return "idCheckhout "+idCheckout +"cardNumber "+ cardNumber;
    }

    public UUID getIdCheckout() {
        return idCheckout;
    }

    public void setIdCheckout(UUID idCheckout) {
        this.idCheckout = idCheckout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Quotes getQuotes() {
        return quotes;
    }

    public void setQuotes(Quotes quotes) {
        this.quotes = quotes;
    }

    public PlacesQuoteApi getPlacesQuoteApi() {
        return placesQuoteApi;
    }

    public void setPlacesQuoteApi(PlacesQuoteApi placesQuoteApi) {
        this.placesQuoteApi = placesQuoteApi;
    }
}
