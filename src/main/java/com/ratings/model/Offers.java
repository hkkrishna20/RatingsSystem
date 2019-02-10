package com.ratings.model;

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
@JsonPropertyOrder({ "priceCurrency", "price", "itemCondition", "availability", "seller" })
public class Offers implements Serializable {

	@JsonProperty("priceCurrency")
	private String priceCurrency;
	@JsonProperty("price")
	private String price;
	@JsonProperty("itemCondition")
	private String itemCondition;
	@JsonProperty("availability")
	private String availability;
	@JsonProperty("seller")
	private Seller seller;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 4628842465169742384L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Offers() {
	}

	/**
	 * 
	 * @param itemCondition
	 * @param price
	 * @param priceCurrency
	 * @param seller
	 * @param availability
	 */
	public Offers(String priceCurrency, String price, String itemCondition, String availability, Seller seller) {
		super();
		this.priceCurrency = priceCurrency;
		this.price = price;
		this.itemCondition = itemCondition;
		this.availability = availability;
		this.seller = seller;
	}

	@JsonProperty("priceCurrency")
	public String getPriceCurrency() {
		return priceCurrency;
	}

	@JsonProperty("priceCurrency")
	public void setPriceCurrency(String priceCurrency) {
		this.priceCurrency = priceCurrency;
	}

	@JsonProperty("price")
	public String getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(String price) {
		this.price = price;
	}

	@JsonProperty("itemCondition")
	public String getItemCondition() {
		return itemCondition;
	}

	@JsonProperty("itemCondition")
	public void setItemCondition(String itemCondition) {
		this.itemCondition = itemCondition;
	}

	@JsonProperty("availability")
	public String getAvailability() {
		return availability;
	}

	@JsonProperty("availability")
	public void setAvailability(String availability) {
		this.availability = availability;
	}

	@JsonProperty("seller")
	public Seller getSeller() {
		return seller;
	}

	@JsonProperty("seller")
	public void setSeller(Seller seller) {
		this.seller = seller;
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
		return new ToStringBuilder(this).append("priceCurrency", priceCurrency).append("price", price)
				.append("itemCondition", itemCondition).append("availability", availability).append("seller", seller)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(itemCondition).append(price).append(additionalProperties)
				.append(priceCurrency).append(seller).append(availability).toHashCode();
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
		return new EqualsBuilder().append(itemCondition, rhs.itemCondition).append(price, rhs.price)
				.append(additionalProperties, rhs.additionalProperties).append(priceCurrency, rhs.priceCurrency)
				.append(seller, rhs.seller).append(availability, rhs.availability).isEquals();
	}

}
