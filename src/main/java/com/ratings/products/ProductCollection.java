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
@JsonPropertyOrder({ "ProductId", "Category", "MainCategory", "TaxTarifCode", "SupplierName", "WeightMeasure",
		"WeightUnit", "Description", "Name", "DateOfSale", "ProductPicUrl", "Status", "Quantity", "UoM", "CurrencyCode",
		"Price", "Width", "Depth", "Height", "DimUnit" })
public class ProductCollection implements Serializable {

	@JsonProperty("ProductId")
	private String productId;
	@JsonProperty("Category")
	private String category;
	@JsonProperty("MainCategory")
	private String mainCategory;
	@JsonProperty("TaxTarifCode")
	private String taxTarifCode;
	@JsonProperty("SupplierName")
	private String supplierName;
	@JsonProperty("WeightMeasure")
	private double weightMeasure;
	@JsonProperty("WeightUnit")
	private String weightUnit;
	@JsonProperty("Description")
	private String description;
	@JsonProperty("Name")
	private String name;
	@JsonProperty("DateOfSale")
	private String dateOfSale;
	@JsonProperty("ProductPicUrl")
	private String productPicUrl;
	@JsonProperty("Status")
	private String status;
	@JsonProperty("Quantity")
	private int quantity;
	@JsonProperty("UoM")
	private String uoM;
	@JsonProperty("CurrencyCode")
	private String currencyCode;
	@JsonProperty("Price")
	private int price;
	@JsonProperty("Width")
	private int width;
	@JsonProperty("Depth")
	private int depth;
	@JsonProperty("Height")
	private double height;
	@JsonProperty("DimUnit")
	private String dimUnit;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -5741648313743839323L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ProductCollection() {
	}

	/**
	 * 
	 * @param dimUnit
	 * @param currencyCode
	 * @param taxTarifCode
	 * @param supplierName
	 * @param productPicUrl
	 * @param weightUnit
	 * @param status
	 * @param width
	 * @param uoM
	 * @param mainCategory
	 * @param depth
	 * @param productId
	 * @param dateOfSale
	 * @param category
	 * @param height
	 * @param price
	 * @param weightMeasure
	 * @param description
	 * @param name
	 * @param quantity
	 */
	public ProductCollection(String productId, String category, String mainCategory, String taxTarifCode,
			String supplierName, double weightMeasure, String weightUnit, String description, String name,
			String dateOfSale, String productPicUrl, String status, int quantity, String uoM, String currencyCode,
			int price, int width, int depth, double height, String dimUnit) {
		super();
		this.productId = productId;
		this.category = category;
		this.mainCategory = mainCategory;
		this.taxTarifCode = taxTarifCode;
		this.supplierName = supplierName;
		this.weightMeasure = weightMeasure;
		this.weightUnit = weightUnit;
		this.description = description;
		this.name = name;
		this.dateOfSale = dateOfSale;
		this.productPicUrl = productPicUrl;
		this.status = status;
		this.quantity = quantity;
		this.uoM = uoM;
		this.currencyCode = currencyCode;
		this.price = price;
		this.width = width;
		this.depth = depth;
		this.height = height;
		this.dimUnit = dimUnit;
	}

	@JsonProperty("ProductId")
	public String getProductId() {
		return productId;
	}

	@JsonProperty("ProductId")
	public void setProductId(String productId) {
		this.productId = productId;
	}

	@JsonProperty("Category")
	public String getCategory() {
		return category;
	}

	@JsonProperty("Category")
	public void setCategory(String category) {
		this.category = category;
	}

	@JsonProperty("MainCategory")
	public String getMainCategory() {
		return mainCategory;
	}

	@JsonProperty("MainCategory")
	public void setMainCategory(String mainCategory) {
		this.mainCategory = mainCategory;
	}

	@JsonProperty("TaxTarifCode")
	public String getTaxTarifCode() {
		return taxTarifCode;
	}

	@JsonProperty("TaxTarifCode")
	public void setTaxTarifCode(String taxTarifCode) {
		this.taxTarifCode = taxTarifCode;
	}

	@JsonProperty("SupplierName")
	public String getSupplierName() {
		return supplierName;
	}

	@JsonProperty("SupplierName")
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	@JsonProperty("WeightMeasure")
	public double getWeightMeasure() {
		return weightMeasure;
	}

