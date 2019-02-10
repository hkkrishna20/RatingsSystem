
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
@JsonPropertyOrder({ "Accessories", "Desktop Computers", "Flat Screens", "Keyboards", "Laptops", "Printers",
		"Smartphones and Tablets", "Mice", "Computer System Accessories", "Graphics Card", "Scanners", "Speakers",
		"Software", "Telekommunikation", "Servers", "Flat Screen TVs" })
public class Category implements Serializable {

	@JsonProperty("Accessories")
	private int accessories;
	@JsonProperty("Desktop Computers")
	private int desktopComputers;
	@JsonProperty("Flat Screens")
	private int flatScreens;
	@JsonProperty("Keyboards")
	private int keyboards;
	@JsonProperty("Laptops")
	private int laptops;
	@JsonProperty("Printers")
	private int printers;
	@JsonProperty("Smartphones and Tablets")
	private int smartphonesAndTablets;
	@JsonProperty("Mice")
	private int mice;
	@JsonProperty("Computer System Accessories")
	private int computerSystemAccessories;
	@JsonProperty("Graphics Card")
	private int graphicsCard;
	@JsonProperty("Scanners")
	private int scanners;
	@JsonProperty("Speakers")
	private int speakers;
	@JsonProperty("Software")
	private int software;
	@JsonProperty("Telekommunikation")
	private int telekommunikation;
	@JsonProperty("Servers")
	private int servers;
	@JsonProperty("Flat Screen TVs")
	private int flatScreenTVs;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 5646889166518374615L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Category() {
	}

	/**
	 * 
	 * @param computerSystemAccessories
	 * @param keyboards
	 * @param laptops
	 * @param scanners
	 * @param accessories
	 * @param speakers
	 * @param flatScreenTVs
	 * @param flatScreens
	 * @param desktopComputers
	 * @param mice
	 * @param software
	 * @param smartphonesAndTablets
	 * @param servers
	 * @param graphicsCard
	 * @param printers
	 * @param telekommunikation
	 */
	public Category(int accessories, int desktopComputers, int flatScreens, int keyboards, int laptops, int printers,
			int smartphonesAndTablets, int mice, int computerSystemAccessories, int graphicsCard, int scanners,
			int speakers, int software, int telekommunikation, int servers, int flatScreenTVs) {
		super();
		this.accessories = accessories;
		this.desktopComputers = desktopComputers;
		this.flatScreens = flatScreens;
		this.keyboards = keyboards;
		this.laptops = laptops;
		this.printers = printers;
		this.smartphonesAndTablets = smartphonesAndTablets;
		this.mice = mice;
		this.computerSystemAccessories = computerSystemAccessories;
		this.graphicsCard = graphicsCard;
		this.scanners = scanners;
		this.speakers = speakers;
		this.software = software;
		this.telekommunikation = telekommunikation;
		this.servers = servers;
		this.flatScreenTVs = flatScreenTVs;
	}

	@JsonProperty("Accessories")
	public int getAccessories() {
		return accessories;
	}

	@JsonProperty("Accessories")
	public void setAccessories(int accessories) {
		this.accessories = accessories;
	}

	@JsonProperty("Desktop Computers")
	public int getDesktopComputers() {
		return desktopComputers;
	}

	@JsonProperty("Desktop Computers")
	public void setDesktopComputers(int desktopComputers) {
		this.desktopComputers = desktopComputers;
	}

	@JsonProperty("Flat Screens")
	public int getFlatScreens() {
		return flatScreens;
	}

	@JsonProperty("Flat Screens")
	public void setFlatScreens(int flatScreens) {
		this.flatScreens = flatScreens;
	}

	@JsonProperty("Keyboards")
	public int getKeyboards() {
		return keyboards;
	}

	@JsonProperty("Keyboards")
	public void setKeyboards(int keyboards) {
		this.keyboards = keyboards;
	}

	@JsonProperty("Laptops")
	public int getLaptops() {
		return laptops;
	}

	@JsonProperty("Laptops")
	public void setLaptops(int laptops) {
		this.laptops = laptops;
	}

	@JsonProperty("Printers")
	public int getPrinters() {
		return printers;
	}

	@JsonProperty("Printers")
	public void setPrinters(int printers) {
		this.printers = printers;
	}

