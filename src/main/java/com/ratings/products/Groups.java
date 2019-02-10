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
@JsonPropertyOrder({ "Category", "SupplierName" })
public class Groups implements Serializable {

	@JsonProperty("Category")
	private Category category;
	@JsonProperty("SupplierName")
	private SupplierName supplierName;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -56847848315500565L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Groups() {
	}

	/**
	 * 
	 * @param category
	 * @param supplierName
	 */
	public Groups(Category category, SupplierName supplierName) {
		super();
		this.category = category;
		this.supplierName = supplierName;
	}

	@JsonProperty("Category")
	public Category getCategory() {
		return category;
	}

	@JsonProperty("Category")
	public void setCategory(Category category) {
		this.category = category;
	}

	@JsonProperty("SupplierName")
	public SupplierName getSupplierName() {
		return supplierName;
	}

	@JsonProperty("SupplierName")
	public void setSupplierName(SupplierName supplierName) {
		this.supplierName = supplierName;
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
		return new ToStringBuilder(this).append("category", category).append("supplierName", supplierName)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(category).append(supplierName).append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Groups) == false) {
			return false;
		}
		Groups rhs = ((Groups) other);
		return new EqualsBuilder().append(category, rhs.category).append(supplierName, rhs.supplierName)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}
