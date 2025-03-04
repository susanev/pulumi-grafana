// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OncallIntegrationTemplatesWeb {
    private @Nullable String imageUrl;
    private @Nullable String message;
    private @Nullable String title;

    private OncallIntegrationTemplatesWeb() {}
    public Optional<String> imageUrl() {
        return Optional.ofNullable(this.imageUrl);
    }
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OncallIntegrationTemplatesWeb defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String imageUrl;
        private @Nullable String message;
        private @Nullable String title;
        public Builder() {}
        public Builder(OncallIntegrationTemplatesWeb defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageUrl = defaults.imageUrl;
    	      this.message = defaults.message;
    	      this.title = defaults.title;
        }

        @CustomType.Setter
        public Builder imageUrl(@Nullable String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        @CustomType.Setter
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        public OncallIntegrationTemplatesWeb build() {
            final var o = new OncallIntegrationTemplatesWeb();
            o.imageUrl = imageUrl;
            o.message = message;
            o.title = title;
            return o;
        }
    }
}
