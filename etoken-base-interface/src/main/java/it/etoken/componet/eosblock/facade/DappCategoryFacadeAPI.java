package it.etoken.componet.eosblock.facade;

import it.etoken.base.common.result.MLResultList;
import it.etoken.base.model.eosblock.entity.DappCategory;

public interface DappCategoryFacadeAPI {
	
	public MLResultList<DappCategory> findAll();
}
