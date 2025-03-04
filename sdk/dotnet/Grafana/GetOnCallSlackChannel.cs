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
    public static class GetOnCallSlackChannel
    {
        /// <summary>
        /// * [HTTP API](https://grafana.com/docs/oncall/latest/oncall-api-reference/slack_channels/)
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Grafana = Pulumi.Grafana;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleSlackChannel = Grafana.GetOnCallSlackChannel.Invoke(new()
        ///     {
        ///         Name = "example_slack_channel",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetOnCallSlackChannelResult> InvokeAsync(GetOnCallSlackChannelArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOnCallSlackChannelResult>("grafana:index/getOnCallSlackChannel:getOnCallSlackChannel", args ?? new GetOnCallSlackChannelArgs(), options.WithDefaults());

        /// <summary>
        /// * [HTTP API](https://grafana.com/docs/oncall/latest/oncall-api-reference/slack_channels/)
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Grafana = Pulumi.Grafana;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var exampleSlackChannel = Grafana.GetOnCallSlackChannel.Invoke(new()
        ///     {
        ///         Name = "example_slack_channel",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetOnCallSlackChannelResult> Invoke(GetOnCallSlackChannelInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOnCallSlackChannelResult>("grafana:index/getOnCallSlackChannel:getOnCallSlackChannel", args ?? new GetOnCallSlackChannelInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOnCallSlackChannelArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Slack channel name.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetOnCallSlackChannelArgs()
        {
        }
        public static new GetOnCallSlackChannelArgs Empty => new GetOnCallSlackChannelArgs();
    }

    public sealed class GetOnCallSlackChannelInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Slack channel name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetOnCallSlackChannelInvokeArgs()
        {
        }
        public static new GetOnCallSlackChannelInvokeArgs Empty => new GetOnCallSlackChannelInvokeArgs();
    }


    [OutputType]
    public sealed class GetOnCallSlackChannelResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Slack channel name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Slack ID of the channel.
        /// </summary>
        public readonly string SlackId;

        [OutputConstructor]
        private GetOnCallSlackChannelResult(
            string id,

            string name,

            string slackId)
        {
            Id = id;
            Name = name;
            SlackId = slackId;
        }
    }
}
