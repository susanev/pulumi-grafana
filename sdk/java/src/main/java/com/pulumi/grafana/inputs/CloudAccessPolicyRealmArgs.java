// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.grafana.inputs.CloudAccessPolicyRealmLabelPolicyArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudAccessPolicyRealmArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudAccessPolicyRealmArgs Empty = new CloudAccessPolicyRealmArgs();

    /**
     * The identifier of the org or stack. For orgs, this is the slug, for stacks, this is the stack ID.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return The identifier of the org or stack. For orgs, this is the slug, for stacks, this is the stack ID.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    @Import(name="labelPolicies")
    private @Nullable Output<List<CloudAccessPolicyRealmLabelPolicyArgs>> labelPolicies;

    public Optional<Output<List<CloudAccessPolicyRealmLabelPolicyArgs>>> labelPolicies() {
        return Optional.ofNullable(this.labelPolicies);
    }

    /**
     * Whether a policy applies to a Cloud org or a specific stack. Should be one of `org` or `stack`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Whether a policy applies to a Cloud org or a specific stack. Should be one of `org` or `stack`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private CloudAccessPolicyRealmArgs() {}

    private CloudAccessPolicyRealmArgs(CloudAccessPolicyRealmArgs $) {
        this.identifier = $.identifier;
        this.labelPolicies = $.labelPolicies;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudAccessPolicyRealmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudAccessPolicyRealmArgs $;

        public Builder() {
            $ = new CloudAccessPolicyRealmArgs();
        }

        public Builder(CloudAccessPolicyRealmArgs defaults) {
            $ = new CloudAccessPolicyRealmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identifier The identifier of the org or stack. For orgs, this is the slug, for stacks, this is the stack ID.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier The identifier of the org or stack. For orgs, this is the slug, for stacks, this is the stack ID.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        public Builder labelPolicies(@Nullable Output<List<CloudAccessPolicyRealmLabelPolicyArgs>> labelPolicies) {
            $.labelPolicies = labelPolicies;
            return this;
        }

        public Builder labelPolicies(List<CloudAccessPolicyRealmLabelPolicyArgs> labelPolicies) {
            return labelPolicies(Output.of(labelPolicies));
        }

        public Builder labelPolicies(CloudAccessPolicyRealmLabelPolicyArgs... labelPolicies) {
            return labelPolicies(List.of(labelPolicies));
        }

        /**
         * @param type Whether a policy applies to a Cloud org or a specific stack. Should be one of `org` or `stack`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Whether a policy applies to a Cloud org or a specific stack. Should be one of `org` or `stack`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public CloudAccessPolicyRealmArgs build() {
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
