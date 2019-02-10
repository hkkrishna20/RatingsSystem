package com.example;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
@JsonPropertyOrder({ "@type", "author", "bookFormat", "datePublished", "image", "inLanguage", "isbn", "name",
		"numberOfPages", "offers", "publisher", "aggregateRating", "review" })
public class MainEntity implements Serializable {

	@JsonProperty("@type")
	private String type;
	@JsonProperty("author")
	private String author;
	@JsonProperty("bookFormat")
	private String bookFormat;
	@JsonProperty("datePublished")
	private String datePublished;
	@JsonProperty("image")
	private String image;
	@JsonProperty("inLanguage")
	private String inLanguage;
	@JsonProperty("isbn")
	private String isbn;
	@JsonProperty("name")
	private String name;
	@JsonProperty("numberOfPages")
	private String numberOfPages;
	@JsonProperty("offers")
	private Offers offers;
	@JsonProperty("publisher")
	private String publisher;
	@JsonProperty("aggregateRating")
	private AggregateRating aggregateRating;
	@JsonProperty("review")
	private List<Review> review = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -8169582216644055711L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public MainEntity() {
	}

	/**
	 * 
	 * @param inLanguage
	 * @param author
	 * @param offers
	 * @param name
	 * @param isbn
	 * @param datePublished
	 * @param bookFormat
	 * @param image
	 * @param numberOfPages
	 * @param aggregateRating
	 * @param type
	 * @param review
	 * @param publisher
	 */
	public MainEntity(String type, String author, String bookFormat, String datePublished, String image,
			String inLanguage, String isbn, String name, String numberOfPages, Offers offers, String publisher,
			AggregateRating aggregateRating, List<Review> review) {
		super();
		this.type = type;
		this.author = author;
		this.bookFormat = bookFormat;
		this.datePublished = datePublished;
		this.image = image;
		this.inLanguage = inLanguage;
		this.isbn = isbn;
		this.name = name;
		this.numberOfPages = numberOfPages;
		this.offers = offers;
		this.publisher = publisher;
		this.aggregateRating = aggregateRating;
		this.review = review;
	}

	@JsonProperty("@type")
	public String getType() {
		return type;
	}

	@JsonProperty("@type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("author")
	public String getAuthor() {
		return author;
	}

	@JsonProperty("author")
	public void setAuthor(String author) {
		this.author = author;
	}

	@JsonProperty("bookFormat")
	public String getBookFormat() {
		return bookFormat;
	}

	@JsonProperty("bookFormat")
	public void setBookFormat(String bookFormat) {
		this.bookFormat = bookFormat;
	}

	@JsonProperty("datePublished")
	public String getDatePublished() {
		return datePublished;
	}

	@JsonProperty("datePublished")
	public void setDatePublished(String datePublished) {
		this.datePublished = datePublished;
	}

	@JsonProperty("image")
	public String getImage() {
		return image;
	}

	@JsonProperty("image")
	public void setImage(String image) {
		this.image = image;
	}

	@JsonProperty("inLanguage")
	public String getInLanguage() {
		return inLanguage;
	}

	@JsonProperty("inLanguage")
	public void setInLanguage(String inLanguage) {
		this.inLanguage = inLanguage;
	}

	@JsonProperty("isbn")
	public String getIsbn() {
		return isbn;
	}

	@JsonProperty("isbn")
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("numberOfPages")
	public String getNumberOfPages() {
		return numberOfPages;
	}

	@JsonProperty("numberOfPages")
	public void setNumberOfPages(String numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@JsonProperty("offers")
	public Offers getOffers() {
		return offers;
	}

	@JsonProperty("offers")
	public void setOffers(Offers offers) {
		this.offers = offers;
	}

	@JsonProperty("publisher")
	public String getPublisher() {
		return publisher;
	}

	@JsonProperty("publisher")
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@JsonProperty("aggregateRating")
	public AggregateRating getAggregateRating() {
		return aggregateRating;
	}

	@JsonProperty("aggregateRating")
	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}

	@JsonProperty("review")
	public List<Review> getReview() {
		return review;
	}

	@JsonProperty("review")
	public void setReview(List<Review> review) {
		this.review = review;
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
		return new ToStringBuilder(this).append("type", type).append("author", author).append("bookFormat", bookFormat)
				.append("datePublished", datePublished).append("image", image).append("inLanguage", inLanguage)
				.append("isbn", isbn).append("name", name).append("numberOfPages", numberOfPages)
				.append("offers", offers).append("publisher", publisher).append("aggregateRating", aggregateRating)
				.append("review", review).append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(inLanguage).append(offers).append(datePublished).append(image).append(type)
				.append(publisher).append(author).append(additionalProperties).append(name).append(isbn)
				.append(bookFormat).append(numberOfPages).append(aggregateRating).append(review).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof MainEntity) == false) {
			return false;
		}
		MainEntity rhs = ((MainEntity) other);
		return new EqualsBuilder().append(inLanguage, rhs.inLanguage).append(offers, rhs.offers)
				.append(datePublished, rhs.datePublished).append(image, rhs.image).append(type, rhs.type)
				.append(publisher, rhs.publisher).append(author, rhs.author)
				.append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(isbn, rhs.isbn)
				.append(bookFormat, rhs.bookFormat).append(numberOfPages, rhs.numberOfPages)
				.append(aggregateRating, rhs.aggregateRating).append(review, rhs.review).isEquals();
	}

}
