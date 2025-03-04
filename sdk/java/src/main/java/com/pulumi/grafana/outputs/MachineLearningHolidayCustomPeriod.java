// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MachineLearningHolidayCustomPeriod {
    private String endTime;
    /**
     * @return The name of the custom period.
     * 
     */
    private @Nullable String name;
    private String startTime;

    private MachineLearningHolidayCustomPeriod() {}
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return The name of the custom period.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public String startTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineLearningHolidayCustomPeriod defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endTime;
        private @Nullable String name;
        private String startTime;
        public Builder() {}
        public Builder(MachineLearningHolidayCustomPeriod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.name = defaults.name;
    	      this.startTime = defaults.startTime;
        }

        @CustomType.Setter
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public MachineLearningHolidayCustomPeriod build() {
            final var o = new MachineLearningHolidayCustomPeriod();
            o.endTime = endTime;
            o.name = name;
            o.startTime = startTime;
            return o;
        }
    }
}
