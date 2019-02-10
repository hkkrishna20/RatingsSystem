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
@JsonPropertyOrder({ "@type", "bestRating", "ratingValue", "worstRating" })
public class ReviewRating implements Serializable {

	@JsonProperty("@type")
	private String type;
	@JsonProperty("bestRating")
	private String bestRating;
	@JsonProperty("ratingValue")
	private String ratingValue;
	@JsonProperty("worstRating")
	private String worstRating;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 3532698806442293299L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ReviewRating() {
	}

	/**
	 * 
	 * @param bestRating
	 * @param ratingValue
	 * @param type
	 * @param worstRating
	 */
	public ReviewRating(String type, String bestRating, String ratingValue, String worstRating) {
		super();
		this.type = type;
		this.bestRating = bestRating;
		this.ratingValue = ratingValue;
		this.worstRating = worstRating;
	}

	@JsonProperty("@type")
	public String getType() {
		return type;
	}

	@JsonProperty("@type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("bestRating")
	public String getBestRating() {
		return bestRating;
	}

	@JsonProperty("bestRating")
	public void setBestRating(String bestRating) {
		this.bestRating = bestRating;
	}

	@JsonProperty("ratingValue")
	public String getRatingValue() {
		return ratingValue;
	}

	@JsonProperty("ratingValue")
	public void setRatingValue(String ratingValue) {
		this.ratingValue = ratingValue;
	}

	@JsonProperty("worstRating")
	public String getWorstRating() {
		return worstRating;
	}

	@JsonProperty("worstRating")
	public void setWorstRating(String worstRating) {
		this.worstRating = worstRating;
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
		return new ToStringBuilder(this).append("type", type).append("bestRating", bestRating)
				.append("ratingValue", ratingValue).append("worstRating", worstRating)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(bestRating).append(ratingValue).append(additionalProperties).append(type)
				.append(worstRating).toHashCode();
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
		return new EqualsBuilder().append(bestRating, rhs.bestRating).append(ratingValue, rhs.ratingValue)
				.append(additionalProperties, rhs.additionalProperties).append(type, rhs.type)
				.append(worstRating, rhs.worstRating).isEquals();
	}

}