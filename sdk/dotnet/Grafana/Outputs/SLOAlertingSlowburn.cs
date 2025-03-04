// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Grafana.Outputs
{

    [OutputType]
    public sealed class SLOAlertingSlowburn
    {
        public readonly ImmutableArray<Outputs.SLOAlertingSlowburnAnnotation> Annotations;
        /// <summary>
        /// Additional labels that will be attached to all metrics generated from the query. These labels are useful for grouping SLOs in dashboard views that you create by hand.
        /// </summary>
        public readonly ImmutableArray<Outputs.SLOAlertingSlowburnLabel> Labels;

        [OutputConstructor]
        private SLOAlertingSlowburn(
            ImmutableArray<Outputs.SLOAlertingSlowburnAnnotation> annotations,

            ImmutableArray<Outputs.SLOAlertingSlowburnLabel> labels)
        {
            Annotations = annotations;
            Labels = labels;
        }
    }
}