	@JsonProperty("Smartphones and Tablets")
	public int getSmartphonesAndTablets() {
		return smartphonesAndTablets;
	}

	@JsonProperty("Smartphones and Tablets")
	public void setSmartphonesAndTablets(int smartphonesAndTablets) {
		this.smartphonesAndTablets = smartphonesAndTablets;
	}

	@JsonProperty("Mice")
	public int getMice() {
		return mice;
	}

	@JsonProperty("Mice")
	public void setMice(int mice) {
		this.mice = mice;
	}

	@JsonProperty("Computer System Accessories")
	public int getComputerSystemAccessories() {
		return computerSystemAccessories;
	}

	@JsonProperty("Computer System Accessories")
	public void setComputerSystemAccessories(int computerSystemAccessories) {
		this.computerSystemAccessories = computerSystemAccessories;
	}

	@JsonProperty("Graphics Card")
	public int getGraphicsCard() {
		return graphicsCard;
	}

	@JsonProperty("Graphics Card")
	public void setGraphicsCard(int graphicsCard) {
		this.graphicsCard = graphicsCard;
	}

	@JsonProperty("Scanners")
	public int getScanners() {
		return scanners;
	}

	@JsonProperty("Scanners")
	public void setScanners(int scanners) {
		this.scanners = scanners;
	}

	@JsonProperty("Speakers")
	public int getSpeakers() {
		return speakers;
	}

	@JsonProperty("Speakers")
	public void setSpeakers(int speakers) {
		this.speakers = speakers;
	}

	@JsonProperty("Software")
	public int getSoftware() {
		return software;
	}

	@JsonProperty("Software")
	public void setSoftware(int software) {
		this.software = software;
	}

	@JsonProperty("Telekommunikation")
	public int getTelekommunikation() {
		return telekommunikation;
	}

	@JsonProperty("Telekommunikation")
	public void setTelekommunikation(int telekommunikation) {
		this.telekommunikation = telekommunikation;
	}

	@JsonProperty("Servers")
	public int getServers() {
		return servers;
	}

	@JsonProperty("Servers")
	public void setServers(int servers) {
		this.servers = servers;
	}

	@JsonProperty("Flat Screen TVs")
	public int getFlatScreenTVs() {
		return flatScreenTVs;
	}

	@JsonProperty("Flat Screen TVs")
	public void setFlatScreenTVs(int flatScreenTVs) {
		this.flatScreenTVs = flatScreenTVs;
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
		return new ToStringBuilder(this).append("accessories", accessories).append("desktopComputers", desktopComputers)
				.append("flatScreens", flatScreens).append("keyboards", keyboards).append("laptops", laptops)
				.append("printers", printers).append("smartphonesAndTablets", smartphonesAndTablets)
				.append("mice", mice).append("computerSystemAccessories", computerSystemAccessories)
				.append("graphicsCard", graphicsCard).append("scanners", scanners).append("speakers", speakers)
				.append("software", software).append("telekommunikation", telekommunikation).append("servers", servers)
				.append("flatScreenTVs", flatScreenTVs).append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(computerSystemAccessories).append(keyboards).append(laptops)
				.append(scanners).append(speakers).append(accessories).append(flatScreenTVs).append(flatScreens)
				.append(mice).append(desktopComputers).append(software).append(smartphonesAndTablets)
				.append(additionalProperties).append(servers).append(graphicsCard).append(printers)
				.append(telekommunikation).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Category) == false) {
			return false;
		}
		Category rhs = ((Category) other);
		return new EqualsBuilder().append(computerSystemAccessories, rhs.computerSystemAccessories)
				.append(keyboards, rhs.keyboards).append(laptops, rhs.laptops).append(scanners, rhs.scanners)
				.append(speakers, rhs.speakers).append(accessories, rhs.accessories)
				.append(flatScreenTVs, rhs.flatScreenTVs).append(flatScreens, rhs.flatScreens).append(mice, rhs.mice)
				.append(desktopComputers, rhs.desktopComputers).append(software, rhs.software)
				.append(smartphonesAndTablets, rhs.smartphonesAndTablets)
				.append(additionalProperties, rhs.additionalProperties).append(servers, rhs.servers)
				.append(graphicsCard, rhs.graphicsCard).append(printers, rhs.printers)
				.append(telekommunikation, rhs.telekommunikation).isEquals();
	}

}
