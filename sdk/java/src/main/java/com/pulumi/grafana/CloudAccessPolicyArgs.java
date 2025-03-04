// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.grafana.inputs.CloudAccessPolicyRealmArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudAccessPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudAccessPolicyArgs Empty = new CloudAccessPolicyArgs();

    /**
     * Display name of the access policy. Defaults to the name.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Display name of the access policy. Defaults to the name.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Name of the access policy.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the access policy.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="realms", required=true)
    private Output<List<CloudAccessPolicyRealmArgs>> realms;

    public Output<List<CloudAccessPolicyRealmArgs>> realms() {
        return this.realms;
    }

    /**
     * Region where the API is deployed. Generally where the stack is deployed. Use the region list API to get the list of available regions: https://grafana.com/docs/grafana-cloud/reference/cloud-api/#list-regions.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return Region where the API is deployed. Generally where the stack is deployed. Use the region list API to get the list of available regions: https://grafana.com/docs/grafana-cloud/reference/cloud-api/#list-regions.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     * Scopes of the access policy. See https://grafana.com/docs/grafana-cloud/authentication-and-permissions/access-policies/#scopes for possible values.
     * 
     */
    @Import(name="scopes", required=true)
    private Output<List<String>> scopes;

    /**
     * @return Scopes of the access policy. See https://grafana.com/docs/grafana-cloud/authentication-and-permissions/access-policies/#scopes for possible values.
     * 
     */
    public Output<List<String>> scopes() {
        return this.scopes;
    }

    private CloudAccessPolicyArgs() {}

    private CloudAccessPolicyArgs(CloudAccessPolicyArgs $) {
        this.displayName = $.displayName;
        this.name = $.name;
        this.realms = $.realms;
        this.region = $.region;
        this.scopes = $.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudAccessPolicyArgs $;

        public Builder() {
            $ = new CloudAccessPolicyArgs();
        }

        public Builder(CloudAccessPolicyArgs defaults) {
            $ = new CloudAccessPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName Display name of the access policy. Defaults to the name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Display name of the access policy. Defaults to the name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param name Name of the access policy.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the access policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder realms(Output<List<CloudAccessPolicyRealmArgs>> realms) {
            $.realms = realms;
            return this;
        }

        public Builder realms(List<CloudAccessPolicyRealmArgs> realms) {
            return realms(Output.of(realms));
        }

        public Builder realms(CloudAccessPolicyRealmArgs... realms) {
            return realms(List.of(realms));
        }

        /**
         * @param region Region where the API is deployed. Generally where the stack is deployed. Use the region list API to get the list of available regions: https://grafana.com/docs/grafana-cloud/reference/cloud-api/#list-regions.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Region where the API is deployed. Generally where the stack is deployed. Use the region list API to get the list of available regions: https://grafana.com/docs/grafana-cloud/reference/cloud-api/#list-regions.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param scopes Scopes of the access policy. See https://grafana.com/docs/grafana-cloud/authentication-and-permissions/access-policies/#scopes for possible values.
         * 
         * @return builder
         * 
         */
        public Builder scopes(Output<List<String>> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes Scopes of the access policy. See https://grafana.com/docs/grafana-cloud/authentication-and-permissions/access-policies/#scopes for possible values.
         * 
         * @return builder
         * 
         */
        public Builder scopes(List<String> scopes) {
            return scopes(Output.of(scopes));
        }

        /**
         * @param scopes Scopes of the access policy. See https://grafana.com/docs/grafana-cloud/authentication-and-permissions/access-policies/#scopes for possible values.
         * 
         * @return builder
         * 
         */
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }

        public CloudAccessPolicyArgs build() {
            $.realms = Objects.requireNonNull($.realms, "expected parameter 'realms' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.scopes = Objects.requireNonNull($.scopes, "expected parameter 'scopes' to be non-null");
            return $;
        }
    }

}
