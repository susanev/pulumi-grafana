// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package grafana

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a single probe by name.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-grafana/sdk/go/grafana"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err = grafana.LookupSyntheticMonitoringProbe(ctx, &grafana.LookupSyntheticMonitoringProbeArgs{
//				Name: "Atlanta",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSyntheticMonitoringProbe(ctx *pulumi.Context, args *LookupSyntheticMonitoringProbeArgs, opts ...pulumi.InvokeOption) (*LookupSyntheticMonitoringProbeResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupSyntheticMonitoringProbeResult
	err := ctx.Invoke("grafana:index/getSyntheticMonitoringProbe:getSyntheticMonitoringProbe", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSyntheticMonitoringProbe.
type LookupSyntheticMonitoringProbeArgs struct {
	// Name of the probe.
	Name string `pulumi:"name"`
}

// A collection of values returned by getSyntheticMonitoringProbe.
type LookupSyntheticMonitoringProbeResult struct {
	// The ID of the probe.
	Id string `pulumi:"id"`
	// Custom labels to be included with collected metrics and logs.
	Labels map[string]string `pulumi:"labels"`
	// Latitude coordinates.
	Latitude float64 `pulumi:"latitude"`
	// Longitude coordinates.
	Longitude float64 `pulumi:"longitude"`
	// Name of the probe.
	Name string `pulumi:"name"`
	// Public probes are run by Grafana Labs and can be used by all users. Only Grafana Labs managed public probes will be set to `true`.
	Public bool `pulumi:"public"`
	// Region of the probe.
	Region string `pulumi:"region"`
	// The tenant ID of the probe.
	TenantId int `pulumi:"tenantId"`
}

func LookupSyntheticMonitoringProbeOutput(ctx *pulumi.Context, args LookupSyntheticMonitoringProbeOutputArgs, opts ...pulumi.InvokeOption) LookupSyntheticMonitoringProbeResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSyntheticMonitoringProbeResult, error) {
			args := v.(LookupSyntheticMonitoringProbeArgs)
			r, err := LookupSyntheticMonitoringProbe(ctx, &args, opts...)
			var s LookupSyntheticMonitoringProbeResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSyntheticMonitoringProbeResultOutput)
}

// A collection of arguments for invoking getSyntheticMonitoringProbe.
type LookupSyntheticMonitoringProbeOutputArgs struct {
	// Name of the probe.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupSyntheticMonitoringProbeOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSyntheticMonitoringProbeArgs)(nil)).Elem()
}

// A collection of values returned by getSyntheticMonitoringProbe.
type LookupSyntheticMonitoringProbeResultOutput struct{ *pulumi.OutputState }

func (LookupSyntheticMonitoringProbeResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSyntheticMonitoringProbeResult)(nil)).Elem()
}

func (o LookupSyntheticMonitoringProbeResultOutput) ToLookupSyntheticMonitoringProbeResultOutput() LookupSyntheticMonitoringProbeResultOutput {
	return o
}

func (o LookupSyntheticMonitoringProbeResultOutput) ToLookupSyntheticMonitoringProbeResultOutputWithContext(ctx context.Context) LookupSyntheticMonitoringProbeResultOutput {
	return o
}

// The ID of the probe.
func (o LookupSyntheticMonitoringProbeResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSyntheticMonitoringProbeResult) string { return v.Id }).(pulumi.StringOutput)
}

// Custom labels to be included with collected metrics and logs.
func (o LookupSyntheticMonitoringProbeResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupSyntheticMonitoringProbeResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

// Latitude coordinates.
func (o LookupSyntheticMonitoringProbeResultOutput) Latitude() pulumi.Float64Output {
	return o.ApplyT(func(v LookupSyntheticMonitoringProbeResult) float64 { return v.Latitude }).(pulumi.Float64Output)
}

// Longitude coordinates.
func (o LookupSyntheticMonitoringProbeResultOutput) Longitude() pulumi.Float64Output {
	return o.ApplyT(func(v LookupSyntheticMonitoringProbeResult) float64 { return v.Longitude }).(pulumi.Float64Output)
}

// Name of the probe.
func (o LookupSyntheticMonitoringProbeResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSyntheticMonitoringProbeResult) string { return v.Name }).(pulumi.StringOutput)
}

// Public probes are run by Grafana Labs and can be used by all users. Only Grafana Labs managed public probes will be set to `true`.
func (o LookupSyntheticMonitoringProbeResultOutput) Public() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupSyntheticMonitoringProbeResult) bool { return v.Public }).(pulumi.BoolOutput)
}

// Region of the probe.
func (o LookupSyntheticMonitoringProbeResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSyntheticMonitoringProbeResult) string { return v.Region }).(pulumi.StringOutput)
}

// The tenant ID of the probe.
func (o LookupSyntheticMonitoringProbeResultOutput) TenantId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupSyntheticMonitoringProbeResult) int { return v.TenantId }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSyntheticMonitoringProbeResultOutput{})
}
