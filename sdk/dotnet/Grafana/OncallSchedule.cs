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
    /// * [HTTP API](https://grafana.com/docs/oncall/latest/oncall-api-reference/schedules/)
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
    ///     var exampleSlackChannel = Grafana.GetOnCallSlackChannel.Invoke(new()
    ///     {
    ///         Name = "example_slack_channel",
    ///     });
    /// 
    ///     var exampleUserGroup = Grafana.GetOncallUserGroup.Invoke(new()
    ///     {
    ///         SlackHandle = "example_slack_handle",
    ///     });
    /// 
    ///     // ICal based schedule
    ///     var exampleScheduleOncallSchedule = new Grafana.OncallSchedule("exampleScheduleOncallSchedule", new()
    ///     {
    ///         Type = "ical",
    ///         IcalUrlPrimary = "https://example.com/example_ical.ics",
    ///         IcalUrlOverrides = "https://example.com/example_overrides_ical.ics",
    ///         Slack = new Grafana.Inputs.OncallScheduleSlackArgs
    ///         {
    ///             ChannelId = exampleSlackChannel.Apply(getOnCallSlackChannelResult =&gt; getOnCallSlackChannelResult.SlackId),
    ///             UserGroupId = exampleUserGroup.Apply(getOncallUserGroupResult =&gt; getOncallUserGroupResult.SlackId),
    ///         },
    ///     });
    /// 
    ///     // Shift based schedule
    ///     var exampleScheduleIndex_oncallScheduleOncallSchedule = new Grafana.OncallSchedule("exampleScheduleIndex/oncallScheduleOncallSchedule", new()
    ///     {
    ///         Type = "calendar",
    ///         TimeZone = "America/New_York",
    ///         Shifts = new[] {},
    ///         IcalUrlOverrides = "https://example.com/example_overrides_ical.ics",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import grafana:index/oncallSchedule:OncallSchedule schedule_name {{schedule_id}}
    /// ```
    /// </summary>
    [GrafanaResourceType("grafana:index/oncallSchedule:OncallSchedule")]
    public partial class OncallSchedule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The URL of external iCal calendar which override primary events.
        /// </summary>
        [Output("icalUrlOverrides")]
        public Output<string?> IcalUrlOverrides { get; private set; } = null!;

        /// <summary>
        /// The URL of the external calendar iCal file.
        /// </summary>
        [Output("icalUrlPrimary")]
        public Output<string?> IcalUrlPrimary { get; private set; } = null!;

        /// <summary>
        /// The schedule's name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The list of ID's of on-call shifts.
        /// </summary>
        [Output("shifts")]
        public Output<ImmutableArray<string>> Shifts { get; private set; } = null!;

        /// <summary>
        /// The Slack-specific settings for a schedule.
        /// </summary>
        [Output("slack")]
        public Output<Outputs.OncallScheduleSlack?> Slack { get; private set; } = null!;

        /// <summary>
        /// The ID of the OnCall team. To get one, create a team in Grafana, and navigate to the OnCall plugin (to sync the team with OnCall). You can then get the ID using the `grafana.getOncallTeam` datasource.
        /// </summary>
        [Output("teamId")]
        public Output<string?> TeamId { get; private set; } = null!;

        /// <summary>
        /// The schedule's time zone.
        /// </summary>
        [Output("timeZone")]
        public Output<string?> TimeZone { get; private set; } = null!;

        /// <summary>
        /// The schedule's type.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a OncallSchedule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OncallSchedule(string name, OncallScheduleArgs args, CustomResourceOptions? options = null)
            : base("grafana:index/oncallSchedule:OncallSchedule", name, args ?? new OncallScheduleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OncallSchedule(string name, Input<string> id, OncallScheduleState? state = null, CustomResourceOptions? options = null)
            : base("grafana:index/oncallSchedule:OncallSchedule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OncallSchedule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OncallSchedule Get(string name, Input<string> id, OncallScheduleState? state = null, CustomResourceOptions? options = null)
        {
            return new OncallSchedule(name, id, state, options);
        }
    }

    public sealed class OncallScheduleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The URL of external iCal calendar which override primary events.
        /// </summary>
        [Input("icalUrlOverrides")]
        public Input<string>? IcalUrlOverrides { get; set; }

        /// <summary>
        /// The URL of the external calendar iCal file.
        /// </summary>
        [Input("icalUrlPrimary")]
        public Input<string>? IcalUrlPrimary { get; set; }

        /// <summary>
        /// The schedule's name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("shifts")]
        private InputList<string>? _shifts;

        /// <summary>
        /// The list of ID's of on-call shifts.
        /// </summary>
        public InputList<string> Shifts
        {
            get => _shifts ?? (_shifts = new InputList<string>());
            set => _shifts = value;
        }

        /// <summary>
        /// The Slack-specific settings for a schedule.
        /// </summary>
        [Input("slack")]
        public Input<Inputs.OncallScheduleSlackArgs>? Slack { get; set; }

        /// <summary>
        /// The ID of the OnCall team. To get one, create a team in Grafana, and navigate to the OnCall plugin (to sync the team with OnCall). You can then get the ID using the `grafana.getOncallTeam` datasource.
        /// </summary>
        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        /// <summary>
        /// The schedule's time zone.
        /// </summary>
        [Input("timeZone")]
        public Input<string>? TimeZone { get; set; }

        /// <summary>
        /// The schedule's type.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public OncallScheduleArgs()
        {
        }
        public static new OncallScheduleArgs Empty => new OncallScheduleArgs();
    }

    public sealed class OncallScheduleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The URL of external iCal calendar which override primary events.
        /// </summary>
        [Input("icalUrlOverrides")]
        public Input<string>? IcalUrlOverrides { get; set; }

        /// <summary>
        /// The URL of the external calendar iCal file.
        /// </summary>
        [Input("icalUrlPrimary")]
        public Input<string>? IcalUrlPrimary { get; set; }

        /// <summary>
        /// The schedule's name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("shifts")]
        private InputList<string>? _shifts;

        /// <summary>
        /// The list of ID's of on-call shifts.
        /// </summary>
        public InputList<string> Shifts
        {
            get => _shifts ?? (_shifts = new InputList<string>());
            set => _shifts = value;
        }

        /// <summary>
        /// The Slack-specific settings for a schedule.
        /// </summary>
        [Input("slack")]
        public Input<Inputs.OncallScheduleSlackGetArgs>? Slack { get; set; }

        /// <summary>
        /// The ID of the OnCall team. To get one, create a team in Grafana, and navigate to the OnCall plugin (to sync the team with OnCall). You can then get the ID using the `grafana.getOncallTeam` datasource.
        /// </summary>
        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        /// <summary>
        /// The schedule's time zone.
        /// </summary>
        [Input("timeZone")]
        public Input<string>? TimeZone { get; set; }

        /// <summary>
        /// The schedule's type.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public OncallScheduleState()
        {
        }
        public static new OncallScheduleState Empty => new OncallScheduleState();
    }
}
