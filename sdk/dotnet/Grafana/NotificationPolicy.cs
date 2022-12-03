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
    /// Sets the global notification policy for Grafana. Note that this resource manages the entire notification policy tree, and will overwrite any existing policies.
    /// 
    /// * [Official documentation](https://grafana.com/docs/grafana/latest/alerting/notifications/)
    /// * [HTTP API](https://grafana.com/docs/grafana/next/developers/http_api/alerting_provisioning/#notification-policies)
    /// 
    /// This resource requires Grafana 9.1.0 or later.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Grafana = Lbrlabs.PulumiPackage.Grafana;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var aContactPoint = new Grafana.ContactPoint("aContactPoint", new()
    ///     {
    ///         Emails = new[]
    ///         {
    ///             new Grafana.Inputs.ContactPointEmailArgs
    ///             {
    ///                 Addresses = new[]
    ///                 {
    ///                     "one@company.org",
    ///                     "two@company.org",
    ///                 },
    ///                 Message = "{{ len .Alerts.Firing }} firing.",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var aMuteTiming = new Grafana.MuteTiming("aMuteTiming", new()
    ///     {
    ///         Intervals = new[]
    ///         {
    ///             new Grafana.Inputs.MuteTimingIntervalArgs
    ///             {
    ///                 Weekdays = new[]
    ///                 {
    ///                     "monday",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var myNotificationPolicy = new Grafana.NotificationPolicy("myNotificationPolicy", new()
    ///     {
    ///         GroupBies = new[]
    ///         {
    ///             "...",
    ///         },
    ///         ContactPoint = aContactPoint.Name,
    ///         GroupWait = "45s",
    ///         GroupInterval = "6m",
    ///         RepeatInterval = "3h",
    ///         Policies = new[]
    ///         {
    ///             new Grafana.Inputs.NotificationPolicyPolicyArgs
    ///             {
    ///                 Matchers = new[]
    ///                 {
    ///                     new Grafana.Inputs.NotificationPolicyPolicyMatcherArgs
    ///                     {
    ///                         Label = "mylabel",
    ///                         Match = "=",
    ///                         Value = "myvalue",
    ///                     },
    ///                 },
    ///                 ContactPoint = aContactPoint.Name,
    ///                 GroupBies = new[]
    ///                 {
    ///                     "alertname",
    ///                 },
    ///                 Continue = true,
    ///                 MuteTimings = new[]
    ///                 {
    ///                     aMuteTiming.Name,
    ///                 },
    ///                 GroupWait = "45s",
    ///                 GroupInterval = "6m",
    ///                 RepeatInterval = "3h",
    ///                 Policies = new[]
    ///                 {
    ///                     new Grafana.Inputs.NotificationPolicyPolicyPolicyArgs
    ///                     {
    ///                         Matchers = new[]
    ///                         {
    ///                             new Grafana.Inputs.NotificationPolicyPolicyPolicyMatcherArgs
    ///                             {
    ///                                 Label = "sublabel",
    ///                                 Match = "=",
    ///                                 Value = "subvalue",
    ///                             },
    ///                         },
    ///                         ContactPoint = aContactPoint.Name,
    ///                         GroupBies = new[]
    ///                         {
    ///                             "...",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///             new Grafana.Inputs.NotificationPolicyPolicyArgs
    ///             {
    ///                 Matchers = new[]
    ///                 {
    ///                     new Grafana.Inputs.NotificationPolicyPolicyMatcherArgs
    ///                     {
    ///                         Label = "anotherlabel",
    ///                         Match = "=~",
    ///                         Value = "another value.*",
    ///                     },
    ///                 },
    ///                 ContactPoint = aContactPoint.Name,
    ///                 GroupBies = new[]
    ///                 {
    ///                     "...",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// The policy is a singleton, so the ID is a constant "policy" value.
    /// 
    /// ```sh
    ///  $ pulumi import grafana:index/notificationPolicy:NotificationPolicy notification_policy_name "policy"
    /// ```
    /// </summary>
    [GrafanaResourceType("grafana:index/notificationPolicy:NotificationPolicy")]
    public partial class NotificationPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The default contact point to route all unmatched notifications to.
        /// </summary>
        [Output("contactPoint")]
        public Output<string> ContactPoint { get; private set; } = null!;

        /// <summary>
        /// A list of alert labels to group alerts into notifications by. Use the special label `...` to group alerts by all labels, effectively disabling grouping.
        /// </summary>
        [Output("groupBies")]
        public Output<ImmutableArray<string>> GroupBies { get; private set; } = null!;

        /// <summary>
        /// Minimum time interval between two notifications for the same group. Default is 5 minutes.
        /// </summary>
        [Output("groupInterval")]
        public Output<string?> GroupInterval { get; private set; } = null!;

        /// <summary>
        /// Time to wait to buffer alerts of the same group before sending a notification. Default is 30 seconds.
        /// </summary>
        [Output("groupWait")]
        public Output<string?> GroupWait { get; private set; } = null!;

        /// <summary>
        /// Routing rules for specific label sets.
        /// </summary>
        [Output("policies")]
        public Output<ImmutableArray<Outputs.NotificationPolicyPolicy>> Policies { get; private set; } = null!;

        /// <summary>
        /// Minimum time interval for re-sending a notification if an alert is still firing. Default is 4 hours.
        /// </summary>
        [Output("repeatInterval")]
        public Output<string?> RepeatInterval { get; private set; } = null!;


        /// <summary>
        /// Create a NotificationPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NotificationPolicy(string name, NotificationPolicyArgs args, CustomResourceOptions? options = null)
            : base("grafana:index/notificationPolicy:NotificationPolicy", name, args ?? new NotificationPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NotificationPolicy(string name, Input<string> id, NotificationPolicyState? state = null, CustomResourceOptions? options = null)
            : base("grafana:index/notificationPolicy:NotificationPolicy", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing NotificationPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NotificationPolicy Get(string name, Input<string> id, NotificationPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new NotificationPolicy(name, id, state, options);
        }
    }

    public sealed class NotificationPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The default contact point to route all unmatched notifications to.
        /// </summary>
        [Input("contactPoint", required: true)]
        public Input<string> ContactPoint { get; set; } = null!;

        [Input("groupBies", required: true)]
        private InputList<string>? _groupBies;

        /// <summary>
        /// A list of alert labels to group alerts into notifications by. Use the special label `...` to group alerts by all labels, effectively disabling grouping.
        /// </summary>
        public InputList<string> GroupBies
        {
            get => _groupBies ?? (_groupBies = new InputList<string>());
            set => _groupBies = value;
        }

        /// <summary>
        /// Minimum time interval between two notifications for the same group. Default is 5 minutes.
        /// </summary>
        [Input("groupInterval")]
        public Input<string>? GroupInterval { get; set; }

        /// <summary>
        /// Time to wait to buffer alerts of the same group before sending a notification. Default is 30 seconds.
        /// </summary>
        [Input("groupWait")]
        public Input<string>? GroupWait { get; set; }

        [Input("policies")]
        private InputList<Inputs.NotificationPolicyPolicyArgs>? _policies;

        /// <summary>
        /// Routing rules for specific label sets.
        /// </summary>
        public InputList<Inputs.NotificationPolicyPolicyArgs> Policies
        {
            get => _policies ?? (_policies = new InputList<Inputs.NotificationPolicyPolicyArgs>());
            set => _policies = value;
        }

        /// <summary>
        /// Minimum time interval for re-sending a notification if an alert is still firing. Default is 4 hours.
        /// </summary>
        [Input("repeatInterval")]
        public Input<string>? RepeatInterval { get; set; }

        public NotificationPolicyArgs()
        {
        }
        public static new NotificationPolicyArgs Empty => new NotificationPolicyArgs();
    }

    public sealed class NotificationPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The default contact point to route all unmatched notifications to.
        /// </summary>
        [Input("contactPoint")]
        public Input<string>? ContactPoint { get; set; }

        [Input("groupBies")]
        private InputList<string>? _groupBies;

        /// <summary>
        /// A list of alert labels to group alerts into notifications by. Use the special label `...` to group alerts by all labels, effectively disabling grouping.
        /// </summary>
        public InputList<string> GroupBies
        {
            get => _groupBies ?? (_groupBies = new InputList<string>());
            set => _groupBies = value;
        }

        /// <summary>
        /// Minimum time interval between two notifications for the same group. Default is 5 minutes.
        /// </summary>
        [Input("groupInterval")]
        public Input<string>? GroupInterval { get; set; }

        /// <summary>
        /// Time to wait to buffer alerts of the same group before sending a notification. Default is 30 seconds.
        /// </summary>
        [Input("groupWait")]
        public Input<string>? GroupWait { get; set; }

        [Input("policies")]
        private InputList<Inputs.NotificationPolicyPolicyGetArgs>? _policies;

        /// <summary>
        /// Routing rules for specific label sets.
        /// </summary>
        public InputList<Inputs.NotificationPolicyPolicyGetArgs> Policies
        {
            get => _policies ?? (_policies = new InputList<Inputs.NotificationPolicyPolicyGetArgs>());
            set => _policies = value;
        }

        /// <summary>
        /// Minimum time interval for re-sending a notification if an alert is still firing. Default is 4 hours.
        /// </summary>
        [Input("repeatInterval")]
        public Input<string>? RepeatInterval { get; set; }

        public NotificationPolicyState()
        {
        }
        public static new NotificationPolicyState Empty => new NotificationPolicyState();
    }
}
