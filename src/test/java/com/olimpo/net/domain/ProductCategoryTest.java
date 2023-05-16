package com.olimpo.net.domain;

import static org.assertj.core.api.Assertions.assertThat;

import com.olimpo.net.web.rest.TestUtil;
import java.util.UUID;
import org.junit.jupiter.api.Test;

class ProductCategoryTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(ProductCategory.class);
        ProductCategory productCategory1 = new ProductCategory();
        productCategory1.setId(UUID.randomUUID());
        ProductCategory productCategory2 = new ProductCategory();
        productCategory2.setId(productCategory1.getId());
        assertThat(productCategory1).isEqualTo(productCategory2);
        productCategory2.setId(UUID.randomUUID());
        assertThat(productCategory1).isNotEqualTo(productCategory2);
        productCategory1.setId(null);
        assertThat(productCategory1).isNotEqualTo(productCategory2);
    }
}
