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
@JsonPropertyOrder({ "ratingValue" })
public class ReviewRating implements Serializable {

	@JsonProperty("ratingValue")
	private String ratingValue;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -5670700074209366837L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ReviewRating() {
	}

	/**
	 * 
	 * @param ratingValue
	 */
	public ReviewRating(String ratingValue) {
		super();
		this.ratingValue = ratingValue;
	}

	@JsonProperty("ratingValue")
	public String getRatingValue() {
		return ratingValue;
	}

	@JsonProperty("ratingValue")
	public void setRatingValue(String ratingValue) {
		this.ratingValue = ratingValue;
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
		return new ToStringBuilder(this).append("ratingValue", ratingValue)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ratingValue).append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ReviewRating) == false) {
			return false;
		}
		ReviewRating rhs = ((ReviewRating) other);
		return new EqualsBuilder().append(ratingValue, rhs.ratingValue)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}
