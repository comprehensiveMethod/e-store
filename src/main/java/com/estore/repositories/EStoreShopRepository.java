package com.estore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estore.models.EStoreShop;
import com.estore.models.EStoreShopPK;

public interface EStoreShopRepository extends JpaRepository<EStoreShop, EStoreShopPK> {

}

