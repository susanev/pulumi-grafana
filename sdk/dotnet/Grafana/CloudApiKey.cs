// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Grafana
{
    /// <summary>
    /// Manages a single API key on the Grafana Cloud portal (on the organization level)
    /// * [API documentation](https://grafana.com/docs/grafana-cloud/reference/cloud-api/#api-keys)
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Grafana = Lbrlabs.PulumiPackage.Grafana;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Grafana.CloudApiKey("test", new()
    ///     {
    ///         CloudOrgSlug = "myorg",
    ///         Role = "Admin",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import grafana:index/cloudApiKey:CloudApiKey resource_name "{{org-name}}-{{api_key_name}}"
    /// ```
    /// </summary>
    [GrafanaResourceType("grafana:index/cloudApiKey:CloudApiKey")]
    public partial class CloudApiKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The slug of the organization to create the API key in. This is the same slug as the organization name in the URL.
        /// </summary>
        [Output("cloudOrgSlug")]
        public Output<string> CloudOrgSlug { get; private set; } = null!;

        /// <summary>
        /// The generated API key.
        /// </summary>
        [Output("key")]
        public Output<string> Key { get; private set; } = null!;

        /// <summary>
        /// Name of the API key.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Role of the API key. Should be one of [Viewer Editor Admin MetricsPublisher PluginPublisher]. See https://grafana.com/docs/grafana-cloud/api/#create-api-key for details.
        /// </summary>
        [Output("role")]
        public Output<string> Role { get; private set; } = null!;


        /// <summary>
        /// Create a CloudApiKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CloudApiKey(string name, CloudApiKeyArgs args, CustomResourceOptions? options = null)
            : base("grafana:index/cloudApiKey:CloudApiKey", name, args ?? new CloudApiKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CloudApiKey(string name, Input<string> id, CloudApiKeyState? state = null, CustomResourceOptions? options = null)
            : base("grafana:index/cloudApiKey:CloudApiKey", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
                AdditionalSecretOutputs =
                {
                    "key",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing CloudApiKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CloudApiKey Get(string name, Input<string> id, CloudApiKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new CloudApiKey(name, id, state, options);
        }
    }

    public sealed class CloudApiKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The slug of the organization to create the API key in. This is the same slug as the organization name in the URL.
        /// </summary>
        [Input("cloudOrgSlug", required: true)]
        public Input<string> CloudOrgSlug { get; set; } = null!;

        /// <summary>
        /// Name of the API key.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Role of the API key. Should be one of [Viewer Editor Admin MetricsPublisher PluginPublisher]. See https://grafana.com/docs/grafana-cloud/api/#create-api-key for details.
        /// </summary>
        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        public CloudApiKeyArgs()
        {
        }
        public static new CloudApiKeyArgs Empty => new CloudApiKeyArgs();
    }

    public sealed class CloudApiKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The slug of the organization to create the API key in. This is the same slug as the organization name in the URL.
        /// </summary>
        [Input("cloudOrgSlug")]
        public Input<string>? CloudOrgSlug { get; set; }

        [Input("key")]
        private Input<string>? _key;

        /// <summary>
        /// The generated API key.
        /// </summary>
        public Input<string>? Key
        {
            get => _key;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _key = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Name of the API key.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Role of the API key. Should be one of [Viewer Editor Admin MetricsPublisher PluginPublisher]. See https://grafana.com/docs/grafana-cloud/api/#create-api-key for details.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        public CloudApiKeyState()
        {
        }
        public static new CloudApiKeyState Empty => new CloudApiKeyState();
    }
}
