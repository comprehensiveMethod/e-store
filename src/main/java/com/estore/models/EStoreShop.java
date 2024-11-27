package com.estore.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@IdClass(EStoreShopPK.class)
@Table(name = "store_eshop")
public class EStoreShop {

    /**
     * Идентификатор магазина
     */
    @Id
    @Column(name = "shopId", nullable = false)
    Long shopId;

    /**
     * Идентификатор электротовара
     */
    @Id
    @Column(name = "electroItemId", nullable = false)
    Long electroItemId;

    /**
     * Оставшееся количество
     */
    @Column(name = "count_", nullable = false)
    int count;
}
