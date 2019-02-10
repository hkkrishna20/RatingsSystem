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
@JsonPropertyOrder({ "ratingId", "reviewRating", "reviewTitleName", "reviewAuthor", "datePublished", "reviewBody" })
public class Review implements Serializable {

	@JsonProperty("ratingId")
	private Integer ratingId;
	@JsonProperty("reviewRating")
	private ReviewRating reviewRating;
	@JsonProperty("reviewTitleName")
	private String reviewTitleName;
	@JsonProperty("reviewAuthor")
	private ReviewAuthor reviewAuthor;
	@JsonProperty("datePublished")
	private String datePublished;
	@JsonProperty("reviewBody")
	private String reviewBody;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -2185184676040237914L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Review() {
	}

	/**
	 * 
	 * @param reviewAuthor
	 * @param reviewRating
	 * @param reviewBody
	 * @param datePublished
	 * @param reviewTitleName
	 * @param ratingId
	 */
	public Review(Integer ratingId, ReviewRating reviewRating, String reviewTitleName, ReviewAuthor reviewAuthor,
			String datePublished, String reviewBody) {
		super();
		this.ratingId = ratingId;
		this.reviewRating = reviewRating;
		this.reviewTitleName = reviewTitleName;
		this.reviewAuthor = reviewAuthor;
		this.datePublished = datePublished;
		this.reviewBody = reviewBody;
	}

	@JsonProperty("ratingId")
	public Integer getRatingId() {
		return ratingId;
	}

	@JsonProperty("ratingId")
	public void setRatingId(Integer ratingId) {
		this.ratingId = ratingId;
	}

	@JsonProperty("reviewRating")
	public ReviewRating getReviewRating() {
		return reviewRating;
	}

	@JsonProperty("reviewRating")
	public void setReviewRating(ReviewRating reviewRating) {
		this.reviewRating = reviewRating;
	}

	@JsonProperty("reviewTitleName")
	public String getReviewTitleName() {
		return reviewTitleName;
	}

	@JsonProperty("reviewTitleName")
	public void setReviewTitleName(String reviewTitleName) {
		this.reviewTitleName = reviewTitleName;
	}

	@JsonProperty("reviewAuthor")
	public ReviewAuthor getReviewAuthor() {
		return reviewAuthor;
	}

	@JsonProperty("reviewAuthor")
	public void setReviewAuthor(ReviewAuthor reviewAuthor) {
		this.reviewAuthor = reviewAuthor;
	}

	@JsonProperty("datePublished")
	public String getDatePublished() {
		return datePublished;
	}

	@JsonProperty("datePublished")
	public void setDatePublished(String datePublished) {
		this.datePublished = datePublished;
	}

	@JsonProperty("reviewBody")
	public String getReviewBody() {
		return reviewBody;
	}

	@JsonProperty("reviewBody")
	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
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
		return new ToStringBuilder(this).append("ratingId", ratingId).append("reviewRating", reviewRating)
				.append("reviewTitleName", reviewTitleName).append("reviewAuthor", reviewAuthor)
				.append("datePublished", datePublished).append("reviewBody", reviewBody)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(reviewAuthor).append(reviewRating).append(additionalProperties)
				.append(reviewBody).append(datePublished).append(reviewTitleName).append(ratingId).toHashCode();
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
		return new EqualsBuilder().append(reviewAuthor, rhs.reviewAuthor).append(reviewRating, rhs.reviewRating)
				.append(additionalProperties, rhs.additionalProperties).append(reviewBody, rhs.reviewBody)
				.append(datePublished, rhs.datePublished).append(reviewTitleName, rhs.reviewTitleName)
				.append(ratingId, rhs.ratingId).isEquals();
	}

}
