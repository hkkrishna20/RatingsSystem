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
@JsonPropertyOrder({ "ItemId", "productType", "name", "product", "offers" })
public class Items implements Serializable {

	@JsonProperty("ItemId")
	private Integer itemId;
	@JsonProperty("productType")
	private String productType;
	@JsonProperty("name")
	private String name;
	@JsonProperty("product")
	private Product product;
	@JsonProperty("offers")
	private Offers offers;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -40358679346896505L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Items() {
	}

	/**
	 * 
	 * @param product
	 * @param offers
	 * @param name
	 * @param itemId
	 * @param productType
	 */
	public Items(Integer itemId, String productType, String name, Product product, Offers offers) {
		super();
		this.itemId = itemId;
		this.productType = productType;
		this.name = name;
		this.product = product;
		this.offers = offers;
	}

	@JsonProperty("ItemId")
	public Integer getItemId() {
		return itemId;
	}

	@JsonProperty("ItemId")
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	@JsonProperty("productType")
	public String getProductType() {
		return productType;
	}

	@JsonProperty("productType")
	public void setProductType(String productType) {
		this.productType = productType;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("product")
	public Product getProduct() {
		return product;
	}

	@JsonProperty("product")
	public void setProduct(Product product) {
		this.product = product;
	}

	@JsonProperty("offers")
	public Offers getOffers() {
		return offers;
	}

	@JsonProperty("offers")
	public void setOffers(Offers offers) {
		this.offers = offers;
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
		return new ToStringBuilder(this).append("itemId", itemId).append("productType", productType)
				.append("name", name).append("product", product).append("offers", offers)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(product).append(additionalProperties).append(offers).append(name)
				.append(itemId).append(productType).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Items) == false) {
			return false;
		}
		Items rhs = ((Items) other);
		return new EqualsBuilder().append(product, rhs.product).append(additionalProperties, rhs.additionalProperties)
				.append(offers, rhs.offers).append(name, rhs.name).append(itemId, rhs.itemId)
				.append(productType, rhs.productType).isEquals();
	}

}
