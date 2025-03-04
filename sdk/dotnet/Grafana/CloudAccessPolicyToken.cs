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
    /// * [Official documentation](https://grafana.com/docs/grafana-cloud/authentication-and-permissions/access-policies/)
    /// * [API documentation](https://grafana.com/docs/grafana-cloud/reference/cloud-api/#create-a-token)
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Grafana = Lbrlabs.PulumiPackage.Grafana;
    /// using Grafana = Pulumi.Grafana;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var current = Grafana.GetCloudOrganization.Invoke(new()
    ///     {
    ///         Slug = "&lt;your org slug&gt;",
    ///     });
    /// 
    ///     var testCloudAccessPolicy = new Grafana.CloudAccessPolicy("testCloudAccessPolicy", new()
    ///     {
    ///         Region = "us",
    ///         DisplayName = "My Policy",
    ///         Scopes = new[]
    ///         {
    ///             "metrics:read",
    ///             "logs:read",
    ///         },
    ///         Realms = new[]
    ///         {
    ///             new Grafana.Inputs.CloudAccessPolicyRealmArgs
    ///             {
    ///                 Type = "org",
    ///                 Identifier = current.Apply(getCloudOrganizationResult =&gt; getCloudOrganizationResult.Id),
    ///                 LabelPolicies = new[]
    ///                 {
    ///                     new Grafana.Inputs.CloudAccessPolicyRealmLabelPolicyArgs
    ///                     {
    ///                         Selector = "{namespace=\"default\"}",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var testCloudAccessPolicyToken = new Grafana.CloudAccessPolicyToken("testCloudAccessPolicyToken", new()
    ///     {
    ///         Region = "us",
    ///         AccessPolicyId = testCloudAccessPolicy.PolicyId,
    ///         DisplayName = "My Policy Token",
    ///         ExpiresAt = "2023-01-01T00:00:00Z",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [GrafanaResourceType("grafana:index/cloudAccessPolicyToken:CloudAccessPolicyToken")]
    public partial class CloudAccessPolicyToken : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ID of the access policy for which to create a token.
        /// </summary>
        [Output("accessPolicyId")]
        public Output<string> AccessPolicyId { get; private set; } = null!;

        /// <summary>
        /// Creation date of the access policy token.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Display name of the access policy token. Defaults to the name.
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Expiration date of the access policy token. Does not expire by default.
        /// </summary>
        [Output("expiresAt")]
        public Output<string?> ExpiresAt { get; private set; } = null!;

        /// <summary>
        /// Name of the access policy token.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Region of the access policy. Should be set to the same region as the access policy. Use the region list API to get the list of available regions: https://grafana.com/docs/grafana-cloud/reference/cloud-api/#list-regions.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        [Output("token")]
        public Output<string> Token { get; private set; } = null!;

        /// <summary>
        /// Last update date of the access policy token.
        /// </summary>
        [Output("updatedAt")]
        public Output<string> UpdatedAt { get; private set; } = null!;


        /// <summary>
        /// Create a CloudAccessPolicyToken resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CloudAccessPolicyToken(string name, CloudAccessPolicyTokenArgs args, CustomResourceOptions? options = null)
            : base("grafana:index/cloudAccessPolicyToken:CloudAccessPolicyToken", name, args ?? new CloudAccessPolicyTokenArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CloudAccessPolicyToken(string name, Input<string> id, CloudAccessPolicyTokenState? state = null, CustomResourceOptions? options = null)
            : base("grafana:index/cloudAccessPolicyToken:CloudAccessPolicyToken", name, state, MakeResourceOptions(options, id))
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
                    "token",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing CloudAccessPolicyToken resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CloudAccessPolicyToken Get(string name, Input<string> id, CloudAccessPolicyTokenState? state = null, CustomResourceOptions? options = null)
        {
            return new CloudAccessPolicyToken(name, id, state, options);
        }
    }

    public sealed class CloudAccessPolicyTokenArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the access policy for which to create a token.
        /// </summary>
        [Input("accessPolicyId", required: true)]
        public Input<string> AccessPolicyId { get; set; } = null!;

        /// <summary>
        /// Display name of the access policy token. Defaults to the name.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Expiration date of the access policy token. Does not expire by default.
        /// </summary>
        [Input("expiresAt")]
        public Input<string>? ExpiresAt { get; set; }

        /// <summary>
        /// Name of the access policy token.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Region of the access policy. Should be set to the same region as the access policy. Use the region list API to get the list of available regions: https://grafana.com/docs/grafana-cloud/reference/cloud-api/#list-regions.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public CloudAccessPolicyTokenArgs()
        {
        }
        public static new CloudAccessPolicyTokenArgs Empty => new CloudAccessPolicyTokenArgs();
    }

    public sealed class CloudAccessPolicyTokenState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the access policy for which to create a token.
        /// </summary>
        [Input("accessPolicyId")]
        public Input<string>? AccessPolicyId { get; set; }

        /// <summary>
        /// Creation date of the access policy token.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Display name of the access policy token. Defaults to the name.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Expiration date of the access policy token. Does not expire by default.
        /// </summary>
        [Input("expiresAt")]
        public Input<string>? ExpiresAt { get; set; }

        /// <summary>
        /// Name of the access policy token.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Region of the access policy. Should be set to the same region as the access policy. Use the region list API to get the list of available regions: https://grafana.com/docs/grafana-cloud/reference/cloud-api/#list-regions.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("token")]
        private Input<string>? _token;
        public Input<string>? Token
        {
            get => _token;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _token = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Last update date of the access policy token.
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        public CloudAccessPolicyTokenState()
        {
        }
        public static new CloudAccessPolicyTokenState Empty => new CloudAccessPolicyTokenState();
    }
}
