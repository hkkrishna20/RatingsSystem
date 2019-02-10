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
@JsonPropertyOrder({ "@context", "@type", "breadcrumb", "mainEntity" })
public class Webpage implements Serializable {

	@JsonProperty("@context")
	private String context;
	@JsonProperty("@type")
	private String type;
	@JsonProperty("breadcrumb")
	private String breadcrumb;
	@JsonProperty("mainEntity")
	private MainEntity mainEntity;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 2535216485966791672L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Webpage() {
	}

	/**
	 * 
	 * @param mainEntity
	 * @param context
	 * @param type
	 * @param breadcrumb
	 */
	public Webpage(String context, String type, String breadcrumb, MainEntity mainEntity) {
		super();
		this.context = context;
		this.type = type;
		this.breadcrumb = breadcrumb;
		this.mainEntity = mainEntity;
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

	@JsonProperty("breadcrumb")
	public String getBreadcrumb() {
		return breadcrumb;
	}

	@JsonProperty("breadcrumb")
	public void setBreadcrumb(String breadcrumb) {
		this.breadcrumb = breadcrumb;
	}

	@JsonProperty("mainEntity")
	public MainEntity getMainEntity() {
		return mainEntity;
	}

	@JsonProperty("mainEntity")
	public void setMainEntity(MainEntity mainEntity) {
		this.mainEntity = mainEntity;
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
				.append("breadcrumb", breadcrumb).append("mainEntity", mainEntity)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(mainEntity).append(additionalProperties).append(context).append(type)
				.append(breadcrumb).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Webpage) == false) {
			return false;
		}
		Webpage rhs = ((Webpage) other);
		return new EqualsBuilder().append(mainEntity, rhs.mainEntity)
				.append(additionalProperties, rhs.additionalProperties).append(context, rhs.context)
				.append(type, rhs.type).append(breadcrumb, rhs.breadcrumb).isEquals();
	}

}