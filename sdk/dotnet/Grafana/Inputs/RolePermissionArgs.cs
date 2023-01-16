// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Grafana.Inputs
{

    public sealed class RolePermissionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specific action users granted with the role will be allowed to perform (for example: `users:read`)
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// Scope to restrict the action to a set of resources (for example: `users:*` or `roles:customrole1`) Defaults to ``.
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        public RolePermissionArgs()
        {
        }
        public static new RolePermissionArgs Empty => new RolePermissionArgs();
    }
}
