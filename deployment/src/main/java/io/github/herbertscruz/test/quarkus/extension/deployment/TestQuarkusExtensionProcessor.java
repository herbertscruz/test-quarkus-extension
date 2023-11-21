package io.github.herbertscruz.test.quarkus.extension.deployment;

import io.github.herbertscruz.test.quarkus.extension.runtime.PersonalSecurityIdentity;

import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class TestQuarkusExtensionProcessor {

    private static final String FEATURE = "test-quarkus-extension";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    /**
     * @see https://quarkus.io/guides/cdi-integration#additional_bean_build_item
     * @return
     */
    @BuildStep
    AdditionalBeanBuildItem additionalBeans() {
        return new AdditionalBeanBuildItem(PersonalSecurityIdentity.class);
    }
}
