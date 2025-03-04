// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.grafana.ApiKeyArgs;
import com.pulumi.grafana.Utilities;
import com.pulumi.grafana.inputs.ApiKeyState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.grafana.ApiKey;
 * import com.pulumi.grafana.ApiKeyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foo = new ApiKey(&#34;foo&#34;, ApiKeyArgs.builder()        
 *             .role(&#34;Viewer&#34;)
 *             .build());
 * 
 *         var bar = new ApiKey(&#34;bar&#34;, ApiKeyArgs.builder()        
 *             .role(&#34;Admin&#34;)
 *             .secondsToLive(30)
 *             .build());
 * 
 *         ctx.export(&#34;apiKeyFooKeyOnly&#34;, foo.key());
 *         ctx.export(&#34;apiKeyBar&#34;, bar);
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="grafana:index/apiKey:ApiKey")
public class ApiKey extends com.pulumi.resources.CustomResource {
    /**
     * Deprecated: Use `grafana.CloudStackServiceAccount` and `grafana.CloudStackServiceAccountToken` resources instead
     * 
     * @deprecated
     * Use `grafana_cloud_stack_service_account` and `grafana_cloud_stack_service_account_token` resources instead
     * 
     */
    @Deprecated /* Use `grafana_cloud_stack_service_account` and `grafana_cloud_stack_service_account_token` resources instead */
    @Export(name="cloudStackSlug", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cloudStackSlug;

    /**
     * @return Deprecated: Use `grafana.CloudStackServiceAccount` and `grafana.CloudStackServiceAccountToken` resources instead
     * 
     */
    public Output<Optional<String>> cloudStackSlug() {
        return Codegen.optional(this.cloudStackSlug);
    }
    @Export(name="expiration", refs={String.class}, tree="[0]")
    private Output<String> expiration;

    public Output<String> expiration() {
        return this.expiration;
    }
    @Export(name="key", refs={String.class}, tree="[0]")
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    /**
     * The Organization ID. If not set, the Org ID defined in the provider block will be used.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> orgId;

    /**
     * @return The Organization ID. If not set, the Org ID defined in the provider block will be used.
     * 
     */
    public Output<Optional<String>> orgId() {
        return Codegen.optional(this.orgId);
    }
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output<String> role;

    public Output<String> role() {
        return this.role;
    }
    @Export(name="secondsToLive", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> secondsToLive;

    public Output<Optional<Integer>> secondsToLive() {
        return Codegen.optional(this.secondsToLive);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiKey(String name) {
        this(name, ApiKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiKey(String name, ApiKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiKey(String name, ApiKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("grafana:index/apiKey:ApiKey", name, args == null ? ApiKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiKey(String name, Output<String> id, @Nullable ApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("grafana:index/apiKey:ApiKey", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "key"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ApiKey get(String name, Output<String> id, @Nullable ApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiKey(name, id, state, options);
    }
}
