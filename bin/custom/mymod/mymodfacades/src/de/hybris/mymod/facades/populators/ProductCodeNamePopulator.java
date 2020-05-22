package de.hybris.mymod.facades.populators;

import de.hybris.platform.commercefacades.product.converters.populator.AbstractProductPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class ProductCodeNamePopulator<SOURCE extends ProductModel, TARGET extends ProductData> extends AbstractProductPopulator<SOURCE, TARGET> {

    @Override
    public void populate(final SOURCE productModel, final TARGET productData) throws ConversionException {
        productData.setCodeName(safeToString(getProductAttribute(productModel, ProductModel.CODENAME)));
    }
}
