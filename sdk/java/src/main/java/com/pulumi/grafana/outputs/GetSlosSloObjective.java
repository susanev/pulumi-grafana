// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSlosSloObjective {
    private Double value;
    private String window;

    private GetSlosSloObjective() {}
    public Double value() {
        return this.value;
    }
    public String window() {
        return this.window;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSlosSloObjective defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double value;
        private String window;
        public Builder() {}
        public Builder(GetSlosSloObjective defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
    	      this.window = defaults.window;
        }

        @CustomType.Setter
        public Builder value(Double value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        @CustomType.Setter
        public Builder window(String window) {
            this.window = Objects.requireNonNull(window);
            return this;
        }
        public GetSlosSloObjective build() {
            final var o = new GetSlosSloObjective();
            o.value = value;
            o.window = window;
            return o;
        }
    }
}
