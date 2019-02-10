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
@JsonPropertyOrder({ "sellerId", "name" })
public class Seller implements Serializable {

	@JsonProperty("sellerId")
	private Integer sellerId;
	@JsonProperty("name")
	private String name;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -2045551920147290687L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Seller() {
	}

	/**
	 * 
	 * @param sellerId
	 * @param name
	 */
	public Seller(Integer sellerId, String name) {
		super();
		this.sellerId = sellerId;
		this.name = name;
	}

	@JsonProperty("sellerId")
	public Integer getSellerId() {
		return sellerId;
	}

	@JsonProperty("sellerId")
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
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
		return new ToStringBuilder(this).append("sellerId", sellerId).append("name", name)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(additionalProperties).append(sellerId).append(name).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Seller) == false) {
			return false;
		}
		Seller rhs = ((Seller) other);
		return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(sellerId, rhs.sellerId)
				.append(name, rhs.name).isEquals();
	}

}