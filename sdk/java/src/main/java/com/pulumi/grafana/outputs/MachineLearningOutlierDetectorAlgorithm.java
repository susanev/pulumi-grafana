// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.grafana.outputs.MachineLearningOutlierDetectorAlgorithmConfig;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MachineLearningOutlierDetectorAlgorithm {
    /**
     * @return For DBSCAN only, specify the configuration map
     * 
     */
    private @Nullable MachineLearningOutlierDetectorAlgorithmConfig config;
    /**
     * @return The name of the algorithm to use (&#39;mad&#39; or &#39;dbscan&#39;).
     * 
     */
    private String name;
    /**
     * @return Specify the sensitivity of the detector (in range [0,1]).
     * 
     */
    private Double sensitivity;

    private MachineLearningOutlierDetectorAlgorithm() {}
    /**
     * @return For DBSCAN only, specify the configuration map
     * 
     */
    public Optional<MachineLearningOutlierDetectorAlgorithmConfig> config() {
        return Optional.ofNullable(this.config);
    }
    /**
     * @return The name of the algorithm to use (&#39;mad&#39; or &#39;dbscan&#39;).
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specify the sensitivity of the detector (in range [0,1]).
     * 
     */
    public Double sensitivity() {
        return this.sensitivity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineLearningOutlierDetectorAlgorithm defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable MachineLearningOutlierDetectorAlgorithmConfig config;
        private String name;
        private Double sensitivity;
        public Builder() {}
        public Builder(MachineLearningOutlierDetectorAlgorithm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.name = defaults.name;
    	      this.sensitivity = defaults.sensitivity;
        }

        @CustomType.Setter
        public Builder config(@Nullable MachineLearningOutlierDetectorAlgorithmConfig config) {
            this.config = config;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder sensitivity(Double sensitivity) {
            this.sensitivity = Objects.requireNonNull(sensitivity);
            return this;
        }
        public MachineLearningOutlierDetectorAlgorithm build() {
            final var o = new MachineLearningOutlierDetectorAlgorithm();
            o.config = config;
            o.name = name;
            o.sensitivity = sensitivity;
            return o;
        }
    }
}
