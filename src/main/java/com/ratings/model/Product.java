package com.ratings.model;

import java.io.Serializable;
import java.util.ArrayList;
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
@JsonPropertyOrder({ "productId", "name", "model", "image", "description", "aggregateRating", "reviews" })
public class Product implements Serializable {

	@JsonProperty("productId")
	private Integer productId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("model")
	private String model;
	@JsonProperty("image")
	private String image;
	@JsonProperty("description")
	private String description;
	@JsonProperty("aggregateRating")
	private AggregateRating aggregateRating;
	@JsonProperty("reviews")
	private List<Review> reviews = new ArrayList<Review>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -2616903364961778460L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Product() {
	}

	/**
	 * 
	 * @param reviews
	 * @param model
	 * @param description
	 * @param name
	 * @param image
	 * @param aggregateRating
	 * @param productId
	 */
	public Product(Integer productId, String name, String model, String image, String description,
			AggregateRating aggregateRating, List<Review> reviews) {
		super();
		this.productId = productId;
		this.name = name;
		this.model = model;
		this.image = image;
		this.description = description;
		this.aggregateRating = aggregateRating;
		this.reviews = reviews;
	}

	@JsonProperty("productId")
	public Integer getProductId() {
		return productId;
	}

	@JsonProperty("productId")
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("model")
	public String getModel() {
		return model;
	}

	@JsonProperty("model")
	public void setModel(String model) {
		this.model = model;
	}

	@JsonProperty("image")
	public String getImage() {
		return image;
	}

	@JsonProperty("image")
	public void setImage(String image) {
		this.image = image;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("aggregateRating")
	public AggregateRating getAggregateRating() {
		return aggregateRating;
	}

	@JsonProperty("aggregateRating")
	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}

	@JsonProperty("reviews")
	public List<Review> getReviews() {
		return reviews;
	}

	@JsonProperty("reviews")
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
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
		return new ToStringBuilder(this).append("productId", productId).append("name", name).append("model", model)
				.append("image", image).append("description", description).append("aggregateRating", aggregateRating)
				.append("reviews", reviews).append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(reviews).append(model).append(additionalProperties).append(description)
				.append(name).append(image).append(aggregateRating).append(productId).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Product) == false) {
			return false;
		}
		Product rhs = ((Product) other);
		return new EqualsBuilder().append(reviews, rhs.reviews).append(model, rhs.model)
				.append(additionalProperties, rhs.additionalProperties).append(description, rhs.description)
				.append(name, rhs.name).append(image, rhs.image).append(aggregateRating, rhs.aggregateRating)
				.append(productId, rhs.productId).isEquals();
	}

}
