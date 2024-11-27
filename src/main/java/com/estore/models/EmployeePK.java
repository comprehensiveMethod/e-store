package com.estore.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeePK implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     *  Идентификатор сотрудника
     */
    Long employeeId;

    /**
     *  Идентификатор типа электротовара
     */
    Long eProductTypeId;
}
