package de.hybris.mymod.core.services;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.impl.DefaultProductService;
import org.apache.log4j.Logger;

public class MymodProductService extends DefaultProductService {
    private static final Logger log = Logger.getLogger(MymodProductService.class.getName());

    @Override
    public ProductModel getProductForCode(String code) {
        ProductModel currentModel = super.getProductForCode(code);
        log.info("Code name of product #" + code + ": " + currentModel.getCodeName());
        return currentModel;
    }
}
