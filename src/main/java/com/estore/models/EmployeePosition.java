package com.estore.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="store_employee_position")
public class EmployeePosition {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "position_counter")
    @TableGenerator(name = "position_counter", pkColumnName = "name", pkColumnValue = "com.estore.models.EmployeePosition", table = "counter", valueColumnName = "currentid", allocationSize = 2)
    @Column(name = "id_", unique = true, nullable = false)
    Long id;

    @Column(name = "position", nullable = false, length = 100)
    String position;

}
