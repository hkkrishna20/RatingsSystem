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
@JsonPropertyOrder({ "type", "values" })
public class Filter implements Serializable {

	@JsonProperty("type")
	private String type;
	@JsonProperty("values")
	private List<Value> values = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 1857429298393529824L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Filter() {
	}

	/**
	 * 
	 * @param values
	 * @param type
	 */
	public Filter(String type, List<Value> values) {
		super();
		this.type = type;
		this.values = values;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("values")
	public List<Value> getValues() {
		return values;
	}

	@JsonProperty("values")
	public void setValues(List<Value> values) {
		this.values = values;
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
		return new ToStringBuilder(this).append("type", type).append("values", values)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(values).append(additionalProperties).append(type).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Filter) == false) {
			return false;
		}
		Filter rhs = ((Filter) other);
		return new EqualsBuilder().append(values, rhs.values).append(additionalProperties, rhs.additionalProperties)
				.append(type, rhs.type).isEquals();
	}

}
