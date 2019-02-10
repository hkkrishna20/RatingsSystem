package com.example;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
@JsonPropertyOrder({ "@context", "@type", "aggregateRating", "description", "name", "image", "offers", "review" })
public class ItemReview implements Serializable {

	@JsonProperty("@context")
	private String context;
	@JsonProperty("@type")
	private String type;
	@JsonProperty("aggregateRating")
	private AggregateRating aggregateRating;
	@JsonProperty("description")
	private String description;
	@JsonProperty("name")
	private String name;
	@JsonProperty("image")
	private String image;
	@JsonProperty("offers")
	private Offers offers;
	@JsonProperty("review")
	private List<Review> review = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 8086412196638789075L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ItemReview() {
	}

	/**
	 * 
	 * @param description
	 * @param offers
	 * @param name
	 * @param context
	 * @param image
	 * @param aggregateRating
	 * @param type
	 * @param review
	 */
	public ItemReview(String context, String type, AggregateRating aggregateRating, String description, String name,
			String image, Offers offers, List<Review> review) {
		super();
		this.context = context;
		this.type = type;
		this.aggregateRating = aggregateRating;
		this.description = description;
		this.name = name;
		this.image = image;
		this.offers = offers;
		this.review = review;
	}

	@JsonProperty("@context")
	public String getContext() {
		return context;
	}

	@JsonProperty("@context")
	public void setContext(String context) {
		this.context = context;
	}

	@JsonProperty("@type")
	public String getType() {
		return type;
	}

	@JsonProperty("@type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("aggregateRating")
	public AggregateRating getAggregateRating() {
		return aggregateRating;
	}

	@JsonProperty("aggregateRating")
	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
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

	@JsonProperty("image")
	public String getImage() {
		return image;
	}

	@JsonProperty("image")
	public void setImage(String image) {
		this.image = image;
	}

	@JsonProperty("offers")
	public Offers getOffers() {
		return offers;
	}

	@JsonProperty("offers")
	public void setOffers(Offers offers) {
		this.offers = offers;
	}

	@JsonProperty("review")
	public List<Review> getReview() {
		return review;
	}

	@JsonProperty("review")
	public void setReview(List<Review> review) {
		this.review = review;
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
		return new ToStringBuilder(this).append("context", context).append("type", type)
				.append("aggregateRating", aggregateRating).append("description", description).append("name", name)
				.append("image", image).append("offers", offers).append("review", review)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(additionalProperties).append(description).append(offers).append(name)
				.append(context).append(image).append(aggregateRating).append(type).append(review).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ItemReview) == false) {
			return false;
		}
		ItemReview rhs = ((ItemReview) other);
		return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties)
				.append(description, rhs.description).append(offers, rhs.offers).append(name, rhs.name)
				.append(context, rhs.context).append(image, rhs.image).append(aggregateRating, rhs.aggregateRating)
				.append(type, rhs.type).append(review, rhs.review).isEquals();
	}

}
