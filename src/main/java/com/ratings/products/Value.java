package com.ratings.products;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "text", "data" })
public class Value implements Serializable {

	@JsonProperty("text")
	private String text;
	@JsonProperty("data")
	private int data;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 7651605358530897249L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Value() {
	}

	/**
	 * 
	 * @param text
	 * @param data
	 */
	public Value(String text, int data) {
		super();
		this.text = text;
		this.data = data;
	}

	@JsonProperty("text")
	public String getText() {
		return text;
	}

	@JsonProperty("text")
	public void setText(String text) {
		this.text = text;
	}

	@JsonProperty("data")
	public int getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(int data) {
		this.data = data;
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
		return new ToStringBuilder(this).append("text", text).append("data", data)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(text).append(additionalProperties).append(data).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Value) == false) {
			return false;
		}
		Value rhs = ((Value) other);
		return new EqualsBuilder().append(text, rhs.text).append(additionalProperties, rhs.additionalProperties)
				.append(data, rhs.data).isEquals();
	}

}
