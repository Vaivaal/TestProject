package org.example;

import com.testService.ImplementableEnum;

import java.util.List;

public class SomeClass implements ImplementableEnum {
    @Override
    public String implementableMethod() {
        return "Hello from test project";
    }

    private Double calculateEmbedmentDepthRange(MountingSystemConfigurationFormObject roofArrayOptions) {
        // v---- panaudojimas
        double maxEmbedment = roofArrayOptions.rafterDimensions().getWidthInInches();
        return maxEmbedment;
    }

    public void something (String param){

    }
}
