package com.single.unit.service.criteria;

import com.single.unit.domain.enumeration.ProductCategory;
import java.io.Serializable;
import java.util.Objects;
import org.springdoc.api.annotations.ParameterObject;
import tech.jhipster.service.Criteria;
import tech.jhipster.service.filter.*;

/**
 * Criteria class for the {@link com.single.unit.domain.Product} entity. This class is used
 * in {@link com.single.unit.web.rest.ProductResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /products?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
@ParameterObject
@SuppressWarnings("common-java:DuplicatedBlocks")
public class ProductCriteria implements Serializable, Criteria {

    /**
     * Class for filtering ProductCategory
     */
    public static class ProductCategoryFilter extends Filter<ProductCategory> {

        public ProductCategoryFilter() {}

        public ProductCategoryFilter(ProductCategoryFilter filter) {
            super(filter);
        }

        @Override
        public ProductCategoryFilter copy() {
            return new ProductCategoryFilter(this);
        }
    }

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter name;

    private StringFilter description;

    private StringFilter producer;

    private StringFilter exporter;

    private LocalDateFilter expirationDate;

    private ProductCategoryFilter category;

    private Boolean distinct;

    public ProductCriteria() {}

    public ProductCriteria(ProductCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.name = other.name == null ? null : other.name.copy();
        this.description = other.description == null ? null : other.description.copy();
        this.producer = other.producer == null ? null : other.producer.copy();
        this.exporter = other.exporter == null ? null : other.exporter.copy();
        this.expirationDate = other.expirationDate == null ? null : other.expirationDate.copy();
        this.category = other.category == null ? null : other.category.copy();
        this.distinct = other.distinct;
    }

    @Override
    public ProductCriteria copy() {
        return new ProductCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public LongFilter id() {
        if (id == null) {
            id = new LongFilter();
        }
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public StringFilter getName() {
        return name;
    }

    public StringFilter name() {
        if (name == null) {
            name = new StringFilter();
        }
        return name;
    }

    public void setName(StringFilter name) {
        this.name = name;
    }

    public StringFilter getDescription() {
        return description;
    }

    public StringFilter description() {
        if (description == null) {
            description = new StringFilter();
        }
        return description;
    }

    public void setDescription(StringFilter description) {
        this.description = description;
    }

    public StringFilter getProducer() {
        return producer;
    }

    public StringFilter producer() {
        if (producer == null) {
            producer = new StringFilter();
        }
        return producer;
    }

    public void setProducer(StringFilter producer) {
        this.producer = producer;
    }

    public StringFilter getExporter() {
        return exporter;
    }

    public StringFilter exporter() {
        if (exporter == null) {
            exporter = new StringFilter();
        }
        return exporter;
    }

    public void setExporter(StringFilter exporter) {
        this.exporter = exporter;
    }

    public LocalDateFilter getExpirationDate() {
        return expirationDate;
    }

    public LocalDateFilter expirationDate() {
        if (expirationDate == null) {
            expirationDate = new LocalDateFilter();
        }
        return expirationDate;
    }

    public void setExpirationDate(LocalDateFilter expirationDate) {
        this.expirationDate = expirationDate;
    }

    public ProductCategoryFilter getCategory() {
        return category;
    }

    public ProductCategoryFilter category() {
        if (category == null) {
            category = new ProductCategoryFilter();
        }
        return category;
    }

    public void setCategory(ProductCategoryFilter category) {
        this.category = category;
    }

    public Boolean getDistinct() {
        return distinct;
    }

    public void setDistinct(Boolean distinct) {
        this.distinct = distinct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final ProductCriteria that = (ProductCriteria) o;
        return (
            Objects.equals(id, that.id) &&
            Objects.equals(name, that.name) &&
            Objects.equals(description, that.description) &&
            Objects.equals(producer, that.producer) &&
            Objects.equals(exporter, that.exporter) &&
            Objects.equals(expirationDate, that.expirationDate) &&
            Objects.equals(category, that.category) &&
            Objects.equals(distinct, that.distinct)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, producer, exporter, expirationDate, category, distinct);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ProductCriteria{" +
            (id != null ? "id=" + id + ", " : "") +
            (name != null ? "name=" + name + ", " : "") +
            (description != null ? "description=" + description + ", " : "") +
            (producer != null ? "producer=" + producer + ", " : "") +
            (exporter != null ? "exporter=" + exporter + ", " : "") +
            (expirationDate != null ? "expirationDate=" + expirationDate + ", " : "") +
            (category != null ? "category=" + category + ", " : "") +
            (distinct != null ? "distinct=" + distinct + ", " : "") +
            "}";
    }
}