	@JsonProperty("WeightMeasure")
	public void setWeightMeasure(double weightMeasure) {
		this.weightMeasure = weightMeasure;
	}

	@JsonProperty("WeightUnit")
	public String getWeightUnit() {
		return weightUnit;
	}

	@JsonProperty("WeightUnit")
	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

	@JsonProperty("Description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("Description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("Name")
	public String getName() {
		return name;
	}

	@JsonProperty("Name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("DateOfSale")
	public String getDateOfSale() {
		return dateOfSale;
	}

	@JsonProperty("DateOfSale")
	public void setDateOfSale(String dateOfSale) {
		this.dateOfSale = dateOfSale;
	}

	@JsonProperty("ProductPicUrl")
	public String getProductPicUrl() {
		return productPicUrl;
	}

	@JsonProperty("ProductPicUrl")
	public void setProductPicUrl(String productPicUrl) {
		this.productPicUrl = productPicUrl;
	}

	@JsonProperty("Status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("Status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("Quantity")
	public int getQuantity() {
		return quantity;
	}

	@JsonProperty("Quantity")
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@JsonProperty("UoM")
	public String getUoM() {
		return uoM;
	}

	@JsonProperty("UoM")
	public void setUoM(String uoM) {
		this.uoM = uoM;
	}

	@JsonProperty("CurrencyCode")
	public String getCurrencyCode() {
		return currencyCode;
	}

	@JsonProperty("CurrencyCode")
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	@JsonProperty("Price")
	public int getPrice() {
		return price;
	}

	@JsonProperty("Price")
	public void setPrice(int price) {
		this.price = price;
	}

	@JsonProperty("Width")
	public int getWidth() {
		return width;
	}

	@JsonProperty("Width")
	public void setWidth(int width) {
		this.width = width;
	}

	@JsonProperty("Depth")
	public int getDepth() {
		return depth;
	}

	@JsonProperty("Depth")
	public void setDepth(int depth) {
		this.depth = depth;
	}

	@JsonProperty("Height")
	public double getHeight() {
		return height;
	}

	@JsonProperty("Height")
	public void setHeight(double height) {
		this.height = height;
	}

	@JsonProperty("DimUnit")
	public String getDimUnit() {
		return dimUnit;
	}

	@JsonProperty("DimUnit")
	public void setDimUnit(String dimUnit) {
		this.dimUnit = dimUnit;
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
		return new ToStringBuilder(this).append("productId", productId).append("category", category)
				.append("mainCategory", mainCategory).append("taxTarifCode", taxTarifCode)
				.append("supplierName", supplierName).append("weightMeasure", weightMeasure)
				.append("weightUnit", weightUnit).append("description", description).append("name", name)
				.append("dateOfSale", dateOfSale).append("productPicUrl", productPicUrl).append("status", status)
				.append("quantity", quantity).append("uoM", uoM).append("currencyCode", currencyCode)
				.append("price", price).append("width", width).append("depth", depth).append("height", height)
				.append("dimUnit", dimUnit).append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(dimUnit).append(currencyCode).append(supplierName).append(taxTarifCode)
				.append(productPicUrl).append(status).append(weightUnit).append(width).append(uoM).append(mainCategory)
				.append(depth).append(dateOfSale).append(productId).append(category).append(height).append(price)
				.append(weightMeasure).append(additionalProperties).append(description).append(name).append(quantity)
				.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ProductCollection) == false) {
			return false;
		}
		ProductCollection rhs = ((ProductCollection) other);
		return new EqualsBuilder().append(dimUnit, rhs.dimUnit).append(currencyCode, rhs.currencyCode)
				.append(supplierName, rhs.supplierName).append(taxTarifCode, rhs.taxTarifCode)
				.append(productPicUrl, rhs.productPicUrl).append(status, rhs.status).append(weightUnit, rhs.weightUnit)
				.append(width, rhs.width).append(uoM, rhs.uoM).append(mainCategory, rhs.mainCategory)
				.append(depth, rhs.depth).append(dateOfSale, rhs.dateOfSale).append(productId, rhs.productId)
				.append(category, rhs.category).append(height, rhs.height).append(price, rhs.price)
				.append(weightMeasure, rhs.weightMeasure).append(additionalProperties, rhs.additionalProperties)
				.append(description, rhs.description).append(name, rhs.name).append(quantity, rhs.quantity).isEquals();
	}

}
