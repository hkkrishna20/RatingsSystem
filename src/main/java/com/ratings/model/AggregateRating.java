
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
@JsonPropertyOrder({ "ratingValue", "reviewCount" })
public class AggregateRating implements Serializable {

	@JsonProperty("ratingValue")
	private String ratingValue;
	@JsonProperty("reviewCount")
	private String reviewCount;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -226331158115825548L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public AggregateRating() {
	}

	/**
	 * 
	 * @param ratingValue
	 * @param reviewCount
	 */
	public AggregateRating(String ratingValue, String reviewCount) {
		super();
		this.ratingValue = ratingValue;
		this.reviewCount = reviewCount;
	}

	@JsonProperty("ratingValue")
	public String getRatingValue() {
		return ratingValue;
	}

	@JsonProperty("ratingValue")
	public void setRatingValue(String ratingValue) {
		this.ratingValue = ratingValue;
	}

	@JsonProperty("reviewCount")
	public String getReviewCount() {
		return reviewCount;
	}

	@JsonProperty("reviewCount")
	public void setReviewCount(String reviewCount) {
		this.reviewCount = reviewCount;
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
		return new ToStringBuilder(this).append("ratingValue", ratingValue).append("reviewCount", reviewCount)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ratingValue).append(additionalProperties).append(reviewCount).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof AggregateRating) == false) {
			return false;
		}
		AggregateRating rhs = ((AggregateRating) other);
		return new EqualsBuilder().append(ratingValue, rhs.ratingValue)
				.append(additionalProperties, rhs.additionalProperties).append(reviewCount, rhs.reviewCount).isEquals();
	}

}
