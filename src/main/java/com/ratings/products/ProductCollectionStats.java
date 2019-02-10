package com.ratings.products;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
@JsonPropertyOrder({ "Counts", "Groups", "Filters" })
public class ProductCollectionStats implements Serializable {

	@JsonProperty("Counts")
	private Counts counts;
	@JsonProperty("Groups")
	private Groups groups;
	@JsonProperty("Filters")
	private List<Filter> filters = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -9098654206095953995L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ProductCollectionStats() {
	}

	/**
	 * 
	 * @param counts
	 * @param filters
	 * @param groups
	 */
	public ProductCollectionStats(Counts counts, Groups groups, List<Filter> filters) {
		super();
		this.counts = counts;
		this.groups = groups;
		this.filters = filters;
	}

	@JsonProperty("Counts")
	public Counts getCounts() {
		return counts;
	}

	@JsonProperty("Counts")
	public void setCounts(Counts counts) {
		this.counts = counts;
	}

	@JsonProperty("Groups")
	public Groups getGroups() {
		return groups;
	}

	@JsonProperty("Groups")
	public void setGroups(Groups groups) {
		this.groups = groups;
	}

	@JsonProperty("Filters")
	public List<Filter> getFilters() {
		return filters;
	}

	@JsonProperty("Filters")
	public void setFilters(List<Filter> filters) {
		this.filters = filters;
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
		return new ToStringBuilder(this).append("counts", counts).append("groups", groups).append("filters", filters)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(additionalProperties).append(counts).append(filters).append(groups)
				.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ProductCollectionStats) == false) {
			return false;
		}
		ProductCollectionStats rhs = ((ProductCollectionStats) other);
		return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(counts, rhs.counts)
				.append(filters, rhs.filters).append(groups, rhs.groups).isEquals();
	}

}
