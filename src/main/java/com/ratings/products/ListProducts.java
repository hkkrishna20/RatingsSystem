package com.ratings.products;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
@JsonPropertyOrder({ "ProductCollection", "ProductCollectionStats" })
public class ListProducts implements Serializable {

	@JsonProperty("ProductCollection")
	private List<ProductCollection> productCollection = null;
	@JsonProperty("ProductCollectionStats")
	private ProductCollectionStats productCollectionStats;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 2976492520617843156L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ListProducts() {
	}

	/**
	 * 
	 * @param productCollectionStats
	 * @param productCollection
	 */
	public ListProducts(List<ProductCollection> productCollection, ProductCollectionStats productCollectionStats) {
		super();
		this.productCollection = productCollection;
		this.productCollectionStats = productCollectionStats;
	}

	@JsonProperty("ProductCollection")
	public List<ProductCollection> getProductCollection() {
		return productCollection;
	}

	@JsonProperty("ProductCollection")
	public void setProductCollection(List<ProductCollection> productCollection) {
		this.productCollection = productCollection;
	}

	@JsonProperty("ProductCollectionStats")
	public ProductCollectionStats getProductCollectionStats() {
		return productCollectionStats;
	}

	@JsonProperty("ProductCollectionStats")
	public void setProductCollectionStats(ProductCollectionStats productCollectionStats) {
		this.productCollectionStats = productCollectionStats;
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
		return new ToStringBuilder(this).append("productCollection", productCollection)
				.append("productCollectionStats", productCollectionStats)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(additionalProperties).append(productCollectionStats)
				.append(productCollection).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ListProducts) == false) {
			return false;
		}
		ListProducts rhs = ((ListProducts) other);
		return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties)
				.append(productCollectionStats, rhs.productCollectionStats)
				.append(productCollection, rhs.productCollection).isEquals();
	}

}
