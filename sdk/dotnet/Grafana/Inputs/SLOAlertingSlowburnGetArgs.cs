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

    public sealed class SLOAlertingSlowburnGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputList<Inputs.SLOAlertingSlowburnAnnotationGetArgs>? _annotations;
        public InputList<Inputs.SLOAlertingSlowburnAnnotationGetArgs> Annotations
        {
            get => _annotations ?? (_annotations = new InputList<Inputs.SLOAlertingSlowburnAnnotationGetArgs>());
            set => _annotations = value;
        }

        [Input("labels")]
        private InputList<Inputs.SLOAlertingSlowburnLabelGetArgs>? _labels;

        /// <summary>
        /// Additional labels that will be attached to all metrics generated from the query. These labels are useful for grouping SLOs in dashboard views that you create by hand.
        /// </summary>
        public InputList<Inputs.SLOAlertingSlowburnLabelGetArgs> Labels
        {
            get => _labels ?? (_labels = new InputList<Inputs.SLOAlertingSlowburnLabelGetArgs>());
            set => _labels = value;
        }

        public SLOAlertingSlowburnGetArgs()
        {
        }
        public static new SLOAlertingSlowburnGetArgs Empty => new SLOAlertingSlowburnGetArgs();
    }
}
