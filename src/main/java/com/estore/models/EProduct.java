package com.estore.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "store_eproducts")
public class EProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * Идентификатор товара
     */
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "product_counter")
    @TableGenerator(name = "product_counter", pkColumnName = "name", pkColumnValue = "com.estore.models.Eproduct", table = "counter", valueColumnName = "currentid", allocationSize = 2)
    @Column(name = "id_", unique = true, nullable = false)
    Long id;

    /**
     * Нвзвание товара
     */
    @Column(name="name", nullable = false, length = 100)
    String product_name;

    /**
     * Идентификатор электронного типа товара
     */
    @ManyToOne
    @JoinColumn(name="typeId",foreignKey = @ForeignKey(name = "FK_EPRODUCT_TYPE"))
    EProductType typeId;

    /**
     * Цена товара
     */
    @Column(name="price", nullable = false)
    int price;

    /**
     * Кол-во товара
     */
    @Column(name="quantity", nullable = false, length = 100)
    int quantity;
    /**
     * Признак архивности товара – логическое значение: true – товара нет в
     * наличии, снят с продаж, false – товар в продаже
     */
    @Column(name = "InSale", nullable = false)
    boolean InSale;
    /**
     * Описание товара
     */
    @Column(name = "description", nullable = false)
    String description;

}
