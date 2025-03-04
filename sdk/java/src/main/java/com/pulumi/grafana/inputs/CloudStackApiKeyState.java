// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudStackApiKeyState extends com.pulumi.resources.ResourceArgs {

    public static final CloudStackApiKeyState Empty = new CloudStackApiKeyState();

    @Import(name="expiration")
    private @Nullable Output<String> expiration;

    public Optional<Output<String>> expiration() {
        return Optional.ofNullable(this.expiration);
    }

    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="role")
    private @Nullable Output<String> role;

    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    @Import(name="secondsToLive")
    private @Nullable Output<Integer> secondsToLive;

    public Optional<Output<Integer>> secondsToLive() {
        return Optional.ofNullable(this.secondsToLive);
    }

    @Import(name="stackSlug")
    private @Nullable Output<String> stackSlug;

    public Optional<Output<String>> stackSlug() {
        return Optional.ofNullable(this.stackSlug);
    }

    private CloudStackApiKeyState() {}

    private CloudStackApiKeyState(CloudStackApiKeyState $) {
        this.expiration = $.expiration;
        this.key = $.key;
        this.name = $.name;
        this.role = $.role;
        this.secondsToLive = $.secondsToLive;
        this.stackSlug = $.stackSlug;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudStackApiKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudStackApiKeyState $;

        public Builder() {
            $ = new CloudStackApiKeyState();
        }

        public Builder(CloudStackApiKeyState defaults) {
            $ = new CloudStackApiKeyState(Objects.requireNonNull(defaults));
        }

        public Builder expiration(@Nullable Output<String> expiration) {
            $.expiration = expiration;
            return this;
        }

        public Builder expiration(String expiration) {
            return expiration(Output.of(expiration));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public Builder secondsToLive(@Nullable Output<Integer> secondsToLive) {
            $.secondsToLive = secondsToLive;
            return this;
        }

        public Builder secondsToLive(Integer secondsToLive) {
            return secondsToLive(Output.of(secondsToLive));
        }

        public Builder stackSlug(@Nullable Output<String> stackSlug) {
            $.stackSlug = stackSlug;
            return this;
        }

        public Builder stackSlug(String stackSlug) {
            return stackSlug(Output.of(stackSlug));
        }

        public CloudStackApiKeyState build() {
            return $;
        }
    }

}
