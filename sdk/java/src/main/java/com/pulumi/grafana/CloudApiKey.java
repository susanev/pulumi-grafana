// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.grafana;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.grafana.CloudApiKeyArgs;
import com.pulumi.grafana.Utilities;
import com.pulumi.grafana.inputs.CloudApiKeyState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a single API key on the Grafana Cloud portal (on the organization level)
 * * [API documentation](https://grafana.com/docs/grafana-cloud/reference/cloud-api/#api-keys)
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.grafana.CloudApiKey;
 * import com.pulumi.grafana.CloudApiKeyArgs;
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
 *         var test = new CloudApiKey(&#34;test&#34;, CloudApiKeyArgs.builder()        
 *             .cloudOrgSlug(&#34;myorg&#34;)
 *             .role(&#34;Admin&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import grafana:index/cloudApiKey:CloudApiKey resource_name &#34;{{org-name}}-{{api_key_name}}&#34;
 * ```
 * 
 */
@ResourceType(type="grafana:index/cloudApiKey:CloudApiKey")
public class CloudApiKey extends com.pulumi.resources.CustomResource {
    /**
     * The slug of the organization to create the API key in. This is the same slug as the organization name in the URL.
     * 
     */
    @Export(name="cloudOrgSlug", refs={String.class}, tree="[0]")
    private Output<String> cloudOrgSlug;

    /**
     * @return The slug of the organization to create the API key in. This is the same slug as the organization name in the URL.
     * 
     */
    public Output<String> cloudOrgSlug() {
        return this.cloudOrgSlug;
    }
    /**
     * The generated API key.
     * 
     */
    @Export(name="key", refs={String.class}, tree="[0]")
    private Output<String> key;

    /**
     * @return The generated API key.
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * Name of the API key.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the API key.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Role of the API key. Should be one of [Viewer Editor Admin MetricsPublisher PluginPublisher]. See https://grafana.com/docs/grafana-cloud/api/#create-api-key for details.
     * 
     */
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output<String> role;

    /**
     * @return Role of the API key. Should be one of [Viewer Editor Admin MetricsPublisher PluginPublisher]. See https://grafana.com/docs/grafana-cloud/api/#create-api-key for details.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudApiKey(String name) {
        this(name, CloudApiKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudApiKey(String name, CloudApiKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudApiKey(String name, CloudApiKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("grafana:index/cloudApiKey:CloudApiKey", name, args == null ? CloudApiKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CloudApiKey(String name, Output<String> id, @Nullable CloudApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("grafana:index/cloudApiKey:CloudApiKey", name, state, makeResourceOptions(options, id));
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
    public static CloudApiKey get(String name, Output<String> id, @Nullable CloudApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloudApiKey(name, id, state, options);
    }
}
