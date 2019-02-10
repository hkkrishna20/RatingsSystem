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
@JsonPropertyOrder({ "reviewAuthorId", "name" })
public class ReviewAuthor implements Serializable {

	@JsonProperty("reviewAuthorId")
	private String reviewAuthorId;
	@JsonProperty("name")
	private String name;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 1092409082908440830L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ReviewAuthor() {
	}

	/**
	 * 
	 * @param name
	 * @param reviewAuthorId
	 */
	public ReviewAuthor(String reviewAuthorId, String name) {
		super();
		this.reviewAuthorId = reviewAuthorId;
		this.name = name;
	}

	@JsonProperty("reviewAuthorId")
	public String getReviewAuthorId() {
		return reviewAuthorId;
	}

	@JsonProperty("reviewAuthorId")
	public void setReviewAuthorId(String reviewAuthorId) {
		this.reviewAuthorId = reviewAuthorId;
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
		return new ToStringBuilder(this).append("reviewAuthorId", reviewAuthorId).append("name", name)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(additionalProperties).append(name).append(reviewAuthorId).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ReviewAuthor) == false) {
			return false;
		}
		ReviewAuthor rhs = ((ReviewAuthor) other);
		return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(name, rhs.name)
				.append(reviewAuthorId, rhs.reviewAuthorId).isEquals();
	}

}
