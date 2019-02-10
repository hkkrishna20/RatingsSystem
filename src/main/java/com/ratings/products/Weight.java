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
@JsonPropertyOrder({
"Ok",
"Heavy",
"Overweight"
})
public class Weight implements Serializable
{

@JsonProperty("Ok")
private int ok;
@JsonProperty("Heavy")
private int heavy;
@JsonProperty("Overweight")
private int overweight;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = -5439821957919844093L;

/**
* No args constructor for use in serialization
* 
*/
public Weight() {
}

/**
* 
* @param overweight
* @param ok
* @param heavy
*/
public Weight(int ok, int heavy, int overweight) {
super();
this.ok = ok;
this.heavy = heavy;
this.overweight = overweight;
}

@JsonProperty("Ok")
public int getOk() {
return ok;
}

@JsonProperty("Ok")
public void setOk(int ok) {
this.ok = ok;
}

@JsonProperty("Heavy")
public int getHeavy() {
return heavy;
}

@JsonProperty("Heavy")
public void setHeavy(int heavy) {
this.heavy = heavy;
}

@JsonProperty("Overweight")
public int getOverweight() {
return overweight;
}

@JsonProperty("Overweight")
public void setOverweight(int overweight) {
this.overweight = overweight;
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
return new ToStringBuilder(this).append("ok", ok).append("heavy", heavy).append("overweight", overweight).append("additionalProperties", additionalProperties).toString();
}

@Override
public int hashCode() {
return new HashCodeBuilder().append(additionalProperties).append(overweight).append(ok).append(heavy).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof Weight) == false) {
return false;
}
Weight rhs = ((Weight) other);
return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(overweight, rhs.overweight).append(ok, rhs.ok).append(heavy, rhs.heavy).isEquals();
}

}