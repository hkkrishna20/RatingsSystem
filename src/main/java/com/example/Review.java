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
@JsonPropertyOrder({ "@type", "author", "datePublished", "description", "name", "reviewRating" })
public class Review implements Serializable {

	@JsonProperty("@type")
	private String type;
	@JsonProperty("author")
	private String author;
	@JsonProperty("datePublished")
	private String datePublished;
	@JsonProperty("description")
	private String description;
	@JsonProperty("name")
	private String name;
	@JsonProperty("reviewRating")
	private ReviewRating reviewRating;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 8452807907798799988L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Review() {
	}

	/**
	 * 
	 * @param author
	 * @param reviewRating
	 * @param description
	 * @param name
	 * @param datePublished
	 * @param type
	 */
	public Review(String type, String author, String datePublished, String description, String name,
			ReviewRating reviewRating) {
		super();
		this.type = type;
		this.author = author;
		this.datePublished = datePublished;
		this.description = description;
		this.name = name;
		this.reviewRating = reviewRating;
	}

	@JsonProperty("@type")
	public String getType() {
		return type;
	}

	@JsonProperty("@type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("author")
	public String getAuthor() {
		return author;
	}

	@JsonProperty("author")
	public void setAuthor(String author) {
		this.author = author;
	}

	@JsonProperty("datePublished")
	public String getDatePublished() {
		return datePublished;
	}

	@JsonProperty("datePublished")
	public void setDatePublished(String datePublished) {
		this.datePublished = datePublished;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("reviewRating")
	public ReviewRating getReviewRating() {
		return reviewRating;
	}

	@JsonProperty("reviewRating")
	public void setReviewRating(ReviewRating reviewRating) {
		this.reviewRating = reviewRating;
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
		return new ToStringBuilder(this).append("type", type).append("author", author)
				.append("datePublished", datePublished).append("description", description).append("name", name)
				.append("reviewRating", reviewRating).append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(author).append(reviewRating).append(additionalProperties)
				.append(description).append(name).append(datePublished).append(type).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Review) == false) {
			return false;
		}
		Review rhs = ((Review) other);
		return new EqualsBuilder().append(author, rhs.author).append(reviewRating, rhs.reviewRating)
				.append(additionalProperties, rhs.additionalProperties).append(description, rhs.description)
				.append(name, rhs.name).append(datePublished, rhs.datePublished).append(type, rhs.type).isEquals();
	}

}
