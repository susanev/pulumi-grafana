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
    public sealed class SLOAlertingFastburn
    {
        public readonly ImmutableArray<Outputs.SLOAlertingFastburnAnnotation> Annotations;
        /// <summary>
        /// Additional labels that will be attached to all metrics generated from the query. These labels are useful for grouping SLOs in dashboard views that you create by hand.
        /// </summary>
        public readonly ImmutableArray<Outputs.SLOAlertingFastburnLabel> Labels;

        [OutputConstructor]
        private SLOAlertingFastburn(
            ImmutableArray<Outputs.SLOAlertingFastburnAnnotation> annotations,

            ImmutableArray<Outputs.SLOAlertingFastburnLabel> labels)
        {
            Annotations = annotations;
            Labels = labels;
        }
    }
}
