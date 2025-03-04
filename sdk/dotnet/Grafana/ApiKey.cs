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
    ///     var foo = new Grafana.ApiKey("foo", new()
    ///     {
    ///         Role = "Viewer",
    ///     });
    /// 
    ///     var bar = new Grafana.ApiKey("bar", new()
    ///     {
    ///         Role = "Admin",
    ///         SecondsToLive = 30,
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["apiKeyFooKeyOnly"] = foo.Key,
    ///         ["apiKeyBar"] = bar,
    ///     };
    /// });
    /// ```
    /// </summary>
    [GrafanaResourceType("grafana:index/apiKey:ApiKey")]
    public partial class ApiKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Deprecated: Use `grafana.CloudStackServiceAccount` and `grafana.CloudStackServiceAccountToken` resources instead
        /// </summary>
        [Output("cloudStackSlug")]
        public Output<string?> CloudStackSlug { get; private set; } = null!;

        [Output("expiration")]
        public Output<string> Expiration { get; private set; } = null!;

        [Output("key")]
        public Output<string> Key { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The Organization ID. If not set, the Org ID defined in the provider block will be used.
        /// </summary>
        [Output("orgId")]
        public Output<string?> OrgId { get; private set; } = null!;

        [Output("role")]
        public Output<string> Role { get; private set; } = null!;

        [Output("secondsToLive")]
        public Output<int?> SecondsToLive { get; private set; } = null!;


        /// <summary>
        /// Create a ApiKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApiKey(string name, ApiKeyArgs args, CustomResourceOptions? options = null)
            : base("grafana:index/apiKey:ApiKey", name, args ?? new ApiKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApiKey(string name, Input<string> id, ApiKeyState? state = null, CustomResourceOptions? options = null)
            : base("grafana:index/apiKey:ApiKey", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ApiKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApiKey Get(string name, Input<string> id, ApiKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new ApiKey(name, id, state, options);
        }
    }

    public sealed class ApiKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Deprecated: Use `grafana.CloudStackServiceAccount` and `grafana.CloudStackServiceAccountToken` resources instead
        /// </summary>
        [Input("cloudStackSlug")]
        public Input<string>? CloudStackSlug { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Organization ID. If not set, the Org ID defined in the provider block will be used.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        [Input("secondsToLive")]
        public Input<int>? SecondsToLive { get; set; }

        public ApiKeyArgs()
        {
        }
        public static new ApiKeyArgs Empty => new ApiKeyArgs();
    }

    public sealed class ApiKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Deprecated: Use `grafana.CloudStackServiceAccount` and `grafana.CloudStackServiceAccountToken` resources instead
        /// </summary>
        [Input("cloudStackSlug")]
        public Input<string>? CloudStackSlug { get; set; }

        [Input("expiration")]
        public Input<string>? Expiration { get; set; }

        [Input("key")]
        private Input<string>? _key;
        public Input<string>? Key
        {
            get => _key;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _key = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Organization ID. If not set, the Org ID defined in the provider block will be used.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("role")]
        public Input<string>? Role { get; set; }

        [Input("secondsToLive")]
        public Input<int>? SecondsToLive { get; set; }

        public ApiKeyState()
        {
        }
        public static new ApiKeyState Empty => new ApiKeyState();
    }
}
