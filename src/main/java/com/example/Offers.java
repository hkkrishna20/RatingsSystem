package com.example;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "@type", "availability", "price", "priceCurrency" })
public class Offers implements Serializable {

	@JsonProperty("@type")
	private String type;
	@JsonProperty("availability")
	private String availability;
	@JsonProperty("price")
	private String price;
	@JsonProperty("priceCurrency")
	private String priceCurrency;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 6346344203979350839L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Offers() {
	}

	/**
	 * 
	 * @param price
	 * @param priceCurrency
	 * @param type
	 * @param availability
	 */
	public Offers(String type, String availability, String price, String priceCurrency) {
		super();
		this.type = type;
		this.availability = availability;
		this.price = price;
		this.priceCurrency = priceCurrency;
	}

	@JsonProperty("@type")
	public String getType() {
		return type;
	}

	@JsonProperty("@type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("availability")
	public String getAvailability() {
		return availability;
	}

	@JsonProperty("availability")
	public void setAvailability(String availability) {
		this.availability = availability;
	}

	@JsonProperty("price")
	public String getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(String price) {
		this.price = price;
	}

	@JsonProperty("priceCurrency")
	public String getPriceCurrency() {
		return priceCurrency;
	}

	@JsonProperty("priceCurrency")
	public void setPriceCurrency(String priceCurrency) {
		this.priceCurrency = priceCurrency;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("type", type).append("availability", availability)
				.append("price", price).append("priceCurrency", priceCurrency)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(price).append(additionalProperties).append(priceCurrency).append(type)
				.append(availability).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Offers) == false) {
			return false;
		}
		Offers rhs = ((Offers) other);
		return new EqualsBuilder().append(price, rhs.price).append(additionalProperties, rhs.additionalProperties)
				.append(priceCurrency, rhs.priceCurrency).append(type, rhs.type).append(availability, rhs.availability)
				.isEquals();
	}

}
