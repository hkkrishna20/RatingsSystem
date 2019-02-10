package com.ratings.products;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Total", "Weight" })
public class Counts implements Serializable {

	@JsonProperty("Total")
	private int total;
	@JsonProperty("Weight")
	private Weight weight;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 5139651060126862562L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Counts() {
	}

	/**
	 * 
	 * @param total
	 * @param weight
	 */
	public Counts(int total, Weight weight) {
		super();
		this.total = total;
		this.weight = weight;
	}

	@JsonProperty("Total")
	public int getTotal() {
		return total;
	}

	@JsonProperty("Total")
	public void setTotal(int total) {
		this.total = total;
	}

	@JsonProperty("Weight")
	public Weight getWeight() {
		return weight;
	}

	@JsonProperty("Weight")
	public void setWeight(Weight weight) {
		this.weight = weight;
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
		return new ToStringBuilder(this).append("total", total).append("weight", weight)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(total).append(weight).append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Counts) == false) {
			return false;
		}
		Counts rhs = ((Counts) other);
		return new EqualsBuilder().append(total, rhs.total).append(weight, rhs.weight)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}
