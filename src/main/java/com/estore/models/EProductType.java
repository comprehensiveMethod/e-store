package com.estore.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="store_EProduct_Type")
public class EProductType implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * Идентификатор электронного типа товара
     */
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "product_type_counter")
    @TableGenerator(name = "product_type_counter", pkColumnName = "name", pkColumnValue = "com.estore.models.EProductType", table = "counter", valueColumnName = "currentid", allocationSize = 2)
    @Column(name = "id_", unique = true, nullable = false)
    Long id;

    /**
     * Тип покупки
     */
    @Column(name = "type", nullable = false, length = 100)
    String type;

    @OneToMany(mappedBy = "typeId")
    List<EProduct> eProductList;
}
