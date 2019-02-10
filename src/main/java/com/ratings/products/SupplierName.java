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
@JsonPropertyOrder({ "Titanium", "Technocom", "Red Point Stores", "Very Best Screens", "Smartcards", "Alpha Printers",
		"Printer for All", "Oxynum", "Fasttech", "Ultrasonic United", "Speaker Experts", "Brainsoft" })
public class SupplierName implements Serializable {

	@JsonProperty("Titanium")
	private int titanium;
	@JsonProperty("Technocom")
	private int technocom;
	@JsonProperty("Red Point Stores")
	private int redPointStores;
	@JsonProperty("Very Best Screens")
	private int veryBestScreens;
	@JsonProperty("Smartcards")
	private int smartcards;
	@JsonProperty("Alpha Printers")
	private int alphaPrinters;
	@JsonProperty("Printer for All")
	private int printerForAll;
	@JsonProperty("Oxynum")
	private int oxynum;
	@JsonProperty("Fasttech")
	private int fasttech;
	@JsonProperty("Ultrasonic United")
	private int ultrasonicUnited;
	@JsonProperty("Speaker Experts")
	private int speakerExperts;
	@JsonProperty("Brainsoft")
	private int brainsoft;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 1086880308113873648L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public SupplierName() {
	}

	/**
	 * 
	 * @param alphaPrinters
	 * @param brainsoft
	 * @param redPointStores
	 * @param titanium
	 * @param veryBestScreens
	 * @param speakerExperts
	 * @param technocom
	 * @param oxynum
	 * @param smartcards
	 * @param fasttech
	 * @param printerForAll
	 * @param ultrasonicUnited
	 */
	public SupplierName(int titanium, int technocom, int redPointStores, int veryBestScreens, int smartcards,
			int alphaPrinters, int printerForAll, int oxynum, int fasttech, int ultrasonicUnited, int speakerExperts,
			int brainsoft) {
		super();
		this.titanium = titanium;
		this.technocom = technocom;
		this.redPointStores = redPointStores;
		this.veryBestScreens = veryBestScreens;
		this.smartcards = smartcards;
		this.alphaPrinters = alphaPrinters;
		this.printerForAll = printerForAll;
		this.oxynum = oxynum;
		this.fasttech = fasttech;
		this.ultrasonicUnited = ultrasonicUnited;
		this.speakerExperts = speakerExperts;
		this.brainsoft = brainsoft;
	}

	@JsonProperty("Titanium")
	public int getTitanium() {
		return titanium;
	}

	@JsonProperty("Titanium")
	public void setTitanium(int titanium) {
		this.titanium = titanium;
	}

	@JsonProperty("Technocom")
	public int getTechnocom() {
		return technocom;
	}

	@JsonProperty("Technocom")
	public void setTechnocom(int technocom) {
		this.technocom = technocom;
	}

	@JsonProperty("Red Point Stores")
	public int getRedPointStores() {
		return redPointStores;
	}

	@JsonProperty("Red Point Stores")
	public void setRedPointStores(int redPointStores) {
		this.redPointStores = redPointStores;
	}

	@JsonProperty("Very Best Screens")
	public int getVeryBestScreens() {
		return veryBestScreens;
	}

	@JsonProperty("Very Best Screens")
	public void setVeryBestScreens(int veryBestScreens) {
		this.veryBestScreens = veryBestScreens;
	}

	@JsonProperty("Smartcards")
	public int getSmartcards() {
		return smartcards;
	}

	@JsonProperty("Smartcards")
	public void setSmartcards(int smartcards) {
		this.smartcards = smartcards;
	}

	@JsonProperty("Alpha Printers")
	public int getAlphaPrinters() {
		return alphaPrinters;
	}

	@JsonProperty("Alpha Printers")
	public void setAlphaPrinters(int alphaPrinters) {
		this.alphaPrinters = alphaPrinters;
	}

	@JsonProperty("Printer for All")
	public int getPrinterForAll() {
		return printerForAll;
	}

	@JsonProperty("Printer for All")
	public void setPrinterForAll(int printerForAll) {
		this.printerForAll = printerForAll;
	}

	@JsonProperty("Oxynum")
	public int getOxynum() {
		return oxynum;
	}

	@JsonProperty("Oxynum")
	public void setOxynum(int oxynum) {
		this.oxynum = oxynum;
	}

	@JsonProperty("Fasttech")
	public int getFasttech() {
		return fasttech;
	}

	@JsonProperty("Fasttech")
	public void setFasttech(int fasttech) {
		this.fasttech = fasttech;
	}

	@JsonProperty("Ultrasonic United")
	public int getUltrasonicUnited() {
		return ultrasonicUnited;
	}

	@JsonProperty("Ultrasonic United")
	public void setUltrasonicUnited(int ultrasonicUnited) {
		this.ultrasonicUnited = ultrasonicUnited;
	}

	@JsonProperty("Speaker Experts")
	public int getSpeakerExperts() {
		return speakerExperts;
	}

	@JsonProperty("Speaker Experts")
	public void setSpeakerExperts(int speakerExperts) {
		this.speakerExperts = speakerExperts;
	}

	@JsonProperty("Brainsoft")
	public int getBrainsoft() {
		return brainsoft;
	}

	@JsonProperty("Brainsoft")
	public void setBrainsoft(int brainsoft) {
		this.brainsoft = brainsoft;
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
		return new ToStringBuilder(this).append("titanium", titanium).append("technocom", technocom)
				.append("redPointStores", redPointStores).append("veryBestScreens", veryBestScreens)
				.append("smartcards", smartcards).append("alphaPrinters", alphaPrinters)
				.append("printerForAll", printerForAll).append("oxynum", oxynum).append("fasttech", fasttech)
				.append("ultrasonicUnited", ultrasonicUnited).append("speakerExperts", speakerExperts)
				.append("brainsoft", brainsoft).append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(alphaPrinters).append(redPointStores).append(speakerExperts).append(oxynum)
				.append(ultrasonicUnited).append(brainsoft).append(additionalProperties).append(titanium)
				.append(veryBestScreens).append(technocom).append(smartcards).append(fasttech).append(printerForAll)
				.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof SupplierName) == false) {
			return false;
		}
		SupplierName rhs = ((SupplierName) other);
		return new EqualsBuilder().append(alphaPrinters, rhs.alphaPrinters).append(redPointStores, rhs.redPointStores)
				.append(speakerExperts, rhs.speakerExperts).append(oxynum, rhs.oxynum)
				.append(ultrasonicUnited, rhs.ultrasonicUnited).append(brainsoft, rhs.brainsoft)
				.append(additionalProperties, rhs.additionalProperties).append(titanium, rhs.titanium)
				.append(veryBestScreens, rhs.veryBestScreens).append(technocom, rhs.technocom)
				.append(smartcards, rhs.smartcards).append(fasttech, rhs.fasttech)
				.append(printerForAll, rhs.printerForAll).isEquals();
	}

}
